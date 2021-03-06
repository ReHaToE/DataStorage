/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.tireschanges.view;

import org.lkrawiec.myprojects.tireschanges.model.AddChangeData;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 * Panel containing all information about change. Has prompts with examples.
 * It's a form to be filled by data by user.
 * 
 * @author Lukasz Krawiec
 */
public class ChangeFormPanel extends javax.swing.JPanel {
    
    /**
     * Example prompts:
     */
    /** Example prompt for Mileage */
    private static final String EX_99999 = "ex. 99999";
    /** Example prompt for License Plates */
    private static final String EX_34LGH5 = "ex. 34-LGH-5";
    /** Example prompt for Model */
    private static final String EX__CIVIC = "ex. Civic";
    /** Example prompt for Brand */
    private static final String EX__HONDA = "ex. Honda";
    /** Example prompt for Email */
    private static final String EX__JV_VLIVENL = "ex. JvV@live.nl";
    /** Example prompt for Phone Number */
    private static final String EX_06_81923452 = "ex. 06 81923452";
    /** Example prompt for Address */
    private static final String EX__SCHEISTRAAT_411 = "ex. Scheistraat 411";
    /** Example prompt for Name */
    private static final String EX__JAN_VAN__VLIET = "ex. Jan van Vliet";
    /** Example prompt for Tire Pressure */
    private static final String EX_24 = "ex. 2.4";
    /** Example prompt for Tire Model */
    private static final String EX__CONTI_ECO_CONTACT5 = "ex. ContiEcoContact5";
    /** Example prompt for Tire Size */
    private static final String EX_1856514 = "ex. 185/65/14";
    /** Example prompt for Tire Profile */
    private static final String EX_41 = "ex. 4.1";
    /** Example prompt for Tire Brand */
    private static final String EX__CONTINENTAL = "ex. Continental";
    
    /**
     * Initializes components of change form panel.
     * If editable is true, sets prompts, else grays out whole panel.
     * @param editable new value for panel editability
     */
    public ChangeFormPanel(boolean editable) {
        initComponents();
        if (editable) {
            setPrompts();
        }
        else {
            setEditable(false);
        }
    }

