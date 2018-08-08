/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.model;

import java.util.HashMap;
import java.util.LinkedList;
import org.lkrawiec.myprojects.datastorage.common.AddChangeData;

/**
 *
 * @author lukii
 */
public class Model {
    
    private final HashMap<String, LinkedList<AddChangeData>> 
            licenseChangesMap;

    public Model() {
        this.licenseChangesMap = new HashMap<>();
    }
    
    public void addChange(AddChangeData addChangeData) {
        String licensePlates = 
                addChangeData.carLicensePlates;
        
        LinkedList<AddChangeData> list = licenseChangesMap.get(licensePlates);
        if (list != null) {
            list.add(addChangeData);
            return;
        }
        // else
        list = new LinkedList<>();
        list.add(addChangeData);
        licenseChangesMap.put(licensePlates, list);
    }
    
    public LinkedList<AddChangeData> listChangesForPlates(
            String licensePlates) {
        LinkedList<AddChangeData> changes = licenseChangesMap.get(licensePlates); 
        return changes != null ? changes : new LinkedList<>();
    }
}
