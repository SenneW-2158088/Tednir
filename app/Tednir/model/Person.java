package app.Tednir.model;
import java.util.Observable;
import java.util.ArrayList;
/**
 * Person class that contains all user information
 * @author Senne Wertelaers
 */
public class Person extends Observable {
    private String $_name; // name of person
    private int age; // age
    private String $_geslacht; // sex
    private ArrayList<String> $_hobbies; // hobby
    private String $_opleiding; // schooling
    // private Pair<int ,int> m_woonplaats;
    private int m_aantalKinderen; // number of children
    private String[] $_favorieteFilms; // favorite movies
    private String[] $_favorieteMuzikanten; // favorite musiscians 
    private String $_religie; // religion
    private ArrayList<String> $_talen; // spoken languages
    private String $_favorieteKeuken; // favorite cultural kitchen
    private String $_favorieteReisbestemming; // favorite travel destination
    private boolean m_rookgewoontes; // kan een enum voorstellen van hoeveelheid
    private String $_sport; // sport

    // system usage
    private ArrayList<Person> $_kinderen; // array of childran
    private ArrayList<Person> $_broers_zussen; // array of brothers and sisters
    private ArrayList<Person> $_ouders; // array of parents
    
    // matchmaking algorithm
    private Matchmaking $_algorithm;

    public Person(String name, int age, String geslacht){
        this.$_name = name;
        this.age = age;
        this.$_geslacht = geslacht;
    }

    // getters and setters
    public String getName(){return this.$_name;};

}
