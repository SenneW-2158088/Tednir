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
       return this.$_controller;
   } 
   @Override
   public void setController(Controller controller) {
      this.$_controller = controller; 
   }

   @Override
   public Observable getModel() {
       return this.$_model;
   }

   @Override
   public void setModel(Observable model) {
       this.$_model = model; 
   }
}