    /**
     * Gathers data from this panel and returns it.
     * 
     * @return Gathered data.
     */
    public AddChangeData getAddChangeData() {
        AddChangeData addChangeData = new AddChangeData();
        addChangeData.name = nameTextField.getText();
        addChangeData.address = addressTextField.getText();
        addChangeData.phoneNumber = phoneNumberTextField.getText();
        addChangeData.email = emailTextField.getText();
        
        addChangeData.carBrand = brandTextField.getText();
        addChangeData.carModel = modelTextField.getText();
        addChangeData.carLicensePlates = licensePlatesTextField.getText();
        addChangeData.carMileage = mileageTextField.getText();
        
        addChangeData.leftFrontNewTiresSize = leftFrontNewTiresSizeTextField.getText();
        addChangeData.leftFrontNewTiresProfile = leftFrontNewTiresProfileTextField.getText();
        addChangeData.leftFrontNewTiresBrand = leftFrontNewTiresBrandTextField.getText();
        addChangeData.leftFrontNewTiresModel = leftFrontNewTiresModelTextField.getText();
        addChangeData.leftFrontNewTiresPressure = leftFrontNewTiresPressureTextField.getText();
        
        addChangeData.rightFrontNewTiresSize = rightFrontNewTiresSizeTextField.getText();
        addChangeData.rightFrontNewTiresProfile = rightFrontNewTiresProfileTextField.getText();
        addChangeData.rightFrontNewTiresBrand = rightFrontNewTiresBrandTextField.getText();
        addChangeData.rightFrontNewTiresModel = rightFrontNewTiresModelTextField.getText();
        addChangeData.rightFrontNewTiresPressure = rightFrontNewTiresPressureTextField.getText();
        
        addChangeData.rearLeftNewTiresSize = rearLeftNewTiresSizeTextField.getText();
        addChangeData.rearLeftNewTiresProfile = rearLeftNewTiresProfileTextField.getText();
        addChangeData.rearLeftNewTiresBrand = rearLeftNewTiresBrandTextField.getText();
        addChangeData.rearLeftNewTiresModel = rearLeftNewTiresModelTextField.getText();
        addChangeData.rearLeftNewTiresPressure = rearLeftNewTiresPressureTextField.getText();
        
        addChangeData.rearRightNewTiresSize = rearRightNewTiresSizeTextField.getText();
        addChangeData.rearRightNewTiresProfile = rearRightNewTiresProfileTextField.getText();
        addChangeData.rearRightNewTiresBrand = rearRightNewTiresBrandTextField.getText();
        addChangeData.rearRightNewTiresModel = rearRightNewTiresModelTextField.getText();
        addChangeData.rearRightNewTiresPressure = rearRightNewTiresPressureTextField.getText();
        
        addChangeData.leftFrontOldTiresSize = leftFrontOldTiresSizeTextField.getText();
        addChangeData.leftFrontOldTiresProfile = leftFrontOldTiresProfileTextField.getText();
        addChangeData.leftFrontOldTiresBrand = leftFrontOldTiresBrandTextField.getText();
        addChangeData.leftFrontOldTiresModel = leftFrontOldTiresModelTextField.getText();
        
        addChangeData.rightFrontOldTiresSize = rightFrontOldTiresSizeTextField.getText();
        addChangeData.rightFrontOldTiresProfile = rightFrontOldTiresProfileTextField.getText();
        addChangeData.rightFrontOldTiresBrand = rightFrontOldTiresBrandTextField.getText();
        addChangeData.rightFrontOldTiresModel = rightFrontOldTiresModelTextField.getText();
        
        addChangeData.rearLeftOldTiresSize = rearLeftOldTiresSizeTextField.getText();
        addChangeData.rearLeftOldTiresProfile = rearLeftOldTiresProfileTextField.getText();
        addChangeData.rearLeftOldTiresBrand = rearLeftOldTiresBrandTextField.getText();
        addChangeData.rearLeftOldTiresModel = rearLeftOldTiresModelTextField.getText();
        
        addChangeData.rearRightOldTiresSize = rearRightOldTiresSizeTextField.getText();
        addChangeData.rearRightOldTiresProfile = rearRightOldTiresProfileTextField.getText();
        addChangeData.rearRightOldTiresBrand = rearRightOldTiresBrandTextField.getText();
        addChangeData.rearRightOldTiresModel = rearRightOldTiresModelTextField.getText();
        
        addChangeData.storeOldTires = storeOldTiresCheckBox.isSelected();

        return addChangeData;
    }

