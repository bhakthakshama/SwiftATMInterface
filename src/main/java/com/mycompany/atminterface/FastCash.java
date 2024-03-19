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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
    }

    int MyAccNum;
    public FastCash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        getBalance();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    int oldBalance;
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
               BalanceLbl.setText("Rs. "+oldBalance);
                
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
        jPanel4 = new javax.swing.JPanel();
        rs100Btn = new javax.swing.JButton();
        rs1000Btn = new javax.swing.JButton();
        rs500Btn = new javax.swing.JButton();
        rs10000Btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rs5000Btn = new javax.swing.JButton();
        rs2500Btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BalanceLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        rs100Btn.setBackground(new java.awt.Color(51, 51, 51));
        rs100Btn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        rs100Btn.setForeground(new java.awt.Color(255, 255, 255));
        rs100Btn.setText("Rs. 100");
        rs100Btn.setBorder(null);
        rs100Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs100BtnMouseClicked(evt);
            }
        });

        rs1000Btn.setBackground(new java.awt.Color(51, 51, 51));
        rs1000Btn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        rs1000Btn.setForeground(new java.awt.Color(255, 255, 255));
        rs1000Btn.setText("Rs. 1000");
        rs1000Btn.setBorder(null);
        rs1000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs1000BtnMouseClicked(evt);
            }
        });

        rs500Btn.setBackground(new java.awt.Color(51, 51, 51));
        rs500Btn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        rs500Btn.setForeground(new java.awt.Color(255, 255, 255));
        rs500Btn.setText("Rs. 500");
        rs500Btn.setBorder(null);
        rs500Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs500BtnMouseClicked(evt);
            }
        });

        rs10000Btn.setBackground(new java.awt.Color(51, 51, 51));
        rs10000Btn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        rs10000Btn.setForeground(new java.awt.Color(255, 255, 255));
        rs10000Btn.setText("Rs. 10000");
        rs10000Btn.setBorder(null);
        rs10000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs10000BtnMouseClicked(evt);
            }
        });
        rs10000Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs10000BtnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(228, 227, 227));
        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BACK");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        rs5000Btn.setBackground(new java.awt.Color(51, 51, 51));
        rs5000Btn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        rs5000Btn.setForeground(new java.awt.Color(255, 255, 255));
        rs5000Btn.setText("Rs. 5000");
        rs5000Btn.setBorder(null);
        rs5000Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs5000BtnMouseClicked(evt);
            }
        });
        rs5000Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs5000BtnActionPerformed(evt);
            }
        });

        rs2500Btn.setBackground(new java.awt.Color(51, 51, 51));
        rs2500Btn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        rs2500Btn.setForeground(new java.awt.Color(255, 255, 255));
        rs2500Btn.setText("Rs. 2500");
        rs2500Btn.setBorder(null);
        rs2500Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs2500BtnMouseClicked(evt);
            }
        });
        rs2500Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2500BtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("SWIFT ATM INTERFACE");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SWIFT ATM INTERFACE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 0, 0));
        jLabel7.setText("FAST CASH");

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Your Balance :");

        BalanceLbl.setFont(new java.awt.Font("Sitka Text", 0, 22)); // NOI18N
        BalanceLbl.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(207, 207, 207))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rs1000Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(rs100Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(rs5000Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rs2500Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rs500Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rs10000Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs100Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs500Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs1000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs2500Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs5000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs10000Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rs10000BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs10000BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs10000BtnActionPerformed

    private void rs5000BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs5000BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs5000BtnActionPerformed

    private void rs2500BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2500BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs2500BtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    
    private void rs100BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs100BtnMouseClicked
        if(oldBalance < 100)
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = 100;
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
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
    }//GEN-LAST:event_rs100BtnMouseClicked

    private void rs500BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs500BtnMouseClicked
        if(oldBalance < 500)
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = 500;
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
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
    }//GEN-LAST:event_rs500BtnMouseClicked

    private void rs1000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs1000BtnMouseClicked
        if(oldBalance < 1000)
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = 1000;
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
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
    }//GEN-LAST:event_rs1000BtnMouseClicked

    private void rs2500BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs2500BtnMouseClicked
        if(oldBalance < 2500)
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = 2500;
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
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
    }//GEN-LAST:event_rs2500BtnMouseClicked

    private void rs5000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs5000BtnMouseClicked
        if(oldBalance < 5000)
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = 5000;
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
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
    }//GEN-LAST:event_rs5000BtnMouseClicked

    private void rs10000BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs10000BtnMouseClicked
        if(oldBalance < 10000)
        {
            JOptionPane.showMessageDialog(this, "Not enough balance");
        }
        else
        {
            try
            {
                String query = "Update accounttbl set Balance = ? where AccNum = ?" ;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftatmdb","root","kshama2003");
                int amt = 10000;
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, oldBalance - amt);
                pst.setInt(2, MyAccNum);
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Balance Updated");
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
    }//GEN-LAST:event_rs10000BtnMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new MainMenu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton rs10000Btn;
    private javax.swing.JButton rs1000Btn;
    private javax.swing.JButton rs100Btn;
    private javax.swing.JButton rs2500Btn;
    private javax.swing.JButton rs5000Btn;
    private javax.swing.JButton rs500Btn;
    // End of variables declaration//GEN-END:variables
}
