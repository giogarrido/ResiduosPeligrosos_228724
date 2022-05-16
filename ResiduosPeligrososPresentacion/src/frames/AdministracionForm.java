/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import controlResiduosPeligrosos.FabricaN;
import controlResiduosPeligrosos.INegocio;
import objetosNegocio.Quimico;


import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class AdministracionForm extends javax.swing.JFrame {

    
    private INegocio negocio = FabricaN.fabricaN();
    
    public AdministracionForm() {
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

        pnlRegistro = new javax.swing.JPanel();
        btnRegProductor = new javax.swing.JButton();
        btnRegTransporte = new javax.swing.JButton();
        btnRegQuimico = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        btnRegAdministrador = new javax.swing.JButton();
        btnSaliRegistro = new javax.swing.JButton();
        pnlRegQuimico = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnAgregarQuimico = new javax.swing.JButton();
        btnSalirQuimico = new javax.swing.JButton();
        lblNombreQuimico = new javax.swing.JLabel();
        txtNombreQuimico = new javax.swing.JTextField();
        pnlRegproductor = new javax.swing.JPanel();
        lblRegistrarProductor = new javax.swing.JLabel();
        lblNombreRegProductor = new javax.swing.JLabel();
        btnNombreRegProductor = new javax.swing.JTextField();
        lblContraseniaRegProductor = new javax.swing.JLabel();
        btnContraseniaRegProductor = new javax.swing.JTextField();
        btnAgregarProductor = new javax.swing.JButton();
        btnSalirProductor = new javax.swing.JButton();
        pnlRegTransporte = new javax.swing.JPanel();
        lblRegistrarTransportista = new javax.swing.JLabel();
        lblNombreRegTransportista = new javax.swing.JLabel();
        lblContraseniaRegTransportista = new javax.swing.JLabel();
        txtNombreRegTransportista = new javax.swing.JTextField();
        txtContraseniaRegTransportista = new javax.swing.JTextField();
        btnAgregarRegTransportista = new javax.swing.JButton();
        btnSalirRegTransportista = new javax.swing.JButton();
        pnlRegAdministrador = new javax.swing.JPanel();
        lblRegistrarAdministrador = new javax.swing.JLabel();
        lblNombreRegAdministrador = new javax.swing.JLabel();
        lblContraseniaRegAdministrador = new javax.swing.JLabel();
        txtNombreRegAdministrador = new javax.swing.JTextField();
        txtContraseniaRegAdministrador = new javax.swing.JTextField();
        btnAgregarRegAdministrador = new javax.swing.JButton();
        btnSalirRegvAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        btnRegProductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegProductor.setText("Productor");
        btnRegProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProductorActionPerformed(evt);
            }
        });

        btnRegTransporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegTransporte.setText("Transporte");
        btnRegTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegTransporteActionPerformed(evt);
            }
        });

        btnRegQuimico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegQuimico.setText("Quimico");
        btnRegQuimico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegQuimicoActionPerformed(evt);
            }
        });

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRegistrar.setText("Registrar:");

        btnRegAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegAdministrador.setText("Administrador");
        btnRegAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAdministradorActionPerformed(evt);
            }
        });

        btnSaliRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSaliRegistro.setText("Salir");
        btnSaliRegistro.setPreferredSize(new java.awt.Dimension(81, 26));
        btnSaliRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaliRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btnRegProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRegAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegTransporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegQuimico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnSaliRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrar)
                    .addComponent(btnRegProductor))
                .addGap(18, 18, 18)
                .addComponent(btnRegTransporte)
                .addGap(18, 18, 18)
                .addComponent(btnRegQuimico)
                .addGap(18, 18, 18)
                .addComponent(btnRegAdministrador)
                .addGap(18, 18, 18)
                .addComponent(btnSaliRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRegistro, "registro");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setText("Registro de Quimico");

        btnAgregarQuimico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarQuimico.setText("Agregar");
        btnAgregarQuimico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarQuimicoActionPerformed(evt);
            }
        });

        btnSalirQuimico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalirQuimico.setText("Salir");
        btnSalirQuimico.setPreferredSize(new java.awt.Dimension(81, 26));
        btnSalirQuimico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirQuimicoActionPerformed(evt);
            }
        });

        lblNombreQuimico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreQuimico.setText("Nombre:");

        txtNombreQuimico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlRegQuimicoLayout = new javax.swing.GroupLayout(pnlRegQuimico);
        pnlRegQuimico.setLayout(pnlRegQuimicoLayout);
        pnlRegQuimicoLayout.setHorizontalGroup(
            pnlRegQuimicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegQuimicoLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(pnlRegQuimicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(pnlRegQuimicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegQuimicoLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(btnAgregarQuimico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalirQuimico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegQuimicoLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(lblNombreQuimico)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreQuimico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        pnlRegQuimicoLayout.setVerticalGroup(
            pnlRegQuimicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegQuimicoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addGroup(pnlRegQuimicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreQuimico)
                    .addComponent(txtNombreQuimico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(pnlRegQuimicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarQuimico)
                    .addComponent(btnSalirQuimico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        getContentPane().add(pnlRegQuimico, "regQuimico");

        lblRegistrarProductor.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRegistrarProductor.setText("Registrar Productor");

        lblNombreRegProductor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreRegProductor.setText("Nombre");

        btnNombreRegProductor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNombreRegProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreRegProductorActionPerformed(evt);
            }
        });

        lblContraseniaRegProductor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContraseniaRegProductor.setText("Contraseña");

        btnContraseniaRegProductor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnContraseniaRegProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseniaRegProductorActionPerformed(evt);
            }
        });

        btnAgregarProductor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarProductor.setText("Agregar");
        btnAgregarProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductorActionPerformed(evt);
            }
        });

        btnSalirProductor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalirProductor.setText("Salir");
        btnSalirProductor.setPreferredSize(new java.awt.Dimension(81, 26));
        btnSalirProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProductorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegproductorLayout = new javax.swing.GroupLayout(pnlRegproductor);
        pnlRegproductor.setLayout(pnlRegproductorLayout);
        pnlRegproductorLayout.setHorizontalGroup(
            pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegproductorLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrarProductor)
                    .addGroup(pnlRegproductorLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlRegproductorLayout.createSequentialGroup()
                                .addComponent(btnAgregarProductor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalirProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRegproductorLayout.createSequentialGroup()
                                .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombreRegProductor)
                                    .addComponent(lblContraseniaRegProductor))
                                .addGap(18, 18, 18)
                                .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnContraseniaRegProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNombreRegProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnlRegproductorLayout.setVerticalGroup(
            pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegproductorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRegistrarProductor)
                .addGap(30, 30, 30)
                .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreRegProductor)
                    .addComponent(btnNombreRegProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseniaRegProductor)
                    .addComponent(btnContraseniaRegProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(pnlRegproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProductor))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRegproductor, "regProductor");

        lblRegistrarTransportista.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRegistrarTransportista.setText("Registro de Trasportista");

        lblNombreRegTransportista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreRegTransportista.setText("Nombre:");

        lblContraseniaRegTransportista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseniaRegTransportista.setText("Contraseña");

        txtNombreRegTransportista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreRegTransportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegTransportistaActionPerformed(evt);
            }
        });

        txtContraseniaRegTransportista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAgregarRegTransportista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarRegTransportista.setText("Agregar");

        btnSalirRegTransportista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalirRegTransportista.setText("Salir");
        btnSalirRegTransportista.setPreferredSize(new java.awt.Dimension(81, 26));
        btnSalirRegTransportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRegTransportistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegTransporteLayout = new javax.swing.GroupLayout(pnlRegTransporte);
        pnlRegTransporte.setLayout(pnlRegTransporteLayout);
        pnlRegTransporteLayout.setHorizontalGroup(
            pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegTransporteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrarTransportista)
                    .addGroup(pnlRegTransporteLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContraseniaRegTransportista)
                            .addComponent(lblNombreRegTransportista)
                            .addComponent(btnAgregarRegTransportista))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContraseniaRegTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreRegTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalirRegTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlRegTransporteLayout.setVerticalGroup(
            pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegTransporteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRegistrarTransportista)
                .addGap(43, 43, 43)
                .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreRegTransportista)
                    .addComponent(txtNombreRegTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContraseniaRegTransportista)
                    .addComponent(txtContraseniaRegTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pnlRegTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRegTransportista)
                    .addComponent(btnSalirRegTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(pnlRegTransporte, "regTransporte");

        lblRegistrarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblRegistrarAdministrador.setText("Registro de Administrador");

        lblNombreRegAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreRegAdministrador.setText("Nombre:");

        lblContraseniaRegAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseniaRegAdministrador.setText("Contraseña");

        txtNombreRegAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreRegAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegAdministradorActionPerformed(evt);
            }
        });

        txtContraseniaRegAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAgregarRegAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarRegAdministrador.setText("Agregar");

        btnSalirRegvAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalirRegvAdministrador.setText("Salir");
        btnSalirRegvAdministrador.setPreferredSize(new java.awt.Dimension(81, 26));

        javax.swing.GroupLayout pnlRegAdministradorLayout = new javax.swing.GroupLayout(pnlRegAdministrador);
        pnlRegAdministrador.setLayout(pnlRegAdministradorLayout);
        pnlRegAdministradorLayout.setHorizontalGroup(
            pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegAdministradorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrarAdministrador)
                    .addGroup(pnlRegAdministradorLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContraseniaRegAdministrador)
                            .addComponent(lblNombreRegAdministrador)
                            .addComponent(btnAgregarRegAdministrador))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContraseniaRegAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreRegAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalirRegvAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegAdministradorLayout.setVerticalGroup(
            pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegAdministradorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRegistrarAdministrador)
                .addGap(43, 43, 43)
                .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreRegAdministrador)
                    .addComponent(txtNombreRegAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContraseniaRegAdministrador)
                    .addComponent(txtContraseniaRegAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(pnlRegAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRegAdministrador)
                    .addComponent(btnSalirRegvAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(pnlRegAdministrador, "regAdministrador");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProductorActionPerformed
        CardLayout cl = (CardLayout) (this.getContentPane().getLayout());
        cl.show(this.getContentPane(), "regProductor");
        this.setTitle("Registro de Productor");
    }//GEN-LAST:event_btnRegProductorActionPerformed

    private void btnRegTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegTransporteActionPerformed
        CardLayout cl = (CardLayout) (this.getContentPane().getLayout());
        cl.show(this.getContentPane(), "regTransporte");
        this.setTitle("Registro de Transporte");
    }//GEN-LAST:event_btnRegTransporteActionPerformed

    private void btnAgregarQuimicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarQuimicoActionPerformed
        // TODO add your handling code here:
        agregarQuimico();
        
    }//GEN-LAST:event_btnAgregarQuimicoActionPerformed

    private void btnRegQuimicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegQuimicoActionPerformed
        //quimicosDAO = new QuimicosDAO(new ConexionBD());
        CardLayout cl = (CardLayout) (this.getContentPane().getLayout());
        cl.show(this.getContentPane(), "regQuimico");
        this.setTitle("Registro de Quimico");
    }//GEN-LAST:event_btnRegQuimicoActionPerformed

    private void btnSalirQuimicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirQuimicoActionPerformed
        // TODO add your handling code here:

        regresar();
    }//GEN-LAST:event_btnSalirQuimicoActionPerformed

    private void btnSaliRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaliRegistroActionPerformed

        dispose();
    }//GEN-LAST:event_btnSaliRegistroActionPerformed

    private void btnNombreRegProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreRegProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNombreRegProductorActionPerformed

    private void btnContraseniaRegProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseniaRegProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContraseniaRegProductorActionPerformed

    private void btnAgregarProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductorActionPerformed

    private void btnSalirProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProductorActionPerformed
        // TODO add your handling code here:
        regresar();
    }//GEN-LAST:event_btnSalirProductorActionPerformed

    private void txtNombreRegTransportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegTransportistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegTransportistaActionPerformed

    private void txtNombreRegAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegAdministradorActionPerformed

    private void btnRegAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAdministradorActionPerformed
        CardLayout cl = (CardLayout) (this.getContentPane().getLayout());
        cl.show(this.getContentPane(), "regAdministrador");
        this.setTitle("Registro de Administrador");
    }//GEN-LAST:event_btnRegAdministradorActionPerformed

    private void btnSalirRegTransportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRegTransportistaActionPerformed
        regresar();
    }//GEN-LAST:event_btnSalirRegTransportistaActionPerformed

    private void regresar() {
        CardLayout cl = (CardLayout) (this.getContentPane().getLayout());
        cl.show(this.getContentPane(), "registro");
        this.setTitle("Administración");
    }

    private void limpiarQumico() {
        txtNombreQuimico.setText("");
    }

    private void agregarQuimico() {
        String nombreQuimico = this.txtNombreQuimico.getText();
        Quimico quimico = new Quimico(nombreQuimico);
        boolean seAgrego =negocio.agregarQuimico(quimico);
        if (seAgrego) {
            JOptionPane.showMessageDialog(this, "Se agrego el quimico", "información", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarQumico();
        } else {
            JOptionPane.showMessageDialog(this, "No fue posible agregar el quimico", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProductor;
    private javax.swing.JButton btnAgregarQuimico;
    private javax.swing.JButton btnAgregarRegAdministrador;
    private javax.swing.JButton btnAgregarRegTransportista;
    private javax.swing.JTextField btnContraseniaRegProductor;
    private javax.swing.JTextField btnNombreRegProductor;
    private javax.swing.JButton btnRegAdministrador;
    private javax.swing.JButton btnRegProductor;
    private javax.swing.JButton btnRegQuimico;
    private javax.swing.JButton btnRegTransporte;
    private javax.swing.JButton btnSaliRegistro;
    private javax.swing.JButton btnSalirProductor;
    private javax.swing.JButton btnSalirQuimico;
    private javax.swing.JButton btnSalirRegTransportista;
    private javax.swing.JButton btnSalirRegvAdministrador;
    private javax.swing.JLabel lblContraseniaRegAdministrador;
    private javax.swing.JLabel lblContraseniaRegProductor;
    private javax.swing.JLabel lblContraseniaRegTransportista;
    private javax.swing.JLabel lblNombreQuimico;
    private javax.swing.JLabel lblNombreRegAdministrador;
    private javax.swing.JLabel lblNombreRegProductor;
    private javax.swing.JLabel lblNombreRegTransportista;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistrarAdministrador;
    private javax.swing.JLabel lblRegistrarProductor;
    private javax.swing.JLabel lblRegistrarTransportista;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlRegAdministrador;
    private javax.swing.JPanel pnlRegQuimico;
    private javax.swing.JPanel pnlRegTransporte;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegproductor;
    private javax.swing.JTextField txtContraseniaRegAdministrador;
    private javax.swing.JTextField txtContraseniaRegTransportista;
    private javax.swing.JTextField txtNombreQuimico;
    private javax.swing.JTextField txtNombreRegAdministrador;
    private javax.swing.JTextField txtNombreRegTransportista;
    // End of variables declaration//GEN-END:variables


}