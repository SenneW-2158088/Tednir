package app.Tednir;
import java.util.ArrayList;

import javax.swing.JFrame;

import app.Tednir.model.Matchmaking;
import app.Tednir.model.Person;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tednir {
    
    public void createGUI() {
        JFrame frame = new JFrame("Tednir");             
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
    
    private static void createAndShowGUI() {
        Clock clock = new Clock(9, 10, 22);
        clock.createGUI();
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}