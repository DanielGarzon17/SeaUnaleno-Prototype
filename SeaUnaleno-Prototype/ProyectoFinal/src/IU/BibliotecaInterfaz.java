/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import java.awt.Desktop;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author delog
 */
public class BibliotecaInterfaz extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;

    public BibliotecaInterfaz() {
        initComponents();
        this.pintarImagen(lblimagen1, "src/RECURSOS/SEAUNALENOLOGO.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBiblioteca = new javax.swing.JLabel();
        Bmaterial = new javax.swing.JButton();
        Bpruebas = new javax.swing.JButton();
        Bsolucionarios = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblimagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(100, 100, 100, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(19, 99, 223));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 500));

        lblBiblioteca.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RECURSOS/LIBRO.png"))); // NOI18N
        lblBiblioteca.setText("BIBLIOTECA");

        Bmaterial.setBackground(new java.awt.Color(255, 255, 255));
        Bmaterial.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Bmaterial.setForeground(new java.awt.Color(6, 40, 61));
        Bmaterial.setText("MATERIAL ORGANIZADO");
        Bmaterial.setToolTipText("");
        Bmaterial.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        Bmaterial.setBorderPainted(false);
        Bmaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bmaterial.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Bmaterial.setName(""); // NOI18N
        Bmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmaterialActionPerformed(evt);
            }
        });

        Bpruebas.setBackground(new java.awt.Color(255, 255, 255));
        Bpruebas.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Bpruebas.setForeground(new java.awt.Color(6, 40, 61));
        Bpruebas.setText("PRUEBAS PDF");
        Bpruebas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Bpruebas.setBorderPainted(false);
        Bpruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpruebasActionPerformed(evt);
            }
        });

        Bsolucionarios.setBackground(new java.awt.Color(255, 255, 255));
        Bsolucionarios.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Bsolucionarios.setForeground(new java.awt.Color(6, 40, 61));
        Bsolucionarios.setText("SOLUCIONARIOS");
        Bsolucionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Bsolucionarios.setBorderPainted(false);
        Bsolucionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsolucionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bmaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(Bpruebas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bsolucionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblBiblioteca)
                .addGap(35, 35, 35)
                .addComponent(Bmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bpruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsolucionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 300));

        lblimagen1.setBackground(new java.awt.Color(255, 255, 255));
        lblimagen1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 290, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmaterialActionPerformed
        AbrirLinks("https://drive.google.com/drive/folders/1JLz1OD87OnvcxlUII1-NtFVm3cPDZx6M?usp=sharing");
    }//GEN-LAST:event_BmaterialActionPerformed

    private void BpruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpruebasActionPerformed
        AbrirLinks("https://drive.google.com/drive/folders/1EW0_3TU3OdEDDSfOtA_Tw-A2Js_kqMf6?usp=sharing");
    }//GEN-LAST:event_BpruebasActionPerformed

    private void BsolucionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsolucionariosActionPerformed
        AbrirLinks("https://drive.google.com/file/d/1SEBz0XUWBBvpcMZnDvqh7wNh_fcPMOQz/view?usp=sharing");
    }//GEN-LAST:event_BsolucionariosActionPerformed

    private void pintarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }

    public void AbrirLinks(String str) {
        if (java.awt.Desktop.isDesktopSupported()) {
            Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    java.net.URI url = new java.net.URI(str);
                    desktop.browse(url);
                } catch (Exception e) {
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaInterfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bmaterial;
    private javax.swing.JButton Bpruebas;
    private javax.swing.JButton Bsolucionarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblimagen1;
    // End of variables declaration//GEN-END:variables
}
