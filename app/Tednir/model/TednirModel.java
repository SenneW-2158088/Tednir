package app.Tednir.model;
import java.util.ArrayList;
import java.util.Observable;

import app.Tednir.model.info.FenrirInfo;

public class TednirModel extends Observable {
    // variables
    private ArrayList<Person> m_persons; // all persons on platform
    private Person $_person; // current person
    

    // system usage
    // matchmaking algorithm
    private Matchmaking $_algorithm;

    public TednirModel(){
        m_persons = new ArrayList<>();
        this.initializePersons();
    }


    private void initializePersons(){
    //    this.m_persons.add(new Person("Ivan el grinder de la pussio", 69, "Alpha male"));
    //    this.m_persons.add(new Person("Wulf, peace monk", 20, "Wolf"));
    //    this.m_persons.add(new Person("Padre ", 20, "Wolf"));
    }


    public void setPerson(Person person) {
        this.$_person = person;

        
        hasChanged();
        notifyAll(new FenrirInfo());
    }
}
