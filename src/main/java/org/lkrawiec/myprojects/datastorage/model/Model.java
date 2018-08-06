/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.model;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author lukii
 */
public class Model {
    
    private final HashMap<ClientsCar.LicensePlates, LinkedList<Change>> 
            licenseChangesMap;

    public Model() {
        this.licenseChangesMap = new HashMap<>();
    }
    
    public void addChange(Change change) {
        ClientsCar.LicensePlates licensePlates = 
                change.getClientsCar().getLicensePlates();
        
        LinkedList<Change> list = licenseChangesMap.get(licensePlates);
        if (list != null) {
            list.add(change);
            return;
        }
        // else
        list = new LinkedList<>();
        list.add(change);
        licenseChangesMap.put(licensePlates, list);
    }
    
    public LinkedList<Change> listChangesForPlates(
            ClientsCar.LicensePlates licensePlates) {
        LinkedList<Change> changes = licenseChangesMap.get(licensePlates); 
        return changes != null ? changes : new LinkedList<>();
    }
}
