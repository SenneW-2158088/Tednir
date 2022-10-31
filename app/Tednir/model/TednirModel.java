package app.Tednir.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

import app.Tednir.model.updates.Update;
import app.Tednir.model.updates.Update.Event;

public class TednirModel extends Observable {
    // variables
    private ArrayList<Person> $_persons; // all persons on platform
    private Person $_person; // current person

    private ArrayList<String> $_matches;

    // system usage
    // matchmaking algorithm
    private Matchmaking $_algorithm;

    public TednirModel() {
        $_persons = new ArrayList<>();
        $_matches = new ArrayList<>();
        this.initializePersons();
    }

    private void initializePersons() {
        Family fam = new Family(new ArrayList<Person>(), new ArrayList<Person>(), new ArrayList<Person>());

        HashMap<String, ArrayList<String>> hash = new HashMap<>(Person.genHash("Ivan el grinder de la pussio", 69, 20000, "Alpha male", "Cs", new ArrayList<Integer>(Arrays.asList(1, 2)), "Budhmism", "italia", "Spaghet", "gym", new ArrayList<String>(Arrays.asList("dutch")), new ArrayList<String>(Arrays.asList("gym", "coding")), true, new ArrayList<String>(Arrays.asList("star wars")), new ArrayList<String>(Arrays.asList("Arctic Monkeys") )));
        HashMap<String, ArrayList<String>> hash2 = new HashMap<>(hash);
        hash2.put("name", new ArrayList<>(Arrays.asList("Wulf, peace monk")));
        HashMap<String, ArrayList<String>> hash3 = new HashMap<>(hash);
        hash3.put("name", new ArrayList<>(Arrays.asList("Padre")));
        this.$_persons.add(new Person(hash, fam));
        this.$_persons.add(new Person(hash2, fam));
        this.$_persons.add(new Person(hash3, fam));
    }

    public void setAlgo(MatchmakingAbstract algo) {
        $_algorithm = algo;

        ArrayList<Person> matches = new ArrayList<>($_algorithm.match($_person, $_persons));

        $_matches = Person.getNames(matches);
        
        Update update = new Update(Event.ALGO_SET, $_matches);

        setChanged();
        notifyObservers();
    }

    public void setPerson(Person person) {
        this.$_person = person;

        Update update = new Update(Event.PERSON_SET, null);

        setChanged();
        notifyObservers(update);
    }
}
