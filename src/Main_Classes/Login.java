package Main_Classes;

import Classes.Player;
import Classes.Squad;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * Login Module
 * <p>
 * Prevents unauthorised access
 * </P>
 * <p>
 * User is assigned login details
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")

public class Login {

    /**
     * Used to assign minutes for clock
     */
    private int minute;
    /**
     * Used to assign hours for clock
     */
    private int hour;
    /**
     * Used to assign seconds for clock
     */
    private int second;

    /**
     * Horizontial position offset
     */
    private double xOffset = 0;
    /**
     * Length position offset
     */
    private double yOffset = 0;


    /**
     * Label which is changed to the current time
     */
    public Label lblTime;

    /**
     * FXML Component that is used to get the username from the GUI
     */
    public JFXTextField txtUsername;
    /**
     * FXML Component that is used to get the password from the GUI
     */
    public JFXTextField txtPassword;
    /**
     * Label used to inform the user has enter the wrong login details
     */
    public Label lblInvalidLogin;
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
     * Gets squads from previous accessed scene/class
     *
     * @param squads This is the current list of squads that has been preopulated during start up. This populates the squad arraylist
     */
    public void getSquads(ArrayList<Squad> squads) {
        this.squads = squads;
    }

    /**
     * Gets players from previous accessed scene/class
     *
     * @param players This is the current list of players that were prepopulated during start up. This populates the local players arraylist
     */
    public void getPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Gets list of junior players from previous accessed scene/class
     *
     * @param juniorPlayers This is the current list of junior players that were prepopulated during start up. This populates the local junior players arraylist
     */
    public void getJuniorPlayers(ArrayList<Player> juniorPlayers) {
        this.juniorPlayers = juniorPlayers;
    }

    /**
     * Gets list of senior players from previous accessed scene/class
     *
     * @param seniorPlayers This is the current list of senior players that were prepopulated during start up. This populates the local senior players arraylist
     */
    public void getSeniorPlayers(ArrayList<Player> seniorPlayers) {
        this.seniorPlayers = seniorPlayers;
    }

    /**
     * Login method prevents the unauthorised access to the system
     * <p>
     * Hashes password
     *
     * @param login This sends the user to the next scene which will be the menu scene
     * @throws IOException On Input error
     */
    public void login(ActionEvent login) throws IOException {
        String passwordToHash = "password";
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            ExceptionUtils.getRootCauseMessage(e);
            ExceptionUtils.getStackTrace(e);
        }
        System.out.println(generatedPassword);

        getPlayers(players);
        getSquads(squads);

        if (txtUsername.getText().equals("admin") && txtPassword.getText().equals(passwordToHash) || txtUsername.getText().equals("coach") && txtPassword.getText().equals("password")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/NavigationMenu.fxml"));
            AnchorPane root = loader.load();
            root.setOnMousePressed(event -> {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            });
            Scene menuViewScene = new Scene(root);
            Stage window = (Stage) ((Node) login.getSource()).getScene().getWindow();
            root.setOnMouseDragged(event -> {
                window.setX(event.getScreenX() - xOffset);
                window.setY(event.getScreenY() - yOffset);
            });

            NavigationMenu passSquads = (NavigationMenu) loader.getController();
            NavigationMenu passPlayers = (NavigationMenu) loader.getController();
            NavigationMenu passJuniorPlayers = (NavigationMenu) loader.getController();
            NavigationMenu passSeniorPlayers = (NavigationMenu) loader.getController();
            passSquads.getSquads(squads);
            passPlayers.getPlayers(players);
            passJuniorPlayers.getJuniorPlayers(juniorPlayers);
            passSeniorPlayers.getSeniorPlayers(seniorPlayers);

            window.setScene(menuViewScene);
            window.setResizable(false);
            window.show();
        } else {
            lblInvalidLogin.setVisible(true);
            if (lblInvalidLogin.isVisible()) {
                FadeTransition fadeOut = new FadeTransition(Duration.millis(1550), lblInvalidLogin);
                fadeOut.setFromValue(1.0);
                fadeOut.setToValue(0.0);
                fadeOut.play();
            }
        }
    }

    /**
     * Used to create clock
     * <p>
     * Gets an instance of calendar and the current time
     * <P>Sets time vaiables to current second, minute and hours</P>
     * <P>Sets label to time</P>
     * <P>Plays animtation when time changes every second</P>
     */
    @FXML
    public void initialize() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            Calendar cal = Calendar.getInstance();
            second = cal.get(Calendar.SECOND);
            minute = cal.get(Calendar.MINUTE);
            hour = cal.get(Calendar.HOUR);
            lblTime.setText(hour + ":" + (minute) + ":" + second);
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    /**
     * Ends the program
     */
    public void exitProgram() {
        System.exit(0);
    }
}