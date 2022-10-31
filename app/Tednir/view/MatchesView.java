package app.Tednir.view;

import java.util.ArrayList;
import java.util.Observable;

import javax.swing.*;

import app.Tednir.controller.Controller;
import app.Tednir.controller.MatchesController;
import app.Tednir.model.updates.Update;

public class MatchesView extends AbstractView {
    private JPanel $_panel;
    ArrayList<JLabel> $_matches;

    public MatchesView(Observable model, Controller controller) {
        super(model, controller);
        $_panel = new JPanel();
        $_panel.setLayout(new BoxLayout($_panel, BoxLayout.Y_AXIS));
        $_matches = new ArrayList<>();
    }

    public JComponent getGUI() {
        return this.$_panel;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg == null)
            return;
        switch (((Update) arg).getEvent()) {
            case ALGO_SET:
                showMatches(((Update) arg).getMatches());
                break;
        }
    }

    private void showMatches(ArrayList<String> matches) {
        for (String name : matches){
            JLabel label = new JLabel(name);
            $_matches.add(label);
            $_panel.add(label);
        }
        $_panel.revalidate();
        $_panel.repaint();
    }

    @Override
    public Controller defaultController(Observable model) {
        return new MatchesController(model);
    }
}
