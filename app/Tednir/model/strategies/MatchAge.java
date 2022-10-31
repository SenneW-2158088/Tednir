package app.Tednir.model.strategies;

import java.util.ArrayList;
import java.util.Arrays;

import app.Tednir.model.MatchmakingAbstract;
import app.Tednir.model.Person;
import app.Tednir.model.Requirements;

public class MatchAge extends MatchmakingAbstract {

    public MatchAge(){
        $_requirements = new Requirements();
        $_requirements.addRequirement("How do you like your women?", new String[]{"Younger", "same age", "Older" });
    }

    @Override
    public ArrayList<Person> match(Person user, ArrayList<Person> persons) {
        ArrayList<Person> out = new ArrayList<>();
        
        ArrayList<Person> remainingPers = removeFamilyMembers(user, persons);

        int ans = $_requirements.getAnswOfQuestion(0);
        int ageUser = Integer.parseInt(user.getAttr("age").get(0));
        for (Person person : remainingPers){
            int ageOther = Integer.parseInt(person.getAttr("age").get(0));
            switch (ans){
                case 0:
                    if (ageOther < ageUser)
                        out.add(person);
                    break;
                case 1:
                    if (ageOther == ageUser)
                        out.add(person);
                    break;
                case 2:
                    if (ageOther > ageUser)
                        out.add(person);
                    break;
            }
        }
        return out;
    
    }
}
