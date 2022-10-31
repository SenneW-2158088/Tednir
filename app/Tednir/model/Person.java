package app.Tednir.model;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
        ArrayList<String> attrKeys = new ArrayList<>(Arrays.asList("name", "age", "gender", "hobbies",
                                    "education", "residence", "amChildren", "favMovies", "favArtists", "religion", 
                                    "languages", "favDish", "favVacationDest", "smokingHabits", "sports"));
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

    public static ArrayList<String> getNames(ArrayList<Person> persons){
        ArrayList<String> names = new ArrayList<>();
        for (Person person : persons)
            names.add(person.getName());

        return names;
    }

    public static HashMap<String,ArrayList<String>> genHash(String name, int age, int amChildren, String gender, String education, ArrayList<Integer> location, String religion, String favVacationDest, String favDish, String sports, ArrayList<String> languages, ArrayList<String> hobbies, boolean smokingHabits, ArrayList<String> favMovies, ArrayList<String> favArtists){
        HashMap<String,ArrayList<String>> hash = new HashMap<>();
        try{
            hash.put("", new ArrayList<>(Arrays.asList()));
            hash.put("name", new ArrayList<>(Arrays.asList(name)));
            hash.put("age", new ArrayList<>(Arrays.asList(Integer.toString(age))));
            hash.put("amChildren", new ArrayList<>(Arrays.asList(Integer.toString(amChildren))));
            hash.put("gender", new ArrayList<>(Arrays.asList(gender)));
            String p1 = Integer.toString(location.get(0));
            String p2 = Integer.toString(location.get(1));
            hash.put("residence", new ArrayList<>(Arrays.asList(p1, p2)));
            hash.put("religion", new ArrayList<>(Arrays.asList(religion)));
            hash.put("favVacationDest", new ArrayList<>(Arrays.asList(favVacationDest)));
            hash.put("hobbies", new ArrayList<>(hobbies));
            hash.put("favDish", new ArrayList<>(Arrays.asList(favDish)));
            hash.put("languages", new ArrayList<>(languages));
            hash.put("favArtists", new ArrayList<>(favArtists));
            hash.put("education", new ArrayList<>(Arrays.asList(education)));
            hash.put("favMovies", new ArrayList<>(favMovies));
            hash.put("smokingHabits", new ArrayList<>(Arrays.asList(smokingHabits ? "true" : "false")));
            hash.put("sports", new ArrayList<>(Arrays.asList(sports)));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return hash;
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