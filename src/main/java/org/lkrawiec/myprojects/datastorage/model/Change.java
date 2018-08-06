/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.model;

import java.util.Date;

/**
 *
 * @author lukii
 */
public class Change {
    private final Client client;
    private final ClientsCar clientsCar;
    private final Tire tire;
    private final boolean storeOldTires;
    private final Date date;
    private final String mileage;
    
    public Change(
            Client client, 
            ClientsCar clientsCar, 
            Tire tire, 
            boolean storeOldTires,
            Date date,
            String mileage) {
        this.client = client;
        this.clientsCar = clientsCar;
        this.tire = tire;
        this.storeOldTires = storeOldTires;
        this.date = date;
        this.mileage = mileage;
    }

    public Client getClient() {
        return client;
    }

    public ClientsCar getClientsCar() {
        return clientsCar;
    }

    public Tire getTire() {
        return tire;
    }

    public boolean isStoreOldTires() {
        return storeOldTires;
    }

    public Date getDate() {
        return date;
    }

    public String getMileage() {
        return mileage;
    }
}