    /**
     * Fills this panel with given data. 
     * @param addChangeData given data
     */
    public void fillWithData(AddChangeData addChangeData) {
        nameTextField.setText(addChangeData.name);
        addressTextField.setText(addChangeData.address);
        phoneNumberTextField.setText(addChangeData.phoneNumber);
        emailTextField.setText(addChangeData.email);
        
        brandTextField.setText(addChangeData.carBrand);
        modelTextField.setText(addChangeData.carModel);
        licensePlatesTextField.setText(addChangeData.carLicensePlates);
        mileageTextField.setText(addChangeData.carMileage);
        
        leftFrontNewTiresSizeTextField.setText(addChangeData.leftFrontNewTiresSize);
        leftFrontNewTiresProfileTextField.setText(addChangeData.leftFrontNewTiresProfile);
        leftFrontNewTiresBrandTextField.setText(addChangeData.leftFrontNewTiresBrand);
        leftFrontNewTiresModelTextField.setText(addChangeData.leftFrontNewTiresModel);
        leftFrontNewTiresPressureTextField.setText(addChangeData.leftFrontNewTiresPressure);
        
        rightFrontNewTiresSizeTextField.setText(addChangeData.rightFrontNewTiresSize);
        rightFrontNewTiresProfileTextField.setText(addChangeData.rightFrontNewTiresProfile);
        rightFrontNewTiresBrandTextField.setText(addChangeData.rightFrontNewTiresBrand);
        rightFrontNewTiresModelTextField.setText(addChangeData.rightFrontNewTiresModel);
        rightFrontNewTiresPressureTextField.setText(addChangeData.rightFrontNewTiresPressure);
        
        rearLeftNewTiresSizeTextField.setText(addChangeData.rearLeftNewTiresSize);
        rearLeftNewTiresProfileTextField.setText(addChangeData.rearLeftNewTiresProfile);
        rearLeftNewTiresBrandTextField.setText(addChangeData.rearLeftNewTiresBrand);
        rearLeftNewTiresModelTextField.setText(addChangeData.rearLeftNewTiresModel);
        rearLeftNewTiresPressureTextField.setText(addChangeData.rearLeftNewTiresPressure);
        
        rearRightNewTiresSizeTextField.setText(addChangeData.rearRightNewTiresSize);
        rearRightNewTiresProfileTextField.setText(addChangeData.rearRightNewTiresProfile);
        rearRightNewTiresBrandTextField.setText(addChangeData.rearRightNewTiresBrand);
        rearRightNewTiresModelTextField.setText(addChangeData.rearRightNewTiresModel);
        rearRightNewTiresPressureTextField.setText(addChangeData.rearRightNewTiresPressure);
        
        leftFrontOldTiresSizeTextField.setText(addChangeData.leftFrontOldTiresSize);
        leftFrontOldTiresProfileTextField.setText(addChangeData.leftFrontOldTiresProfile);
        leftFrontOldTiresBrandTextField.setText(addChangeData.leftFrontOldTiresBrand);
        leftFrontOldTiresModelTextField.setText(addChangeData.leftFrontOldTiresModel);
        
        rightFrontOldTiresSizeTextField.setText(addChangeData.rightFrontOldTiresSize);
        rightFrontOldTiresProfileTextField.setText(addChangeData.rightFrontOldTiresProfile);
        rightFrontOldTiresBrandTextField.setText(addChangeData.rightFrontOldTiresBrand);
        rightFrontOldTiresModelTextField.setText(addChangeData.rightFrontOldTiresModel);
        
        rearLeftOldTiresSizeTextField.setText(addChangeData.rearLeftOldTiresSize);
        rearLeftOldTiresProfileTextField.setText(addChangeData.rearLeftOldTiresProfile);
        rearLeftOldTiresBrandTextField.setText(addChangeData.rearLeftOldTiresBrand);
        rearLeftOldTiresModelTextField.setText(addChangeData.rearLeftOldTiresModel);
        
        rearRightOldTiresSizeTextField.setText(addChangeData.rearRightOldTiresSize);
        rearRightOldTiresProfileTextField.setText(addChangeData.rearRightOldTiresProfile);
        rearRightOldTiresBrandTextField.setText(addChangeData.rearRightOldTiresBrand);
        rearRightOldTiresModelTextField.setText(addChangeData.rearRightOldTiresModel);
        
        storeOldTiresCheckBox.setSelected(addChangeData.storeOldTires);
    }

    /**
     * Sets prompts for this panel.
     */
    private void setPrompts() {
        PromptSupport.setPrompt(EX__JAN_VAN__VLIET, nameTextField);
        PromptSupport.setPrompt(EX__SCHEISTRAAT_411, addressTextField);
        PromptSupport.setPrompt(EX_06_81923452, phoneNumberTextField);
        PromptSupport.setPrompt(EX__JV_VLIVENL, emailTextField);
        
        PromptSupport.setPrompt(EX__HONDA, brandTextField);
        PromptSupport.setPrompt(EX__CIVIC, modelTextField);
        PromptSupport.setPrompt(EX_34LGH5, licensePlatesTextField);
        PromptSupport.setPrompt(EX_99999, mileageTextField);
        
        PromptSupport.setPrompt(EX_1856514, leftFrontNewTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, leftFrontNewTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, leftFrontNewTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, leftFrontNewTiresModelTextField);
        PromptSupport.setPrompt(EX_24, leftFrontNewTiresPressureTextField);
        
        PromptSupport.setPrompt(EX_1856514, rightFrontNewTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, rightFrontNewTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, rightFrontNewTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, rightFrontNewTiresModelTextField);
        PromptSupport.setPrompt(EX_24, rightFrontNewTiresPressureTextField);
        
        PromptSupport.setPrompt(EX_1856514, rearLeftNewTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, rearLeftNewTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, rearLeftNewTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, rearLeftNewTiresModelTextField);
        PromptSupport.setPrompt(EX_24, rearLeftNewTiresPressureTextField);
        
        PromptSupport.setPrompt(EX_1856514, rearRightNewTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, rearRightNewTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, rearRightNewTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, rearRightNewTiresModelTextField);
        PromptSupport.setPrompt(EX_24, rearRightNewTiresPressureTextField);
        
        PromptSupport.setPrompt(EX_1856514, leftFrontOldTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, leftFrontOldTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, leftFrontOldTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, leftFrontOldTiresModelTextField);
        
        PromptSupport.setPrompt(EX_1856514, rightFrontOldTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, rightFrontOldTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, rightFrontOldTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, rightFrontOldTiresModelTextField);
        
        PromptSupport.setPrompt(EX_1856514, rearLeftOldTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, rearLeftOldTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, rearLeftOldTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, rearLeftOldTiresModelTextField);
        
        PromptSupport.setPrompt(EX_1856514, rearRightOldTiresSizeTextField);
        PromptSupport.setPrompt(EX_41, rearRightOldTiresProfileTextField);
        PromptSupport.setPrompt(EX__CONTINENTAL, rearRightOldTiresBrandTextField);
        PromptSupport.setPrompt(EX__CONTI_ECO_CONTACT5, rearRightOldTiresModelTextField);
        
    }
    
