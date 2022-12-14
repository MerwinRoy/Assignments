/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface;


import business_model.Fleet;

import java.awt.CardLayout;

import javax.swing.JPanel;

/**
 *
 * @author merwinroy
 */


public class OptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OptionJPanel
     */
    
    //Fleet object
    private final Fleet fleet;
    
    //JPanel object to refer to controlPanel(right component)
    private final JPanel controlPanel;
    
    //Constructor with parameters for JPanel and Fleet objects
    public OptionJPanel(JPanel controlPanel, Fleet fleet) {
        initComponents();
        //Fleet object
        this.fleet = fleet;
        //JPanel object
        this.controlPanel = controlPanel;
        
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
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("VEHICLE MANAGEMENT SYSTEM");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

        btnAdd.setText("ADD CAR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnView.setText("VIEW / SEARCH/ DELETE");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setText("MODIFY EXISTING RECORD");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        //CreateJPanel layout is displayed when add button is clicked by user
        
        //CreateJPanel object contains reference to JPanel and Fleet objects
        CreateJPanel createPanel = new CreateJPanel(controlPanel,fleet);
        
        //CreateJPanel added to controlPanel JPanel object
        controlPanel.add("CreateJPanel",createPanel);
        
        //Layout displays CreateJPanel layout
        CardLayout cardLayout = (CardLayout) controlPanel.getLayout();
        
        cardLayout.next(controlPanel);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        //UpdateJPanel layout is displayed when add button is clicked by user
        
        //UpdateJPanel object contains reference to JPanel and Fleet objects
        UpdateJPanel updatePanel = new UpdateJPanel(controlPanel,fleet);
        
        //UpdateJPanel added to controlPanel JPanel object
        controlPanel.add("UpdateJPanel",updatePanel);
        
        //Layout displays UpdateJPanel layout
        CardLayout cardLayout = (CardLayout) controlPanel.getLayout();
        cardLayout.next(controlPanel);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        //ViewJPanel layout is displayed when add button is clicked by user
        
        //ViewJPanel object contains reference to JPanel and Fleet objects
        ViewJPanel viewPanel = new ViewJPanel(controlPanel,fleet);
        
        //ViewJPanel added to controlPanel JPanel object
        controlPanel.add("ViewJPanel",viewPanel);
        
        //Layout displays ViewJPanel layout
        CardLayout cardLayout = (CardLayout) controlPanel.getLayout();
        cardLayout.next(controlPanel);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
