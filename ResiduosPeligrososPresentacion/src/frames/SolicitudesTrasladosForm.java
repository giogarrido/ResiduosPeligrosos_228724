/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import controlResiduosPeligrosos.FabricaN;
import controlResiduosPeligrosos.INegocio;
import dtos.ProductorDTO;
import entidades.Productor;
import entidades.Residuo;
import entidades.SolicitudTraslado;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author giova
 */
public class SolicitudesTrasladosForm extends javax.swing.JPanel {

    // Representa si el formulario ya fue cargado una vez.
    private boolean estaActivado;
    private INegocio negocio = FabricaN.fabricaN();
    private List<Productor> listaProductores;
    private List<Residuo> listaResiduosDisponibles;
    private List<Residuo> listaResiduosRegistrados;
    private List<Residuo> listaResiduosTrasportar;

    /**
     * Creates new form solicitudesTrasladosForm
     */
    public SolicitudesTrasladosForm() {

        estaActivado = false;
    }

    public void cargarContenido() {
        initComponents();
        iniciartablas();
        llenarCajaProductoresST();
        DtFecha.setDateToToday();

        this.llenarTablaResiduosDisponibles();

        estaActivado = true;

    }

    public boolean estaActivado() {
        return estaActivado;
    }

    private void llenarCajaProductoresST() {
        listaProductores = negocio.consultarTodosProductores();
        cmbProductorSolicTras.addItem("Seleccione...");

        for (int i = 0; i < listaProductores.size(); i++) {
            cmbProductorSolicTras.addItem(listaProductores.get(i).getNombre());
        }
    }// end llenar caja productores

    private void llenarTablaResiduosDisponibles() {

        llenarListaResiduosRegistrados();
        listaResiduosDisponibles = listaResiduosRegistrados;

        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblResiduosDisponibles.getModel();
        modeloTabla2.setRowCount(0);
        listaResiduosDisponibles.forEach(residuosProductor -> {
            Object[] fila = new Object[1];
            fila[0] = residuosProductor;
            modeloTabla2.addRow(fila);
        });

    }

    private void agregarResiduoSolTrasporte() {

        listaResiduosTrasportar.add((Residuo) tblResiduosDisponibles.getValueAt(tblResiduosDisponibles.getSelectedRow(), 0));
    }

    private void eliminarResiduoSolTrasnporte() {

        if (tblResiduosSeleccionados.getSelectedRow() >= 0) {
            listaResiduosTrasportar.remove(((Residuo) tblResiduosSeleccionados.getValueAt(tblResiduosSeleccionados.getSelectedRow(), 0)));
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un residuo", "Informaci??n", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarTablaResiduosSolTransporte() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblResiduosSeleccionados.getModel();
        modeloTabla.setRowCount(0);
        listaResiduosTrasportar.forEach(residuosSolTrasnportar -> {
            Object[] fila = new Object[1];
            fila[0] = residuosSolTrasnportar;
            modeloTabla.addRow(fila);
        });
    }

    private void iniciartablas() {
        listaResiduosDisponibles = new ArrayList<>();
        listaResiduosRegistrados = new ArrayList<>();
        listaResiduosTrasportar = new ArrayList<>();
    }

    private void llenarListaResiduosRegistrados() {
        String nombreP = cmbProductorSolicTras.getSelectedItem().toString();
        if (nombreP.equals("Seleccione...")) {
            //iniciartablas();
            //llenarTablaResiduosSolTransporte();

        } else {
            ProductorDTO productorDTO = negocio.consultarResiduos(nombreP);
            listaResiduosRegistrados = productorDTO.getResiduos();

        }

    }

    private void solicitarTraslado() {
        if (validarCamposLlenos()) {
            String productor = cmbProductorSolicTras.getSelectedItem().toString();
            String fecha = DtFecha.getDateStringOrEmptyString();
            Float cantidad = Float.valueOf(tblResiduosSeleccionados.getValueAt(tblResiduosSeleccionados.getSelectedRow(), 1).toString());
            String unidad = tblResiduosSeleccionados.getValueAt(tblResiduosSeleccionados.getSelectedRow(), 2).toString();
            //List<ObjectId> idsResiduos = listaResiduosTrasportar.ge;

            SolicitudTraslado solicitudTraslado = new SolicitudTraslado(productor, fecha, cantidad, unidad);
            boolean seAgrego = (negocio.agregarSolicitudTraslado(solicitudTraslado));
            if (seAgrego) {
                JOptionPane.showMessageDialog(this, "Se registro la solicitud de traslado", "informaci??n", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Rellene todos los campos", "Informaci??n", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void limpiarCampos() {
        cmbProductorSolicTras.setSelectedIndex(0);

        DtFecha.setDateToToday();

    }

    private boolean validarCamposLlenos() {

        if (cmbProductorSolicTras.getSelectedItem().toString().equals("Seleccione...")) {
            return false;
        }


        if (tblResiduosSeleccionados.getValueAt(tblResiduosSeleccionados.getSelectedRow(), 1).toString().isEmpty()) {
            return false;
        }
        if (tblResiduosSeleccionados.getValueAt(tblResiduosSeleccionados.getSelectedRow(), 2).toString().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSolicitudTraslados = new javax.swing.JLabel();
        lblProductor = new javax.swing.JLabel();
        lblResiduosST = new javax.swing.JLabel();
        pnlTablaResiduosDisponibles = new javax.swing.JScrollPane();
        tblResiduosDisponibles = new javax.swing.JTable();
        pnlTablaResiduosSeleccionados = new javax.swing.JScrollPane();
        tblResiduosSeleccionados = new javax.swing.JTable();
        btnElegirST = new javax.swing.JButton();
        btnEliminarST = new javax.swing.JButton();
        btnSolicitarST = new javax.swing.JButton();
        lblFechaST = new javax.swing.JLabel();
        cmbProductorSolicTras = new javax.swing.JComboBox<>();
        DtFecha = new com.github.lgooddatepicker.components.DatePicker();

        lblSolicitudTraslados.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSolicitudTraslados.setText("Solicitud de Traslados");

        lblProductor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProductor.setText("Productor: ");

        lblResiduosST.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResiduosST.setText("RESIDUOS");

        tblResiduosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Residuo Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTablaResiduosDisponibles.setViewportView(tblResiduosDisponibles);
        if (tblResiduosDisponibles.getColumnModel().getColumnCount() > 0) {
            tblResiduosDisponibles.getColumnModel().getColumn(0).setResizable(false);
        }

        tblResiduosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Residuo", "Cantidad", "Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTablaResiduosSeleccionados.setViewportView(tblResiduosSeleccionados);

        btnElegirST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnElegirST.setText("Elegir");
        btnElegirST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirSTActionPerformed(evt);
            }
        });

        btnEliminarST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarST.setText("Eliminar");
        btnEliminarST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSTActionPerformed(evt);
            }
        });

