package app.Tednir.view;


import java.util.Observer;
import java.util.Observable;

import javax.management.modelmbean.ModelMBean;

import app.Tednir.controller.Controller;

public abstract class AbstractView implements View, Observer {
   private Controller $_controller;
   private Observable $_model;

    public AbstractView(Observable model, Controller controller){
        setModel(model);
        if(controller != null){
            setController(controller);
        }
    }
    @Override
    public Controller getController() {
            // If a controller hasn't been defined yet...
            if ($_controller == null) {
                // ...make one. Note that defaultController is normally overriden by 
                // the AbstractView subclass so that it returns the appropriate 
                // controller for the view.
                setController(defaultController(getModel()));
            }
        
        return $_controller;
    } 
    @Override
    public void setController(Controller controller) {
        this.$_controller = controller; 
        // Tell the controller this object is its view.
        getController().setView(this);
    }

    @Override
    public Observable getModel() {
        return this.$_model;
    }

    @Override
    public void setModel(Observable model) {
        this.$_model = model; 
    }

    @Override
    public Controller defaultController(Observable model) {
        return null;
    }

    /**
     * A do-nothing implementation of the Observer interface's update method.
     * Subclasses of AbstractView will provide a concrete implementation for 
     * this method.
     */
    @Override
    public void update(Observable o, Object arg) {    
    }
}
