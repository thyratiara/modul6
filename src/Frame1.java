/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM
 */
public final class Frame1 extends javax.swing.JFrame {
String jns = " ";
int jml;

    /**
     * Creates new form Frame1
     */
    
    public Frame1() {
        initComponents();
getJumlah();
setJenis();
panel.setVisible(false);
ss.setEnabled(false);
bil3.setVisible(false);
bil4.setVisible(false);
b3.setVisible(false);
b4.setVisible(false);
b1.setVisible(false);
bil2.setVisible(false);
b1.setVisible(false);
b2.setVisible(false);
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
        jenis = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        ss = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        bil2 = new javax.swing.JLabel();
        bil3 = new javax.swing.JLabel();
        bil4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        thasil = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        pilihanbil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROGRAM ARITMATIKA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 10, 250, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Jenis Aritmatika");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 60, 150, 15);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        jPanel1.add(jenis);
        jenis.setBounds(216, 60, 150, 20);

        panel.setBackground(new java.awt.Color(204, 204, 255));

        ss.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ss.setText("Jumlah Bilangan");

        bil1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bil1.setText("Bilangan 1");

        bil2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bil2.setText("Bilangan 2");

        bil3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bil3.setText("Bilangan 3");

        bil4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bil4.setText("Bilangan 4");

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pilihanbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        pilihanbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanbilActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Operasi");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bil4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bil2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bil1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                    .addGap(51, 51, 51))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(bil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(ss)
                                .addGap(101, 101, 101)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pilihanbil, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(116, 116, 116))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(thasil, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ss)
                    .addComponent(pilihanbil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil1)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil2)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil3)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(bil4)
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thasil, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel);
        panel.setBounds(20, 100, 360, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 470);

        setBounds(0, 0, 416, 507);
    }// </editor-fold>//GEN-END:initComponents

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        setJenis();
    }
    public void setJenis(){
if(jenis.getSelectedItem().equals("Penjumlahan")){
jns = "Penjumlahan";
ket.setText("Penjumlahan");
panel.setVisible(true);
ss.setEnabled(true);
}
else if(jenis.getSelectedItem().equals("Pengurangan")){
jns = "Pengurangan";
ket.setText("pengurangan");
panel.setVisible(true);
ss.setEnabled(true);
    
}
else if(jenis.getSelectedItem().equals("Perkalian")){
jns = "Perkalian";
ket.setText("Perkalian");
panel.setVisible(true);
ss.setEnabled(true);
}
else if(jenis.getSelectedItem().equals("Pembagian")){
jns = "Pembagian";
ket.setText("Pembagian");
panel.setVisible(true);
ss.setEnabled(true);}
// TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void pilihanbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanbilActionPerformed
getJumlah();

}

public void getJumlah(){
if(pilihanbil.getSelectedItem().equals("2")){
bil3.setVisible(false);
bil4.setVisible(false);
b3.setVisible(false);
b4.setVisible(false);
bil1.setVisible(true);
bil2.setVisible(true);
b1.setVisible(true);
b2.setVisible(true);
jml = 2;
} else if (pilihanbil.getSelectedItem().equals("3")){
bil1.setVisible(true);
bil2.setVisible(true);
b1.setVisible(true);
b2.setVisible(true);
bil3.setVisible(true);
bil4.setVisible(false);
b3.setVisible(true);
b4.setVisible(false);
jml = 3;
} else 
    if (pilihanbil.getSelectedItem().equals("4")){
bil1.setVisible(true);
bil2.setVisible(true);
b1.setVisible(true);
b2.setVisible(true);
bil3.setVisible(true);
bil4.setVisible(true);
b3.setVisible(true);
b4.setVisible(true);
jml = 4; }// TODO add your handling code here:
    }//GEN-LAST:event_pilihanbilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    double hsl = 0.0;
double a1, a2, a3, a4;
a1 = Double.parseDouble(b1.getText().toString());
a2 = Double.parseDouble(b2.getText().toString());
a3 = Double.parseDouble(b3.getText().toString());
a4 = Double.parseDouble(b4.getText().toString());

if(jns.equals("Penjumlahan")){
if(jml == 2){
hsl = a1+a2;
thasil.setText(" "+a1+ " + " +a2 + " = "+hsl);
}
if(jml == 3){
hsl = a1+a2+a3;
thasil.setText(" "+a1+ " + " +a2 + " + " +a3 + "= "+hsl);
}
if(jml == 4){
hsl = a1+a2+a3+a4;
thasil.setText(" "+a1+ " + " +a2 + " + " +a3 + "+" +a4 + "= "+hsl);
}
}
else if(jns.equals("Pengurangan")){
if(jml == 2){
hsl = a1-a2;
thasil.setText(""+a1 + " - " +a2 + " - " +hsl);}
if(jml == 3){
hsl = a1-a2-a3;
thasil.setText(" "+a1+ " - " +a2 + " - " +a3 + "= "+hsl);
}
if(jml == 4){
hsl = a1-a2-a3-a4;
thasil.setText(" "+a1+ " - " +a2 + " - " +a3 + "-" +a4 + "= "+hsl);
}
}
else if(jns.equals("Pembagian")){
if(jml == 2){
hsl = a1/a2;
thasil.setText(""+a1 + " / " +a2 + " / " +hsl);}
if(jml == 3){
hsl = a1/a2/a3;
thasil.setText(" "+a1+ " / " +a2 + " / " +a3 + "= "+hsl);
}
if(jml == 4){
hsl = a1/a2/a3/a4;
thasil.setText(" "+a1+ " / " +a2 + " / " +a3 + "/" +a4 + "= "+hsl);
}
}
else if(jns.equals("Perkalian")){
if(jml == 2){
hsl = a1*a2;
thasil.setText(""+a1 + " * " +a2 + " * " +hsl);
if(jml == 3){
hsl = a1*a2*a3;
thasil.setText(" "+a1+ " * " +a2 + " * " +a3 + "= "+hsl);
}
if(jml == 4){
hsl = a1*a2*a3*a4;
thasil.setText(" "+a1+ " * " +a2 + " * " +a3 + "*" +a4 + "= "+hsl);
}}}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel ket;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> pilihanbil;
    private javax.swing.JLabel ss;
    private javax.swing.JTextField thasil;
    // End of variables declaration//GEN-END:variables
}
