package app.Tednir.model;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Person class that contains all user information
 * @author Senne Wertelaers
 */
public class Person extends Observable {
    private HashMap<String, ArrayList<String>> $_attributes; // contains all the attributes a person can have

    private Family $_family; // has family members of person

    public Person(HashMap<String, ArrayList<String>> attributes, Family family){
        this.$_attributes = new HashMap<>();
        initAttributes(attributes);

        $_family = family;
    }

    /**
     * copy constructor
     * @param person
     */
    Person(Person person){
        this.$_attributes = person.$_attributes;
        this.$_family = person.$_family;
    }

    /**
     * 
     */
    private void initAttributes(HashMap<String, ArrayList<String>> attributes){
        ArrayList<String> attrKeys = (ArrayList<String>) Arrays.asList("name", "age", "gender", "hobbies",
                                    "education", "residence", "amChildren", "favMovies", "favArtists", "religion", 
                                    "languages", "favDish", "favVacationDest", "smokingHabits", "sports");
        for (String attr : attrKeys){
            this.$_attributes.put(attr, attributes.get(attr));
        }
    }

    /**
     * Check if a person is of name @name
     * @param name
     * @return true if person has @name, false if not
     */
    public boolean hasName(String name){
        return this.$_attributes.get("name").get(0) == name;
    }

    public boolean hasFamilyMember(Person person){ return $_family.hasFamilyMember(person); }

    public String getName(){ return $_attributes.get("name").get(0);}

    /**
     * Returns a copy of an object
     * @param attr
     * @return
     */
    public ArrayList<String> getAttr(String attr){
        return new ArrayList<>($_attributes.get(attr));
    }
}

// private String $_name; // name of person
// private int age; // age
// private int m_aantalKinderen; // number of children
// private String $_geslacht; // sex
// private String $_opleiding; // schooling
// // private Pair<int ,int> m_woonplaats;
// private boolean m_rookgewoontes; // kan een enum voorstellen van hoeveelheid
// private String $_religie; // religion
// private String $_favorieteKeuken; // favorite cultural kitchen
// private String $_favorieteReisbestemming; // favorite travel destination
// private String $_sport; // sport
// private ArrayList<String> $_talen; // spoken languages
// private ArrayList<String> $_hobbies; // hobby
// private String[] $_favorieteFilms; // favorite movies
// private String[] $_favorieteMuzikanten; // favorite musiscians 