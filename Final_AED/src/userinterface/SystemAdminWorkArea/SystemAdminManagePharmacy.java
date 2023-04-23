/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Pharmacy.Pharmacy;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pratik Poojari
 */
public class SystemAdminManagePharmacy extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManagePharmacy
     */
    
    private JPanel userProcessContainerSAMR;
    private EcoSystem ecosystem;
    private String user;
    
    public SystemAdminManagePharmacy(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAMR = userProcessContainer;
        this.ecosystem = ecosystem;
        this.user = user;
        txtPharmacyName.setEnabled(false);
        txtAddress.setEnabled(false);

        btnSubmit.setEnabled(false);
        btnDeletePharmacy.setEnabled(false);
        btnManagePharmacy.setEnabled(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeletePharmacy = new javax.swing.JButton();
        btnCreatePharmacy = new javax.swing.JButton();
        txtPharmacyName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblPharmacy = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnManagePharmacy = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacy = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnDeletePharmacy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDeletePharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        btnDeletePharmacy.setText("Delete Pharmacy");
        btnDeletePharmacy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeletePharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePharmacyActionPerformed(evt);
            }
        });
        add(btnDeletePharmacy);
        btnDeletePharmacy.setBounds(10, 220, 190, 60);

        btnCreatePharmacy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreatePharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add Medicine.png"))); // NOI18N
        btnCreatePharmacy.setText("Create Pharmacy ");
        btnCreatePharmacy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreatePharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePharmacyActionPerformed(evt);
            }
        });
        add(btnCreatePharmacy);
        btnCreatePharmacy.setBounds(10, 310, 190, 60);

        txtPharmacyName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPharmacyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPharmacyName);
        txtPharmacyName.setBounds(560, 340, 270, 30);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress);
        txtAddress.setBounds(560, 390, 270, 30);

        lblPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPharmacy.setText("Pharmacy Name:");
        add(lblPharmacy);
        lblPharmacy.setBounds(370, 340, 144, 30);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(440, 390, 70, 30);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(560, 474, 104, 40);

        btnManagePharmacy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManagePharmacy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        btnManagePharmacy.setText("View Pharmacy");
        btnManagePharmacy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyActionPerformed(evt);
            }
        });
        add(btnManagePharmacy);
        btnManagePharmacy.setBounds(10, 131, 190, 54);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(50, 30, 100, 50);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Pharmacy");
        add(lblTitle);
        lblTitle.setBounds(350, 40, 445, 50);

        tblPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblPharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Pharmacy Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPharmacyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPharmacy);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 140, 550, 170);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(220, 10, 11, 520);
        add(lblBackground);
        lblBackground.setBounds(220, 0, 810, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletePharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePharmacyActionPerformed
        // TODO add your handling code here:
        int selectedRowSAMR = tblPharmacy.getSelectedRow();
        if (selectedRowSAMR >= 0)
        {
            Pharmacy selectedPharmacy = (Pharmacy) tblPharmacy.getValueAt(selectedRowSAMR, 1);
            ecosystem.getPharmacyDirectory().deletePharmacy(selectedPharmacy);
            JOptionPane.showMessageDialog(null, "Pharmacy " + selectedPharmacy.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeletePharmacyActionPerformed

    private void btnCreatePharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePharmacyActionPerformed
        // TODO add your handling code here:
        btnCreatePharmacy.setEnabled(false);
        txtPharmacyName.setEnabled(true);
        txtAddress.setEnabled(true);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnCreatePharmacyActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Pharmacy p = ecosystem.getPharmacyDirectory().createPharmacy(txtPharmacyName.getText(), txtAddress.getText());
        if(p == null)
        {
            JOptionPane.showMessageDialog(null,"Pharmacy " + txtPharmacyName.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Pharmacy created successfully as " + p.getName());
            btnCreatePharmacy.setEnabled(true);
            txtPharmacyName.setEnabled(false);
            txtAddress.setEnabled(false);
            btnSubmit.setEnabled(false);
            txtPharmacyName.setText("");
            txtAddress.setText("");
        }
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnManagePharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPharmacy.getSelectedRow();
        if (selectedRow >= 0)
        {
            Pharmacy selectedPharmacy = (Pharmacy) tblPharmacy.getValueAt(selectedRow, 1);
            SystemManageEmployees fs = new SystemManageEmployees(userProcessContainerSAMR, selectedPharmacy, ecosystem);
            userProcessContainerSAMR.add("SysAdminManageEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainerSAMR.getLayout();
            layout.next(userProcessContainerSAMR);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnManagePharmacyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainerSAMR.remove(this);
        Component[] componentArray = userProcessContainerSAMR.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        //dwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainerSAMR.getLayout();
        layout.previous(userProcessContainerSAMR);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblPharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPharmacyMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblPharmacy.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnDeletePharmacy.setEnabled(true);
            btnManagePharmacy.setEnabled(true);
        }
    }//GEN-LAST:event_tblPharmacyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePharmacy;
    private javax.swing.JButton btnDeletePharmacy;
    private javax.swing.JButton btnManagePharmacy;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPharmacy;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPharmacyName;
    // End of variables declaration//GEN-END:variables

   private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblPharmacy.getModel();
        dtm.setRowCount(0);
        int count1 = 1;
        if(ecosystem.getPharmacyDirectory().getPharmacyList() != null)
        {
            for(Pharmacy p : ecosystem.getPharmacyDirectory().getPharmacyList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = p.getId();
                row[1] = p;
                row[2] = p.getAddress();
                dtm.addRow(row);
                count1++;
            }
        }
        else
        {
            tblPharmacy.setEnabled(false);
        }
    }
}

        
    

