/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.model;

/**
 *
 * @author lukii
 */
public class Tire {

    public enum Position {
        LEFTFRONT,
        RIGHTFRONT,
        REARLEFT,
        REARRIGHT
    }

    public enum NewOld {
        NEW,
        OLD
    }

    public String size, profile, brand, model, pressure;
    public Position position;
    public NewOld newOld;

}