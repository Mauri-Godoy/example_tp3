package com.mycompany.mavenproject1.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JTextField emailField;
    private JTextField passwordField;

    public LoginForm() {
        setTitle("Formulario de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JTextField();
        JButton registerButton = new JButton("Registrar");
        
        registerButton.addActionListener((e) -> {
            String email = emailField.getText();
            String password = passwordField.getText();

            if (email.equals("alumno@ulp.edu.ar") && password.equals("12345678")) {
                JOptionPane.showMessageDialog(this, "¡Bienvenido!");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
            }
        });

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Espacio en blanco
        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }
}
