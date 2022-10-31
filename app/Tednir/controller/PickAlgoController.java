package app.Tednir.controller;

import java.util.Observable;

import app.Tednir.model.MatchmakingAbstract;
import app.Tednir.model.*;

public class PickAlgoController extends AbstractController {
    public PickAlgoController(Observable model) {
        super(model);
    }
    
    public void onAlgoSet(MatchmakingAbstract algo){
        ((TednirModel)getModel()).setAlgo(algo);
    }
}
