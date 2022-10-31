package app.Tednir;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import app.Tednir.model.Matchmaking;
import app.Tednir.model.Person;
import app.Tednir.model.TednirModel;
import app.Tednir.view.TednirView;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tednir {
    private TednirModel $_model;
    private TednirView $_tednirView;
    
    Tednir(){
        $_model = new TednirModel();
        $_tednirView = new TednirView($_model, null);
    }
    
    public void createGUI() {
        JFrame frame = new JFrame("Tednir");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add($_tednirView.getGUI());
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
        Tednir clock = new Tednir();
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