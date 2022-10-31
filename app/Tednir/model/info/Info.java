package app.Tednir.model.info;

abstract public class Info {
    static final enum Types = {FENRIR_INFO};
    
    public abstract getType();
    public abstract getEvent();
}
