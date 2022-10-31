package app.Tednir.model;
import app.Tednir.model.*;
import app.Tednir.model.strategies.*;
import java.util.*;

public class MatchMakingAlgorithms {

    public MatchMakingAlgorithms(){}

    public static  Matchmaking getAlgorithms(){
        
        Matchmaking[] test = {new MatchAge(), new MatchRandom()};
        return ;
    }
}