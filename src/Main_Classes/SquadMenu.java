package Main_Classes;

import Classes.Player;
import Classes.Squad;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Allows user to navigate through squad menu, leads them to player and squad manager
 */
@SuppressWarnings("ALL")
public class SquadMenu {

    /**
     * Informational label used to inform user which squad they're currently viewing
     */
    public Label lblSquadName;

    /**
     * ID of Selected Squad
     */
    private int selectedSquad;
    /**
     * Name of squad
     */
    private String squadName;

    /**
     * Horizontial position offset
     */
    private double xOffset = 0;
    /**
     * Length position offset
     */
    private double yOffset = 0;

    /**
     * Local array list of squads
     */
    private ArrayList<Squad> squads;
    /**
     * Local array list of players
     */
    private ArrayList<Player> players;
    /**
     * Local array list of junior players
     */
    private ArrayList<Player> juniorPlayers;
    /**
     * Local array list of senior players
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
     * Gets selected squad from squad finder
     * <P>Sets squad name label to squad name found in array is the selected squad ID is equal to the squad object ID</P>
     *
     * @param selectedSquad currently selected squad ID
     */
    public void getSelectedSquad(int selectedSquad) {
        this.selectedSquad = selectedSquad;
        for (Squad aSquad : squads) {
            if (aSquad.getSquadID() == selectedSquad) {
                squadName = aSquad.getSquadName();
            }
        }
        lblSquadName.setText(squadName);
    }

    /**
     * Sends user to PlayerManager scene
     *
     * @param playerManager Sends user to PlayerManager
     * @throws IOException When root is loader
     */
    public void goViewPlayer(ActionEvent playerManager) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/PlayerManager.fxml"));
        AnchorPane root = loader.load();
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        Scene viewSquadScene = new Scene(root);
        Stage window = (Stage) ((Node) playerManager.getSource()).getScene().getWindow();
        root.setOnMouseDragged(event -> {
            window.setX(event.getScreenX() - xOffset);
            window.setY(event.getScreenY() - yOffset);
        });
        PlayerManager passSquads = (PlayerManager) loader.getController();
        PlayerManager passJuniorPlayers = (PlayerManager) loader.getController();
        PlayerManager passSeniorPlayers = (PlayerManager) loader.getController();
        PlayerManager passPlayers = (PlayerManager) loader.getController();
        PlayerManager passSelectedSquad = (PlayerManager) loader.getController();
        passSquads.getSquads(squads);
        passSelectedSquad.getSelectedSquad(selectedSquad);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        passPlayers.getPlayers(players);
        window.setScene(viewSquadScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Sends user to SquadManager
     *
     * @param squadManager Squad Manager Scene
     * @throws IOException When root is loaded
     */
    public void goAddPlayer(ActionEvent squadManager) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/SquadManager.fxml"));
        AnchorPane root = loader.load();
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        Scene viewSquadScene = new Scene(root);
        Stage window = (Stage) ((Node) squadManager.getSource()).getScene().getWindow();
        root.setOnMouseDragged(event -> {
            window.setX(event.getScreenX() - xOffset);
            window.setY(event.getScreenY() - yOffset);
        });
        SquadManager passSquads = (SquadManager) loader.getController();
        SquadManager passPlayers = (SquadManager) loader.getController();
        SquadManager passJuniorPlayers = (SquadManager) loader.getController();
        SquadManager passSeniorPlayers = (SquadManager) loader.getController();
        SquadManager passSelectedSquad = (SquadManager) loader.getController();
        passSquads.getSquads(squads);
        passSelectedSquad.getSelectedSquad(selectedSquad);
        passPlayers.getPlayers(players);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        window.setScene(viewSquadScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Sends user back to previous scene
     *
     * @param back Sends user to Squad Finder scene
     * @throws IOException When root is loaded
     */
    public void goBack(ActionEvent back) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/SquadFinder.fxml"));
        AnchorPane root = loader.load();
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        Scene backScene = new Scene(root);
        Stage window = (Stage) ((Node) back.getSource()).getScene().getWindow();
        root.setOnMouseDragged(event -> {
            window.setX(event.getScreenX() - xOffset);
            window.setY(event.getScreenY() - yOffset);
        });
        SquadFinder passSquads = (SquadFinder) loader.getController();
        SquadFinder passJuniorPlayers = (SquadFinder) loader.getController();
        SquadFinder passSeniorPlayers = (SquadFinder) loader.getController();
        SquadFinder passPlayers = (SquadFinder) loader.getController();
        passSquads.getSquads(squads);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        passPlayers.getPlayers(players);
        window.setScene(backScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Exits program
     */
    public void exitProgram() {
        System.exit(0);
    }
}
