/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

//Import ecosystem
import Business.EcoSystem;

//import company
import Business.Company.Company;

//import order
import Business.Order;

//import organization
import Business.Organization;

//import user account
import Business.UserAccount.UserAccount;

//import card layout
import java.awt.CardLayout;

//import JOption pane
import javax.swing.JOptionPane;

//import jpanel
import javax.swing.JPanel;

//import table model
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merwinroy
 */
public class OrderCancellationJPanel extends javax.swing.JPanel 
{
    
    //JPanel container object
    private JPanel container;
    
    //UserAccount object
    private UserAccount userAccount;
    
    //Ecosystem object
    private EcoSystem ecoSystem;
    
    public OrderCancellationJPanel(JPanel container, UserAccount account, Organization organization, Company company, EcoSystem ecoSystem) 
    {
        //Initialize component
        initComponents();
        
        this.container = container;
        this.userAccount = account;
        this.ecoSystem=ecoSystem;
        
        populateTable();
    }

    public void populateTable()
    {
        //Table model object is created
        DefaultTableModel tableModel = (DefaultTableModel) tblCancelOrder.getModel();
        //set row count of table model to 0
        tableModel.setRowCount(0);
        
        //For loop to iterate through order object in table
        for(Order order:ecoSystem.getOrderDir().getOrderList())
        {
            if(order.getCustomerName().equals(userAccount.getUsername()) && order.getOrderStatus().equals("Hay! order placed"))
            {
                Object row[] = new Object[5];
                
                row[0] = order;
                
                row[1] = order.getCustomerName();
                
                row[3] = order.getOrderStatus();
                
                row[4] = order.getResName();
                
                //Add row to table model after every iteration
                tableModel.addRow(row);
            }
    
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancelOrder = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCancel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCancelOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Customer Name", "Status", "Restaurant Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCancelOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 750, 96));

        btnCancel.setText("Cancel Order");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ORDER CANCELLATION PANEL");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 30, 820, -1));

        lblCancel.setText("<- Select option to cancel order");
        add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCancelOrder.getSelectedRow();
        
        if (selectedRow < 0) 
        {
            //Show error prompt upon not selecting a row
            JOptionPane.showMessageDialog(null, "Select row from table to delete record ");
            
            return;
        }
        else
        {
            //Selected order object selected from table for cancellation
            Order o = (Order)tblCancelOrder.getValueAt(selectedRow,0 ); 
            
            //delete cancelled order from model
            ecoSystem.getOrderDir().deleteOrder(o);
            
            //Prompt successful cancellation of model
            JOptionPane.showMessageDialog(null, "Order information has been deleted successfully!");
            
            //refresh table
            populateTable();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        //Cardlayout object is created
        CardLayout cardLayout = (CardLayout)container.getLayout();
        
        //current container is removed from layout
        container.remove(this);
        
        //previous layout is loaded
        cardLayout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCancelOrder;
    // End of variables declaration//GEN-END:variables
}
