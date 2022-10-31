package app.Tednir.controller;

import java.util.Observable;

import app.Tednir.model.Person;
import app.Tednir.model.TednirModel;
import app.Tednir.view.TednirView;

public class TednirController extends AbstractController {
    public TednirController(Observable model) {
        super(model);
    }
    public void onPersonAdded(Person person) {
        System.out.println("[Controller] Game starting");
        ((TednirModel)getModel()).setPerson(person);

        ((TednirView)getView()).showMatchAlgos();
    }
}