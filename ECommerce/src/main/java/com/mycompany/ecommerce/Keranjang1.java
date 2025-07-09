/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ecommerce;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


/**
 *
 * @author LENOVO
 */
public class Keranjang1 extends javax.swing.JFrame {

    public JTable cartTable;
    public DefaultTableModel tableModel; // Ini akan menerima model dari NewJFrame
    public JLabel totalLabel;
    public JTextField namaPembeliField;
    /**
     * Creates new form Keranjang1
     */
  
    // Konstruktor KeranjangFrame sekarang menerima DefaultTableModel
    public Keranjang1 (DefaultTableModel cartDataModel) {
        initComponents(); // NetBeans-generated, wajib dipanggil dulu
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        this.tableModel = cartDataModel; // Gunakan model yang diterima

        setTitle("Keranjang Belanja");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        JPanel panelNama = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelNama.add(new JLabel("Nama Pembeli: "));
        namaPembeliField = new JTextField(20);
        panelNama.add(namaPembeliField);
        bottomPanel.add(panelNama, BorderLayout.NORTH);

        // Setel JTable keranjang menggunakan model yang diterima
        cartTable = new JTable(this.tableModel);
        JScrollPane scrollPane = new JScrollPane(cartTable);
        add(scrollPane, BorderLayout.CENTER);

        
        totalLabel = new JLabel("Total: Rp 0.00", SwingConstants.RIGHT);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        bottomPanel.add(totalLabel, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel();
        JButton checkoutButton = new JButton("Checkout");
        JButton continueShoppingButton = new JButton("Lanjutkan Belanja");
        continueShoppingButton.addActionListener(e -> dispose()); // Tutup frame keranjang

        buttonPanel.add(checkoutButton);
        buttonPanel.add(continueShoppingButton);
        bottomPanel.add(buttonPanel, BorderLayout.WEST);

        add(bottomPanel, BorderLayout.SOUTH);

           // Set panelUtama ke konten frame
        setContentPane(bottomPanel);

        // Tombol
        continueShoppingButton.addActionListener(e -> dispose());
        checkoutButton.addActionListener(e -> prosesCheckout());
        
        // Muat data keranjang dan hitung total
        updateCartTotal();
    }
    
     private void prosesCheckout() {
    String nama = namaPembeliField.getText().trim();

    if (nama.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan nama pembeli terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Simulasi menyimpan data transaksi
    StringBuilder data = new StringBuilder();
    data.append("Nama: ").append(nama).append("\n");
    double total = 0;
    for (int i = 0; i < tableModel.getRowCount(); i++) {
        Object id = tableModel.getValueAt(i, 0);
        Object namaBarang = tableModel.getValueAt(i, 1);
        Object harga = tableModel.getValueAt(i, 2);
        Object qty = tableModel.getValueAt(i, 3);
        Object subTotal = tableModel.getValueAt(i, 4);
        total += (double) subTotal;
        data.append(id).append(" - ").append(namaBarang).append(" x ").append(qty)
            .append(" = ").append(subTotal).append("\n");
    }
    data.append("TOTAL: Rp ").append(String.format("%,.2f", total));

    // Simulasi: cetak ke konsol atau simpan ke database/file kalau mau
    System.out.println("=== TRANSAKSI DISIMPAN ===\n" + data);

    // Alert berhasil
    JOptionPane.showMessageDialog(this, "Transaksi berhasil!\nTerima kasih, " + nama + ".", "Checkout Berhasil", JOptionPane.INFORMATION_MESSAGE);

    // ✅ Tambahan: reset isi keranjang dan input nama
    tableModel.setRowCount(0);              // Hapus semua baris di keranjang
    namaPembeliField.setText("");           // Kosongkan field nama pembeli
    updateCartTotal();                      // Refresh label total

    // Pindah ke JFrame Pesanan
    PesananFrame pesananFrame = new PesananFrame(nama, tableModel);
    pesananFrame.setVisible(true);

    dispose();
}
     
     
    
     private void updateCartTotal() {
        double grandTotal = 0;
        // Iterasi melalui baris di tableModel untuk menghitung total
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            try {
                // Kolom 'Total' (indeks 4)
                double itemTotal = (double)  tableModel.getValueAt(i, 4);
                grandTotal += itemTotal;
            } catch (ClassCastException e) {
                System.err.println("Error casting total value at row " + i + ": " +  tableModel.getValueAt(i, 4) + ". Ensure it's a Double.");
                // Handle error jika tipe data tidak sesuai
            }
        }
        totalLabel.setText(String.format("Total: Rp %.2f", grandTotal));
    }
     
      @SuppressWarnings("unchecked")

      public void refreshCartDisplay() {
        updateCartTotal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Keranjang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keranjang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keranjang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keranjang1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       SwingUtilities.invokeLater(() -> {
            DefaultTableModel dummyModel = new DefaultTableModel(new String[]{"ID", "Nama", "Harga", "Qty", "Total"}, 0);
            dummyModel.addRow(new Object[]{"D001", "Dummy Product 1", 10000.0, 2, 20000.0});
            new Keranjang1(dummyModel).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
