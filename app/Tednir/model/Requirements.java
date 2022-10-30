package app.Tednir.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Senne en Wolf
 */
public class Requirements {
    class Requirement{
        String $_question;
        ArrayList<String> $_possibleAnsw;
        Integer $_result;

        Requirement(String question, String[] possibleAns){
            $_question = question;
            $_possibleAnsw = (ArrayList<String>) Arrays.asList(possibleAns);
            $_result = 0;
        }

        public void setResultIndex(Integer index){
            $_result = index;
        }

        public Integer getAnsw(){
            return $_result;
        }
    }
    
    private ArrayList<Requirement> $_requirements;

    public Requirements(){
        $_requirements = new ArrayList<>();
    }

    /**
     * @param question will be shown in view
     * @param possibleAns will be shown as possible answers to the question
     * @post: adds a requirement to the object
     */
    public void addRequirement(String question, String[] possibleAns){
        this.$_requirements.add(new Requirement(question, possibleAns));
    }

    public void setRequirement(Integer idQuestion, Integer idResult){
        this.$_requirements.get(idQuestion).setResultIndex(idResult);
    }

    public Integer getAnswOfQuestion(Integer id){
        return $_requirements.get(id).getAnsw();
    }
}

/* TO-DO
 * In main klasse een pointer van matchmaking algoritme en bij elke update
 * wordt er gekeken of er een matchmaking algoritme geselecteerd is
 * indien die niet NULL is, worden de requirements opgevraagd, en getoond in een view
 * de view kan de requirements setten
 *  confirm: 
 */