    /**
     * Sets if this panel is editable.
     * @param value given parameter
     */
    private void setEditable(boolean value) {    
        
        nameTextField.setEditable(value);
        addressTextField.setEditable(value);
        phoneNumberTextField.setEditable(value);
        emailTextField.setEditable(value);
        
        brandTextField.setEditable(value);
        modelTextField.setEditable(value);
        licensePlatesTextField.setEditable(value);
        mileageTextField.setEditable(value);
        
        leftFrontNewTiresSizeTextField.setEditable(value);
        leftFrontNewTiresProfileTextField.setEditable(value);
        leftFrontNewTiresBrandTextField.setEditable(value);
        leftFrontNewTiresModelTextField.setEditable(value);
        leftFrontNewTiresPressureTextField.setEditable(value);
        
        rightFrontNewTiresSizeTextField.setEditable(value);
        rightFrontNewTiresProfileTextField.setEditable(value);
        rightFrontNewTiresBrandTextField.setEditable(value);
        rightFrontNewTiresModelTextField.setEditable(value);
        rightFrontNewTiresPressureTextField.setEditable(value);
        
        rearLeftNewTiresSizeTextField.setEditable(value);
        rearLeftNewTiresProfileTextField.setEditable(value);
        rearLeftNewTiresBrandTextField.setEditable(value);
        rearLeftNewTiresModelTextField.setEditable(value);
        rearLeftNewTiresPressureTextField.setEditable(value);
        
        rearRightNewTiresSizeTextField.setEditable(value);
        rearRightNewTiresProfileTextField.setEditable(value);
        rearRightNewTiresBrandTextField.setEditable(value);
        rearRightNewTiresModelTextField.setEditable(value);
        rearRightNewTiresPressureTextField.setEditable(value);
        
        leftFrontOldTiresSizeTextField.setEditable(value);
        leftFrontOldTiresProfileTextField.setEditable(value);
        leftFrontOldTiresBrandTextField.setEditable(value);
        leftFrontOldTiresModelTextField.setEditable(value);
        
        rightFrontOldTiresSizeTextField.setEditable(value);
        rightFrontOldTiresProfileTextField.setEditable(value);
        rightFrontOldTiresBrandTextField.setEditable(value);
        rightFrontOldTiresModelTextField.setEditable(value);
        
        rearLeftOldTiresSizeTextField.setEditable(value);
        rearLeftOldTiresProfileTextField.setEditable(value);
        rearLeftOldTiresBrandTextField.setEditable(value);
        rearLeftOldTiresModelTextField.setEditable(value);
        
        rearRightOldTiresSizeTextField.setEditable(value);
        rearRightOldTiresProfileTextField.setEditable(value);
        rearRightOldTiresBrandTextField.setEditable(value);
        rearRightOldTiresModelTextField.setEditable(value);
        
        storeOldTiresCheckBox.setEnabled(value);
    }
    
