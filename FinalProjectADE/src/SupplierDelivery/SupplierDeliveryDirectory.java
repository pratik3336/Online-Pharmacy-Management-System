/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierDelivery;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierDeliveryDirectory {
    private ArrayList<SupplierDelivery> supplierDeliverylist;
    
    public SupplierDeliveryDirectory(){
        this.supplierDeliverylist = new ArrayList<>();
    }

    public ArrayList<SupplierDelivery> getSupplierDeliverylist() {
        return supplierDeliverylist;
    }

    public void setSupplierDeliverylist(ArrayList<SupplierDelivery> supplierDeliverylist) {
        this.supplierDeliverylist = supplierDeliverylist;
    }
    
    
}