        btnSolicitarST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSolicitarST.setText("Solicitar");
        btnSolicitarST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarSTActionPerformed(evt);
            }
        });

        lblFechaST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaST.setText("Fecha:");

        cmbProductorSolicTras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductorSolicTrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(lblSolicitudTraslados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductor)
                            .addComponent(lblFechaST))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSolicitarST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminarST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnElegirST, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(pnlTablaResiduosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlTablaResiduosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbProductorSolicTras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblResiduosST)
                                .addGap(243, 243, 243)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSolicitudTraslados)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductor)
                    .addComponent(cmbProductorSolicTras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaST)
                    .addComponent(DtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblResiduosST)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnElegirST)
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminarST)
                        .addGap(41, 41, 41)
                        .addComponent(btnSolicitarST))
                    .addComponent(pnlTablaResiduosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTablaResiduosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnElegirSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirSTActionPerformed

        if (tblResiduosDisponibles.getSelectedRow() >= 0) {
            agregarResiduoSolTrasporte();
            llenarTablaResiduosSolTransporte();
            llenarTablaResiduosDisponibles();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un residuo", "Informaci??n", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnElegirSTActionPerformed

    private void btnSolicitarSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarSTActionPerformed
        // TODO add your handling code here:

        solicitarTraslado();
        limpiarCampos();

    }//GEN-LAST:event_btnSolicitarSTActionPerformed

    private void cmbProductorSolicTrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductorSolicTrasActionPerformed

        iniciartablas();
        llenarTablaResiduosSolTransporte();
        llenarTablaResiduosDisponibles();


    }//GEN-LAST:event_cmbProductorSolicTrasActionPerformed

    private void btnEliminarSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSTActionPerformed

        if (!listaResiduosTrasportar.isEmpty()) {
            eliminarResiduoSolTrasnporte();
            llenarTablaResiduosSolTransporte();
            llenarTablaResiduosDisponibles();

        } else {
            JOptionPane.showMessageDialog(this, "La lista esta vac??a", "Informaci??n", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarSTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker DtFecha;
    private javax.swing.JButton btnElegirST;
    private javax.swing.JButton btnEliminarST;
    private javax.swing.JButton btnSolicitarST;
    private javax.swing.JComboBox<String> cmbProductorSolicTras;
    private javax.swing.JLabel lblFechaST;
    private javax.swing.JLabel lblProductor;
    private javax.swing.JLabel lblResiduosST;
    private javax.swing.JLabel lblSolicitudTraslados;
    private javax.swing.JScrollPane pnlTablaResiduosDisponibles;
    private javax.swing.JScrollPane pnlTablaResiduosSeleccionados;
    private javax.swing.JTable tblResiduosDisponibles;
    private javax.swing.JTable tblResiduosSeleccionados;
    // End of variables declaration//GEN-END:variables
}
