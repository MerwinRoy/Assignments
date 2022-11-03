/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

//Import ecosystem
import Business.EcoSystem;

//Import company
import Business.Company.Company;

//Import products
import Business.Company.Products;

//import order
import Business.Order;

//import organization
import Business.Organization;

//import useraccount
import Business.UserAccount.UserAccount;


//import cardlayout
import java.awt.CardLayout;

//import combo box model
import javax.swing.DefaultComboBoxModel;

//import Joption pane
import javax.swing.JOptionPane;

//import jpanel
import javax.swing.JPanel;

//import tablemodel
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merwinroy
 */
public class OrderPlacementJPanel extends javax.swing.JPanel 
{
    //JPanel container object
    private JPanel container;
    
    //account object 
    private UserAccount account;
    
    //organization object
    private Organization organization;
    
    //order object 
    private Order order; 
    
    //ecosystem object
    private EcoSystem ecoSystem;
    
    //company object
    private Company company;
    
    
    
    public OrderPlacementJPanel(JPanel container, UserAccount account, Organization organization, Company company, EcoSystem ecoSystem) 
    {
        //Initialize components
        initComponents();
        
        this.container = container;
        
        this.account = account;
        
        this.organization=organization;
        
        this.company=company;
        
        this.ecoSystem=ecoSystem;
        
        this.order=ecoSystem.getOrderDir().newOrder();
        
        populateComboBox();
    }
    
    public void populateComboBox()
    {
        //combo box model created
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel();
        
        //iterate
        for(Company c:ecoSystem.getCompanyDirectory().getCompanyList())
        {
           //for loop to iterate through company list to add object into combo box model
           comboModel.addElement(c);    
        }
        
        //comboModel is set to restaurant combo box
        cmbRestaurant.setModel(comboModel);
    }
    
    public void populateRequestTable(String restaurantName)
    {
        //Table model created
        DefaultTableModel tableModel = (DefaultTableModel) tblOrderPlacement.getModel();
        
        //Row count of model is set to 0
        tableModel.setRowCount(0);
        
        //For loop to iterate through company list 
        for(Company c:ecoSystem.getCompanyDirectory().getCompanyList())
        {
            //Search enterprise based on restaurant name
            if(c.getName().equals(restaurantName))
            {
                //iterate through product list and display product object on table
                for(Products product:c.getProductsList())
                {
                    Object row[] = new Object[2];
                    
                    row[0] = product;
                    
                    row[1] = product.getProductPrice();
                    
                    //add row to model after every iteration
                    tableModel.addRow(row);
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderPlacement = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        lblSelectRestaurant = new javax.swing.JLabel();
        cmbRestaurant = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        lblRestaurantTitle = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblOrderPlacement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblOrderPlacement);
        if (tblOrderPlacement.getColumnModel().getColumnCount() > 0) {
            tblOrderPlacement.getColumnModel().getColumn(0).setResizable(false);
            tblOrderPlacement.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAdd.setText("Add to cart");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setText("Search Menu");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ORDER PLACEMENT PANEL");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPlaceOrder.setText("Place order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        lblSelectRestaurant.setText("Select Restaurant:");

        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblRestaurantTitle.setText("Pick a Restaurant:");
        lblRestaurantTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        lblMenu.setText("Menu:");
        lblMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRestaurantTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblSelectRestaurant)
                .addGap(18, 18, 18)
                .addComponent(cmbRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(0, 201, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlaceOrder)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRestaurantTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectRestaurant)
                    .addComponent(cmbRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      
        int selectedRow = tblOrderPlacement.getSelectedRow();
        if (selectedRow < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed!");
            return;
        }
        else
        {
            //Created object of selected table row
            Products pr = (Products)tblOrderPlacement.getValueAt(selectedRow,0 ); 
            
            //add product to order 
            Products product =order.addProducts();
            
            //set product name 
            product.setProductName(pr.getProductName());
            
            //set product price
            product.setProductPrice(pr.getProductPrice());
            
            //Prompt user of successful addition of product into cart
            JOptionPane.showMessageDialog(null, "item added to cart successfully");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        //Enterprise object of selected restaurant from combo box
        Company c = (Company) cmbRestaurant.getSelectedItem();
        
        if (c.getName() == null || c.getName()=="")
        {
            return;
        }
        //Populate table with name of enterprise if search is successful
        populateRequestTable(c.getName());
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        //Selected row in the table
        int selectedRow = tblOrderPlacement.getSelectedRow();
        
        //error if no row is selected
        if (selectedRow < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed!");
            
            return;
        }
        else
        {
            //Products object of selected row 
            Products p = (Products)tblOrderPlacement.getValueAt(selectedRow,0 ); 
        
            //Delete selected product
            order.deleteProducts(p);
        
            //prompt successful deletion
            JOptionPane.showMessageDialog(null, "item deleted from cart successfully");}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        
        //Selected enterprise object from restaurant combo box
        Company selectedItem = (Company) cmbRestaurant.getSelectedItem();
        
        //set restaurant name
        order.setResName(selectedItem.getName());
        
        //set order status
        order.setOrderStatus("order placed");
        
        //set customer id
        order.setCustomerID(account.getEmployee().getId());
        
        
        //set customer name
        order.setCustomerName(account.getEmployee().getName());
        
        //set customer username
        order.setCustomerUser(account.getUsername());
        
        //Order placement successful prompt
        JOptionPane.showMessageDialog(null, "Order has been placed successfully");
        
        //Invoice JPanel object created
        InvoiceJPanel invoicePanel = new InvoiceJPanel(container,account,order);
        
        //panel object added to container
        container.add("InvoiceJPanel", invoicePanel);
        
        //cardlayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next cardlayout set to container
        cardLayout.next(container);
        
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        //cardlayout object is created
        CardLayout cardLayout = (CardLayout)container.getLayout();
        
        // current layout is removed
        container.remove(this);
        
        //previous container layout is loaded
        cardLayout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbRestaurant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblRestaurantTitle;
    private javax.swing.JLabel lblSelectRestaurant;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrderPlacement;
    // End of variables declaration//GEN-END:variables
}
