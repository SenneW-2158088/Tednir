package app.Tednir.model;

import java.util.ArrayList;
import java.util.HashMap;

public interface Matchmaking {
   /**
    * Match user to person 
    * @param user: user to find matches for
    * @param persons: list of persons to check for match
    * @out: List of matches
    */
   public ArrayList<Person> match(Person user, ArrayList<Person> persons);
}
