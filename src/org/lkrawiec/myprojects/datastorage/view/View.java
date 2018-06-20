/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.view;

import java.awt.EventQueue;

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
        HISTORY,
        UNKNOWN
    }

    private final GUIFrame guiframe = new GUIFrame();
    private final HistoryPanel historyPanel = new HistoryPanel();
    private final ChangeFormPanel changeFormPanel = new ChangeFormPanel();
    private final ButtonsPanel buttonsPanel = new ButtonsPanel();
    private final MainPanel mainPanel = new MainPanel();
    private State state = State.UNKNOWN;

    public void makeVisible() {
        dispatchToUIThread(() -> {
            guiframe.startGUI();
        });

    }

    public void showMenu() {
        dispatchToUIThread(() -> {
            guiframe.setFirstPanel(mainPanel);
            guiframe.setSecondPanel(null);
        });
        state = State.MENU;
    }

    public void showAddChangeUI() {
        dispatchToUIThread(() -> {
            buttonsPanel.setSaveButtonVisible(true);
            guiframe.setFirstPanel(changeFormPanel);
            guiframe.setSecondPanel(buttonsPanel);
        });
        state = State.ADD_CHANGE;
    }

    public void showHistoryUI() {
        dispatchToUIThread(() -> {
            buttonsPanel.setSaveButtonVisible(false);
            guiframe.setFirstPanel(historyPanel);
            guiframe.setSecondPanel(buttonsPanel);
        });
        state = State.HISTORY;
    }

    public State getState() {
        return state;
    }

    public AddChangeData retrieveChangeData() throws InvalidViewStateException {
        if (getState() == State.ADD_CHANGE) {
            return changeFormPanel.getAddChangeData();
        }
        throw new InvalidViewStateException();
    }

    public void fillChangePanel(AddChangeData data) {
        dispatchToUIThread(() -> {
            changeFormPanel.fillWithData(data);
        });
    }

    public void showChangePanelInHistoryUI() {
        dispatchToUIThread(() -> {
            historyPanel.setSecondPanel(changeFormPanel);
        });
    }

    public void hideChangePanelInHistoryUI() {
        dispatchToUIThread(() -> {
            historyPanel.setSecondPanel(null);
        });
    }

    private void dispatchToUIThread(Action a) {
        EventQueue.invokeLater(() -> {
            a.Do();
        });
    }
}