    /**
     * Resets data of this panel.
     */
    public void resetData () {
        
        nameTextField.setText(null);
        addressTextField.setText(null);
        phoneNumberTextField.setText(null);
        emailTextField.setText(null);
        
        brandTextField.setText(null);
        modelTextField.setText(null);
        licensePlatesTextField.setText(null);
        mileageTextField.setText(null);
        
        leftFrontNewTiresSizeTextField.setText(null);
        leftFrontNewTiresProfileTextField.setText(null);
        leftFrontNewTiresBrandTextField.setText(null);
        leftFrontNewTiresModelTextField.setText(null);
        leftFrontNewTiresPressureTextField.setText(null);
        
        rightFrontNewTiresSizeTextField.setText(null);
        rightFrontNewTiresProfileTextField.setText(null);
        rightFrontNewTiresBrandTextField.setText(null);
        rightFrontNewTiresModelTextField.setText(null);
        rightFrontNewTiresPressureTextField.setText(null);
        
        rearLeftNewTiresSizeTextField.setText(null);
        rearLeftNewTiresProfileTextField.setText(null);
        rearLeftNewTiresBrandTextField.setText(null);
        rearLeftNewTiresModelTextField.setText(null);
        rearLeftNewTiresPressureTextField.setText(null);
        
        rearRightNewTiresSizeTextField.setText(null);
        rearRightNewTiresProfileTextField.setText(null);
        rearRightNewTiresBrandTextField.setText(null);
        rearRightNewTiresModelTextField.setText(null);
        rearRightNewTiresPressureTextField.setText(null);
        
        leftFrontOldTiresSizeTextField.setText(null);
        leftFrontOldTiresProfileTextField.setText(null);
        leftFrontOldTiresBrandTextField.setText(null);
        leftFrontOldTiresModelTextField.setText(null);
        
        rightFrontOldTiresSizeTextField.setText(null);
        rightFrontOldTiresProfileTextField.setText(null);
        rightFrontOldTiresBrandTextField.setText(null);
        rightFrontOldTiresModelTextField.setText(null);
        
        rearLeftOldTiresSizeTextField.setText(null);
        rearLeftOldTiresProfileTextField.setText(null);
        rearLeftOldTiresBrandTextField.setText(null);
        rearLeftOldTiresModelTextField.setText(null);
        
        rearRightOldTiresSizeTextField.setText(null);
        rearRightOldTiresProfileTextField.setText(null);
        rearRightOldTiresBrandTextField.setText(null);
        rearRightOldTiresModelTextField.setText(null);
        
        storeOldTiresCheckBox.setSelected(false);
    }
    
