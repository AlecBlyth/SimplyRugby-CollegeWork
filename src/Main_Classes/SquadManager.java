package Main_Classes;

import Classes.Player;
import Classes.Squad;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Squad Manager Module
 * <p>
 * Used to add a player into the squad
 * </P>
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class SquadManager {
    /**
     * Combobox for player objects
     */
    public JFXComboBox<String> cmbPlayers;

    /**
     * Text Area for basic player details
     */
    public JFXTextArea txtPlayerDetails;

    /**
     * Informational label, used to inform user which squad they're managing
     */
    public Label lblSquadName;

    /**
     * Informational label, used to inform user when player is added to squad, fades out using animation package
     */
    public Label lblPlayerAdded;

    /**
     * Creates new line
     */
    private String newLine = System.getProperty("line.separator"); //Creates new line when called.

    /**
     * Current Squad
     */
    private int selectedSquad;

    /**
     * Selected Player
     */
    private Player selectedPlayer;

    /**
     * Players not assigned to a squad
     */
    private String availablePlayers;

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
     * Gets senior players from previous class and populates local array list
     *
     * @param seniorPlayers gets Senior players from array list
     */
    public void getSeniorPlayers(ArrayList<Player> seniorPlayers) {
        this.seniorPlayers = seniorPlayers;
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
     * Gets squads from previous class and populates local array list
     *
     * @param squads gets squads from array list
     */
    public void getSquads(ArrayList<Squad> squads) {
        this.squads = squads;
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
     * Gets selected squad, gets players, for each squad, if the selected squad is found then for each player in players array list, if any player isn't in the squad then available players is that/those player/s
     * Gets names of available players and converts them to an observable list.
     * Removes empty strings from combo box and adds list of available players
     * Try Catch block prevents Null Pointer when they are no more available players
     *
     * @param players gets players from array list
     * @throws NullPointerException When no available players
     */
    public void getPlayers(ArrayList<Player> players) {
        getSelectedSquad(selectedSquad);
        this.players = players;
        try {
            for (Squad aSquad : squads) {
                if (selectedSquad == aSquad.getSquadID()) {
                    for (Player aPlayer : players) {
                        if (!aSquad.getPlayerList().contains(aPlayer)) {
                            if (aSquad.getSquadType().equals(aPlayer.getPlayerType()))
                                availablePlayers = aPlayer.getFirstName() + " " + aPlayer.getSurName();
                        } else {
                            cmbPlayers.setPromptText(""); //else set the combo text to blank (It would be preferable to set it to "No Players Available" when the user loads the scene again, however this causes a bizarre CSS and graphical issue that I'm unable to fix for the time being, the issue is when the prompt text is change, both default and changed fx-text-fill are applied and overlap
                        }
                    }
                    ObservableList<String> list = FXCollections.observableArrayList(availablePlayers);
                    if (availablePlayers != null) {
                        cmbPlayers.getItems().addAll(list);
                    }
                }
            }
        } catch (NullPointerException e) {
            cmbPlayers.setPromptText("No Available Players"); //Sets prompt text to "No Available Players" (This isn't affected by the graphical issue.)
            ExceptionUtils.getRootCauseMessage(e);
            ExceptionUtils.getStackTrace(e);
        }
    }

    /**
     * Gets player from combo box displays player's basic details and assigns selectedPlayer to aPlayer Object
     *
     * @throws NullPointerException When no more avaliable players are found
     */
    public void selectPlayer() {
        txtPlayerDetails.clear();
        try {
            for (Player aPlayer : players) {
                if (cmbPlayers.getValue().equals(aPlayer.getFirstName() + " " + aPlayer.getSurName())) {
                    txtPlayerDetails.appendText("Player Name : " + aPlayer.getFirstName() + " " + aPlayer.getSurName() + newLine +
                            "Player Type   : " + aPlayer.getPlayerType() + newLine +
                            "Field Position  : " + aPlayer.getFieldPosition());
                    selectedPlayer = aPlayer;
                }
            }
        } catch (NullPointerException e) {
            cmbPlayers.setPromptText("No Available Players");
            ExceptionUtils.getRootCauseMessage(e);
            ExceptionUtils.getStackTrace(e);
        }
    }

    /**
     * Adds player to squad
     * Gets selected squad, for each squad in the array list
     * <P>If the selected squad ID is equal to the squad object's ID then if the player type and squad type match</P>
     * <P>Intialise player counter and increment the player counter
     * <P>Add the selected player to the selected squad and set player counter for squad to player counter
     * <P>Set selected player to null</P>
     * <P>Play animation for label to inform the player has been added</P>
     *
     * @throws NullPointerException When no more avaliable players are found
     */
    public void addPlayer() {
        getSelectedSquad(selectedSquad);
        try {
            for (Squad aSquad : squads) {
                if (aSquad.getSquadID() == selectedSquad) {
                    if (aSquad.getSquadType().equals(selectedPlayer.getPlayerType())) {
                        int playerCount = aSquad.getPlayerCount();
                        playerCount++;
                        aSquad.addPlayer(selectedPlayer);
                        aSquad.setPlayerCount(playerCount);
                        cmbPlayers.getItems().remove(selectedPlayer.getFirstName() + " " + selectedPlayer.getSurName());
                        selectedPlayer = null;
                        lblPlayerAdded.setVisible(true);
                        if (lblPlayerAdded.isVisible()) {
                            FadeTransition fadeOut = new FadeTransition(Duration.millis(1550), lblPlayerAdded);
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No Available Players");
            cmbPlayers.setPromptText("No Available Players");
            ExceptionUtils.getRootCauseMessage(e);
            ExceptionUtils.getStackTrace(e);
        }
    }

    /**
     * Sends user to player manager where they can view players
     *
     * @param playerManager Sends user to PlayerManager
     * @throws IOException when root is loaded
     */
    public void goViewPlayers(ActionEvent playerManager) throws IOException {
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
     * Sends user back to previous scene
     *
     * @param back Sends user to Squad Menu
     * @throws IOException When root is loaded
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
        passSelectedSquad.getSelectedSquad(selectedSquad);
        passPlayers.getPlayers(players);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        window.setScene(backScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Ends the program
     */
    public void exitProgram() {
        System.exit(0);
    } //Exits program
}
