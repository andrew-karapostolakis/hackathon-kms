/* Andrew Karapostolakis
   2016-12-03
   Calculates logarithms*/
package hackathon.kms;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author Andrew
 */
public class log extends javax.swing.JFrame {

    /**
     * Creates new form log
     */
    public log() {
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

        lblPrimary = new javax.swing.JLabel();
        lblArg = new javax.swing.JLabel();
        txtfieldArg = new javax.swing.JTextField();
        txtfieldBase = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();
        btnLog10 = new javax.swing.JButton();
        btnLogE = new javax.swing.JButton();
        btnLogB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logarithm calculator");

        lblPrimary.setText("Enter the logarithm to be calculated below:");

        lblArg.setText("Argument");

        lblBase.setText("Base");

        btnLog10.setText("Calculate log");
        btnLog10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLog10ActionPerformed(evt);
            }
        });

        btnLogE.setText("Calculate ln");
        btnLogE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogEActionPerformed(evt);
            }
        });

        btnLogB.setText("Calculate log (custom base)");
        btnLogB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrimary)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfieldArg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblArg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBase)
                            .addComponent(txtfieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLog10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogE))
                    .addComponent(btnLogB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArg)
                    .addComponent(lblBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldArg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLog10)
                    .addComponent(btnLogE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLog10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLog10ActionPerformed
        //get argument from text field
        double argument = Double.parseDouble(txtfieldArg.getText());
        //calculate log base 10
        double answer = Math.log10(argument);
        JOptionPane.showMessageDialog(null, "The log of " + argument + " is " + answer + ".");
    }//GEN-LAST:event_btnLog10ActionPerformed

    private void btnLogEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogEActionPerformed
        //get argument from text field
        double argument = Double.parseDouble(txtfieldArg.getText());
        //calculate log base e
        double answer = Math.log(argument);
        JOptionPane.showMessageDialog(null, "The ln of " + argument + " is " + answer + ".");
    }//GEN-LAST:event_btnLogEActionPerformed

    private void btnLogBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogBActionPerformed
        //get argument from text field
        double argument = Double.parseDouble(txtfieldArg.getText());
        //get base from text field
        double base = Double.parseDouble(txtfieldBase.getText());
        //calculate log with custom base
        double answer = Math.log(argument) / Math.log(base);
        JOptionPane.showMessageDialog(null, "The log of " + argument + " base " + base + " is " + answer + ".");
    }//GEN-LAST:event_btnLogBActionPerformed

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
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog10;
    private javax.swing.JButton btnLogB;
    private javax.swing.JButton btnLogE;
    private javax.swing.JLabel lblArg;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblPrimary;
    private javax.swing.JTextField txtfieldArg;
    private javax.swing.JTextField txtfieldBase;
    // End of variables declaration//GEN-END:variables
}
