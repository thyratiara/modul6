/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM
 */
public class Pemilihandokter extends javax.swing.JFrame {

    /**
     * Creates new form Pemilihandokter
     */
    public Pemilihandokter() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dokterspesialis = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jeniskelamin = new javax.swing.JTextField();
        golongandarah = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        kewarganegaraan = new javax.swing.JTextField();
        waktupraktek = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 150, 30);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 70, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu --", "DR. Farras Yassar", "DR. Dian Sikahita", "DR. Harun Ulum Fajar", " " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 50, 140, 20);

        jLabel3.setText("Identitas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 100, 14);

        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 80, 14);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 190, 100, 14);

        jLabel6.setText("Usia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 110, 14);

        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 270, 130, 20);

        jLabel8.setText("Golongan Darah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 310, 130, 14);

        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 350, 100, 14);

        jLabel10.setText("Kewarganegaraan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 390, 110, 14);

        jLabel11.setText("Waktu Praktek");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 430, 140, 14);

        jLabel12.setText("Dokter Spesialis");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 470, 120, 14);

        dokterspesialis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterspesialisActionPerformed(evt);
            }
        });
        getContentPane().add(dokterspesialis);
        dokterspesialis.setBounds(120, 470, 190, 20);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(120, 150, 190, 20);

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(120, 190, 190, 20);

        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });
        getContentPane().add(usia);
        usia.setBounds(120, 230, 190, 20);

        jeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniskelaminActionPerformed(evt);
            }
        });
        getContentPane().add(jeniskelamin);
        jeniskelamin.setBounds(120, 270, 190, 20);

        golongandarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golongandarahActionPerformed(evt);
            }
        });
        getContentPane().add(golongandarah);
        golongandarah.setBounds(120, 310, 190, 20);

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status);
        status.setBounds(120, 350, 190, 20);

        kewarganegaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kewarganegaraanActionPerformed(evt);
            }
        });
        getContentPane().add(kewarganegaraan);
        kewarganegaraan.setBounds(120, 390, 190, 20);

        waktupraktek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktupraktekActionPerformed(evt);
            }
        });
        getContentPane().add(waktupraktek);
        waktupraktek.setBounds(120, 430, 190, 20);

        setBounds(0, 0, 416, 572);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().equals("DR. Farras Yassar")){
            nama.setText("DR.Farras Yassar");
            alamat.setText("Jl. Surabaya 16, Malang");
            usia.setText("20 Tahun");
            jeniskelamin.setText("Laki-laki");
            golongandarah.setText("A");
            status.setText("Belum Menikah");
            kewarganegaraan.setText("Indonesia");
            dokterspesialis.setText("Dokter Umum");
            waktupraktek.setText("Pagi (07.00-15.00)");
        }
        else
            
            if (jComboBox1.getSelectedItem().equals("DR. Dian Sikahita")){
            nama.setText("DR. Dian Sikahita");
            alamat.setText("Jl. Veteran 3, Malang");
            usia.setText("20 Tahun");
            jeniskelamin.setText("Perempuan");
            golongandarah.setText("O");
            status.setText("Belum Menikah");
            kewarganegaraan.setText("Indonesia");
            dokterspesialis.setText("Dokter Gigi");
            waktupraktek.setText("Sore (16.00-22.00)");
            
    }else 
            if(jComboBox1.getSelectedItem().equals("DR. Harun Ulum Fajar")){
            nama.setText("DR. Harun Ulum Fajar");
            alamat.setText("Jl. Bandung 9, Malang");
            usia.setText("20 Tahun");
            jeniskelamin.setText("Laki-laki");
            golongandarah.setText("B");
            status.setText("Belum Menikah");
            kewarganegaraan.setText("Indonesia");
            dokterspesialis.setText("Dokter Gizi");
            waktupraktek.setText("Malam (22.00-06.00)");
    }//GEN-LAST:event_jComboBox1ActionPerformed
    }
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void dokterspesialisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterspesialisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dokterspesialisActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usiaActionPerformed

    private void jeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeniskelaminActionPerformed

    private void golongandarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golongandarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golongandarahActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void kewarganegaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kewarganegaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kewarganegaraanActionPerformed

    private void waktupraktekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktupraktekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktupraktekActionPerformed

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
            java.util.logging.Logger.getLogger(Pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemilihandokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField dokterspesialis;
    private javax.swing.JTextField golongandarah;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jeniskelamin;
    private javax.swing.JTextField kewarganegaraan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktupraktek;
    // End of variables declaration//GEN-END:variables
}
