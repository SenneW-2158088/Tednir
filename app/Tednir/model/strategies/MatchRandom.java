package app.Tednir.model.strategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import app.Tednir.model.MatchmakingAbstract;
import app.Tednir.model.Person;

public class MatchRandom extends MatchmakingAbstract {

    MatchRandom(){
    }
    
    @Override
    public ArrayList<Person> match(Person user, ArrayList<Person> persons) {
        ArrayList<Person> out = new ArrayList<>();
        
        ArrayList<Person> remainingPers = removeFamilyMembers(user, persons);
        
        Random generator = new Random();
        for (int i = 0; i < 3; i++ ){
            if (remainingPers.size() > 1){
                int randomId = generator.nextInt(remainingPers.size());
                out.add(remainingPers.get(randomId));
                remainingPers.remove(randomId);
            }
        }

        return out;
    }
}
