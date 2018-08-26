/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.view;

import org.lkrawiec.myprojects.datastorage.common.AddChangeData;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.lkrawiec.myprojects.datastorage.model.Model;

/**
 * View represents logic for displaying UI and has control over model.
 * This class is part of VM (View-Model).
 * 
 * @author Lukasz Krawiec
 */
public class View {

    /**
     * Enum for state of view
     */
    public enum State {
        MENU,
        ADD_CHANGE,
        HISTORY,
        UNKNOWN
    }

    /** Main frame of this application */
    private final GUIFrame guiframe = new GUIFrame();   
    /** History panel */
    private final HistoryPanel historyPanel = new HistoryPanel();
    /** Change form panel */
    private final ChangeFormPanel changeFormPanel = new ChangeFormPanel(true);
    /** Buttons panel */
    private final ButtonsPanel buttonsPanel = new ButtonsPanel();
    /** Main panel shown at the start of this application */
    private final MainPanel mainPanel = new MainPanel();
    /** Current state of view */
    private State state = State.UNKNOWN;
    /** Model as a part of the VM (View-Model) */
    private final Model model = new Model();
    
    /**
     * Sets up view but does not start it. 
     */
    public View() {
        setActionForEvents();
        showMenu();
    }
    
    /**
     * Starts GUI and makes it visible to the user
     */
    public void makeVisible() {
        dispatchToUIThread(() -> {
            guiframe.startGUI();
        });

    }

    /**
     * Sets GUI to main panel and sets state to MENU
     */
    private void showMenu() {
        dispatchToUIThread(() -> {
            guiframe.setFirstPanel(mainPanel);
            guiframe.setSecondPanel(null);
            guiframe.revalidate();
            guiframe.pack();
        });
        state = State.MENU;
    }

    /**
     * Sets GUI to change form panel and sets state to ADD_CHANGE
     */
    private void showAddChangeUI() {
        dispatchToUIThread(() -> {
            buttonsPanel.setSaveButtonVisible(true);
            guiframe.setFirstPanel(changeFormPanel);
            guiframe.setSecondPanel(buttonsPanel);
        });
        state = State.ADD_CHANGE;
    }

    /**
     * Sets GUI to history panel and sets state to HISTORY
     */
    private void showHistoryUI() {
        dispatchToUIThread(() -> {
            buttonsPanel.setSaveButtonVisible(false);
            guiframe.setFirstPanel(historyPanel);
            guiframe.setSecondPanel(buttonsPanel);
        });
        state = State.HISTORY;
    }

    /**
     * Retrieves current state
     * 
     * @return actual state of view
     */
    private State getState() {
        return state;
    }

    /**
     * Retrieves from change form panel its data.
     * 
     * @return data from mentioned panel or if it's invalid state then null
     */
    private AddChangeData retrieveChangeData() {
        if (getState() == State.ADD_CHANGE) {
            return changeFormPanel.getAddChangeData();
        }
        return null;
    }

    /**
     * Dispatches given action to UI thread to avoid racing problems
     * 
     * @param a given action
     */
    private void dispatchToUIThread(Action a) {
        // FIXME
        if (EventQueue.isDispatchThread()) {
//            System.out.println("in thread");
            new Thread(() -> {
                EventQueue.invokeLater(() -> {
//                  System.out.println("out of thread");
                    a.Do();
                });
            }).start();

            return;
        }
        EventQueue.invokeLater(() -> {
//            System.out.println("out of thread");
            a.Do();
        });
//        SwingUtilities.invokeLater(()->{a.Do();});
    }

    /**
     * Configures panels to match the logic of view by
     * setting actions for events
     */
    private void setActionForEvents() {
        // buttons panel registration
        buttonsPanel.setBackAction(() -> {
            switch (getState()) {
                case ADD_CHANGE:
                    //FALLTHROUGH
                case HISTORY:
                    showMenu();
                    break;
                default:
                    Logger.getGlobal().warning(
                            "back button pressed when not in "
                                    + "add_change or history state");
            }
        });

        buttonsPanel.setSaveAction(() -> {
            if (getState() != State.ADD_CHANGE) {
                Logger.getGlobal().warning(
                        "save on another state than ADD_CHANGE");
                return;    
            }
            AddChangeData addChangeData = changeFormPanel.getAddChangeData();
            model.addChange(addChangeData);
            changeFormPanel.resetData();
        });
        
        // main menu registration
        mainPanel.setAddChangeButtonAction(() -> {
            showAddChangeUI();
        });

        mainPanel.setSearchCarButtonAction(() -> {
            showHistoryUI();
        });
        
        // history menu registration
        historyPanel.setSearchAction(() -> {
            if (getState() != State.HISTORY) {
                Logger.getGlobal().warning(
                        "search executed when not in history state");
                return;
            }
            String searchLicencePlates =
                    historyPanel.getSearchLicensePlates();
            LinkedList<AddChangeData> changes =
                    model.listChangesForPlates(searchLicencePlates);
            historyPanel.setAddChangeDataList(changes);
        });
    }
}
