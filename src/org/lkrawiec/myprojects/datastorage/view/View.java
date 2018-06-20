/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.view;

/**
 *
 * @author lukii
 */
public class View {

    public class InvalidViewStateException extends Exception {

        public InvalidViewStateException() {
        }
    }

    public class AddChangeData {

    }
    
    public enum State {
        MENU,
        ADD_CHANGE,
        HISTORY
    }
    
    public void showMenu() {
        
    }
    
    public void showAddChangeUI() {
        
    }
    
    public void showHistoryUI() {
        
    }
    
    public State getState() {
        return State.ADD_CHANGE;
    }
    
    public AddChangeData retrieveChangeData() throws InvalidViewStateException {
        if (getState() == State.ADD_CHANGE){
            return new AddChangeData();
        }
        throw new InvalidViewStateException();
    }
    
    public void fillChangePanel(AddChangeData data) {
        // fills panel with given data
    }
   
    public void showChangePanelInHistoryUI () {
        
    }
    
    public void hideChangePanelInHistoryUI () {
        
    }
}
