package app.Tednir.view;

import java.util.Observable;
import app.Tednir.controller.Controller;

public interface View {
   public void setModel(Observable model);
   public Observable getModel();

   public void setController(Controller controller);
   public Controller getController();
}
