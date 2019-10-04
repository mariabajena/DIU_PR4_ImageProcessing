
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cayetano
 */
public class myFrame extends javax.swing.JFrame {
    /**
     * Creates new form myFrame
     */
    
    
    public myFrame() {
        initComponents();
        
        rb1.setSelected(true);
        rb2.setSelected(false);
        rb3.setSelected(false);
        
        CheckBoxRed.setSelected(true);
        CheckBoxBlue.setSelected(true);
        CheckBoxGreen.setSelected(true);
        CheckBoxAll.setSelected(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup = new javax.swing.ButtonGroup();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        myJPanel1 = new myJPanel();
        CheckBoxRed = new javax.swing.JCheckBox();
        CheckBoxBlue = new javax.swing.JCheckBox();
        CheckBoxGreen = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        CheckBoxAll = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgroup.add(rb1);
        rb1.setText("arriba - izquierda");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        bgroup.add(rb2);
        rb2.setText("arriba - derecha");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        bgroup.add(rb3);
        rb3.setText("abajo - izquierda");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myJPanel1Layout = new javax.swing.GroupLayout(myJPanel1);
        myJPanel1.setLayout(myJPanel1Layout);
        myJPanel1Layout.setHorizontalGroup(
            myJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        myJPanel1Layout.setVerticalGroup(
            myJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        CheckBoxRed.setText("Canal rojo");
        CheckBoxRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxRedActionPerformed(evt);
            }
        });

        CheckBoxBlue.setText("Canal azul");
        CheckBoxBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBlueActionPerformed(evt);
            }
        });

        CheckBoxGreen.setText("Canal verde");
        CheckBoxGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreenActionPerformed(evt);
            }
        });

        bgroup.add(jRadioButton1);
        jRadioButton1.setText("abajo - derecha");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        CheckBoxAll.setText("Canal todos");
        CheckBoxAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAllActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Filtrado de colores:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ubicación del icono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb1)
                            .addComponent(rb3))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(rb2)))
                    .addComponent(jLabel2))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBoxAll)
                        .addGap(18, 18, 18)
                        .addComponent(CheckBoxRed)
                        .addGap(18, 18, 18)
                        .addComponent(CheckBoxGreen)
                        .addGap(18, 18, 18)
                        .addComponent(CheckBoxBlue))
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxRed)
                        .addComponent(CheckBoxBlue)
                        .addComponent(CheckBoxGreen)
                        .addComponent(CheckBoxAll))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb1)
                        .addComponent(rb2)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb3)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(myJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
               //System.out.print("Botón cambiado");        // TODO add your handling code here:
               System.out.print(rb1.isSelected()); 
               myJPanel1.whichAlignment(0);
               repaint();
    }//GEN-LAST:event_rb1ActionPerformed

    private void CheckBoxRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxRedActionPerformed
        myJPanel1.invertMode(CheckBoxRed.isSelected(), true, false, false);
    }//GEN-LAST:event_CheckBoxRedActionPerformed

    private void CheckBoxGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxGreenActionPerformed
      myJPanel1.invertMode(CheckBoxGreen.isSelected(), false, true, false);
    }//GEN-LAST:event_CheckBoxGreenActionPerformed

    private void CheckBoxBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBlueActionPerformed
        myJPanel1.invertMode(CheckBoxBlue.isSelected(), false, false, true);
    }//GEN-LAST:event_CheckBoxBlueActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        System.out.print(rb1.isSelected()); 
        myJPanel1.whichAlignment(3);
        repaint();    }//GEN-LAST:event_rb3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        System.out.print(rb1.isSelected()); 
        myJPanel1.whichAlignment(2);
        repaint();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        System.out.print(rb1.isSelected()); 
        myJPanel1.whichAlignment(1);
        repaint();    }//GEN-LAST:event_rb2ActionPerformed

    private void CheckBoxAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAllActionPerformed
       if(CheckBoxAll.isSelected()) myJPanel1.invertMode(CheckBoxAll.isSelected(), true, true, true);
    }//GEN-LAST:event_CheckBoxAllActionPerformed

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
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxAll;
    private javax.swing.JCheckBox CheckBoxBlue;
    private javax.swing.JCheckBox CheckBoxGreen;
    private javax.swing.JCheckBox CheckBoxRed;
    private javax.swing.ButtonGroup bgroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private myJPanel myJPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    // End of variables declaration//GEN-END:variables
}
