/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

//Import ecosystem
import Business.EcoSystem;

//Import organization
import Business.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;


//Import company
import Business.Company.Company;


//Import CardLayout
import java.awt.CardLayout;

//Import Component
import java.awt.Component;

//Import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import Table model
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merwinroy
 */
public class RestaurantManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantManagementJPanel
     */
    
    //JPanel container object
    JPanel container;
    
    //Ecosystem object
    EcoSystem ecoSystem;
    
    //Company object
    Company company; 
    
    //Organization object
    Organization organization;
    
    
    public RestaurantManagementJPanel(JPanel container,EcoSystem ecoSystem) 
    {
        //Initialize components
        initComponents();
        
        this.container=container;
        
        this.ecoSystem=ecoSystem;
        
        populateTable();
        
        //no error prompt if there is enterprise and organization
        if(company!=null &&organization!=null )
        {
            this.company = ecoSystem.
                    getCompanyDirectory().
                    findCompany(txtSearch.getText());
            
            this.organization=company.getRestaurantDirectory().
                    findOrganization("RestaurantAdmin") ;
        }
    }
    
    public void populateTable()
    {
        //TableModel object is created
        DefaultTableModel tableModel = (DefaultTableModel) tblRestaurantManagement.getModel();
        
        //set row count of model to 0
        tableModel.setRowCount(0);
        
        for(Company company:ecoSystem.getCompanyDirectory().getCompanyList()) 
        {
            Object row[] = new Object[3];
            
            row[0] = company.getName();
            
            row[1] = company.getAddress();
            
            row[2] = company;
            
            //add row to model after every iteration
            tableModel.addRow(row);
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
        tblRestaurantManagement = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnAddRestaurant = new javax.swing.JButton();
        btnUpdateRestaurant = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestaurantManagerInfo = new javax.swing.JTable();
        btnUpdateManager = new javax.swing.JButton();
        lblRestaurantName = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDeleteManager = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDeleteRestaurant = new javax.swing.JButton();
        lblOptions = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblRestaurantManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Address", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurantManagement);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("RESTAURANT MANAGEMENT PANEL");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        btnAddRestaurant.setText("Add Restaurant");
        btnAddRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRestaurantActionPerformed(evt);
            }
        });

        btnUpdateRestaurant.setText("Update Restaurant ");
        btnUpdateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRestaurantActionPerformed(evt);
            }
        });

        tblRestaurantManagerInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Manager Name", "Manager User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRestaurantManagerInfo);

        btnUpdateManager.setText("Update Manager");
        btnUpdateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManagerActionPerformed(evt);
            }
        });

        lblRestaurantName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurantName.setText("Restaurant Name:");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search ");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDeleteManager.setText("Delete Manager");
        btnDeleteManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteManagerActionPerformed(evt);
            }
        });

        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteRestaurant.setText("Delete Restaurant ");
        btnDeleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRestaurantActionPerformed(evt);
            }
        });

        lblOptions.setText("Restaurant Options:");
        lblOptions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));

        lblSearch.setText("Search/Manager  options");
        lblSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));

        jLabel5.setText("<- Add Restaurant record into system");

        jLabel6.setText("<- Update Restaurant details");

        jLabel7.setText("<- Delete Restaurant record from system");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnUpdateRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDeleteRestaurant))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRestaurantName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateManager, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteManager, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteRestaurant)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdateManager, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteManager, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRestaurantActionPerformed
        // TODO add your handling code here:
        
        //AddRestaurantJPanel object is created 
        AddRestaurantJPanel addRestaurantPanel = new AddRestaurantJPanel(container,ecoSystem);
        
        //panel object added to container
        container.add("AddRestaurantJPanel", addRestaurantPanel);
        
        //cardlayout object is created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next layout is loaded
        cardLayout.next(container);

    }//GEN-LAST:event_btnAddRestaurantActionPerformed

    private void btnUpdateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRestaurantActionPerformed
        // TODO add your handling code here:
        
        //Selected row from table
        int selectedRow = tblRestaurantManagement.getSelectedRow();
        
        //if row is selected
        if (selectedRow >= 0) 
        {
            //UpdateRestaurantJPanel object is created
            UpdateRestaurantJPanel UpdateRestaurantPanel = new UpdateRestaurantJPanel(container,ecoSystem);
            
            //panel object added to container
            container.add("UpdateRestaurantJPanel", UpdateRestaurantPanel);
            
            //cardlayout object is created
            CardLayout layout = (CardLayout) container.getLayout();
            
            //next layout is added
            layout.next(container); 
        }
        else 
        {
            //Show messageDialog
            JOptionPane.showMessageDialog(null, "Please select an restaurant to update");
        }
    }//GEN-LAST:event_btnUpdateRestaurantActionPerformed

    private void btnUpdateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManagerActionPerformed
        // TODO add your handling code here:
        
        //Selected row from table
        int selectedRow = tblRestaurantManagerInfo.getSelectedRow();
        
        //if no row is selected
        if (selectedRow < 0) 
        {
            //Show message dialog
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed");
            return;
        }
        else
        {
            //Useraccount object selected from table row
            UserAccount account = (UserAccount)tblRestaurantManagerInfo.getValueAt(selectedRow, 2);
            
            //UpdateManagerJPanel object is created
            UpdateManagerJPanel UpdateManagerPanel = new UpdateManagerJPanel(container,account,"RestaurantAdmin");
            
            //Panel object added to container
            container.add("UpdateManagerJPanel", UpdateManagerPanel);
            
            //Cardlayout object is created
            CardLayout cardLayout = (CardLayout) container.getLayout();
            
            //next layout is loaded
            cardLayout.next(container);
        }
    }//GEN-LAST:event_btnUpdateManagerActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        //Fetch result from textfield
        Company result = ecoSystem.
                getCompanyDirectory().
                findCompany(txtSearch.getText());
        
        
        //Organization object
        Organization org=result.
                getRestaurantDirectory().
                findOrganization("RestaurantAdmin") ;
        
        //Check if restaurant exists
        if (result == null) 
        {
            //Show message dialog
            JOptionPane.showMessageDialog(null, "Restaurant entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
            
            //table model is created
            DefaultTableModel tableModel = (DefaultTableModel) tblRestaurantManagerInfo.getModel();
            
            //row count is set to 0
            tableModel.setRowCount(0);
        }
        else
        {
            //table model is created
            DefaultTableModel tableModel = (DefaultTableModel) tblRestaurantManagerInfo.getModel();
            
            //row count is set to 0
            tableModel.setRowCount(0);
            
        //for loop to iterate through list of user accounts    
        for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList()) 
        {
            Object row[] = new Object[3];
            
            row[0] = result.getName();
            
            row[1] = userAccount.getEmployee().getName();
            
            row[2] = userAccount;
           
            //add row to model after every iteration
            tableModel.addRow(row);
        }
    }
      
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteManagerActionPerformed
        // TODO add your handling code here:
        
        //Selected row from table
        int selectedRow = tblRestaurantManagerInfo.getSelectedRow();
        
        //if no row is selected,error prompt
        if (selectedRow < 0) 
        {
            //show messageDialog
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed");
            
            return;
        }
        else
        {
            //UserAccount object is created 
            UserAccount account = (UserAccount)tblRestaurantManagerInfo.getValueAt(selectedRow, 2);
            
            organization.
                    getUserAccountDirectory().
                    deleteAccount(account);
            
            organization.
                    getEmployeeDirectory().
                    deleteEmployee(account.getEmployee());
            
            //show message dialog
            JOptionPane.showMessageDialog(null, "User Account has been deleted successfully");
        } 
    }//GEN-LAST:event_btnDeleteManagerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        //remove current container layout
        container.remove(this);
        
        //cardlayout object is created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //previous layout is loaded
        cardLayout.previous(container);
        
        //components array is created to fetch and store components from container
        Component[] components = this.container.
                getComponents();
        
        //for loop to iterate through all components
        for(Component component : components)
        {
            if(component instanceof SystemAdminWorkAreaJPanel)
            {
                //SystemAdminWorkAreaJPanel object 
                SystemAdminWorkAreaJPanel sawaPanel= (SystemAdminWorkAreaJPanel) component;
                sawaPanel.populateTree(); 
            }
        }
        //previous container layout is loaded
        cardLayout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRestaurantActionPerformed
        // TODO add your handling code here:
        
        //Selected row from table
        int selectedRow = tblRestaurantManagement.getSelectedRow();
        
        //prompts error if no row is selected from table
        if (selectedRow < 0) 
        {
            //show message dialog
            JOptionPane.showMessageDialog(null, "Please select a row from table to proceed");
            return;
        }
        else
        {
            //company object selected from table row
            Company com = (Company)tblRestaurantManagement.getValueAt(selectedRow, 2);
            
            ecoSystem.
                    getCompanyDirectory().
                    deleteCompany(com);
            
            //show message dialog
            JOptionPane.showMessageDialog(null, "Restaurant has been deleted from system successfully");
            
            populateTable();
    } 
        
    }//GEN-LAST:event_btnDeleteRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRestaurant;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteManager;
    private javax.swing.JButton btnDeleteRestaurant;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateManager;
    private javax.swing.JButton btnUpdateRestaurant;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblRestaurantManagement;
    private javax.swing.JTable tblRestaurantManagerInfo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
