package app.Tednir.model;
import app.Tednir.model.*;
import app.Tednir.model.strategies.*;
import java.util.*;

public class MatchmakingAlgorithms {

    public MatchmakingAlgorithms(){}

    public static ArrayList<MatchmakingAbstract> getAlgorithms(){
        ArrayList<MatchmakingAbstract> list = new ArrayList<>();
        list.add(new MatchRandom());
        list.add(new MatchAge());
        return list;
    }
}