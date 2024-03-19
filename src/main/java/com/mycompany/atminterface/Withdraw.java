/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atminterface;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Withdraw extends javax.swing.JFrame {

    /**
     * Creates new form Withdraw
     */
    public Withdraw() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    int oldBalance;
    int MyAccNum;
    public Withdraw(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        getBalance();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
    }
    private void getBalance()
    {
        String query = "select * from AccountTbl where AccNum = "+MyAccNum+"";
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
            st1 = con.createStatement();
            rs1 = st1.executeQuery(query);
            if(rs1.next())
            {
               oldBalance =  rs1.getInt(8);
               BalLbl.setText("Rs. "+oldBalance);
            }
            else
            {
                //JOptionPane.showMessageDialog(this, "Incorrect Account Number or Pin");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        WithdrawBtn = new javax.swing.JButton();
        AmtTb = new javax.swing.JTextField();
        BalLbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SWIFT ATM INTERFACE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(173, 173, 173))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 0, 0));
        jLabel7.setText("CASH WITHDRAWAL");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText(" Your Balance : ");

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("SWIFT ATM INTERFACE");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText(" AMOUNT  : ");

        jLabel10.setBackground(new java.awt.Color(228, 227, 227));
        jLabel10.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BACK");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        WithdrawBtn.setBackground(new java.awt.Color(51, 51, 51));
        WithdrawBtn.setFont(new java.awt.Font("Lucida Handwriting", 1, 16)); // NOI18N
        WithdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawBtn.setText("WITHDRAW ");
        WithdrawBtn.setBorder(null);
        WithdrawBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrawBtnMouseClicked(evt);
            }
        });
        WithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtnActionPerformed(evt);
            }
        });

        AmtTb.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        AmtTb.setForeground(new java.awt.Color(102, 0, 0));

        BalLbl.setFont(new java.awt.Font("Sitka Text", 0, 22)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmtTb, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(WithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(169, 169, 169))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(AmtTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(WithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WithdrawBtnActionPerformed

    String MyDate;
    public void getDate()
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        MyDate = s.format(d);
    }
    
    private void withdrawMoney()
    {
        try{
            getDate();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                PreparedStatement Add = con.prepareStatement("insert into TransactionTbl values(?,?,?,?)");
                Add.setInt(1, MyAccNum);
                Add.setString(2, "Withdraw");
                Add.setString(3, AmtTb.getText());
                Add.setString(4, MyDate);
                int row = Add.executeUpdate();
                con.close();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }
    
    private void WithdrawBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrawBtnMouseClicked
        if(AmtTb.getText().isEmpty() || AmtTb.getText().equals(0))
        {
            JOptionPane.showMessageDialog(this, "Enter Valid Amount");
        }
        else if(oldBalance < Integer.parseInt(AmtTb.getText()))
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = Integer.parseInt(AmtTb.getText());
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                    withdrawMoney();
                    new MainMenu(MyAccNum).setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Invalid amount format. Please enter a valid integer amount.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_WithdrawBtnMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
         new MainMenu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmtTb;
    private javax.swing.JLabel BalLbl;
    private javax.swing.JButton WithdrawBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
