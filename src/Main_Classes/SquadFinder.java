package Main_Classes;

import Classes.Player;
import Classes.Squad;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Squad Finder Module
 * <p>
 * Used to allow the user to find squads in the system
 * </P>
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class SquadFinder {

    /**
     * Creates a new line
     */
    private String newLine = System.getProperty("line.separator");

    /**
     * ID of selected squad
     */
    private int selectedSquad;

    /**
     * Combobox for squads
     */
    public JFXComboBox<String> cmbSquads;
    /**
     * Text Area for basic squad details
     */
    public JFXTextArea txtSquadDetails;

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
     * Gets squads from previous class and populates local array list
     * For each squad in the array listm converts array list into ObservableList and gets the name of each squad found and adds them to the squads combobox
     *
     * @param squads Gets squads from previous class/scene and populates local array list
     */
    public void getSquads(ArrayList<Squad> squads) {
        this.squads = squads;
        for (Squad aSquads : squads) {
            ObservableList<String> list = FXCollections.observableArrayList(aSquads.getSquadName());
            cmbSquads.getItems().addAll(list);
        }
    }

    /**
     * Gets the sqaud when user clicks on the squad in the combobox
     * <P>When the user clicks on the squad, the squad's details are displayed and selectedSquad is the squad object's id</P>
     * <P>If the user selects another squad, the text area is cleared before the details are inserted</P>
     */
    public void selectSquad() {
        txtSquadDetails.clear();
        for (Squad aSquads : squads) {
            if (cmbSquads.getValue().equals(aSquads.getSquadName())) {
                txtSquadDetails.appendText("Squad Name : " + aSquads.getSquadName() + newLine +
                        "Squad Type   : " + aSquads.getSquadType() + newLine +
                        "Player Count  : " + aSquads.getPlayerCount());
                selectedSquad = aSquads.getSquadID();
            }
        }
    }

    /**
     * Sends user to the squad's menu
     *
     * @param viewSquad Sends user to SquadMenu
     * @throws IOException When root is loaded
     */
    public void viewSquad(ActionEvent viewSquad) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/SquadMenu.fxml"));
        AnchorPane root = loader.load();
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        Scene viewSquadScene = new Scene(root);
        Stage window = (Stage) ((Node) viewSquad.getSource()).getScene().getWindow();
        root.setOnMouseDragged(event -> {
            window.setX(event.getScreenX() - xOffset);
            window.setY(event.getScreenY() - yOffset);
        });
        SquadMenu passSquads = (SquadMenu) loader.getController();
        SquadMenu passSelectedSquad = (SquadMenu) loader.getController();
        SquadMenu passPlayers = (SquadMenu) loader.getController();
        SquadMenu passJuniorPlayers = (SquadMenu) loader.getController();
        SquadMenu passSeniorPlayers = (SquadMenu) loader.getController();
        passPlayers.getPlayers(players);
        passSquads.getSquads(squads);
        passSelectedSquad.getSelectedSquad(selectedSquad);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        window.setScene(viewSquadScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Sends user back to previous scene
     *
     * @param back Sends user back to navigation menu
     * @throws IOException When root is loaded
     */
    public void goBack(ActionEvent back) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/NavigationMenu.fxml"));
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
        NavigationMenu passSquads = (NavigationMenu) loader.getController();
        NavigationMenu passJuniorPlayers = (NavigationMenu) loader.getController();
        NavigationMenu passSeniorPlayers = (NavigationMenu) loader.getController();
        NavigationMenu passPlayers = (NavigationMenu) loader.getController();
        passSquads.getSquads(squads);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        passPlayers.getPlayers(players);
        window.setScene(backScene);
        window.setResizable(false);
        window.show();
    }

    /**
     * Ends the program
     */
    public void exitProgram() {
        System.exit(0);
    }
}