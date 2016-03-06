package GUI;

/**
 * Created by Emily on 3/5/2016.
 */

// import armagriddon.Armagriddon, state, logic, engine, etc.

import state.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Color;


public class ArmagriddonGUI extends JFrame implements ActionListener{

    private ScorePanel scorePanel;
    private TurnPanel turnPanel;
    private GridPanel gridPanel;

    private State state;

    public ArmagriddonGUI(State s) {
        reset(s);
    }

    public void reset(State s) {
        state = s;

        scorePanel = new ScorePanel(this, state);
        turnPanel = new TurnPanel(this, state);
        gridPanel = new GridPanel(this, state, 8, 8);

        String title = "Armagriddon";
        setTitle(title);

        // Create main panel
        JPanel mainPane = new JPanel(new BorderLayout());
        mainPane.setPreferredSize(new Dimension(1024, 710));

        // Add panels
        mainPane.add(scorePanel, BorderLayout.SOUTH);
        mainPane.add(turnPanel, BorderLayout.NORTH);
        mainPane.add(gridPanel, BorderLayout.CENTER);

        // Set main window frame properties
        mainPane.setBackground(Color.white);
        setContentPane(mainPane);
        setVisible(true);
        setSize(getLayout().preferredLayoutSize(this));

        // Show in center of the screen
        setLocationRelativeTo(null);
        validate();
        repaint();
    }

    public void update() {
        scorePanel.update();
        turnPanel.update();
        repaint();
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
    }

    public static void main(String[] args) {
        State s = new State();
        ArmagriddonGUI gui = new ArmagriddonGUI(s);
        gui.update();
    }
}


