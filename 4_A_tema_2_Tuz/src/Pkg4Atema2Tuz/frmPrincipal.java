/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg4Atema2Tuz;

import java.util.ArrayList;


public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Biseccion = new javax.swing.JMenuItem();
        Aproximacion = new javax.swing.JMenuItem();
        Newton = new javax.swing.JMenuItem();
        Secante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setText("Metodos Ecuaciones No Lineales");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Biseccion.setText("Bisección");
        Biseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiseccionActionPerformed(evt);
            }
        });
        jMenu1.add(Biseccion);

        Aproximacion.setText("Aproximaciones");
        Aproximacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AproximacionActionPerformed(evt);
            }
        });
        jMenu1.add(Aproximacion);

        Newton.setText("Newton");
        Newton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewtonActionPerformed(evt);
            }
        });
        jMenu1.add(Newton);

        Secante.setText("Secante");
        Secante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecanteActionPerformed(evt);
            }
        });
        jMenu1.add(Secante);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void BiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiseccionActionPerformed
       dnjBiseccion dlg = new dnjBiseccion(this, true);
       dlg.setSize(600,400);
       dlg.setVisible(true);
    }//GEN-LAST:event_BiseccionActionPerformed

    private void AproximacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AproximacionActionPerformed
        // TODO add your handling code here: 
       dnjAproximacion dlg = new dnjAproximacion(this, true);
       dlg.setSize(600,400);
       dlg.setVisible(true);
    }//GEN-LAST:event_AproximacionActionPerformed

    private void NewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewtonActionPerformed
        // TODO add your handling code here:
      dnjNewton dlg = new dnjNewton(this, true);
       dlg.setSize(600,400);
       dlg.setVisible(true);
    }//GEN-LAST:event_NewtonActionPerformed

    private void SecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecanteActionPerformed
        // TODO add your handling code here: 
       dnjSecante dlg = new dnjSecante(this, true);
       dlg.setSize(600,400);
       dlg.setVisible(true);
    }//GEN-LAST:event_SecanteActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aproximacion;
    private javax.swing.JMenuItem Biseccion;
    private javax.swing.JMenuItem Newton;
    private javax.swing.JMenuItem Secante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
