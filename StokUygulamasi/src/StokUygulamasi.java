
import javax.swing.table.DefaultTableModel;

//JTable -> ürün ekleme,silme ve güncelleme
public class StokUygulamasi extends javax.swing.JFrame {

    public StokUygulamasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        urunIsmiTextField = new javax.swing.JTextField();
        kategoriCombobox = new javax.swing.JComboBox<>();
        fiyatTextField = new javax.swing.JTextField();
        mesajYazisiAlani = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        urunTable = new javax.swing.JTable();
        ekleButon = new javax.swing.JButton();
        guncelleButon = new javax.swing.JButton();
        silButon = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ürün İsmi : ");

        jLabel2.setText("Kategori : ");

        jLabel3.setText("Fiyat :");

        kategoriCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kültür Sanat", "Yemek", "Elektronik" }));

        mesajYazisiAlani.setForeground(new java.awt.Color(255, 0, 51));

        urunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ));
        urunTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(urunTable);

        ekleButon.setText("Ürün Ekle");
        ekleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonActionPerformed(evt);
            }
        });

        guncelleButon.setText("Ürün Güncelle");
        guncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonActionPerformed(evt);
            }
        });

        silButon.setText("Ürün Sil");
        silButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesajYazisiAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(urunIsmiTextField)
                                    .addComponent(kategoriCombobox, 0, 183, Short.MAX_VALUE)
                                    .addComponent(fiyatTextField))))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guncelleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ekleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(silButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(urunIsmiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekleButon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kategoriCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guncelleButon)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fiyatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(silButon)))
                .addGap(54, 54, 54)
                .addComponent(mesajYazisiAlani)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonActionPerformed
        mesajYazisiAlani.setText("");
        DefaultTableModel model=(DefaultTableModel)urunTable.getModel();
        
        if (urunIsmiTextField.getText().trim().equals("")) {
            mesajYazisiAlani.setText("Ürün ismi boş bırakılamaz ! ");
        }else{
            Object[] eklenecek={urunIsmiTextField.getText(),kategoriCombobox.getSelectedItem().toString(),fiyatTextField.getText()};
            
            model.addRow(eklenecek);// satır ekler
        }
    }//GEN-LAST:event_ekleButonActionPerformed

    private void guncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonActionPerformed
        mesajYazisiAlani.setText("");
        DefaultTableModel model=(DefaultTableModel)urunTable.getModel();
        
        int secili_row=urunTable.getSelectedRow();// seçili satır yoksa -1 döner
        if (secili_row==-1) {
            if (urunTable.getRowCount()==0) {
                mesajYazisiAlani.setText("Ürün tablosu şu an boş ! ");
            }else{
                mesajYazisiAlani.setText("Lütfen güncellenecek bir ürün seçiniz...");
            }
        }else{
            model.setValueAt(urunIsmiTextField.getText(), secili_row, 0);
            model.setValueAt(kategoriCombobox.getSelectedItem().toString(), secili_row, 1);
            model.setValueAt(fiyatTextField.getText(), secili_row, 2);
            
            mesajYazisiAlani.setText("Ürün başarıyla güncellendi...");
        }
        
        
        
    }//GEN-LAST:event_guncelleButonActionPerformed

    private void urunTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)urunTable.getModel();
        
        int secili_row=urunTable.getSelectedRow();
        
        urunIsmiTextField.setText(model.getValueAt(secili_row, 0).toString()); //tıkladığımız satırın direk olarak alanlara yerleşmesi için
        kategoriCombobox.setSelectedItem(model.getValueAt(secili_row, 1).toString());
        fiyatTextField.setText(model.getValueAt(secili_row, 2).toString());
        
    }//GEN-LAST:event_urunTableMouseClicked

    private void silButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonActionPerformed
        mesajYazisiAlani.setText("");
        DefaultTableModel model=(DefaultTableModel)urunTable.getModel();
        int secili_row=urunTable.getSelectedRow();
        
        if (secili_row==-1) {
            if (urunTable.getRowCount()==0) {
               mesajYazisiAlani.setText("Ürün tablosu şu anda boş ! ");
            }else{
                mesajYazisiAlani.setText("Lütfen silinecek ürünü seçiniz ! ");
            }
        }else{
            model.removeRow(secili_row);
            mesajYazisiAlani.setText("Ürün başarıyla silindi...");
        }
    }//GEN-LAST:event_silButonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekleButon;
    private javax.swing.JTextField fiyatTextField;
    private javax.swing.JButton guncelleButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> kategoriCombobox;
    private javax.swing.JLabel mesajYazisiAlani;
    private javax.swing.JButton silButon;
    private javax.swing.JTextField urunIsmiTextField;
    private javax.swing.JTable urunTable;
    // End of variables declaration//GEN-END:variables
}
