/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.model;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Class containing all information to be used by view.
 * Part of VM model.
 * 
 * @author Lukasz Krawiec
 */
public class Model {
    
    /**
     * Hashmap used to search car history by license plates.
     */
    private final HashMap<String, LinkedList<AddChangeData>> 
            licenseChangesMap;

    /**
     * Creates new model.
     */
    public Model() {
        this.licenseChangesMap = new HashMap<>();
    }
    
    /**
     * Adds new change to the changes list.
     * If there is no list, makes new list and adds change.
     * 
     * @param addChangeData contains information about change
     */
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
    
    /**
     * Lists changes for given license plates.
     * 
     * @param licensePlates license plates
     * @return changes for given license plates and if there are no changes,
     * makes new empty list. Never returns null.
     */
    public LinkedList<AddChangeData> listChangesForPlates(
            String licensePlates) {
        LinkedList<AddChangeData> changes = licenseChangesMap.get(licensePlates); 
        return changes != null ? changes : new LinkedList<>();
    }
}
