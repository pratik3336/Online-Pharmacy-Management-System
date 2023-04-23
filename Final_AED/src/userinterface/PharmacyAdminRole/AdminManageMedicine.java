/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PharmacyAdminRole;


import Business.MedicineItems.MedicineItem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pratik Poojari
 */
public class AdminManageMedicine extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageMenu
     */
    JPanel userProcessContainer;
    Pharmacy pharmacy;
    
    public AdminManageMedicine(JPanel userProcessContainer, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pharmacy = pharmacy;
        btnDelete.setEnabled(false);
        btnView.setEnabled(false);
        txtName.setEnabled(false);
        spinnerPrice.setEnabled(false);
        lblValue.setText(pharmacy.getName());
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

        btnView = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblPharmacy = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        spinnerPrice = new javax.swing.JSpinner();
        lblMedicine = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicineCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        btnView.setText("View");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(220, 430, 132, 50);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(680, 180, 320, 40);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(590, 177, 60, 40);

        lblPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPharmacy.setText("Pharmacy");
        add(lblPharmacy);
        lblPharmacy.setBounds(230, 40, 292, 50);

        lblPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Price:");
        add(lblPrice);
        lblPrice.setBounds(590, 260, 60, 40);

        lblValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue);
        lblValue.setBounds(530, 40, 410, 50);

        spinnerPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(spinnerPrice);
        spinnerPrice.setBounds(680, 260, 320, 40);

        lblMedicine.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMedicine.setText("Medicine");
        add(lblMedicine);
        lblMedicine.setBounds(480, 110, 100, 50);

        tblMedicineCatalog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblMedicineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item No.", "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMedicineCatalog);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 170, 480, 220);

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
        btnBack.setBounds(50, 50, 150, 50);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(380, 430, 130, 50);

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add Medicine.png"))); // NOI18N
        btnAdd.setText("Add ");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(60, 430, 132, 50);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(780, 340, 130, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/46c6cc94a14f2da88997d4df1d5efde7.jpg"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicineCatalog.getSelectedRow();
        if (selectedRow >= 0)
        {
            MedicineItem mi = (MedicineItem) tblMedicineCatalog.getValueAt(selectedRow, 1);
            AdminUpdateMedicineItem fs = new AdminUpdateMedicineItem(userProcessContainer, mi);
            userProcessContainer.add("SysAdminManageEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       btnAdd.setEnabled(false);
        txtName.setEnabled(true);
        spinnerPrice.setEnabled(true);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(validateThis())
        {
            if(pharmacy.getMedicineCatalog().checkIfMedicineItemIsUnique(txtName.getText()))
            {
                MedicineItem mi = pharmacy.getMedicineCatalog().createNewFoodItem(txtName.getText(), (Integer)spinnerPrice.getValue());
                JOptionPane.showMessageDialog(null, "Medicine Item " + mi.getName()+ " created successfully!");
                populateTable();
                btnAdd.setEnabled(true);
                txtName.setText("");
                txtName.setEnabled(false);
                spinnerPrice.setValue(0);
                spinnerPrice.setEnabled(false);
                btnSubmit.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Medicine already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicineCatalog.getSelectedRow();
        if (selectedRow >= 0)
        {
            MedicineItem mi = (MedicineItem) tblMedicineCatalog.getValueAt(selectedRow, 1);
            pharmacy.getMedicineCatalog().deleteMedicineItem(mi);
            JOptionPane.showMessageDialog(null, "Medicine " + mi.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSpinner spinnerPrice;
    private javax.swing.JTable tblMedicineCatalog;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblMedicineCatalog.getModel();
        dtm.setRowCount(0);
        if(pharmacy.getMedicineCatalog().getMedicineItemList() != null)
        {
            for(MedicineItem mi : pharmacy.getMedicineCatalog().getMedicineItemList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = mi.getId();
                row[1] = mi;
                row[2] = mi.getPrice();
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                btnDelete.setEnabled(false);
                btnView.setEnabled(false);
            }
    }

    private boolean validateThis() {
        if("".equals(txtName.getText()))
        {
            JOptionPane.showMessageDialog(null,"Name cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if((Integer)spinnerPrice.getValue() <= 0)
        {
            JOptionPane.showMessageDialog(null,"Price must be above 0!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
