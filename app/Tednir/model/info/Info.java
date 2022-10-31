package app.Tednir.model.info;
import java.awt.event.ActionEvent;

abstract public class Info {
    public static enum Types {FENRIR_INFO};
    
    public abstract Types getType();
    public abstract ActionEvent getEvent();
}
