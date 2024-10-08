package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Database {

    private String serveur = "localhost";
    private String TodoListFx = "TodoListFx";
    private String utilisateur = "root";
    private String MotDePasse = "";


    private String getUrl() {
        return "jdbc:mysql://" + serveur + "/" + TodoListFx + "?serverTimezone=UTC";
    }


    public Connection getConnection() {
        try {
            Connection cnx = DriverManager.getConnection(this.getUrl(), this.utilisateur, this.MotDePasse);
            System.out.println("Etat de la Connexion");
            System.out.println(cnx.isClosed() ? "fermée" : "ouverte \r\n");
            return cnx;
        } catch (SQLException e) {

            System.out.println("Erreur lors de la connexion : " + e.getMessage());
            return null;
        }

    }

}
