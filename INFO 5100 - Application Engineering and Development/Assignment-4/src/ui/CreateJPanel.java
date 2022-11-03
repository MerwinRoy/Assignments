/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.Community;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.System1;
import model.VitalSignHistory;
import model.VitalSigns;


/**
 *
 * @author merwinroy
 */


public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    private EncounterHistory eHistory;
    
    private PatientDirectory patientDir;
    
    private VitalSignHistory vHistory;
    
    private Community community;
    
    private City city;
    
    private PersonDirectory personDir;
    
    private System1 systemList;
    
    private JPanel controlPanel;
    
    public CreateJPanel(JPanel controlPanel,System1 systemList, EncounterHistory eHistory, VitalSignHistory vHistory, Community community, PersonDirectory personDir, PatientDirectory patientDir, City city) {
        initComponents();
        this.controlPanel= controlPanel;
        this.systemList = systemList;
        this.eHistory = eHistory;
        this.vHistory = vHistory;
        this.patientDir = patientDir;
        this.personDir = personDir;
        this.community = community;
        this.city = city;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblPatientTitle = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblDob = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lblHouse = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblVitalTitle = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblBp = new javax.swing.JLabel();
        txtBp = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblStreetName = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ADD PATIENT DETAILS INTO THE SYSTEM");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        lblPatientTitle.setText("PATIENT DETAILS");
        lblPatientTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        lblFname.setText("First Name:");

        lblLname.setText("Last Name:");

        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        lblID.setText("Patient-ID:");

        lblSex.setText("Gender:");

        lblAge.setText("Age:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblDob.setText("Date of Birth:");

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        lblHouse.setText("House No.:");

        lblCommunity.setText("Community:");

        lblCity.setText("City:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblVitalTitle.setText("PATIENT VITALS");
        lblVitalTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        lblTemperature.setText("Temperature:");

        lblBp.setText("Blood Pressure:");

        lblPulse.setText("Pulse:");

        lblDate.setText("Check-up Date");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblStreetName.setText("Street Name:");

        lblZip.setText("Zip Code:");

        lblPhone.setText("Phone Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(lblPatientTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblVitalTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemperature)
                    .addComponent(lblBp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBp)
                    .addComponent(txtTemperature))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(txtPulse))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFname)
                            .addComponent(lblID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtFname)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHouse)
                            .addComponent(lblCity))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHouse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblZip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDob)
                        .addGap(18, 18, 18)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txtPhone))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblPatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFname)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLname)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSex)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDob)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouse)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreetName)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblVitalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBp)
                    .addComponent(txtBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //Current Panel layout removed
        controlPanel.remove(this);
        
        //Previous panel layout is loaded 
        CardLayout cardLayout = (CardLayout) controlPanel.getLayout();
        cardLayout.previous(controlPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fname = "";
        String lname = "";
        String cityName = "";
        String sex = "";
        String streetName = "";
        String communityName = "";
        String contact = "";
        
        //Condition to check if textfields are empty or not (Validation)
        if(txtFname.getText().equals("") || txtLname.getText().equals("") || txtCity.getText().equals("") || txtSex.getText().equals("") || txtStreet.getText().equals("") || txtCommunity.getText().equals(""))
            
        {
            
            JOptionPane.showMessageDialog(null, "Empty Field Entries are not permitted!");
            return;
            
        }
        
        else
            
        {
   
            fname = txtFname.getText();
            lname = txtLname.getText();
            cityName = txtCity.getText();
            sex = txtSex.getText();
            streetName = txtStreet.getText();
            communityName = txtCommunity.getText();
            contact = txtPhone.getText();
            
        }
        
        try{
            int patientID = Integer.parseInt(txtId.getText());
            String dateOfBirth = txtDob.getText();
            int houseNo = Integer.parseInt(txtHouse.getText());
            int zip = Integer.parseInt(txtZip.getText());
            int age = Integer.parseInt(txtAge.getText());
            
            double temperature = Double.parseDouble(txtTemperature.getText());
            double bloodPressure = Double.parseDouble(txtBp.getText());
            int pulse = Integer.parseInt(txtPulse.getText());
            String date = txtDate.getText();
            
            model.System system = systemList.addNewSystem();
            
           
            
            system.setBloodPressure(bloodPressure);
            system.setTemperature(temperature);
            system.setPulse(pulse);
           
            system.setPatientID(patientID);
            
            
            
            system.setFirstName(fname);
            system.setLastName(lname);
            system.setSex(sex);
            system.setAge(age);
            system.setContactNum(contact);
            system.setDob(dateOfBirth); 
            
            system.setStreetName(streetName);
            system.setHouseNumber(houseNo);
            system.setZip(zip);
            system.setCity(cityName);
            system.setCommunity(communityName);
            
            
            
            JOptionPane.showMessageDialog(null, "Patient has been added and saved into the system successfully");

            
        }
        catch(NumberFormatException n)
        {   //Numeric Format error (For validation) will lead to a prompt
            JOptionPane.showMessageDialog(null,"Invalid Numeric Entry");
            return;
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBp;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPatientTitle;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblStreetName;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVitalTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBp;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
