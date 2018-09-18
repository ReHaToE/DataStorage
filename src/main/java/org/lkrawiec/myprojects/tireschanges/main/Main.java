/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.tireschanges.main;

import org.lkrawiec.myprojects.tireschanges.view.View;

/**
 * Main class with main method.
 * 
 * @author Lukasz Krawiec
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
//        view.showMenu();
        view.makeVisible();
    }

//    private static void test1() {
//        View view = new View();
//        view.showMenu();
//        view.makeVisible();
//    }
//    
//    private static void test2() {
//        View view = new View();
//        view.showHistoryUI();
//        view.makeVisible();
//    }
//        
//    private static void test4() {
//        View view = new View();
//        view.showAddChangeUI();
//        view.makeVisible();
//    }
}
