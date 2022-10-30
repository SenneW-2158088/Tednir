package app.Tednir.view;

import app.Tednir.Controller.Controller;
import java.util.Observable;

public interface View {
   public void setModel(Observable model);
   public Observable getModel();

   public void setController(Controller controller);
   public Controller getController();
}
