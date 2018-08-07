/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lkrawiec.myprojects.datastorage.view;

import java.awt.EventQueue;
import javax.swing.SwingUtilities;

/**
 *
 * @author lukii
 */
public class View {

    public class InvalidViewStateException extends Exception {

        public InvalidViewStateException() {
        }
    }

    public static class AddChangeData {

        public String name;
        public String address;
        public String phoneNumber;
        public String email;
        public String carBrand;
        public String carModel;
        public String carLicensePlates;
        public String carMileage;
        public String leftFrontNewTiresSize;
        public String leftFrontNewTiresProfile;
        public String leftFrontNewTiresBrand;
        public String leftFrontNewTiresModel;
        public String leftFrontNewTiresPressure;
        public String rightFrontNewTiresSize;
        public String rightFrontNewTiresProfile;
        public String rightFrontNewTiresBrand;
        public String rightFrontNewTiresModel;
        public String rightFrontNewTiresPressure;
        public String rearLeftNewTiresSize;
        public String rearLeftNewTiresProfile;
        public String rearLeftNewTiresBrand;
        public String rearLeftNewTiresModel;
        public String rearLeftNewTiresPressure;
        public String rearRightNewTiresSize;
        public String rearRightNewTiresProfile;
        public String rearRightNewTiresBrand;
        public String rearRightNewTiresModel;
        public String rearRightNewTiresPressure;
        public String leftFrontOldTiresSize;
        public String leftFrontOldTiresProfile;
        public String leftFrontOldTiresBrand;
        public String leftFrontOldTiresModel;
        public String rightFrontOldTiresSize;
        public String rightFrontOldTiresProfile;
        public String rightFrontOldTiresBrand;
        public String rightFrontOldTiresModel;
        public String rearLeftOldTiresSize;
        public String rearLeftOldTiresProfile;
        public String rearLeftOldTiresBrand;
        public String rearLeftOldTiresModel;
        public String rearRightOldTiresSize;
        public String rearRightOldTiresProfile;
        public String rearRightOldTiresBrand;
        public String rearRightOldTiresModel;
        public boolean storeOldTires;

        public AddChangeData() {
        }
        
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
        buttonsPanel.setBackAction(new Action() {
            @Override
            public void Do() {
                switch (getState()) {
                    case ADD_CHANGE:
                    //FALLTHROUGH
                    case HISTORY:
                        showMenu();
                        break;
                    default:
                }
            }
        });

        // main menu registration
        mainPanel.setAddChangeButtonAction(new Action() {
            @Override
            public void Do() {
                showAddChangeUI();
            }
        });

        mainPanel.setSearchCarButtonAction(new Action() {
            @Override
            public void Do() {
                showHistoryUI();
            }
        });
    }
}
