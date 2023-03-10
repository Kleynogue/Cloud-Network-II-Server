/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import modelo.Usuario;

/**
 *
 * @author emgl_
 */
public class InicioServidor extends javax.swing.JFrame {
    private Usuario usuario;
    /**
     * Creates new form Login
     */
    
    public InicioServidor(Usuario usuario) {
        this.usuario = new Usuario();
        this.usuario = usuario;
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

        ladoSuperior = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JButton();
        ladoInferior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cloud Network");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ladoSuperior.setBackground(new java.awt.Color(44, 90, 122));
        ladoSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuario: "+usuario.getUsuario());
        ladoSuperior.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Puerto:");
        ladoSuperior.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Direccion IP:");
        ladoSuperior.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cloud Network");
        ladoSuperior.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 270, 50));

        botonCerrarSesion.setText("Cerrar Sesi??n");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        ladoSuperior.add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 160, 30));

        getContentPane().add(ladoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        ladoInferior.setBackground(new java.awt.Color(255, 255, 255));
        ladoInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spReportes.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        ladoInferior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 220, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spAdministrarUsuario.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        ladoInferior.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 220, 300));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spSuperusuario.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        ladoInferior.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 220, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spConfiguracionConexion.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        ladoInferior.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 330, 90));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        ladoInferior.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 220, 300));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spConfiguracionCuenta.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        ladoInferior.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 330, 90));

        getContentPane().add(ladoInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pAdministrarUsuario.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spAdministrarUsuario.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pSuperusuario.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
       jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spSuperusuario.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pReportes.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spReportes.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pConfiguracionCuenta.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spConfiguracionCuenta.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pConfiguracionConexion.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spConfiguracionConexion.jpg"))); // NOI18N
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        AdministrarUsuarios ventanaAdminUsuarios = new AdministrarUsuarios();
        ventanaAdminUsuarios.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel ladoInferior;
    private javax.swing.JPanel ladoSuperior;
    // End of variables declaration//GEN-END:variables
}
