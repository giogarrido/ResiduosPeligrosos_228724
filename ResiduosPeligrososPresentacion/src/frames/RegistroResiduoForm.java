package frames;

import entidades.Quimico;
import entidades.Residuo;
import controlResiduosPeligrosos.FabricaN;
import controlResiduosPeligrosos.INegocio;
import entidades.Productor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import validores.Validadores;

/**
 *
 * @author giova
 */
public class RegistroResiduoForm extends javax.swing.JPanel {

    // Representa si el formulario ya fue cargado una vez.
    private boolean estaActivado;
    private Validadores validadores = new Validadores();
    private List<Quimico> listaQuimicosDisponibles;
    private List<Quimico> listaQuimicosRegistrados;
    private List<Quimico> listaQuimicosResiduo;
    private List<Productor> listaProductores;

    private INegocio negocio = FabricaN.fabricaN();


    /*
    Crea el objeto formulario sin cargar nada
     */
    public RegistroResiduoForm() {
        estaActivado = false;
    }

    /*
    Carga el contenido del formulario y realiza las consultas.
     */
    public void cargarContenido() {
        initComponents();
        iniciarTablasResiduos();
        llenarCajaProductores();

        this.llenarTablaQuimicoDisponible();
        //this.agregarQuimicoResiduo();
        estaActivado = true;

    }

    public boolean estaActivado() {
        return estaActivado;
    }

    private void llenarTablaQuimicoDisponible() {
        listaQuimicosRegistrados = negocio.consultarTodosQuimicos();
        listaQuimicosRegistrados.removeAll(listaQuimicosResiduo);
        listaQuimicosDisponibles = listaQuimicosRegistrados;

        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblQuimicoDisponible.getModel();
        modeloTabla.setRowCount(0);
        listaQuimicosDisponibles.forEach(quimicosExistente -> {
            Object[] fila = new Object[1];
            fila[0] = quimicosExistente.getNombre();
            modeloTabla.addRow(fila);
        });
    }

    private void agregarQuimicoResiduo() {

        listaQuimicosResiduo.add(new Quimico((String) tblQuimicoDisponible.getValueAt(tblQuimicoDisponible.getSelectedRow(), 0)));

    }

    private void eliminarQuimicoResiduo() {

        //if (!listaQuimicosResiduo.isEmpty()) {
        if (tblQuimicoResiduo.getSelectedRow() >= 0) {
            listaQuimicosResiduo.remove(new Quimico((String) tblQuimicoResiduo.getValueAt(tblQuimicoResiduo.getSelectedRow(), 0)));
        } else {
            //JOptionPane.showMessageDialog(this, "La lista esta vacia", "Información", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "Seleccione un químico", "Información", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void llenarTablaQuimicoResiduo() {
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblQuimicoResiduo.getModel();
        modeloTabla2.setRowCount(0);
        listaQuimicosResiduo.forEach(quimicosResiduo -> {
            Object[] fila = new Object[1];
            fila[0] = quimicosResiduo.getNombre();
            modeloTabla2.addRow(fila);
        });
    }

    private void guardarResiduo() {

        agregarResiduoProductor();

    }

    private void iniciarTablasResiduos() {
        listaQuimicosRegistrados = new ArrayList<>();
        listaQuimicosResiduo = new ArrayList<>();
        listaQuimicosDisponibles = new ArrayList<>();
    }

    private void llenarCajaProductores() {

        listaProductores = negocio.consultarTodosProductores();

        cmbProductorRegRes.addItem("Seleccione...");

        for (int i = 0; i < listaProductores.size(); i++) {
            cmbProductorRegRes.addItem(listaProductores.get(i).getNombre());
        }

    }

    private void agregarResiduoProductor() {

        if (!validarCampoCodigo()) {
            JOptionPane.showMessageDialog(this, "El codigo tiene que tener 6 dígitos enteros", "Información", JOptionPane.ERROR_MESSAGE);

        } else {
            if (validarCamposLlenos()) {
                int codigo = Integer.parseInt(this.txtCodigoResiduo.getText());
                String nombre = this.txtNombreResiduo.getText().toUpperCase();
                List<Quimico> quimicos = listaQuimicosResiduo;
                if (negocio.consultarExisteClave(codigo)) {
                    JOptionPane.showMessageDialog(this, "La clave ya existe", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (negocio.consultarExisteNombreResiduo(nombre)) {
                        JOptionPane.showMessageDialog(this, "El nombre ya existe", "error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        Residuo residuo = new Residuo(codigo, nombre, quimicos);
                        boolean seAgrego = negocio.agregarResiduo(residuo);
                        if (seAgrego) {
                            String productorRes = cmbProductorRegRes.getSelectedItem().toString();
                            ObjectId idRes = negocio.obtenerIDResiduo(nombre);
                            boolean seAgregoRes = negocio.agregarIdsResiduos(productorRes, idRes);
                            if (seAgregoRes) {
                                JOptionPane.showMessageDialog(this, "Se registro el Residuo y se asignó al Productor", "información", JOptionPane.INFORMATION_MESSAGE);
                                limpiarPanelResiduo();
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "No fue posible agregar el quimico", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos", "Información", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void limpiarPanelResiduo() {

        iniciarTablasResiduos();
        llenarTablaQuimicoDisponible();
        llenarTablaQuimicoResiduo();
        txtCodigoResiduo.setText("");
        txtNombreResiduo.setText("");
        cmbProductorRegRes.setSelectedIndex(0);
    }

    public void recargarRegistroResiduo() {
        llenarTablaQuimicoDisponible();
    }

    private boolean validarCamposLlenos() {
        if (txtCodigoResiduo.getText().isEmpty()) {
            return false;
        }
        if (txtNombreResiduo.getText().isEmpty()) {
            return false;
        }
        if (listaQuimicosResiduo.isEmpty()) {
            return false;
        }
        if (cmbProductorRegRes.getSelectedItem().toString().equals("Seleccione...")) {
            return false;
        }
        return true;
    }

    private boolean validarCampoCodigo() {
        String codigo = txtCodigoResiduo.getText();
        if (validadores.validaEntero(codigo)) {
            if (codigo.length() == 6) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistroResiduos = new javax.swing.JLabel();
        pnlTablaQuimicoDisponible = new javax.swing.JScrollPane();
        tblQuimicoDisponible = new javax.swing.JTable();
        lblCodigoResiduo = new javax.swing.JLabel();
        lblNombreResiduo = new javax.swing.JLabel();
        btnAgregarRegistroResiduo = new javax.swing.JButton();
        btnEliminarRegistroResiduo = new javax.swing.JButton();
        btnGuardarResiduo = new javax.swing.JButton();
        txtCodigoResiduo = new javax.swing.JTextField();
        txtNombreResiduo = new javax.swing.JTextField();
        pnlTablaQuimicoResiduo = new javax.swing.JScrollPane();
        tblQuimicoResiduo = new javax.swing.JTable();
        lblProductorRegRes = new javax.swing.JLabel();
        cmbProductorRegRes = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1000, 500));

        lblRegistroResiduos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRegistroResiduos.setText("Registro de Residuos");

        tblQuimicoDisponible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Químico Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTablaQuimicoDisponible.setViewportView(tblQuimicoDisponible);

        lblCodigoResiduo.setText("Codigo");

        lblNombreResiduo.setText("Nombre");

        btnAgregarRegistroResiduo.setText("Agregar");
        btnAgregarRegistroResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRegistroResiduoActionPerformed(evt);
            }
        });

        btnEliminarRegistroResiduo.setText("Eliminar");
        btnEliminarRegistroResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroResiduoActionPerformed(evt);
            }
        });

        btnGuardarResiduo.setText("Guardar");
        btnGuardarResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarResiduoActionPerformed(evt);
            }
        });

        txtCodigoResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoResiduoActionPerformed(evt);
            }
        });

        txtNombreResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreResiduoActionPerformed(evt);
            }
        });

        tblQuimicoResiduo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Químico del Residuo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTablaQuimicoResiduo.setViewportView(tblQuimicoResiduo);

        lblProductorRegRes.setText("Productor: ");

        cmbProductorRegRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductorRegResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(lblRegistroResiduos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlTablaQuimicoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlTablaQuimicoResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregarRegistroResiduo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCodigoResiduo)
                                            .addComponent(lblNombreResiduo))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCodigoResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminarRegistroResiduo)
                                    .addComponent(btnGuardarResiduo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblProductorRegRes)
                        .addGap(18, 18, 18)
                        .addComponent(cmbProductorRegRes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistroResiduos)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductorRegRes)
                    .addComponent(cmbProductorRegRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTablaQuimicoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTablaQuimicoResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarRegistroResiduo)
                    .addComponent(btnAgregarRegistroResiduo))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoResiduo)
                    .addComponent(txtCodigoResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreResiduo)
                    .addComponent(txtNombreResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarResiduo))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarRegistroResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRegistroResiduoActionPerformed
        // TODO add your handling code here:

        if (tblQuimicoDisponible.getSelectedRow() >= 0) {
            agregarQuimicoResiduo();
            llenarTablaQuimicoResiduo();
            llenarTablaQuimicoDisponible();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un químico", "Información", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarRegistroResiduoActionPerformed

    private void txtNombreResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreResiduoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreResiduoActionPerformed

    private void txtCodigoResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoResiduoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoResiduoActionPerformed

    private void btnEliminarRegistroResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroResiduoActionPerformed

        if (!listaQuimicosResiduo.isEmpty()) {
            eliminarQuimicoResiduo();
            llenarTablaQuimicoResiduo();
            llenarTablaQuimicoDisponible();
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta vacía", "Información", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarRegistroResiduoActionPerformed

    private void btnGuardarResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarResiduoActionPerformed
        // TODO add your handling code here:
        guardarResiduo();

    }//GEN-LAST:event_btnGuardarResiduoActionPerformed

    private void cmbProductorRegResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductorRegResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductorRegResActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRegistroResiduo;
    private javax.swing.JButton btnEliminarRegistroResiduo;
    private javax.swing.JButton btnGuardarResiduo;
    private javax.swing.JComboBox<String> cmbProductorRegRes;
    private javax.swing.JLabel lblCodigoResiduo;
    private javax.swing.JLabel lblNombreResiduo;
    private javax.swing.JLabel lblProductorRegRes;
    private javax.swing.JLabel lblRegistroResiduos;
    private javax.swing.JScrollPane pnlTablaQuimicoDisponible;
    private javax.swing.JScrollPane pnlTablaQuimicoResiduo;
    private javax.swing.JTable tblQuimicoDisponible;
    private javax.swing.JTable tblQuimicoResiduo;
    private javax.swing.JTextField txtCodigoResiduo;
    private javax.swing.JTextField txtNombreResiduo;
    // End of variables declaration//GEN-END:variables

}
