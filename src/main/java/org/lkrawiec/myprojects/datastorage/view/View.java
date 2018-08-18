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
 *
 * @author lukii
 */
public class View {

    public enum State {
        MENU,
        ADD_CHANGE,
        HISTORY,
        UNKNOWN
    }

    private final GUIFrame guiframe = new GUIFrame();
    private final HistoryPanel historyPanel = new HistoryPanel();
    private final ChangeFormPanel changeFormPanel = new ChangeFormPanel(true);
    private final ButtonsPanel buttonsPanel = new ButtonsPanel();
    private final MainPanel mainPanel = new MainPanel();
    private State state = State.UNKNOWN;
    private final Model model = new Model();
    
    public View() {
        registerForEvents();
    }

    public void makeVisible() {
        dispatchToUIThread(() -> {
            guiframe.startGUI();
        });

    }

    public void showMenu() {
        dispatchToUIThread(() -> {
            guiframe.setFirstPanel(mainPanel);
            guiframe.setSecondPanel(null);
            guiframe.revalidate();
            guiframe.pack();
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

    public AddChangeData retrieveChangeData() {
        if (getState() == State.ADD_CHANGE) {
            return changeFormPanel.getAddChangeData();
        }
        return null;
    }

    public void fillChangePanel(AddChangeData data) {
        dispatchToUIThread(() -> {
            changeFormPanel.fillWithData(data);
        });
    }

    private void dispatchToUIThread(Action a) {
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

    private void registerForEvents() {
        // buttons panel registartion
        buttonsPanel.setBackAction(() -> {
            switch (getState()) {
                case ADD_CHANGE:
                    //FALLTHROUGH
                case HISTORY:
                    showMenu();
                    break;
                default:
                    Logger.getGlobal().warning(
                            "back button pressed when not in add_change or history state");
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
                    historyPanel.getSearchLicencePlates();
            LinkedList<AddChangeData> changes =
                    model.listChangesForPlates(searchLicencePlates);
            historyPanel.setAddChangeDataList(changes);
        });
    }
}
