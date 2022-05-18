/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

/**
 *
 * @author giova
 */
public class InformacionTrasladoForm extends javax.swing.JFrame {

    /**
     * Creates new form InformacionTrasladoForm
     */
    public InformacionTrasladoForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblinformacionTraslado1 = new javax.swing.JLabel();
        pnlTablaResiduosTraslados = new javax.swing.JScrollPane();
        tblResiduosTraslados = new javax.swing.JTable();
        lblProductorInfoTraslados = new javax.swing.JLabel();
        txtProductorInfoTraslados = new javax.swing.JTextField();
        lblFechaInfoTraslados = new javax.swing.JLabel();
        txtFechaInfoTraslados = new javax.swing.JTextField();
        lblTransportistaInfoTraslados = new javax.swing.JLabel();
        cmbTransportistaInfoTraslados = new javax.swing.JComboBox<>();
        btnAsignarInfoTraslados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información de traslado");

        jPanel2.setPreferredSize(new java.awt.Dimension(700, 380));

        lblinformacionTraslado1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblinformacionTraslado1.setText("Información del Traslado");

        tblResiduosTraslados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Residuos", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTablaResiduosTraslados.setViewportView(tblResiduosTraslados);

        lblProductorInfoTraslados.setText("Productor");

        lblFechaInfoTraslados.setText("Fecha Solcitada");

        txtFechaInfoTraslados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInfoTrasladosActionPerformed(evt);
            }
        });

        lblTransportistaInfoTraslados.setText("Transportistas");

        cmbTransportistaInfoTraslados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTransportistaInfoTrasladosActionPerformed(evt);
            }
        });

        btnAsignarInfoTraslados.setText("Asignar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblinformacionTraslado1)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblProductorInfoTraslados)
                                    .addComponent(lblFechaInfoTraslados)
                                    .addComponent(lblTransportistaInfoTraslados))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProductorInfoTraslados)
                                    .addComponent(txtFechaInfoTraslados)
                                    .addComponent(cmbTransportistaInfoTraslados, 0, 200, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAsignarInfoTraslados)
                                .addGap(65, 65, 65)))
                        .addGap(124, 124, 124)
                        .addComponent(pnlTablaResiduosTraslados, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblinformacionTraslado1)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductorInfoTraslados)
                            .addComponent(txtProductorInfoTraslados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaInfoTraslados)
                            .addComponent(txtFechaInfoTraslados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTransportistaInfoTraslados)
                            .addComponent(cmbTransportistaInfoTraslados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAsignarInfoTraslados))
                    .addComponent(pnlTablaResiduosTraslados, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaInfoTrasladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInfoTrasladosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInfoTrasladosActionPerformed

    private void cmbTransportistaInfoTrasladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTransportistaInfoTrasladosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTransportistaInfoTrasladosActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InformacionTrasladoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InformacionTrasladoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InformacionTrasladoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InformacionTrasladoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InformacionTrasladoForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarInfoTraslados;
    private javax.swing.JComboBox<String> cmbTransportistaInfoTraslados;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFechaInfoTraslados;
    private javax.swing.JLabel lblProductorInfoTraslados;
    private javax.swing.JLabel lblTransportistaInfoTraslados;
    private javax.swing.JLabel lblinformacionTraslado1;
    private javax.swing.JScrollPane pnlTablaResiduosTraslados;
    private javax.swing.JTable tblResiduosTraslados;
    private javax.swing.JTextField txtFechaInfoTraslados;
    private javax.swing.JTextField txtProductorInfoTraslados;
    // End of variables declaration//GEN-END:variables
}
