package app.Tednir.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

import app.Tednir.controller.Controller;
import app.Tednir.controller.TednirController;
import app.Tednir.model.Family;
import app.Tednir.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CreatePerson extends AbstractView {
    private JPanel $_panel;
    private JButton $_button;
    private ArrayList<JTextField> $_inputs; // store all input fields
    List<String> $_attributes = Arrays.asList("name", "age", "gender", "hobbies", "education", "residence", "amChildren", "favMovies", "favArtists", "religion", "languages", "favDish", "favVacationDest", "smokingHabits", "sports");
    public CreatePerson(Observable model, Controller controller){
        super(model, controller);
        $_inputs = new ArrayList<>(); 
        $_panel = new JPanel();
        $_panel.setLayout(new BoxLayout($_panel, BoxLayout.Y_AXIS));
        
        // add 
        for (String attr : $_attributes){
            JTextField field = new JTextField(attr);
            $_inputs.add(field);
            $_panel.add(field);
        }      
        $_button = new JButton("Register");

        $_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                HashMap<String, ArrayList<String>> attributes = new HashMap<>();
                // put the inputs into the attributes map
                for (int i = 0; i < $_inputs.size(); i++){
                    String key = $_attributes.get(i);
                    ArrayList<String> input = new ArrayList<>(Arrays.asList($_inputs.get(i).getText()));
                    attributes.put(key, input);
                }

                Family family = new Family(new ArrayList<Person>(),new ArrayList<Person>(),new ArrayList<Person>());
                
                Person person = new Person(attributes, family);

                ((TednirController)getController()).onPersonAdded(person);
            }
        });

        $_panel.add($_button);
    }

   public JComponent getGUI(){
    return this.$_panel;
   }
   @Override
   public void update(Observable o, Object arg) {
       
   } 
}
