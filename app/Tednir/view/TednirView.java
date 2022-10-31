package app.Tednir.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.LayoutManager;
import java.awt.Dimension;
import java.awt.FlowLayout;

import app.Tednir.controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Amadeus
 */
public class TednirView extends AbstractView {
    private JPanel $_panel;
    private CreatePerson $_createPerson;
    private PickAlgoView $_pickAlgoView;
    
    public TednirView(Observable model, Controller controller){
        super(model, controller);
        $_panel = new JPanel();
        $_createPerson = new CreatePerson(model, null);
        $_pickAlgoView = new PickAlgoView(model, controller);

        $_panel.add($_createPerson.getGUI());
    }

    public JComponent getGUI(){
            return this.$_panel;
    }
    @Override
    public void update(Observable o, Object arg) {
        
    }

    public void showMatchAlgos() {
        $_panel.removeAll();
        $_panel.add($_pickAlgoView.getGUI());
    } 
}
