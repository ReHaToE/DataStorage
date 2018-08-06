/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.model;

import java.util.Objects;

/**
 *
 * @author lukii
 */
public class ClientsCar {
    
    public class LicensePlates {
        public final String value;

        public LicensePlates(String value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 47 * hash + Objects.hashCode(this.value);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final LicensePlates other = (LicensePlates) obj;
            if (!Objects.equals(this.value, other.value)) {
                return false;
            }
            return true;
        }
    }
    
    public final String brand, model;
    private final LicensePlates licensePlates;
    
    public ClientsCar(String brand, String model, LicensePlates licensePlates) {
        this.brand = brand;
        this.model = model;
        this.licensePlates = licensePlates;
    }

    public LicensePlates getLicensePlates() {
        return licensePlates;
    }
}
