/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evraktakip_v2;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Uğur Durmuş
 */
public class FrameLogin extends javax.swing.JFrame {
//   Doktor d = new Doktor("duralog", "nick", "1234", 1234, "Dahiliye");
//    Hasta h = new Hasta("Ugur", "Durmus", "4321", 4321);
    Random r = new Random();
    int ilk = r.nextInt(10);
    int ikinci = r.nextInt(10);

    public FrameLogin() {
        initComponents();
        jLabel7.setText(String.valueOf(ilk));
        jLabel9.setText(String.valueOf(ikinci));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDokId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordDok = new javax.swing.JPasswordField();
        jTextHastaId = new javax.swing.JTextField();
        jPasswordHasta = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jTextDokId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDokIdActionPerformed(evt);
            }
        });

        jButton1.setText("Giriş Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordDok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordDokActionPerformed(evt);
            }
        });

        jButton2.setText("Giriş Yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setText("Yeni Kayıt Oluştur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Şifre:");

        jLabel3.setText("Id:");

        jLabel4.setText("Şifre:");

        jLabel5.setText("Doktor Girişi");

        jLabel6.setText("Hasta Girişi");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 102));
        jLabel7.setText("100");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("+");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 255));
        jLabel9.setText("100");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordDok, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jTextDokId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextHastaId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPasswordHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel6)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97)
                        .addComponent(jButton2)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHastaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDokId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordDok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String iDesen = "^[A-z]";
        Pattern p = Pattern.compile(iDesen);
        Matcher m = p.matcher(jTextField1.getText());
        boolean anaKontrol = true;
        if (jTextDokId.getText().isEmpty() && String.copyValueOf(jPasswordDok.getPassword()).isEmpty() && jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lüften gerekli alanları boş bırakmayın!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {

            Doktor d = new Doktor();
            int i = Integer.parseInt(jTextDokId.getText());
            int a = 0;
            String s = String.copyValueOf(jPasswordDok.getPassword());
            boolean varmi = false;
            boolean kontrol = false;
            boolean kontrol2 = false;
            boolean kontrol3 = true;
            if (jTextField1.getText().isEmpty()) {
                kontrol3 = false;
                JOptionPane.showMessageDialog(this, "Lüften işlem sonucunu boş bırakmayın!", "Hata", JOptionPane.ERROR_MESSAGE);
            } else {

                if (m.find()) {

                    JOptionPane.showMessageDialog(this, "Lüften işlem sonucuna rakam giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    kontrol2 = true;
                    a = Integer.parseInt(jTextField1.getText());

                    if (ilk + ikinci == a && kontrol2) {
                        kontrol = true;
                    } else if (kontrol2) {
                        ilk = r.nextInt(100);
                        ikinci = r.nextInt(100);
                        jLabel7.setText(String.valueOf(ilk));
                        jLabel9.setText(String.valueOf(ikinci));
                        JOptionPane.showMessageDialog(this, "Lüften işlem sonucuna doğru giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Lütfen girdilerinizi kontrol ediniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    }

                    for (Doktor doktor : Doktor.doktors) {

                        if (i == doktor.id && s.equals(doktor.password)) {
                            varmi = true;
                            d = doktor;
                            break;
                        }
                    }

                    if (varmi && kontrol) {
                        FrameDok f = new FrameDok(d);
                        f.setVisible(true);
                        this.dispose();
                    } else if (!varmi) {
                        reset();
                        JOptionPane.showMessageDialog(this, "Kullanıcı id veya şifre hatalı", "Hata", JOptionPane.ERROR_MESSAGE);
                    } else {
                        reset();
                    }
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String iDesen = "^[A-z]";
        Pattern p = Pattern.compile(iDesen);
        Matcher m = p.matcher(jTextField1.getText());

        boolean anaKontrol = true;
        if (jTextHastaId.getText().isEmpty() && String.copyValueOf(jPasswordHasta.getPassword()).isEmpty() && jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lüften gerekli alanları boş bırakmayın!", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {

            boolean kontrol = false;
            boolean kontrol2 = false;
            boolean kontrol3 = true;
            int a = 0;

            Hasta h = new Hasta();
            int i = Integer.parseInt(jTextHastaId.getText());
            String s = String.copyValueOf(jPasswordHasta.getPassword());
            boolean varmi = false;

            if (jTextField1.getText().isEmpty()) {
                kontrol3 = false;
                JOptionPane.showMessageDialog(this, "Lüften işlem sonucunu boş bırakmayınız!", "Hata", JOptionPane.ERROR_MESSAGE);
            } else {

                if (m.find()) {

                    JOptionPane.showMessageDialog(this, "Lüften işlem sonucuna rakam giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    kontrol2 = true;
                    a = Integer.parseInt(jTextField1.getText());

                    if (ilk + ikinci == a && kontrol2) {
                        kontrol = true;
                    } else if (kontrol2) {
                        ilk = r.nextInt(100);
                        ikinci = r.nextInt(100);
                        jLabel7.setText(String.valueOf(ilk));
                        jLabel9.setText(String.valueOf(ikinci));
                        JOptionPane.showMessageDialog(this, "Lüften işlem sonucuna doğru giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Lütfen girdilerinizi kontrol ediniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    }

                    for (Hasta hasta : Hasta.hastalar) {
                        if (i == hasta.id && s.equals(hasta.pass)) {
                            varmi = true;
                            h = hasta;
                        }
                    }

                    if (varmi && kontrol) {
                        FrameHasta f = new FrameHasta(h);
                        f.setVisible(true);
                        this.dispose();
                    } else if (!varmi) {
                        reset();
                        JOptionPane.showMessageDialog(this, "Kullanıcı id veya şifre hatalı", "Hata", JOptionPane.ERROR_MESSAGE);
                    } else {
                        reset();
                    }

                    //
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FrameRegister r = new FrameRegister();
        r.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextDokIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDokIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDokIdActionPerformed

    private void jPasswordDokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordDokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordDokActionPerformed

    void reset() {
        jTextDokId.setText("");
        jPasswordDok.setText("");
        jPasswordHasta.setText("");
        jTextHastaId.setText("");
        jTextField1.setText("");
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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordDok;
    private javax.swing.JPasswordField jPasswordHasta;
    private javax.swing.JTextField jTextDokId;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextHastaId;
    // End of variables declaration//GEN-END:variables
}
