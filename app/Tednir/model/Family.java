package app.Tednir.model;

import java.util.ArrayList;

/**
 * Family class that contains:
 *  parents
 *  children
 *  siblings
 * @author Wolf En Ivan
 */
public class Family{
    private ArrayList<Person> $_parents;
    private ArrayList<Person> $_kiddos;
    private ArrayList<Person> $_siblings;
    
    public Family(ArrayList<Person> parents, ArrayList<Person> kiddos, ArrayList<Person> siblings){
        $_parents = parents;
        $_kiddos = kiddos;
        $_siblings = siblings;
    }

    public boolean hasFamilyMember(Person person){
        String name = person.getName();
        for (Person member : $_parents){
            if (member.hasName(name))
               return true;
        }
        for (Person member : $_kiddos){
            if (member.hasName(name))
               return true;
        }
        for (Person member : $_siblings){
            if (member.hasName(name))
               return true;
        }
        return false;
    }
}
