package Main_Classes;

import Classes.Player;
import Classes.Squad;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Navigational Menu Module
 * <p>
 * Used to allow the user to navigate the system
 * </P>
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class NavigationMenu {

    /**
     * Horizontial position offset
     */
    private double xOffset = 0;
    /**
     * Length position offset
     */
    private double yOffset = 0;

    /**
     * Local list of squads
     */
    private ArrayList<Squad> squads;
    /**
     * Local list of players
     */
    private ArrayList<Player> players;
    /**
     * Local list of junior players
     */
    private ArrayList<Player> juniorPlayers;
    /**
     * Local list of senior players
     */
    private ArrayList<Player> seniorPlayers;

    /**
     * Gets squads from previous class and populates local array list
     *
     * @param squads gets squads from array list
     */
    public void getSquads(ArrayList<Squad> squads) {
        this.squads = squads;
    }

    /**
     * Gets players from previous class and populates local array list
     *
     * @param players gets players from array list
     */
    public void getPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Gets junior players from previous class and populates local array list
     *
     * @param juniorPlayers gets Junior players from array list
     */
    public void getJuniorPlayers(ArrayList<Player> juniorPlayers) {
        this.juniorPlayers = juniorPlayers;
    }

    /**
     * Gets senior players from previous class and populates local array list
     *
     * @param seniorPlayers gets Senior players from array list
     */
    public void getSeniorPlayers(ArrayList<Player> seniorPlayers) {
        this.seniorPlayers = seniorPlayers;
    }

    /**
     * Sends user to Squad finder scene
     *
     * @param searchSquad Squad finder scene
     * @throws IOException When root is loaded
     */
    public void searchSquad(ActionEvent searchSquad) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/SquadFinder.fxml"));
        AnchorPane root = loader.load();
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        Scene searchSquadScene = new Scene(root);
        Stage window = (Stage) ((Node) searchSquad.getSource()).getScene().getWindow();
        root.setOnMouseDragged(event -> {
            window.setX(event.getScreenX() - xOffset);
            window.setY(event.getScreenY() - yOffset);
        });
        SquadFinder passSquads = (SquadFinder) loader.getController();
        SquadFinder passPlayers = (SquadFinder) loader.getController();
        SquadFinder passJuniorPlayers = (SquadFinder) loader.getController();
        SquadFinder passSeniorPlayers = (SquadFinder) loader.getController();
        passSquads.getSquads(squads);
        passPlayers.getPlayers(players);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        window.setScene(searchSquadScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Used to log out user
     *
     * @param logOut Sends user to login screne
     * @throws IOException when root is loaded
     */
    public void logOut(ActionEvent logOut) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/Login.fxml"));
        AnchorPane root = loader.load();
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        Scene logoutScene = new Scene(root);
        Stage window = (Stage) ((Node) logOut.getSource()).getScene().getWindow();
        root.setOnMouseDragged(event -> {
            window.setX(event.getScreenX() - xOffset);
            window.setY(event.getScreenY() - yOffset);
        });
        Login passSquads = (Login) loader.getController();
        Login passJuniorPlayers = (Login) loader.getController();
        Login passSeniorPlayers = (Login) loader.getController();
        Login passPlayers = (Login) loader.getController();
        passSquads.getSquads(squads);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        passPlayers.getPlayers(players);
        window.setScene(logoutScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Exits program
     */
    public void exitProgram() {
        System.exit(0);
    } //Exits program
}