package app.Tednir.model.updates;

import java.util.ArrayList;

public class Update {
    public static enum Event{MATCHES_FOUND, PERSON_SET, ALGO_SET, REQUIREMENTS_SET};
    Event m_event;

    ArrayList<String> $_namesMatches;
    

    public Update(Event event, ArrayList<String> namesMatches){
        m_event = event;
        $_namesMatches = namesMatches;
    }
    
    public Event getEvent(){ return m_event; }
    public ArrayList<String> getMatches(){ return $_namesMatches; }
}
