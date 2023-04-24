/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PharmacyAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik Poojari
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;

    UserAccount user;
    EcoSystem system;
    Pharmacy pharmacy;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount user, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = user;
        this.system = system;
        for (Pharmacy r : system.getPharmacyDirectory().getPharmacyList()) {
            for (Employee e : r.getEmployeeDirectory().getEmployeeList()) {
                if (user.getEmployee() == e) {
                    this.pharmacy = r;
                    lblValue.setText(r.getName());
                }
            }
        }
        txtPharmcyName.setText(this.pharmacy.getName());
        txtAddress.setText(this.pharmacy.getAddress());
        System.out.println("Admin area work panel pharmacy : " + pharmacy);
        //valueLabel.setText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminWorkArea = new javax.swing.JLabel();
        lblPharmacy = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnManageMedicines = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        lblPharmacyName = new javax.swing.JLabel();
        txtPharmcyName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnOrderMedicines = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        lblAdminWorkArea.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAdminWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminWorkArea.setText("Admin Work Area");
        add(lblAdminWorkArea);
        lblAdminWorkArea.setBounds(210, 40, 600, 60);

        lblPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPharmacy.setText("Pharmacy");
        add(lblPharmacy);
        lblPharmacy.setBounds(329, 140, 120, 29);

        lblValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue);
        lblValue.setBounds(480, 140, 230, 29);

        btnManageMedicines.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageMedicines.setText("Manage Medicines");
        btnManageMedicines.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMedicinesActionPerformed(evt);
            }
        });
        add(btnManageMedicines);
        btnManageMedicines.setBounds(70, 340, 200, 60);

        btnManageOrders.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageOrders.setText("Manage Orders");
        btnManageOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders);
        btnManageOrders.setBounds(70, 220, 200, 60);

        lblPharmacyName.setBackground(new java.awt.Color(255, 255, 255));
        lblPharmacyName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPharmacyName.setText("Pharmacy Name :");
        add(lblPharmacyName);
        lblPharmacyName.setBounds(400, 230, 140, 50);

        txtPharmcyName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPharmcyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPharmcyName);
        txtPharmcyName.setBounds(590, 230, 340, 50);

        lblAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address :");
        add(lblAddress);
        lblAddress.setBounds(460, 340, 80, 50);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress);
        txtAddress.setBounds(590, 340, 340, 50);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Update");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(680, 450, 200, 60);

        btnOrderMedicines.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOrderMedicines.setText("Order Medicines");
        btnOrderMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMedicinesActionPerformed(evt);
            }
        });
        add(btnOrderMedicines);
        btnOrderMedicines.setBounds(70, 470, 200, 60);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Medomand-online-Pharmacy-supply-1024x759.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMedicinesActionPerformed
        AdminManageMedicine amm = new AdminManageMedicine(userProcessContainer, pharmacy);
        userProcessContainer.add("UserCustomer", amm);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageMedicinesActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        AdminManageOrders amo = new AdminManageOrders(userProcessContainer, pharmacy);
        userProcessContainer.add("UserCustomer", amo);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (("".equals(txtPharmcyName.getText())) || ("".equals(txtAddress.getText()))) {
            JOptionPane.showMessageDialog(null, "Please fill all values!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (txtPharmcyName.getText() == null ? pharmacy.getName() != null : !txtPharmcyName.getText().equals(pharmacy.getName())) {
            if (system.getPharmacyDirectory().checkIfPharmacyIsUnique(txtPharmcyName.getText())) {
                pharmacy.setName(txtPharmcyName.getText());
                pharmacy.setAddress(txtAddress.getText());
                JOptionPane.showMessageDialog(null, "Pharmacy details updated!");
            } else {
                JOptionPane.showMessageDialog(null, "Pharmacy name not unique!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        lblValue.setText(pharmacy.getName());
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnOrderMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMedicinesActionPerformed
        // TODO add your handling code here:
        PharmacyAreaJPanel pap = new PharmacyAreaJPanel(userProcessContainer, user, system, pharmacy);
        userProcessContainer.add("UserCustomer", pap);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderMedicinesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMedicines;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnOrderMedicines;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAdminWorkArea;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblPharmacyName;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPharmcyName;
    // End of variables declaration//GEN-END:variables
}
