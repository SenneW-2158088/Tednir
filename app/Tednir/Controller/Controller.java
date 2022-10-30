package app.Tednir.Controller;

import java.util.Observable;
import app.Tednir.view.View;

public interface Controller {

   public void setView(View view);
   public View getView();

   public void setModel(Observable model);
   public Observable getModel();

}
