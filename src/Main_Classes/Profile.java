package Main_Classes;

import Classes.Player;
import Classes.Squad;
import com.jfoenix.controls.JFXTextArea;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Profile Module
 * <p>
 * Used to edit/adjust skill ratings for specific player. Also used to add/edit skill notes for each skill category
 * </P>
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class Profile {

    /**
     * Horizontial position offset
     */
    private double xOffset = 0;
    /**
     * Length position offset
     */
    private double yOffset = 0;

    /**
     * Informational label informs user that note has been saved
     */
    public Label lblNoteSaved;
    /**
     * Informational label informs user which profile they're viewing based on the player's name
     */
    public Label lblPlayersName;
    /**
     * Standard skill progress bar
     */
    public ProgressBar progressStandard;
    /**
     * Spin skill progress bar
     */
    public ProgressBar progressSpin;
    /**
     * Pop skill progress bar
     */
    public ProgressBar progressPop;

    /**
     * Default value for standard skill progress bar
     */
    public double standardLevel = 0.2;
    /**
     * Default value for spin skill progress bar
     */
    public double spinLevel = 0.2;
    /**
     * Default value for pop skill progress bar
     */
    public double popLevel = 0.2;

    /**
     * Front skill progress bar
     */
    public ProgressBar progressFront;
    /**
     * Rear skill progress bar
     */
    public ProgressBar progressRear;
    /**
     * Side skill progress bar
     */
    public ProgressBar progressSide;
    /**
     * Scrabble skill progress bar
     */
    public ProgressBar progressScrabble;
    /**
     * Default value for front skill progress bar
     */
    public double frontLevel = 0.2;
    /**
     * Default value for rear skill progress bar
     */
    public double rearLevel = 0.2;
    /**
     * Default value for side skill progress bar
     */
    public double sideLevel = 0.2;
    /**
     * Default value for scrabble skill progress bar
     */
    public double scrabbleLevel = 0.2;

    /**
     * Drop skill progress bar
     */
    public ProgressBar progressDrop;
    /**
     * Punt skill progress bar
     */
    public ProgressBar progressPunt;
    /**
     * Grubber skill progress bar
     */
    public ProgressBar progressGrubber;
    /**
     * Goal skill progress bar
     */
    public ProgressBar progressGoal;
    /**
     * Default value for drop skill progress bar
     */
    public double dropLevel = 0.2;
    /**
     * Default value for punt skill progress bar
     */
    public double puntLevel = 0.2;
    /**
     * Default value for grubber skill progress bar
     */
    public double grubberLevel = 0.2;
    /**
     * Default value for goal skill progress bar
     */
    public double goalLevel = 0.2;

    /**
     * Text Area for skill category passing
     */
    public JFXTextArea txtPassingNotes;
    /**
     * Text Area for skill category tackling
     */
    public JFXTextArea txtTacklingNotes;
    /**
     * Text Area for skill category kicking
     */
    public JFXTextArea txtKickingNotes;

    /**
     * ID of selected squad
     */
    private int selectedSquad;
    /**
     * ID of selected player
     */
    private int selectedPlayer;

    /**
     * skill counter for standard skill
     */
    private int standard;
    /**
     * skill counter for spin skill
     */
    private int spin;
    /**
     * skill counter for pop skill
     */
    private int pop;
    /**
     * skill counter for front skill
     */
    private int front;
    /**
     * skill counter for rear skill
     */
    private int rear;
    /**
     * skill counter for side skill
     */
    private int side;
    /**
     * skill counter for scrabble skill
     */
    private int scrabble;
    /**
     * skill counter for drop skill
     */
    private int drop;
    /**
     * skill counter for punt skill
     */
    private int punt;
    /**
     * skill counter for grubber skill
     */
    private int grubber;
    /**
     * skill counter for goal skill
     */
    private int goal;

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
     * Gets selected squad from squad finder
     *
     * @param selectedSquad currently selected squad ID
     */
    public void getSelectedSquad(int selectedSquad) {
        this.selectedSquad = selectedSquad;
    }

    /**
     * Gets the current player selected and gets the current selected squad
     * <P>Sets the textareas to the current player skill category notes</P>
     * <P>Sets the label to the player's full name</P>
     * <P>Gets the current player skills of the user and sets the progress bar levels and counters based on 0.2 increments and decrements</P>
     *
     * @param selectedPlayer Selected player that was previously selected in the player manager scene
     */
    public void getSelectedPlayer(int selectedPlayer) {
        this.selectedPlayer = selectedPlayer;
        getSelectedSquad(selectedSquad);
        for (Squad aSquad : squads) {
            if (aSquad.getSquadID() == selectedSquad) {
                for (Player aPlayer : players) {
                    if (aPlayer.getID() == selectedPlayer) {
                        txtPassingNotes.appendText(aPlayer.getSkillCategory("Passing").getSkillNotes());
                        txtKickingNotes.appendText(aPlayer.getSkillCategory("Kicking").getSkillNotes());
                        txtTacklingNotes.appendText(aPlayer.getSkillCategory("Tackling").getSkillNotes());
                        lblPlayersName.setText(aPlayer.getFirstName() + " " + aPlayer.getSurName() + "'s Profile");
                        if (aPlayer.getSkillCategory("Passing").getSkill("Standard").getSkillRating() == 1) {
                            progressStandard.setProgress(0.2);
                            standardLevel = 0.2;
                            standard = 1;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Standard").getSkillRating() == 2) {
                            progressStandard.setProgress(0.4);
                            standardLevel = 0.4;
                            standard = 2;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Standard").getSkillRating() == 3) {
                            progressStandard.setProgress(0.6);
                            standardLevel = 0.6;
                            standard = 3;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Standard").getSkillRating() == 4) {
                            progressStandard.setProgress(0.8);
                            standardLevel = 0.8;
                            standard = 4;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Standard").getSkillRating() == 5) {
                            progressStandard.setProgress(1);
                            standardLevel = 1;
                            standard = 5;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Spin").getSkillRating() == 1) {
                            progressSpin.setProgress(0.2);
                            spinLevel = 0.2;
                            spin = 1;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Spin").getSkillRating() == 2) {
                            progressSpin.setProgress(0.4);
                            spinLevel = 0.4;
                            spin = 2;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Spin").getSkillRating() == 3) {
                            progressSpin.setProgress(0.6);
                            spinLevel = 0.6;
                            spin = 3;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Spin").getSkillRating() == 4) {
                            progressSpin.setProgress(0.8);
                            spinLevel = 0.8;
                            spin = 4;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Spin").getSkillRating() == 5) {
                            progressSpin.setProgress(1);
                            spinLevel = 1;
                            spin = 5;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Pop").getSkillRating() == 1) {
                            progressPop.setProgress(0.2);
                            popLevel = 0.2;
                            pop = 1;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Pop").getSkillRating() == 2) {
                            progressPop.setProgress(0.4);
                            popLevel = 0.4;
                            pop = 2;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Pop").getSkillRating() == 3) {
                            progressPop.setProgress(0.6);
                            popLevel = 0.6;
                            pop = 3;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Pop").getSkillRating() == 4) {
                            progressPop.setProgress(0.8);
                            popLevel = 0.8;
                            pop = 4;
                        }
                        if (aPlayer.getSkillCategory("Passing").getSkill("Pop").getSkillRating() == 5) {
                            progressPop.setProgress(1);
                            popLevel = 1;
                            pop = 5;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Front").getSkillRating() == 1) {
                            progressFront.setProgress(0.2);
                            frontLevel = 0.2;
                            front = 1;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Front").getSkillRating() == 2) {
                            progressFront.setProgress(0.4);
                            frontLevel = 0.4;
                            front = 2;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Front").getSkillRating() == 3) {
                            progressFront.setProgress(0.6);
                            frontLevel = 0.6;
                            front = 3;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Front").getSkillRating() == 4) {
                            progressFront.setProgress(0.8);
                            frontLevel = 0.8;
                            front = 4;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Front").getSkillRating() == 5) {
                            progressFront.setProgress(1);
                            frontLevel = 1;
                            front = 5;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Rear").getSkillRating() == 1) {
                            progressRear.setProgress(0.2);
                            rearLevel = 0.2;
                            rear = 1;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Rear").getSkillRating() == 2) {
                            progressRear.setProgress(0.4);
                            rearLevel = 0.4;
                            rear = 2;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Rear").getSkillRating() == 3) {
                            progressRear.setProgress(0.6);
                            rearLevel = 0.6;
                            rear = 3;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Rear").getSkillRating() == 4) {
                            progressRear.setProgress(0.8);
                            rearLevel = 0.8;
                            rear = 4;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Rear").getSkillRating() == 5) {
                            progressRear.setProgress(1);
                            rearLevel = 1;
                            rear = 5;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Side").getSkillRating() == 1) {
                            progressSide.setProgress(0.2);
                            sideLevel = 0.2;
                            side = 1;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Side").getSkillRating() == 2) {
                            progressSide.setProgress(0.4);
                            sideLevel = 0.4;
                            side = 2;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Side").getSkillRating() == 3) {
                            progressSide.setProgress(0.6);
                            sideLevel = 0.6;
                            side = 3;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Side").getSkillRating() == 4) {
                            progressSide.setProgress(0.8);
                            sideLevel = 0.8;
                            side = 4;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Side").getSkillRating() == 5) {
                            progressSide.setProgress(1);
                            sideLevel = 1;
                            side = 5;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").getSkillRating() == 1) {
                            progressScrabble.setProgress(0.2);
                            scrabbleLevel = 0.2;
                            scrabble = 1;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").getSkillRating() == 2) {
                            progressScrabble.setProgress(0.4);
                            scrabbleLevel = 0.4;
                            scrabble = 2;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").getSkillRating() == 3) {
                            progressScrabble.setProgress(0.6);
                            scrabbleLevel = 0.6;
                            scrabble = 3;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").getSkillRating() == 4) {
                            progressScrabble.setProgress(0.8);
                            scrabbleLevel = 0.8;
                            scrabble = 4;
                        }
                        if (aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").getSkillRating() == 5) {
                            progressScrabble.setProgress(1);
                            scrabbleLevel = 1;
                            scrabble = 5;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Drop").getSkillRating() == 1) {
                            progressDrop.setProgress(0.2);
                            dropLevel = 0.2;
                            drop = 1;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Drop").getSkillRating() == 2) {
                            progressDrop.setProgress(0.4);
                            dropLevel = 0.4;
                            drop = 2;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Drop").getSkillRating() == 3) {
                            progressDrop.setProgress(0.6);
                            dropLevel = 0.6;
                            drop = 3;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Drop").getSkillRating() == 4) {
                            progressDrop.setProgress(0.8);
                            dropLevel = 0.8;
                            drop = 4;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Drop").getSkillRating() == 5) {
                            progressDrop.setProgress(1);
                            dropLevel = 1;
                            drop = 5;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Punt").getSkillRating() == 1) {
                            progressPunt.setProgress(0.2);
                            puntLevel = 0.2;
                            punt = 1;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Punt").getSkillRating() == 2) {
                            progressPunt.setProgress(0.4);
                            puntLevel = 0.4;
                            punt = 2;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Punt").getSkillRating() == 3) {
                            progressPunt.setProgress(0.6);
                            puntLevel = 0.6;
                            punt = 3;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Punt").getSkillRating() == 4) {
                            progressPunt.setProgress(0.8);
                            puntLevel = 0.8;
                            punt = 4;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Punt").getSkillRating() == 5) {
                            progressPunt.setProgress(1);
                            puntLevel = 1;
                            punt = 5;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Grubber").getSkillRating() == 1) {
                            progressGrubber.setProgress(0.2);
                            grubberLevel = 0.2;
                            grubber = 1;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Grubber").getSkillRating() == 2) {
                            progressGrubber.setProgress(0.4);
                            grubberLevel = 0.4;
                            grubber = 2;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Grubber").getSkillRating() == 3) {
                            progressGrubber.setProgress(0.6);
                            grubberLevel = 0.6;
                            grubber = 3;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Grubber").getSkillRating() == 4) {
                            progressGrubber.setProgress(0.8);
                            grubberLevel = 0.8;
                            grubber = 4;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Grubber").getSkillRating() == 5) {
                            progressGrubber.setProgress(1);
                            grubberLevel = 1;
                            grubber = 5;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Goal").getSkillRating() == 1) {
                            progressGoal.setProgress(0.2);
                            goalLevel = 0.2;
                            goal = 1;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Goal").getSkillRating() == 2) {
                            progressGoal.setProgress(0.4);
                            goalLevel = 0.4;
                            goal = 2;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Goal").getSkillRating() == 3) {
                            progressGoal.setProgress(0.6);
                            goalLevel = 0.6;
                            goal = 3;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Goal").getSkillRating() == 4) {
                            progressGoal.setProgress(0.8);
                            goalLevel = 0.8;
                            goal = 4;
                        }
                        if (aPlayer.getSkillCategory("Kicking").getSkill("Goal").getSkillRating() == 5) {
                            progressGoal.setProgress(1);
                            goalLevel = 1;
                            goal = 5;
                        }
                    }
                }
            }
        }
    }

    /**
     * Saves notes for the player object and for the skill category
     * Gets selected player object and sets the skill notes for the skill category objects to the text in the text area
     */
    public void saveNotes() {
        getSelectedSquad(selectedSquad);
        for (Squad aSquad : squads) {
            if (aSquad.getSquadID() == selectedSquad) {
                for (Player aPlayer : players) {
                    if (aPlayer.getID() == selectedPlayer) {
                        aPlayer.getSkillCategory("Passing").setSkillNotes(txtPassingNotes.getText());
                        aPlayer.getSkillCategory("Kicking").setSkillNotes(txtKickingNotes.getText());
                        aPlayer.getSkillCategory("Tackling").setSkillNotes(txtTacklingNotes.getText());
                        lblNoteSaved.setVisible(true);
                        if (lblNoteSaved.isVisible()) {
                            FadeTransition fadeOut = new FadeTransition(Duration.millis(1550), lblNoteSaved);
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();
                        }
                    }
                }
            }
        }
    }

    /**
     * increases standard skill
     */
    public void increaseStandardSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (standardLevel != 1 && standard != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            standardLevel = standardLevel + 0.2; //Increment progress bar counter
                            standard = standard + 1; //Increment skill counter
                            progressStandard.setProgress(standardLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Passing").getSkill("Standard").setSkillRating(standard); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases spin skill
     */
    public void increaseSpinSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (spinLevel != 1 && spin != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            spinLevel = spinLevel + 0.2; //Increment progress bar counter
                            spin = spin + 1; //Increment skill counter
                            progressSpin.setProgress(spinLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Passing").getSkill("Spin").setSkillRating(spin); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases pop skill
     */
    public void increasePopSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (popLevel != 1 && pop != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            popLevel = popLevel + 0.2; //Increment progress bar counter
                            pop = pop + 1; //Increment skill counter
                            progressPop.setProgress(popLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Passing").getSkill("Pop").setSkillRating(pop); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases standard skill
     */
    public void decreaseStandardSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (standardLevel > 0.20000000000000007 && standard != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            standardLevel = standardLevel - 0.2; //Decrement progress bar counter
                            standard = standard - 1; //Decrement skill counter
                            progressStandard.setProgress(standardLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Passing").getSkill("Standard").setSkillRating(standard); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases spin skill
     */
    public void decreaseSpinSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (spinLevel > 0.20000000000000007 && spin != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            spinLevel = spinLevel - 0.2; //Decrement progress bar counter
                            spin = spin - 1; //Decrement skill counter
                            progressSpin.setProgress(spinLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Passing").getSkill("Spin").setSkillRating(spin); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases pop skill
     */
    public void decreasePopSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (popLevel > 0.20000000000000007 && pop != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            popLevel = popLevel - 0.2; //Decrement progress bar counter
                            pop = pop - 1;  //Decrement skill counter
                            progressPop.setProgress(popLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Passing").getSkill("Pop").setSkillRating(pop); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }


    /**
     * increases front skill
     */
    public void increaseFrontSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (frontLevel != 1 && front != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            frontLevel = frontLevel + 0.2; //Increment progress bar counter
                            front = front + 1; //Increment skill counter
                            progressFront.setProgress(frontLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Front").setSkillRating(front); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases rear skill
     */
    public void increaseRearSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (rearLevel != 1 && rear != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            rearLevel = rearLevel + 0.2; //Increment progress bar counter
                            rear = rear + 1; //Increment skill counter
                            progressRear.setProgress(rearLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(rear); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases side skill
     */
    public void increaseSideSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (sideLevel != 1 && side != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            sideLevel = sideLevel + 0.2; //Increment progress bar counter
                            side = side + 1; //Increment skill counter
                            progressSide.setProgress(sideLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Side").setSkillRating(side); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases scrabble skill
     */
    public void increaseScrabbleSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (scrabbleLevel != 1 && scrabble != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            scrabbleLevel = scrabbleLevel + 0.2; //Increment progress bar counter
                            scrabble = scrabble + 1; //Increment skill counter
                            progressScrabble.setProgress(scrabbleLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(scrabble); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases front skill
     */
    public void decreaseFrontSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (frontLevel > 0.20000000000000007 && front != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            frontLevel = frontLevel - 0.2; //Decrement progress bar counter
                            front = front - 1; //Decrement skill counter
                            progressFront.setProgress(frontLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Front").setSkillRating(front); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases rear skill
     */
    public void decreaseRearSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (rearLevel > 0.20000000000000007 && rear != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            rearLevel = rearLevel - 0.2; //Decrement progress bar counter
                            rear = rear - 1; //Decrement skill counter
                            progressRear.setProgress(rearLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(rear); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases side skill
     */
    public void decreaseSideSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (sideLevel > 0.20000000000000007 && side != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            sideLevel = sideLevel - 0.2; //Decrement progress bar counter
                            side = side - 1;  //Decrement skill counter
                            progressSide.setProgress(sideLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Side").setSkillRating(side); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases scrabble skill
     */
    public void decreaseScrabbleSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (scrabbleLevel > 0.20000000000000007 && scrabble != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            scrabbleLevel = scrabbleLevel - 0.2;  //Decrement progress bar counter
                            scrabble = scrabble - 1; //Decrement skill counter
                            progressScrabble.setProgress(scrabbleLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(scrabble); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases drop skill
     */
    public void increaseDropSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (dropLevel != 1 && drop != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            dropLevel = dropLevel + 0.2; //Increment progress bar counter
                            drop = drop + 1; //Increment skill counter
                            progressDrop.setProgress(dropLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(drop); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases punt skill
     */
    public void increasePuntSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (puntLevel != 1 && punt != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            puntLevel = puntLevel + 0.2; //Increment progress bar counter
                            punt = punt + 1; //Increment skill counter
                            progressPunt.setProgress(puntLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(punt); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases grubber skill
     */
    public void increaseGrubberSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (grubberLevel != 1 && grubber != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            grubberLevel = grubberLevel + 0.2; //Increment progress bar counter
                            grubber = grubber + 1; //Increment skill counter
                            progressGrubber.setProgress(grubberLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(grubber); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * increases goal skill
     */
    public void increaseGoalSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (goalLevel != 1 && goal != 5) { //If progress bar level isn't equal to one and skill counter isn't equal to five then...
                            goalLevel = goalLevel + 0.2; //Increment progress bar counter
                            goal = goal + 1; //Increment skill counter
                            progressGoal.setProgress(goalLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(goal); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases drop skill
     */
    public void decreaseDropSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (dropLevel > 0.20000000000000007 && drop != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            dropLevel = dropLevel - 0.2; //Decrement progress bar counter
                            drop = drop - 1; //Decrement skill counter
                            progressDrop.setProgress(dropLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(drop); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases punt skill
     */
    public void decreasePuntSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (puntLevel > 0.20000000000000007 && punt != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            puntLevel = puntLevel - 0.2; //Decrement progress bar counter
                            punt = punt - 1; //Decrement skill counter
                            progressPunt.setProgress(puntLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(punt); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases grubber skill
     */
    public void decreaseGrubberSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (grubberLevel > 0.20000000000000007 && grubber != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            grubberLevel = grubberLevel - 0.2; //Decrement progress bar counter
                            grubber = grubber - 1;  //Decrement skill counter
                            progressGrubber.setProgress(grubberLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(grubber); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Decreases goal skill
     */
    public void decreaseGoalSkill() {
        getSelectedSquad(selectedSquad); //Get selected squad
        for (Squad aSquad : squads) { //For each squad in squad array list
            if (aSquad.getSquadID() == selectedSquad) { //If found squad ID = selected squad ID then...
                for (Player aPlayer : players) { //For each player in player array list
                    if (aPlayer.getID() == selectedPlayer) { //If found player ID = selected player ID then...
                        if (goalLevel > 0.20000000000000007 && goal != 1) { //If progress bar level is more than 0.2 and skill counter isn't equal to one then...
                            goalLevel = goalLevel - 0.2;  //Decrement progress bar counter
                            goal = goal - 1; //Decrement skill counter
                            progressGoal.setProgress(goalLevel); //Set progress to progress bar counter
                            aPlayer.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(goal); //Set skill rating to skill counter
                        }
                    }
                }
            }
        }
    }

    /**
     * Sends user back to previous scene
     *
     * @param back Sends user back to player manager scene
     * @throws IOException When root is loaded
     */
    public void goBack(ActionEvent back) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLs/PlayerManager.fxml"));
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
        PlayerManager passSquads = (PlayerManager) loader.getController();
        PlayerManager passPlayers = (PlayerManager) loader.getController();
        PlayerManager passSelectedSquad = (PlayerManager) loader.getController();
        passSquads.getSquads(squads);
        passSelectedSquad.getSelectedSquad(selectedSquad);
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
    } //Exits program
}