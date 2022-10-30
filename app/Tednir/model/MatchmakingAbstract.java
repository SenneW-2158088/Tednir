package app.Tednir.model;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class MatchmakingAbstract implements Matchmaking {
    protected Requirements $_requirements;
    
   /**
    * Match user to person 
    * @param user: user to find matches for
    * @param persons: list of persons to check for match
    * @out: List of matches
    */
   public abstract ArrayList<Person> match(Person user, ArrayList<Person> persons);

   protected ArrayList<Person> removeFamilyMembers(Person user, ArrayList<Person> persons){
      ArrayList<Person> out = new ArrayList<>(persons);

      for (int i = 0; i < out.size(); i++){
         if (user.getName() == out.get(i).getName()) // remove the user from the possible matches
            out.remove(i);
         if (user.hasFamilyMember(out.get(i)))
            out.remove(i);
      }
      return out;
   }

   public Requirements getRequirements(){
        return $_requirements;
   }
}