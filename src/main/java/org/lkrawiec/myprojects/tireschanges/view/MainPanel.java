/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.tireschanges.view;

/**
 * Main panel which shows menu at the start of the application.
 * Contains two buttons for change form panel and history panel.
 * 
 * @author Lukasz Krawiec
 */
public class MainPanel extends javax.swing.JPanel {

    /**  Action made on add change button press - by default not set */
    private Action addChangeButtonAction;
    /**  Action made on search car button press - by default not set */
    private Action searchCarButtonAction;

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
    }

    /**
     * Registers given action on add new change button press.
     * 
     * @param addChangeButtonAction given action
     */
    public void setAddChangeButtonAction(Action addChangeButtonAction) {
        this.addChangeButtonAction = addChangeButtonAction;
    }

    /**
     *  Registers given action on search car button press.
     * 
     * @param searchCarButtonAction given action
     */
    public void setSearchCarButtonAction(Action searchCarButtonAction) {
        this.searchCarButtonAction = searchCarButtonAction;
    }

    /**
     * Initializes components of given UI elements (generated)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        newChangeButton = new javax.swing.JButton();
        searchCarButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        newChangeButton.setText("New Change");
        newChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newChangeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(newChangeButton, gridBagConstraints);

        searchCarButton.setText("Search Car");
        searchCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(searchCarButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Fires action on add new change button press
     * Action can not be null or exception will be thrown
     * @param evt given action
     */
    private void newChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newChangeButtonActionPerformed
        addChangeButtonAction.Do();
    }//GEN-LAST:event_newChangeButtonActionPerformed

    /**
     * Fires action on search car button press
     * Action can not be null or exception will be thrown
     * @param evt given action
     */
    private void searchCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCarButtonActionPerformed
        searchCarButtonAction.Do();
    }//GEN-LAST:event_searchCarButtonActionPerformed

    /**
     * Elements of UI
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton newChangeButton;
    private javax.swing.JButton searchCarButton;
    // End of variables declaration//GEN-END:variables
}