    /**
     * Elements of UI   
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        brandTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        licensePlatesTextField = new javax.swing.JTextField();
        mileageTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightFrontNewTiresSizeTextField = new javax.swing.JTextField();
        rightFrontNewTiresModelTextField = new javax.swing.JTextField();
        rightFrontNewTiresProfileTextField = new javax.swing.JTextField();
        rightFrontNewTiresBrandTextField = new javax.swing.JTextField();
        rightFrontNewTiresPressureTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        rearLeftNewTiresSizeTextField = new javax.swing.JTextField();
        rearLeftNewTiresProfileTextField = new javax.swing.JTextField();
        rearLeftNewTiresBrandTextField = new javax.swing.JTextField();
        rearLeftNewTiresModelTextField = new javax.swing.JTextField();
        rearLeftNewTiresPressureTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        leftFrontNewTiresSizeTextField = new javax.swing.JTextField();
        leftFrontNewTiresModelTextField = new javax.swing.JTextField();
        leftFrontNewTiresProfileTextField = new javax.swing.JTextField();
        leftFrontNewTiresBrandTextField = new javax.swing.JTextField();
        leftFrontNewTiresPressureTextField = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        rearRightNewTiresSizeTextField = new javax.swing.JTextField();
        rearRightNewTiresModelTextField = new javax.swing.JTextField();
        rearRightNewTiresProfileTextField = new javax.swing.JTextField();
        rearRightNewTiresBrandTextField = new javax.swing.JTextField();
        rearRightNewTiresPressureTextField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        leftFrontOldTiresSizeTextField = new javax.swing.JTextField();
        leftFrontOldTiresModelTextField = new javax.swing.JTextField();
        leftFrontOldTiresProfileTextField = new javax.swing.JTextField();
        leftFrontOldTiresBrandTextField = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        rearLeftOldTiresSizeTextField = new javax.swing.JTextField();
        rearLeftOldTiresProfileTextField = new javax.swing.JTextField();
        rearLeftOldTiresBrandTextField = new javax.swing.JTextField();
        rearLeftOldTiresModelTextField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        rearRightOldTiresProfileTextField = new javax.swing.JTextField();
        rearRightOldTiresModelTextField = new javax.swing.JTextField();
        rearRightOldTiresBrandTextField = new javax.swing.JTextField();
        rearRightOldTiresSizeTextField = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        rightFrontOldTiresSizeTextField = new javax.swing.JTextField();
        rightFrontOldTiresModelTextField = new javax.swing.JTextField();
        rightFrontOldTiresProfileTextField = new javax.swing.JTextField();
        rightFrontOldTiresBrandTextField = new javax.swing.JTextField();
        storeOldTiresCheckBox = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Client");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel5.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel1.add(nameTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel1.add(addressTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel1.add(phoneNumberTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel1.add(emailTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Client´s car");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel9.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(brandTextField, gridBagConstraints);

        jLabel10.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(modelTextField, gridBagConstraints);

        jLabel11.setText("License Plates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(jLabel11, gridBagConstraints);

        jLabel12.setText("Mileage");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(jLabel12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(licensePlatesTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(mileageTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel2, gridBagConstraints);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("New Tires");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel4.add(jLabel3, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel13.setText("Right Front");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jLabel13, gridBagConstraints);

        jLabel17.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jLabel17, gridBagConstraints);

        jLabel19.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jLabel19, gridBagConstraints);

        jLabel18.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jLabel18, gridBagConstraints);

        jLabel20.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jLabel20, gridBagConstraints);

        jLabel4.setText("Pressure");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(rightFrontNewTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(rightFrontNewTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(rightFrontNewTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(rightFrontNewTiresBrandTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel5.add(rightFrontNewTiresPressureTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(jPanel5, gridBagConstraints);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel15.setText("Rear Left");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(jLabel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(rearLeftNewTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(rearLeftNewTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(rearLeftNewTiresBrandTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(rearLeftNewTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(rearLeftNewTiresPressureTextField, gridBagConstraints);

        jLabel21.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(jLabel21, gridBagConstraints);

        jLabel22.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(jLabel22, gridBagConstraints);

        jLabel23.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(jLabel23, gridBagConstraints);

        jLabel24.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(jLabel24, gridBagConstraints);

        jLabel38.setText("Pressure");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel7.add(jLabel38, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(jPanel7, gridBagConstraints);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jLabel45.setText("Left Front");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(jLabel45, gridBagConstraints);

        jLabel46.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(jLabel46, gridBagConstraints);

        jLabel52.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(jLabel52, gridBagConstraints);

        jLabel53.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(jLabel53, gridBagConstraints);

        jLabel54.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(jLabel54, gridBagConstraints);

        jLabel55.setText("Pressure");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(jLabel55, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(leftFrontNewTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(leftFrontNewTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(leftFrontNewTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(leftFrontNewTiresBrandTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel11.add(leftFrontNewTiresPressureTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(jPanel11, gridBagConstraints);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel56.setText("Rear Right");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(jLabel56, gridBagConstraints);

        jLabel57.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(jLabel57, gridBagConstraints);

        jLabel58.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(jLabel58, gridBagConstraints);

        jLabel59.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(jLabel59, gridBagConstraints);

        jLabel60.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(jLabel60, gridBagConstraints);

        jLabel61.setText("Pressure");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(jLabel61, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(rearRightNewTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(rearRightNewTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(rearRightNewTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(rearRightNewTiresBrandTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel13.add(rearRightNewTiresPressureTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel4.add(jPanel13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel4, gridBagConstraints);

        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel39.setText("Old Tires");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel9.add(jLabel39, gridBagConstraints);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel40.setText("Left Front");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(jLabel40, gridBagConstraints);

        jLabel41.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(jLabel41, gridBagConstraints);

        jLabel42.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(jLabel42, gridBagConstraints);

        jLabel43.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(jLabel43, gridBagConstraints);

        jLabel44.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(jLabel44, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(leftFrontOldTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(leftFrontOldTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(leftFrontOldTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel10.add(leftFrontOldTiresBrandTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 11, 10, 20);
        jPanel9.add(jPanel10, gridBagConstraints);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jLabel47.setText("Rear Left");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(jLabel47, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(rearLeftOldTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(rearLeftOldTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(rearLeftOldTiresBrandTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(rearLeftOldTiresModelTextField, gridBagConstraints);

        jLabel48.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(jLabel48, gridBagConstraints);

        jLabel49.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(jLabel49, gridBagConstraints);

        jLabel50.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(jLabel50, gridBagConstraints);

        jLabel51.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel12.add(jLabel51, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 11, 10, 20);
        jPanel9.add(jPanel12, gridBagConstraints);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jLabel62.setText("Rear Right");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(jLabel62, gridBagConstraints);

        jLabel63.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(jLabel63, gridBagConstraints);

        jLabel64.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(jLabel64, gridBagConstraints);

        jLabel65.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(jLabel65, gridBagConstraints);

        jLabel66.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(jLabel66, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(rearRightOldTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(rearRightOldTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(rearRightOldTiresBrandTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel14.add(rearRightOldTiresSizeTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        jPanel9.add(jPanel14, gridBagConstraints);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        jLabel68.setText("Right Front");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(jLabel68, gridBagConstraints);

        jLabel69.setText("Profile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(jLabel69, gridBagConstraints);

        jLabel70.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(jLabel70, gridBagConstraints);

        jLabel71.setText("Brand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(jLabel71, gridBagConstraints);

        jLabel72.setText("Model");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(jLabel72, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(rightFrontOldTiresSizeTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(rightFrontOldTiresModelTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(rightFrontOldTiresProfileTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel15.add(rightFrontOldTiresBrandTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        jPanel9.add(jPanel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel9.add(storeOldTiresCheckBox, gridBagConstraints);

        jLabel67.setText("Store old tires?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel9.add(jLabel67, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel9, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField leftFrontNewTiresBrandTextField;
    private javax.swing.JTextField leftFrontNewTiresModelTextField;
    private javax.swing.JTextField leftFrontNewTiresPressureTextField;
    private javax.swing.JTextField leftFrontNewTiresProfileTextField;
    private javax.swing.JTextField leftFrontNewTiresSizeTextField;
    private javax.swing.JTextField leftFrontOldTiresBrandTextField;
    private javax.swing.JTextField leftFrontOldTiresModelTextField;
    private javax.swing.JTextField leftFrontOldTiresProfileTextField;
    private javax.swing.JTextField leftFrontOldTiresSizeTextField;
    private javax.swing.JTextField licensePlatesTextField;
    private javax.swing.JTextField mileageTextField;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField rearLeftNewTiresBrandTextField;
    private javax.swing.JTextField rearLeftNewTiresModelTextField;
    private javax.swing.JTextField rearLeftNewTiresPressureTextField;
    private javax.swing.JTextField rearLeftNewTiresProfileTextField;
    private javax.swing.JTextField rearLeftNewTiresSizeTextField;
    private javax.swing.JTextField rearLeftOldTiresBrandTextField;
    private javax.swing.JTextField rearLeftOldTiresModelTextField;
    private javax.swing.JTextField rearLeftOldTiresProfileTextField;
    private javax.swing.JTextField rearLeftOldTiresSizeTextField;
    private javax.swing.JTextField rearRightNewTiresBrandTextField;
    private javax.swing.JTextField rearRightNewTiresModelTextField;
    private javax.swing.JTextField rearRightNewTiresPressureTextField;
    private javax.swing.JTextField rearRightNewTiresProfileTextField;
    private javax.swing.JTextField rearRightNewTiresSizeTextField;
    private javax.swing.JTextField rearRightOldTiresBrandTextField;
    private javax.swing.JTextField rearRightOldTiresModelTextField;
    private javax.swing.JTextField rearRightOldTiresProfileTextField;
    private javax.swing.JTextField rearRightOldTiresSizeTextField;
    private javax.swing.JTextField rightFrontNewTiresBrandTextField;
    private javax.swing.JTextField rightFrontNewTiresModelTextField;
    private javax.swing.JTextField rightFrontNewTiresPressureTextField;
    private javax.swing.JTextField rightFrontNewTiresProfileTextField;
    private javax.swing.JTextField rightFrontNewTiresSizeTextField;
    private javax.swing.JTextField rightFrontOldTiresBrandTextField;
    private javax.swing.JTextField rightFrontOldTiresModelTextField;
    private javax.swing.JTextField rightFrontOldTiresProfileTextField;
    private javax.swing.JTextField rightFrontOldTiresSizeTextField;
    private javax.swing.JCheckBox storeOldTiresCheckBox;
    // End of variables declaration//GEN-END:variables
}
