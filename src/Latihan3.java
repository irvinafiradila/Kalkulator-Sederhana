/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irvina
 */
public class Latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan3
     */
    public Latihan3() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bil2 = new javax.swing.JTextField();
        bil1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Bagi = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(132, 11, 136, 17);

        jLabel2.setText("Bilangan 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(62, 60, 75, 14);

        jLabel3.setText("Bilangan 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(62, 107, 85, 14);
        getContentPane().add(bil2);
        bil2.setBounds(188, 99, 99, 31);

        bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bil1ActionPerformed(evt);
            }
        });
        getContentPane().add(bil1);
        bil1.setBounds(188, 52, 99, 31);

        jLabel4.setText("Operator");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(175, 148, 93, 14);

        Bagi.setBackground(new java.awt.Color(255, 102, 102));
        Bagi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bagi.setText(":");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        getContentPane().add(Bagi);
        Bagi.setBounds(144, 189, 37, 32);

        Tambah.setBackground(new java.awt.Color(255, 102, 102));
        Tambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah);
        Tambah.setBounds(214, 189, 43, 32);

        Kali.setBackground(new java.awt.Color(255, 102, 102));
        Kali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Kali.setText("x");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kali);
        Kali.setBounds(74, 189, 39, 32);

        Kurang.setBackground(new java.awt.Color(255, 102, 102));
        Kurang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        getContentPane().add(Kurang);
        Kurang.setBounds(290, 189, 37, 32);

        jLabel5.setText("Hasil");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(178, 232, 70, 14);
        getContentPane().add(TF);
        TF.setBounds(144, 252, 101, 45);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 410, 310);

        setBounds(0, 0, 424, 347);
    }// </editor-fold>//GEN-END:initComponents

    private void bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bil1ActionPerformed

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
    int bilangan1 = Integer.parseInt(bil1.getText());
    int bilangan2 = Integer.parseInt(bil2.getText());
    int hasilkali = bilangan1*bilangan2;
    TF.setText(String.valueOf(hasilkali));// TODO add your handling code here:
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
    double bilangan1 = Integer.parseInt(bil1.getText());
    double bilangan2 = Integer.parseInt(bil2.getText());
    double hasilbagi = bilangan1/bilangan2;
    TF.setText(String.valueOf(hasilbagi));        // TODO add your handling code here:
    }//GEN-LAST:event_BagiActionPerformed

    
    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
    int bilangan1 = Integer.parseInt(bil1.getText());
    int bilangan2 = Integer.parseInt(bil2.getText());
    int hasiltambah = bilangan1+bilangan2;
    TF.setText(String.valueOf(hasiltambah));        // TODO add your handling code here:
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
    int bilangan1 = Integer.parseInt(bil1.getText());
    int bilangan2 = Integer.parseInt(bil2.getText());
    int hasilkurang = bilangan1-bilangan2;
    TF.setText(String.valueOf(hasilkurang));        // TODO add your handling code here:
    }//GEN-LAST:event_KurangActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JTextField TF;
    private javax.swing.JButton Tambah;
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
