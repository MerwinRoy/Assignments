/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

//Import products
import Business.Company.Products;

//Import order
import Business.Order;

//Import useraccount
import Business.UserAccount.UserAccount;

//import cardlayout
import java.awt.CardLayout;

//import component
import java.awt.Component;

//import Jpanel
import javax.swing.JPanel;

//Import table model
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merwinroy
 */
public class InvoiceJPanel extends javax.swing.JPanel 

{

  //container JPanel object
  JPanel container;
  
  //total variable
  String total;
  
  //User account object
  UserAccount account;
  
  //Order object
  Order order;
  
 
  
  
    public InvoiceJPanel(JPanel container,UserAccount account,Order order ) 
    {
        //Initialize components
        initComponents();
        
        this.container=container;
        
        this.account=account;
        
        this.order=order;
        
        
        this.total=populateTable();
        
        //Set text of label
        lblTotal.setText(this.total);
    }
    
    
     public String populateTable()
     {
        // Table model created
        DefaultTableModel tableModel = (DefaultTableModel) tblInvoice.getModel();
        
        //Setting row count of table model to 0
        tableModel.setRowCount(0);
        
        //total bill initialized to 0
        int totalBill=0;
        
        //For loop to iterate through product list in table
        for(Products product:order.getProductList()) 
        {
            Object row[] = new Object[2];
            
            row[0] = product;
            
            row[1] = product.getProductPrice();
            
            totalBill=totalBill+product.getProductPrice();
            
            //add row into table model after every iteration
            tableModel.addRow(row);
        }
                
    return String.valueOf(totalBill);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        lblTotal_ = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInvoice);

        lblTotal_.setText("Total: ");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("INVOICE PANEL");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        backBtn.setText(" Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotal_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        //CardLayout object created
        CardLayout cardLayout = (CardLayout)container.getLayout();
        
        //remove current container
        container.remove(this);
        
        //load previous container as layout
        cardLayout.previous(container);
        
        cardLayout.previous(container);
        
        //Fetch components from container
        Component[] components = this.container.getComponents();
        
        //Iterate through each component object
        for(Component component : components)
        {
            //check if component is an instance of jpanel
            if(component instanceof CustomerUsageJPanel)
            {
                CustomerUsageJPanel customerAreaJPanel= (CustomerUsageJPanel) component;
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal_;
    private javax.swing.JTable tblInvoice;
    // End of variables declaration//GEN-END:variables
}
