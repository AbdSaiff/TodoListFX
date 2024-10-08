package appli;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


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
        } else {
            errorLabel.setText("");

        }
    }

    @FXML
    public void onClickInscription(ActionEvent event) {
        try {
            StartApplication.changeScene("InscriptionView");
        } catch (IOException e) {
            e.printStackTrace();
            errorLabel.setText("Erreur lors de la navigation vers l'inscription.");
        }
    }
}
