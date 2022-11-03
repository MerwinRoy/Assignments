/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

//Import ecosystem
import Business.EcoSystem;

//import organization
import Business.Organization;

//import userAccount
import Business.UserAccount.UserAccount;

//import company
import Business.Company.Company;

//import cardlayout
import java.awt.CardLayout;


//import JPanel
import javax.swing.JPanel;

//import tree node
import javax.swing.tree.DefaultMutableTreeNode;

//import tree model
import javax.swing.tree.DefaultTreeModel;

//import arraylist
import java.util.ArrayList;


/**
 *
 * @author merwinroy
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    
    //JPanel container object
    JPanel container;
    
    //Ecosystem object
    EcoSystem ecosystem;
    
    //deliverManOrganization object
    Organization deliveryAgentOrganization;
    
    //CustomerOrganization object
    Organization customerOrganization;
    
    
    public SystemAdminWorkAreaJPanel(JPanel container, EcoSystem ecosystem) 
    {
        //Initialize components
        initComponents();
        
        
        this.container=container;
        
        this.ecosystem=ecosystem;
        
        
       Organization dOrganization= (Organization)ecosystem.
               getDeliveryManDirectory().
               findOrganization("DeliveryMan");
       
       Organization cOrganization= (Organization)ecosystem.
               getCustomerDirectory().
               findOrganization("Customer");
       
        if(dOrganization==null)
        {
            this.deliveryAgentOrganization=(Organization)ecosystem.
                    getDeliveryManDirectory().
                    newOrganization(Organization.Type.DeliveryMan);
        }
        else 
        {
            this.deliveryAgentOrganization=dOrganization;
        }
        
        if(cOrganization==null)
        {
            this.customerOrganization=(Organization)ecosystem.
                    getCustomerDirectory().
                    newOrganization(Organization.Type.Customer);
        }
        else
        {
            this.customerOrganization=cOrganization;
        }
        
        populateTree();
    }
    
    public void populateTree(){
       // Add the code for draw your system structure shown by JTree
        DefaultTreeModel treeModel = (DefaultTreeModel) JTree.getModel();
        
        //ArrayLists
        ArrayList<Company> companyList;
        
        ArrayList<Organization> orgList;
        
        ArrayList<UserAccount> userList;
        
        ArrayList<Organization> custOrgList;
        
        ArrayList<UserAccount> custAccountList;
        
        ArrayList<Organization> delivOrgList;
        
        ArrayList<UserAccount> delivMenUserAccList;
        
        //Company object
        Company company;
        
        //Organizations
        Organization org;
        Organization organizationA;
        Organization organizationB;
        
        //UserAccounts
        UserAccount userAccount;
        UserAccount custUserAccount;
        UserAccount delivUserAccount;
        
      
        DefaultMutableTreeNode companies = new DefaultMutableTreeNode("Enterprises/Restaurants");
        DefaultMutableTreeNode custOrg2 = new DefaultMutableTreeNode("Customers");
        DefaultMutableTreeNode delivOrg2 = new DefaultMutableTreeNode("Delivery Men");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModel.getRoot();
        
        
        root.removeAllChildren();
        root.insert(companies, 0);
        root.insert(custOrg2,1);
        root.insert(delivOrg2, 2);

        //Nodes
        DefaultMutableTreeNode companyNode;
        DefaultMutableTreeNode orgNode;
        DefaultMutableTreeNode userAccNode;
        DefaultMutableTreeNode custOrgNode;
        DefaultMutableTreeNode custNode;
        DefaultMutableTreeNode delivOrgNode;
        DefaultMutableTreeNode DelivMenNode;
        
        

        companyList = ecosystem.
                    getCompanyDirectory().
                    getCompanyList();
            
            
        for (int j = 0; j < companyList.size(); j++) 
        {
            company = companyList.get(j);
            
            companyNode = new DefaultMutableTreeNode(company.getName());
            
            companies.insert(companyNode, j);

            orgList = company.
                        getRestaurantDirectory().
                        getOrganizationDir();
                
            for (int k = 0; k < orgList.size(); k++) 
            {
                org = orgList.get(k);
                
                orgNode = new DefaultMutableTreeNode(org.getName());
                    
                companyNode.insert(orgNode, k);
                    
                userList=org.
                           getUserAccountDirectory().
                           getUserAccountList();
                 
                for (int l = 0; l < userList.size(); l++) 
                {
                    userAccount = userList.get(l);
                    
                    userAccNode = new DefaultMutableTreeNode(userAccount.getUsername());
                    
                    orgNode.
                            insert(userAccNode, l);
                }
            }
        }
        
        custOrgList = ecosystem.
                    getCustomerDirectory().
                    getOrganizationDir();
                
        for (int k = 0; k < custOrgList.size(); k++) 
        {
            organizationA = custOrgList.get(k);
                    
            custOrgNode = new DefaultMutableTreeNode(organizationA.getName());
                    
            custOrg2.insert(custOrgNode, k);
                    
            custAccountList=organizationA.
                           getUserAccountDirectory().
                           getUserAccountList();
                 
            for (int l = 0; l < custAccountList.size(); l++) 
            {
                custUserAccount = custAccountList.get(l);
                
                custNode = new DefaultMutableTreeNode(custUserAccount.getUsername());
                
                custOrgNode.insert(custNode, l);
            }
        }
        delivOrgList = ecosystem.
                   getDeliveryManDirectory().
                   getOrganizationDir();
                
        for (int k = 0; k < delivOrgList.size(); k++) 
        {
            organizationB = delivOrgList.get(k);
            
            delivOrgNode = new DefaultMutableTreeNode(organizationB.getName());
            
            delivOrg2.insert(delivOrgNode, k);
                    
            delivMenUserAccList=organizationB.
                           getUserAccountDirectory().
                           getUserAccountList();
                 
            for (int l = 0; l < delivMenUserAccList.size(); l++) 
            {
                delivUserAccount = delivMenUserAccList.get(l);
                
                DelivMenNode = new DefaultMutableTreeNode(delivUserAccount.getUsername());
                    
                delivOrgNode.insert(DelivMenNode, l);
            }
        }
       
        //refresh the tree model
        treeModel.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        lblNodeSelect = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnCustomersManagement = new javax.swing.JButton();
        btnRestaurantManagement = new javax.swing.JButton();
        btnDeliveryAgentManagement = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCustomerManagement = new javax.swing.JLabel();
        lblRestaurantManagement = new javax.swing.JLabel();
        lblDeliveryAgentManagement = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));
        setLayout(new java.awt.BorderLayout());

        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lblNodeSelect.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnCustomersManagement.setText("Manage Customers");
        btnCustomersManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersManagementActionPerformed(evt);
            }
        });

        btnRestaurantManagement.setText("Manage Restaurants");
        btnRestaurantManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantManagementActionPerformed(evt);
            }
        });

        btnDeliveryAgentManagement.setText("Manage Delivery agent");
        btnDeliveryAgentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryAgentManagementActionPerformed(evt);
            }
        });

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SYSTEM ADMINISTRATION PANEL");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        lblCustomerManagement.setText("<- Customer Management Panel button");

        lblRestaurantManagement.setText("<- Restaurant Management Panel button");

        lblDeliveryAgentManagement.setText("<- Delivery Agent Management Panel button");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNodeSelect)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRestaurantManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeliveryAgentManagement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomersManagement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCustomerManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDeliveryAgentManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblRestaurantManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNodeSelect)
                    .addComponent(lblSelectedNode))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomersManagement)
                    .addComponent(lblCustomerManagement))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveryAgentManagement)
                    .addComponent(lblDeliveryAgentManagement))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestaurantManagement)
                    .addComponent(lblRestaurantManagement))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomersManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersManagementActionPerformed
        
        //CustomerManagementJpanel object created
        CustomerManagementJPanel customerPanel = new CustomerManagementJPanel(container,ecosystem,customerOrganization);
        
        //add panel object to container
        container.add("CustomerManagementJPanel", customerPanel);
        
        //cardlayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next layout loaded
        cardLayout.next(container);        
    }//GEN-LAST:event_btnCustomersManagementActionPerformed

    private void btnRestaurantManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantManagementActionPerformed
        
        //RestaurantManagementJpanel object created
        RestaurantManagementJPanel restaurantPanel = new RestaurantManagementJPanel(container,ecosystem);
        
        //add panel object to container
        container.add("RestaurantManagementJPanel", restaurantPanel);
        
        //cardlayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next layout loaded
        cardLayout.next(container);        
    }//GEN-LAST:event_btnRestaurantManagementActionPerformed

    private void btnDeliveryAgentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryAgentManagementActionPerformed
        
        //RestaurantManagementJpanel object created
        DeliveryAgentManagementJPanel deliveryAgentManagementPanel = new DeliveryAgentManagementJPanel(container,ecosystem,deliveryAgentOrganization);
        
        //add panel object to container
        container.add("DeliveryAgentManagementJPanel", deliveryAgentManagementPanel);
        
        //cardlayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next layout loaded
        cardLayout.next(container);   
    }//GEN-LAST:event_btnDeliveryAgentManagementActionPerformed

    private void JTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTreeValueChanged
        
        //Selected node from tree
        DefaultMutableTreeNode node= (DefaultMutableTreeNode)JTree.getLastSelectedPathComponent();
        
        //if node exists
        if(node!=null)
        {
            //change label of selected node by setting its text
            lblSelectedNode.setText(node.toString());
        }
    }//GEN-LAST:event_JTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JButton btnCustomersManagement;
    private javax.swing.JButton btnDeliveryAgentManagement;
    private javax.swing.JButton btnRestaurantManagement;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblCustomerManagement;
    private javax.swing.JLabel lblDeliveryAgentManagement;
    private javax.swing.JLabel lblNodeSelect;
    private javax.swing.JLabel lblRestaurantManagement;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
