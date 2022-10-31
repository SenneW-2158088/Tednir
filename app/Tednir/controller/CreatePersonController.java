package app.Tednir.controller;

import java.util.Observable;

import app.Tednir.model.Person;
import app.Tednir.model.TednirModel;

public class CreatePersonController extends AbstractController {
    public CreatePersonController(Observable model) {
        super(model);
    }
    
    public void onPersonAdded(Person person) {
        ((TednirModel)getModel()).setPerson(person);
    }
}
