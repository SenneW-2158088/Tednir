package app.Tednir.view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle.Control;

import app.Tednir.model.MatchmakingAbstract;
import javax.swing.*;

import app.Tednir.model.MatchmakingAbstract;

public class PickAlgoView extends AbstractView{
    ButtonGroup $_group;
    ArrayList<JRadioButton> $_buttons; 

    public PickAlgoView(Observable model, Controller controller){
        super(model, controller);

        $_group = new ButtonGroup();
        for (MatchmakingAbstract algo :  MatchmakingAbstract.algorithms){
            JRadioButton button = new JRadioButton(algo.toString());
            button.addActionListener(new java.awt.event.ActionListener(){
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // if algo == null > use member variable inside class
                    AlgorithmClicked(e, algo);
                }
            });
        }
    }

    private void AlgorithmClicked(java.awt.event.ActionEvent e, MatchmakingAbstract algorithm){
       // model code  
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        
    }
}
