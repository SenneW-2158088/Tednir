package app.Tednir.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;
import java.util.ArrayList;

public class CreatePerson extends AbstractView {
    private JComponent $_frame;
    private ArrayList<JComponent> $_inputs; // store all input fields

    public CreatePerson(Observable model, Controller controller){
        super(model, controller);
    }

   public JComponent getGUI(){
    return this.$_frame;
   }
   @Override
   public void update(Observable o, Object arg) {
       
   } 
}
