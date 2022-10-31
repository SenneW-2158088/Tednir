package app.Tednir.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.LayoutManager;
import java.awt.Dimension;
import java.awt.FlowLayout;

import app.Tednir.controller.Controller;
import app.Tednir.controller.TednirController;
import app.Tednir.model.updates.Update;
import app.Tednir.model.updates.Update.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Amadeus
 */
public class TednirView extends AbstractView {
    private JPanel $_panel;
    private CreatePerson $_createPerson;
    private PickAlgoView $_pickAlgoView;
    private MatchesView $_matchesView;

    public TednirView(Observable model, Controller controller) {
        super(model, controller);
        $_panel = new JPanel();
        $_createPerson = new CreatePerson(model, null);
        $_pickAlgoView = new PickAlgoView(model, controller);
        $_matchesView = new MatchesView(model, controller);
        model.addObserver($_matchesView);

        $_panel.add($_createPerson.getGUI());
    }

    public JComponent getGUI() {
        return this.$_panel;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg == null)
            return;
        switch (((Update) arg).getEvent()) {
            case PERSON_SET:
                showMatchAlgos();
                break;
            case ALGO_SET:
                showMatches();
                break;
        }
        $_panel.revalidate();
        $_panel.repaint();
    }

    public void showMatchAlgos() {
        $_panel.removeAll();
        $_panel.add($_pickAlgoView.getGUI());
    }

    public void showMatches() {
        $_panel.removeAll();
        $_panel.add($_matchesView.getGUI());
    }

    @Override
    public Controller defaultController(Observable model) {
        return new TednirController(model);
    }
}
