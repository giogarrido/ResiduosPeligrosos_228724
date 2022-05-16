/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

/**
 *
 * @author giova
 */
public class SolicitudesTrasladosForm extends javax.swing.JPanel {

    // Representa si el formulario ya fue cargado una vez.
    private boolean estaActivado;
    
    /**
     * Creates new form solicitudesTrasladosForm
     */
    public SolicitudesTrasladosForm() {

        estaActivado=false;
    }
    
    public void cargarContenido(){
        initComponents();
        
        estaActivado= true;
    }
    
    
    public boolean estaActivado(){
        return estaActivado;
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
        txtProductorST = new javax.swing.JTextField();
        lblResiduosST = new javax.swing.JLabel();
        pnlTablaResiduosDisponibles = new javax.swing.JScrollPane();
        tblResiduosDisponibles = new javax.swing.JTable();
        pnlTablaResiduosSeleccionados = new javax.swing.JScrollPane();
        tblResiduosSeleccionados = new javax.swing.JTable();
        btnElegirST = new javax.swing.JButton();
        btnEliminarST = new javax.swing.JButton();
        btnSolicitarST = new javax.swing.JButton();
        lblFechaST = new javax.swing.JLabel();
        datePickerFechaST = new com.github.lgooddatepicker.components.DatePicker();

        lblSolicitudTraslados.setText("Solicitud de Traslados");
        lblSolicitudTraslados.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        lblProductor.setText("Productor: ");
        lblProductor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtProductorST.setEditable(false);
        txtProductorST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtProductorST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductorSTActionPerformed(evt);
            }
        });

        lblResiduosST.setText("RESIDUOS");
        lblResiduosST.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        tblResiduosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Residuo Disponible"
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
                java.lang.Integer.class, java.lang.Float.class, java.lang.Byte.class
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

        btnElegirST.setText("Elegir");
        btnElegirST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnElegirST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirSTActionPerformed(evt);
            }
        });

        btnEliminarST.setText("Eliminar");
        btnEliminarST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSolicitarST.setText("Solicitar");
        btnSolicitarST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSolicitarST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarSTActionPerformed(evt);
            }
        });

        lblFechaST.setText("Fecha:");
        lblFechaST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(datePickerFechaST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProductorST))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResiduosST)
                .addGap(353, 353, 353))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSolicitudTraslados)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProductor)
                    .addComponent(txtProductorST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaST)
                    .addComponent(datePickerFechaST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnlTablaResiduosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlTablaResiduosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductorSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductorSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductorSTActionPerformed

    private void btnElegirSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElegirSTActionPerformed

    private void btnSolicitarSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarSTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElegirST;
    private javax.swing.JButton btnEliminarST;
    private javax.swing.JButton btnSolicitarST;
    private com.github.lgooddatepicker.components.DatePicker datePickerFechaST;
    private javax.swing.JLabel lblFechaST;
    private javax.swing.JLabel lblProductor;
    private javax.swing.JLabel lblResiduosST;
    private javax.swing.JLabel lblSolicitudTraslados;
    private javax.swing.JScrollPane pnlTablaResiduosDisponibles;
    private javax.swing.JScrollPane pnlTablaResiduosSeleccionados;
    private javax.swing.JTable tblResiduosDisponibles;
    private javax.swing.JTable tblResiduosSeleccionados;
    private javax.swing.JTextField txtProductorST;
    // End of variables declaration//GEN-END:variables
}
