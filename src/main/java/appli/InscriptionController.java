package appli;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InscriptionController {

    @FXML
    private TextField nomField;

    @FXML
    private TextField prenomField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField motDePasseField;

    @FXML
    private TextField confirmationField;

    @FXML
    private Label errorLabel;

    @FXML
    public void onClickInscription() {

        errorLabel.setText("");

        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String motDePasse = motDePasseField.getText();
        String confirmation = confirmationField.getText();


        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || motDePasse.isEmpty() || confirmation.isEmpty()) {
            errorLabel.setText("Tous les champs doivent être remplis.");
        } else if (!motDePasse.equals(confirmation)) {
            errorLabel.setText("Les mots de passe ne correspondent pas.");
        } else {

            errorLabel.setText("Inscription réussie !");

        }
    }
}
