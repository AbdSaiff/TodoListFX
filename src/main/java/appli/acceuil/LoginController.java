package appli.acceuil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
    @FXML
    private void connexion() {
       String email = emailField.getText();
       String password = passwordField.getText();

       if (email.isEmpty() || password.isEmpty()) {
           errorLabel.setText("Email ou Mot de passe vide.");
       }
       else {
           errorLabel.setText("");
       }
    }
}