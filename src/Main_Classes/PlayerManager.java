package Main_Classes;

import Classes.Player;
import Classes.Squad;
import com.jfoenix.controls.JFXListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Player Manager Module
 * <p>
 * Used to allow user to get player and view their profile
 * </P>
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class PlayerManager {

    /**
     * Prevents user from accessing player profile without selecting a player
     */
    private boolean playerSelected = false;

    /**
     * Horizontial position offset
     */
    private double xOffset = 0;
    /**
     * Length position offset
     */
    private double yOffset = 0;


    /**
     * ID of selected Player object
     */
    private int selectedPlayer;
    /**
     * ID of selected Squad object
     */
    private int selectedSquad;
    /**
     * Name of the Squad
     */
    private String squadName;

    /**
     * Listview that contains list of players
     */
    public JFXListView<Player> ltvPlayers;
    /**
     * Informational label which informs user which squad they're viewing
     */
    public Label lblSquadName;

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
     * Gets  selected squad from squad finder
     *
     * @param selectedSquad currently selected squad ID
     */
    public void getSelectedSquad(int selectedSquad) {
        this.selectedSquad = selectedSquad; //Gets selected squad from previous class
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If squad ID = selected squad ID then...
                squadName = aSquad.getSquadName(); //Set squad name to found squad name
            }
        }
        lblSquadName.setText(squadName); //Sets label to squad name
    } //Gets current selected squad from class

    /**
     * Gets players from previous class and populates array list
     * <P>Gets selected squad</P>
     * <P>For each squad in the array list and for each player in the player list, if the selected squad ID is equal to the squad object's ID then if the squad's player list contains players in the player array list then if the squad type is equal to the player object's player type add the player object into the list view</P>
     * <P>Set the text for the list view to display the first name, surname, field poisiton and the player level/type of the player selected</P>
     *
     * @param players Gets list of player objects from previous scene/class and populates local arraylist
     */
    public void getPlayers(ArrayList<Player> players) {
        this.players = players;
        getSelectedSquad(selectedSquad);
        for (Squad aSquad : squads) {
            for (Player aPlayer : players) {
                if (selectedSquad == aSquad.getSquadID()) {
                    if (aSquad.getPlayerList().contains(aPlayer)) {
                        if (aSquad.getSquadType().equals(aPlayer.getPlayerType()))
                            ltvPlayers.getItems().addAll(aPlayer);
                        ltvPlayers.setCellFactory(lv -> new ListCell<>() {
                            @Override
                            public void updateItem(Player player, boolean empty) {
                                super.updateItem(player, empty);
                                setText(empty ? null : "Full Name: " + player.getFirstName() + " " + player.getSurName() + " | Field Position: " + player.getFieldPosition() + "| Player Level: " + player.getPlayerType());
                            }
                        });
                    }
                }
            }
        }
    }

    /**
     * Gets selected player when the user clicks on the listview and clicks on the specific player
     * <P>Gets player object from selection model of the list view</P>
     * <P>A new player object is created and is assigned to the selected item/player object</P>
     * <P>selectedPlayer is new player object's ID</P>
     *
     * @throws NullPointerException When no player is selected
     */
    public void playerSelected() {
        try {
            Player selected = ltvPlayers.getSelectionModel().getSelectedItem();
            selectedPlayer = selected.getID();
            playerSelected = true;
        } catch (NullPointerException e) {
            ExceptionUtils.getRootCauseMessage(e);
            ExceptionUtils.getStackTrace(e);
        }
    }

    /**
     * Sends user to the selected player's profile and loads their skill ratings and skill notes if a player has been selected
     *
     * @param playerProfile Sends the user to the player profile
     * @throws IOException When loader root is loaded
     */
    public void viewPlayer(ActionEvent playerProfile) throws IOException {
        if (playerSelected == true) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/Profile.fxml"));
            AnchorPane root = loader.load();
            root.setOnMousePressed(event -> {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            });
            Scene playerProfileScene = new Scene(root);
            Stage window = (Stage) ((Node) playerProfile.getSource()).getScene().getWindow();
            root.setOnMouseDragged(event -> {
                window.setX(event.getScreenX() - xOffset);
                window.setY(event.getScreenY() - yOffset);
            });
            Profile passSquads = (Profile) loader.getController();
            Profile passJuniorPlayers = (Profile) loader.getController();
            Profile passSeniorPlayers = (Profile) loader.getController();
            Profile passPlayers = (Profile) loader.getController();
            Profile passSelectedSquad = (Profile) loader.getController();
            Profile passSelectedPlayer = (Profile) loader.getController();
            passSquads.getSquads(squads);
            passJuniorPlayers.getJuniorPlayers(juniorPlayers);
            passSeniorPlayers.getSeniorPlayers(seniorPlayers);
            passPlayers.getPlayers(players);
            passSelectedSquad.getSelectedSquad(selectedSquad);
            passSelectedPlayer.getSelectedPlayer(selectedPlayer);
            window.setScene(playerProfileScene);
            window.setResizable(false);
            window.show();
        } else {
            System.out.println("No Player has been selected");
        }
    }

    /**
     * Sends user back to previous scene
     *
     * @param back Sends user back to squad menu
     * @throws IOException When loader root is loaded
     */
    public void goBack(ActionEvent back) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/SquadMenu.fxml"));
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
        SquadMenu passSquads = (SquadMenu) loader.getController();
        SquadMenu passPlayers = (SquadMenu) loader.getController();
        SquadMenu passJuniorPlayers = (SquadMenu) loader.getController();
        SquadMenu passSeniorPlayers = (SquadMenu) loader.getController();
        SquadMenu passSelectedSquad = (SquadMenu) loader.getController();
        passSquads.getSquads(squads);
        passPlayers.getPlayers(players);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        passSelectedSquad.getSelectedSquad(selectedSquad);
        window.setScene(backScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Ends program
     */
    public void exitProgram() {
        System.exit(0);
    }
}