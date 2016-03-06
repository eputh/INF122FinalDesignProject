package GUI;

import state.State;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by Emily on 3/5/2016.
 */
public class LoginPanel extends JPanel {
    private ArmagriddonGUI gui;
    private State state;

    private JPanel loginPanel;
    private String username;
    private String password;

    public LoginPanel(ArmagriddonGUI g, State s) {
        gui = g;
        state = s;

        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setPreferredSize(new Dimension(200,200));
        loginPanel.setBorder(new TitledBorder("Login"));
        loginPanel.setBackground(Color.WHITE);
        loginPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(new JLabel("Username:"), gbc);
        gbc.gridy++;
        loginPanel.add(new JLabel("Password:"), gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        loginPanel.add(new JTextField(25), gbc);
        gbc.gridy++;
        loginPanel.add(new JTextField(25), gbc);

        gbc.gridx = 1;
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        loginPanel.add(new JButton("Login"), gbc);

        add(loginPanel);
    }

    public void paintComponent(Graphics g) {
//        g.setColor(Color.DARK_GRAY);
    }

    public void update() {

    }
}
