/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.view;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.lkrawiec.myprojects.datastorage.common.AddChangeData;

/**
 * History panel with possibility to search history of the car by entering 
 * license plates. After selection of a change from the shown history, shows
 * selected change details.
 * 
 * @author Lukasz Krawiec
 */
public class HistoryPanel extends javax.swing.JPanel {
    /** Action to be performed on search button press*/
    private Action searchAction;
    /** List with change history that will be shown after selected change*/
    private LinkedList<AddChangeData> changes;
    /** Panel that will be shown to the user after the selected car history
     * change. If there is no change selected, panel is invisible. */
    private final ChangeFormPanel changeFormPanel;
    
    /**
     * Creates new history panel
     */
    public HistoryPanel() {
        this.changeFormPanel = new ChangeFormPanel(false);
        initComponents();
        secondPanel.add(changeFormPanel);
        changeFormPanel.setVisible(false);        
    }
    
    /**
     * Initializes components of given UI elements (generated)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchLicensePlatesTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyChangesList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        secondPanel = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Enter license plate of the car");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(searchLicensePlatesTextField, gridBagConstraints);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(searchButton, gridBagConstraints);

        historyChangesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                historyChangesListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(historyChangesList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel2.setText("History of the car");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel1, gridBagConstraints);

        secondPanel.setBorder(new javax.swing.border.MatteBorder(null));
        secondPanel.setLayout(new javax.swing.BoxLayout(secondPanel, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.6;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(secondPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Fires action on search button press
     * Action can not be null or exception will be thrown
     * @param evt given action
     */
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchAction.Do();
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * If there are no changes, hides change form panel and returns.
     * Otherwise fills change form panel with selected change data and shows it.
     * 
     * @param evt given action
     */
    private void historyChangesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_historyChangesListValueChanged
        if (changes == null || changes.isEmpty()) {
            changeFormPanel.setVisible(false);
            return;
        }
        int i = evt.getFirstIndex();
        AddChangeData addChangeData = changes.get(i);
        changeFormPanel.fillWithData(addChangeData);
        changeFormPanel.setVisible(true);
    }//GEN-LAST:event_historyChangesListValueChanged

    /**
     * Setter for searchAction
     * @param action given action
     */
    public void setSearchAction(Action action) {
        searchAction = action;
    }

    /**
     * Returns input from search license plates text field
     * @return input from search license plates text field
     */
    public String getSearchLicensePlates() {
        return searchLicensePlatesTextField.getText();
    }
    
    /**
     * Sets up new changes and updates UI
     * @param newChanges new changes 
     */
    public void setAddChangeDataList(LinkedList<AddChangeData> newChanges) {
        changes = newChanges;
        updateHistoryChanges();
    }

    /**
     * Updates history change list with new previously set changes
     */
    private void updateHistoryChanges() {
        if (changes == null) {
            Logger.getGlobal().warning(
                    "cannot pass changes as null to viewing list");
            return;
        }
        historyChangesList.setListData(
                createHistoryChangesFormattedItems(changes));
    }

    /**
     * Creates formatted changes for history change list
     * @param historyChanges history change list
     * @return list of formatted changes
     */
    private String[] createHistoryChangesFormattedItems(
            LinkedList<AddChangeData> historyChanges) {
        if (historyChanges == null) {
            return new String[0];
        }
        String[] changesArray = new String[historyChanges.size()];
        for (int i = 0; i < changesArray.length; ++i) {
            AddChangeData addChangeData = historyChanges.get(i);
            changesArray[i] = "Date: " + new SimpleDateFormat("dd/MM/yyyy")
                    .format(addChangeData.date).toString()
                    + ", Mileage: " + addChangeData.carMileage;
        } 
        return changesArray;
    }
    
    /**
     * Elements of UI
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> historyChangesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchLicensePlatesTextField;
    private javax.swing.JPanel secondPanel;
    // End of variables declaration//GEN-END:variables
}
