package app.Tednir.view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle.Control;

import app.Tednir.controller.Controller;
import app.Tednir.model.MatchMakingAlgorithms;
import app.Tednir.model.MatchmakingAbstract;
import javax.swing.*;
import app.Tednir.model.*;
import app.Tednir.model.MatchmakingAbstract;

public class PickAlgoView extends AbstractView{
    private JPanel $_panel;
    private ButtonGroup $_group;
    private ArrayList<JRadioButton> $_buttons; 

    public PickAlgoView(Observable model, Controller controller){
        super(model, controller);
        $_panel = new JPanel();
        $_group = new ButtonGroup();
        
        for (Matchmaking algo :  MatchMakingAlgorithms.getAlgorithms()){
            JRadioButton button = new JRadioButton(algo.toString());
            button.addActionListener(new java.awt.event.ActionListener(){
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // if algo == null > use member variable inside class
                    AlgorithmClicked(e, algo);
                }
            });
            $_panel.add(button);
        }
    }

    private void AlgorithmClicked(java.awt.event.ActionEvent e, Matchmaking algorithm){
       // model code  
    }

    public JComponent getGUI(){
        return this.$_panel;
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        
    }
}
