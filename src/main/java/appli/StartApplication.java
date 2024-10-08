package appli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    private static Stage mainstage;

    @Override
    public void start(Stage stage) throws IOException {
        this.mainstage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("/appli/acceuil/LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 440);
        this.mainstage.setTitle("Hello!");
        this.mainstage.setScene(scene);
        this.mainstage.show();
    }

    public static void changeScene(String nomDuFichier) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("/appli/acceuil/" + nomDuFichier + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        mainstage.setScene(scene);
        mainstage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
