package Main_Classes;

import Classes.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import static java.lang.System.out;

/**
 * Simply Rugby Module
 * <p>
 * Used to prepopulate required data and start the program.
 * </P>
 *
 * @author Alec Blyth
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class SimplyRugby extends Application {

    /**
     * New array list of Squad objects
     */
    private static ArrayList<Squad> squads = new ArrayList<>();
    /**
     * New array list of Player objects
     */
    private static ArrayList<Player> players = new ArrayList<>();
    /**
     * New array list of SeniorPlayer objects
     */
    private static ArrayList<Player> seniorPlayers = new ArrayList<>();
    /**
     * New array list of JuniorPlayer objects
     */
    private static ArrayList<Player> juniorPlayers = new ArrayList<>();

    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J1 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J1 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J1 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J2 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J2 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J2 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J3 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J3 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J3 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J4 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J4 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J4 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J5 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J5 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J5 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J6 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J6 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J6 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J7 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J7 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J7 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J8 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J8 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J8 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J9 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J9 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J9 = new ArrayList<>();
    /**
     * List of passing skills for junior player
     */
    private static ArrayList<Skill> passingList_J10 = new ArrayList<>();
    /**
     * List of tackling skills for junior player
     */
    private static ArrayList<Skill> tackingList_J10 = new ArrayList<>();
    /**
     * List of kicking skills for junior player
     */
    private static ArrayList<Skill> kickingList_J10 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S1 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S1 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S1 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S2 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S2 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S2 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S3 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S3 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S3 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S4 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S4 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S4 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S5 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S5 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S5 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S6 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S6 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S6 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S7 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S7 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S7 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S8 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S8 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S8 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S9 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S9 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S9 = new ArrayList<>();
    /**
     * List of passing skills for senior player
     */
    private static ArrayList<Skill> passingList_S10 = new ArrayList<>();
    /**
     * List of tackling skills for senior player
     */
    private static ArrayList<Skill> tackingList_S10 = new ArrayList<>();
    /**
     * List of kicking skills for senior player
     */
    private static ArrayList<Skill> kickingList_S10 = new ArrayList<>();

    /**
     * Prepopulates Junior Players
     * <P>Creates a new squad object with squad name and sets the squad type to "Junior", the ID is set to 1000 and the player count is set to 9 by default, the list of players is inserted into the constructor</P>
     * <P>The newly created squad is then added into the squads array list</P>
     * <P>Skill objects for each player is created and added into the skill array lists </P>
     * <P>After Skill objects are created, Skill Category objects are created for each player and the corresponding skill lists are inserted into the skill category object</P>
     * <P>After the Skill Category objects are created, junior player objects are created</P>
     * <P>After the junior player objects are created, the skill categories are added to the player object</P>
     * <P>After the Skill Categories have been added to the player, their skill ratings are set</P>
     * <P>After the Skill Ratings have been assigned, the players are inserted into the corresponding player list - Junior</P>
     * <P>Finally the players are all inserted into players array list </P>
     */
    private static void prepopulateJuniorPlayers() {

        Squad juniorSquad = new Squad("Simply Cubs", "Junior", 1000, 9, juniorPlayers);
        squads.add(juniorSquad);

        //================================================================================
        // Junior Player 1 - Skills - Passing
        //================================================================================
        Skill standard_J1 = new Skill("Standard", 1);
        Skill spin_J1 = new Skill("Spin", 1);
        Skill pop_J1 = new Skill("Pop", 1);
        passingList_J1.add(standard_J1);
        passingList_J1.add(spin_J1);
        passingList_J1.add(pop_J1);

        //================================================================================
        // Junior Player 1 - Skills - Tackling
        //================================================================================

        Skill front_J1 = new Skill("Front", 1);
        Skill rear_J1 = new Skill("Rear", 1);
        Skill side_J1 = new Skill("Side", 1);
        Skill scrabble_J1 = new Skill("Scrabble", 1);
        tackingList_J1.add(front_J1);
        tackingList_J1.add(rear_J1);
        tackingList_J1.add(side_J1);
        tackingList_J1.add(scrabble_J1);

        //================================================================================
        // Junior Player 1 - Skills - Kicking
        //================================================================================

        Skill drop_J1 = new Skill("Drop", 1);
        Skill punt_J1 = new Skill("Punt", 1);
        Skill grubber_J1 = new Skill("Grubber", 1);
        Skill goal_J1 = new Skill("Goal", 1);
        kickingList_J1.add(drop_J1);
        kickingList_J1.add(punt_J1);
        kickingList_J1.add(grubber_J1);
        kickingList_J1.add(goal_J1);

        //================================================================================
        // Junior Player 2 - Skills - Passing
        //================================================================================

        Skill standard_J2 = new Skill("Standard", 1);
        Skill spin_J2 = new Skill("Spin", 1);
        Skill pop_J2 = new Skill("Pop", 1);
        passingList_J2.add(standard_J2);
        passingList_J2.add(spin_J2);
        passingList_J2.add(pop_J2);

        //================================================================================
        // Junior Player 2 - Skills - Tackling
        //================================================================================

        Skill front_J2 = new Skill("Front", 1);
        Skill rear_J2 = new Skill("Rear", 1);
        Skill side_J2 = new Skill("Side", 1);
        Skill scrabble_J2 = new Skill("Scrabble", 1);
        tackingList_J2.add(front_J2);
        tackingList_J2.add(rear_J2);
        tackingList_J2.add(side_J2);
        tackingList_J2.add(scrabble_J2);

        //================================================================================
        // Junior Player 2 - Skills - Kicking
        //================================================================================

        Skill drop_J2 = new Skill("Drop", 1);
        Skill punt_J2 = new Skill("Punt", 1);
        Skill grubber_J2 = new Skill("Grubber", 1);
        Skill goal_J2 = new Skill("Goal", 1);
        kickingList_J2.add(drop_J2);
        kickingList_J2.add(punt_J2);
        kickingList_J2.add(grubber_J2);
        kickingList_J2.add(goal_J2);

        //================================================================================
        // Junior Player 3 - Skills - Passing
        //================================================================================

        Skill standard_J3 = new Skill("Standard", 1);
        Skill spin_J3 = new Skill("Spin", 1);
        Skill pop_J3 = new Skill("Pop", 1);
        passingList_J3.add(standard_J3);
        passingList_J3.add(spin_J3);
        passingList_J3.add(pop_J3);

        //================================================================================
        // Junior Player 3 - Skills - Tackling
        //================================================================================

        Skill front_J3 = new Skill("Front", 1);
        Skill rear_J3 = new Skill("Rear", 1);
        Skill side_J3 = new Skill("Side", 1);
        Skill scrabble_J3 = new Skill("Scrabble", 1);
        tackingList_J3.add(front_J3);
        tackingList_J3.add(rear_J3);
        tackingList_J3.add(side_J3);
        tackingList_J3.add(scrabble_J3);

        //================================================================================
        // Junior Player 3- Skills - Kicking
        //================================================================================

        Skill drop_J3 = new Skill("Drop", 1);
        Skill punt_J3 = new Skill("Punt", 1);
        Skill grubber_J3 = new Skill("Grubber", 1);
        Skill goal_J3 = new Skill("Goal", 1);
        kickingList_J3.add(drop_J3);
        kickingList_J3.add(punt_J3);
        kickingList_J3.add(grubber_J3);
        kickingList_J3.add(goal_J3);

        //================================================================================
        // Junior Player 4 - Skills - Passing
        //================================================================================

        Skill standard_J4 = new Skill("Standard", 1);
        Skill spin_J4 = new Skill("Spin", 1);
        Skill pop_J4 = new Skill("Pop", 1);
        passingList_J4.add(standard_J4);
        passingList_J4.add(spin_J4);
        passingList_J4.add(pop_J4);

        //================================================================================
        // Junior Player 4 - Skills - Tackling
        //================================================================================

        Skill front_J4 = new Skill("Front", 1);
        Skill rear_J4 = new Skill("Rear", 1);
        Skill side_J4 = new Skill("Side", 1);
        Skill scrabble_J4 = new Skill("Scrabble", 1);
        tackingList_J4.add(front_J4);
        tackingList_J4.add(rear_J4);
        tackingList_J4.add(side_J4);
        tackingList_J4.add(scrabble_J4);

        //================================================================================
        // Junior Player 4- Skills - Kicking
        //================================================================================

        Skill drop_J4 = new Skill("Drop", 1);
        Skill punt_J4 = new Skill("Punt", 1);
        Skill grubber_J4 = new Skill("Grubber", 1);
        Skill goal_J4 = new Skill("Goal", 1);
        kickingList_J4.add(drop_J4);
        kickingList_J4.add(punt_J4);
        kickingList_J4.add(grubber_J4);
        kickingList_J4.add(goal_J4);

        //================================================================================
        // Junior Player 5 - Skills - Passing
        //================================================================================

        Skill standard_J5 = new Skill("Standard", 1);
        Skill spin_J5 = new Skill("Spin", 1);
        Skill pop_J5 = new Skill("Pop", 1);
        passingList_J5.add(standard_J5);
        passingList_J5.add(spin_J5);
        passingList_J5.add(pop_J5);

        //================================================================================
        // Junior Player 5 - Skills - Tackling
        //================================================================================

        Skill front_J5 = new Skill("Front", 1);
        Skill rear_J5 = new Skill("Rear", 1);
        Skill side_J5 = new Skill("Side", 1);
        Skill scrabble_J5 = new Skill("Scrabble", 1);
        tackingList_J5.add(front_J5);
        tackingList_J5.add(rear_J5);
        tackingList_J5.add(side_J5);
        tackingList_J5.add(scrabble_J5);

        //================================================================================
        // Junior Player 5- Skills - Kicking
        //================================================================================

        Skill drop_J5 = new Skill("Drop", 1);
        Skill punt_J5 = new Skill("Punt", 1);
        Skill grubber_J5 = new Skill("Grubber", 1);
        Skill goal_J5 = new Skill("Goal", 1);
        kickingList_J5.add(drop_J5);
        kickingList_J5.add(punt_J5);
        kickingList_J5.add(grubber_J5);
        kickingList_J5.add(goal_J5);

        //================================================================================
        // Junior Player 6 - Skills - Passing
        //================================================================================

        Skill standard_J6 = new Skill("Standard", 1);
        Skill spin_J6 = new Skill("Spin", 1);
        Skill pop_J6 = new Skill("Pop", 1);
        passingList_J6.add(standard_J6);
        passingList_J6.add(spin_J6);
        passingList_J6.add(pop_J6);

        //================================================================================
        // Junior Player 6 - Skills - Tackling
        //================================================================================

        Skill front_J6 = new Skill("Front", 1);
        Skill rear_J6 = new Skill("Rear", 1);
        Skill side_J6 = new Skill("Side", 1);
        Skill scrabble_J6 = new Skill("Scrabble", 1);
        tackingList_J6.add(front_J6);
        tackingList_J6.add(rear_J6);
        tackingList_J6.add(side_J6);
        tackingList_J6.add(scrabble_J6);

        //================================================================================
        // Junior Player 6- Skills - Kicking
        //================================================================================

        Skill drop_J6 = new Skill("Drop", 1);
        Skill punt_J6 = new Skill("Punt", 1);
        Skill grubber_J6 = new Skill("Grubber", 1);
        Skill goal_J6 = new Skill("Goal", 1);
        kickingList_J6.add(drop_J6);
        kickingList_J6.add(punt_J6);
        kickingList_J6.add(grubber_J6);
        kickingList_J6.add(goal_J6);

        //================================================================================
        // Junior Player 7 - Skills - Passing
        //================================================================================

        Skill standard_J7 = new Skill("Standard", 1);
        Skill spin_J7 = new Skill("Spin", 1);
        Skill pop_J7 = new Skill("Pop", 1);
        passingList_J7.add(standard_J7);
        passingList_J7.add(spin_J7);
        passingList_J7.add(pop_J7);

        //================================================================================
        // Junior Player 7 - Skills - Tackling
        //================================================================================

        Skill front_J7 = new Skill("Front", 1);
        Skill rear_J7 = new Skill("Rear", 1);
        Skill side_J7 = new Skill("Side", 1);
        Skill scrabble_J7 = new Skill("Scrabble", 1);
        tackingList_J7.add(front_J7);
        tackingList_J7.add(rear_J7);
        tackingList_J7.add(side_J7);
        tackingList_J7.add(scrabble_J7);

        //================================================================================
        // Junior Player 7- Skills - Kicking
        //================================================================================

        Skill drop_J7 = new Skill("Drop", 1);
        Skill punt_J7 = new Skill("Punt", 1);
        Skill grubber_J7 = new Skill("Grubber", 1);
        Skill goal_J7 = new Skill("Goal", 1);
        kickingList_J7.add(drop_J7);
        kickingList_J7.add(punt_J7);
        kickingList_J7.add(grubber_J7);
        kickingList_J7.add(goal_J7);

        //================================================================================
        // Junior Player 8 - Skills - Passing
        //================================================================================

        Skill standard_J8 = new Skill("Standard", 1);
        Skill spin_J8 = new Skill("Spin", 1);
        Skill pop_J8 = new Skill("Pop", 1);
        passingList_J8.add(standard_J8);
        passingList_J8.add(spin_J8);
        passingList_J8.add(pop_J8);

        //================================================================================
        // Junior Player 8 - Skills - Tackling
        //================================================================================

        Skill front_J8 = new Skill("Front", 1);
        Skill rear_J8 = new Skill("Rear", 1);
        Skill side_J8 = new Skill("Side", 1);
        Skill scrabble_J8 = new Skill("Scrabble", 1);
        tackingList_J8.add(front_J8);
        tackingList_J8.add(rear_J8);
        tackingList_J8.add(side_J8);
        tackingList_J8.add(scrabble_J8);

        //================================================================================
        // Junior Player 8- Skills - Kicking
        //================================================================================

        Skill drop_J8 = new Skill("Drop", 1);
        Skill punt_J8 = new Skill("Punt", 1);
        Skill grubber_J8 = new Skill("Grubber", 1);
        Skill goal_J8 = new Skill("Goal", 1);
        kickingList_J8.add(drop_J8);
        kickingList_J8.add(punt_J8);
        kickingList_J8.add(grubber_J8);
        kickingList_J8.add(goal_J8);

        //================================================================================
        // Junior Player 9 - Skills - Passing
        //================================================================================

        Skill standard_J9 = new Skill("Standard", 1);
        Skill spin_J9 = new Skill("Spin", 1);
        Skill pop_J9 = new Skill("Pop", 1);
        passingList_J9.add(standard_J9);
        passingList_J9.add(spin_J9);
        passingList_J9.add(pop_J9);

        //================================================================================
        // Junior Player 9 - Skills - Tackling
        //================================================================================

        Skill front_J9 = new Skill("Front", 1);
        Skill rear_J9 = new Skill("Rear", 1);
        Skill side_J9 = new Skill("Side", 1);
        Skill scrabble_J9 = new Skill("Scrabble", 1);
        tackingList_J9.add(front_J9);
        tackingList_J9.add(rear_J9);
        tackingList_J9.add(side_J9);
        tackingList_J9.add(scrabble_J9);

        //================================================================================
        // Junior Player 9- Skills - Kicking
        //================================================================================

        Skill drop_J9 = new Skill("Drop", 1);
        Skill punt_J9 = new Skill("Punt", 1);
        Skill grubber_J9 = new Skill("Grubber", 1);
        Skill goal_J9 = new Skill("Goal", 1);
        kickingList_J9.add(drop_J9);
        kickingList_J9.add(punt_J9);
        kickingList_J9.add(grubber_J9);
        kickingList_J9.add(goal_J9);

        //================================================================================
        // Junior Player 10 - Skills - Passing
        //================================================================================

        Skill standard_J10 = new Skill("Standard", 1);
        Skill spin_J10 = new Skill("Spin", 1);
        Skill pop_J10 = new Skill("Pop", 1);
        passingList_J10.add(standard_J10);
        passingList_J10.add(spin_J10);
        passingList_J10.add(pop_J10);

        //================================================================================
        // Junior Player 10 - Skills - Tackling
        //================================================================================

        Skill front_J10 = new Skill("Front", 1);
        Skill rear_J10 = new Skill("Rear", 1);
        Skill side_J10 = new Skill("Side", 1);
        Skill scrabble_J10 = new Skill("Scrabble", 1);
        tackingList_J10.add(front_J10);
        tackingList_J10.add(rear_J10);
        tackingList_J10.add(side_J10);
        tackingList_J10.add(scrabble_J10);

        //================================================================================
        // Junior Player 10- Skills - Kicking
        //================================================================================

        Skill drop_J10 = new Skill("Drop", 1);
        Skill punt_J10 = new Skill("Punt", 1);
        Skill grubber_J10 = new Skill("Grubber", 1);
        Skill goal_J10 = new Skill("Goal", 1);
        kickingList_J10.add(drop_J10);
        kickingList_J10.add(punt_J10);
        kickingList_J10.add(grubber_J10);
        kickingList_J10.add(goal_J10);

        //================================================================================
        // Skill Categories - Passing
        //================================================================================
        SkillCategory passing_J1 = new SkillCategory("Passing", "", passingList_J1);
        SkillCategory passing_J2 = new SkillCategory("Passing", "", passingList_J2);
        SkillCategory passing_J3 = new SkillCategory("Passing", "", passingList_J3);
        SkillCategory passing_J4 = new SkillCategory("Passing", "", passingList_J4);
        SkillCategory passing_J5 = new SkillCategory("Passing", "", passingList_J5);
        SkillCategory passing_J6 = new SkillCategory("Passing", "", passingList_J6);
        SkillCategory passing_J7 = new SkillCategory("Passing", "", passingList_J7);
        SkillCategory passing_J8 = new SkillCategory("Passing", "", passingList_J8);
        SkillCategory passing_J9 = new SkillCategory("Passing", "", passingList_J9);
        SkillCategory passing_J10 = new SkillCategory("Passing", "", passingList_J10);

        //================================================================================
        // Skill Categories - Tackling
        //================================================================================
        SkillCategory tackling_J1 = new SkillCategory("Tackling", "", tackingList_J1);
        SkillCategory tackling_J2 = new SkillCategory("Tackling", "", tackingList_J2);
        SkillCategory tackling_J3 = new SkillCategory("Tackling", "", tackingList_J3);
        SkillCategory tackling_J4 = new SkillCategory("Tackling", "", tackingList_J4);
        SkillCategory tackling_J5 = new SkillCategory("Tackling", "", tackingList_J5);
        SkillCategory tackling_J6 = new SkillCategory("Tackling", "", tackingList_J6);
        SkillCategory tackling_J7 = new SkillCategory("Tackling", "", tackingList_J7);
        SkillCategory tackling_J8 = new SkillCategory("Tackling", "", tackingList_J8);
        SkillCategory tackling_J9 = new SkillCategory("Tackling", "", tackingList_J9);
        SkillCategory tackling_J10 = new SkillCategory("Tackling", "", tackingList_J10);
        //================================================================================
        // Skill Categories - Kicking
        //================================================================================
        SkillCategory kicking_J1 = new SkillCategory("Kicking", "", kickingList_J1);
        SkillCategory kicking_J2 = new SkillCategory("Kicking", "", kickingList_J2);
        SkillCategory kicking_J3 = new SkillCategory("Kicking", "", kickingList_J3);
        SkillCategory kicking_J4 = new SkillCategory("Kicking", "", kickingList_J4);
        SkillCategory kicking_J5 = new SkillCategory("Kicking", "", kickingList_J5);
        SkillCategory kicking_J6 = new SkillCategory("Kicking", "", kickingList_J6);
        SkillCategory kicking_J7 = new SkillCategory("Kicking", "", kickingList_J7);
        SkillCategory kicking_J8 = new SkillCategory("Kicking", "", kickingList_J8);
        SkillCategory kicking_J9 = new SkillCategory("Kicking", "", kickingList_J9);
        SkillCategory kicking_J10 = new SkillCategory("Kicking", "", kickingList_J10);

        //================================================================================
        // New Junior Player Objects
        //================================================================================

        JuniorPlayer juniorPlayer01 = new JuniorPlayer(1001, "Louis", "Powell", "27/09/2008", "18 Marlborough Cresent", "KY1-ABC", "078 1785 2932", "N/A", "PK2V-QF8G-A8ZT-CN3N",
                "N/A", "Full-Back", "Junior", "Enoch Powell", "18 Marlborough Cresent", "078 1785 2932", "Father",
                "Victoria Powell", "18 Marlborough Cresent", "078 1785 2932", "Mother",
                "George Dawkins", "023 3292 2190", "None", "32 Victoria Street");

        JuniorPlayer juniorPlayer02 = new JuniorPlayer(1002, "Ellis", "McMillan", "15/03/2005", "59 Grenoble Road", "KY2-ACB", "077 3488 9524", "N/A", "RWXD-EKGN-ASAT-ZNMC",
                "N/A", "Wing", "Junior", "Phillip McMillan", "59 Grenoble Road", "077 3488 9524", "Father",
                "Emma McMillan", "59 Grenoble Road", "077 3488 9524", "Mother",
                "David Hugh", "024 3789 2378", "None", "23 George Street");

        JuniorPlayer juniorPlayer03 = new JuniorPlayer(1003, "Conan", "White", "17/08/2004", "76 Malcom Road", "KY3-BAC", "074 1925 2382", "N/A", "56DT-5VY3-JKSR-SZCE",
                "N/A", "Centre", "Junior", "Fawkes White", "76 Malcom Road", "074 1925 2382", "Father",
                "Hayley White", "76 Malcom Road", "074 1925 2382", "Mother",
                "Albert Simpson", "029 1821 1332", "None", "10 Hudson Road");

        JuniorPlayer juniorPlayer04 = new JuniorPlayer(1004, "Nicolas", "Lynch", "09/02/2003", "11 St James Boulevard", "KY4-JSA", "077 0736 5289", "N/A", "PH54-BE8D-G34X-CCZK",
                "N/A", "Fly-Half", "Junior", "Nicolas Lynch", "11 St James Boulevard", "077 0736 5289", "Father",
                "Velma Lynch", "11 St James Boulevard", "077 0736 5289", "Mother",
                "George Matthews", "077 1836 9388", "None", "33 Dover Road");

        JuniorPlayer juniorPlayer05 = new JuniorPlayer(1005, "Robert", "Duvall", "23/05/2002", "12 Caradon Hill", "KY5-2TC", "077 4552 2197", "N/A", "LEVD-5ULL-CFPR-XVNC",
                "N/A", "Scrum-Half", "Junior", "Francis Duvall", "12 Caradon Hill", "077 4552 2197", "Father",
                "Barbara Duvall", "12 Caradon Hill", "077 4552 2197", "Mother",
                "Chiemi Tamura", "077 4278 1417", "None", "37 Stewart Street");

        JuniorPlayer juniorPlayer06 = new JuniorPlayer(1006, "Julian", "Smith", "03/06/2006", "24 Sardis Station", "KY6-SAS", "078 6771 5390", "N/A", "DB22-25ZK-CEN3-M2X2",
                "N/A", "Hooker", "Junior", "Alexander Smith", "24 Sardis Station", "078 6771 5390", "Father",
                "Imogen Smith", "24 Sardis Station", "078 6771 5390", "Mother",
                "Holly Hudson", "070 8934 5270", "None", "97 Sloe Lane");

        JuniorPlayer juniorPlayer07 = new JuniorPlayer(1007, "Derrick", "Pinkman", "31/10/2008", "50 Guildford Rd", "KY7-H2T", "077 4450 9680", "N/A", "H3LW-FBEA-T3L5-9WJK",
                "N/A", "Prop", "Junior", "Jesse Pickman", "50 Guildford Rd", "077 4450 9680", "Father",
                "Eve Pinkman", "50 Guildford Rd", "077 4450 9680", "Mother",
                "Jorge Connors", "078 7575 1386", "None", "93 Ploughley Rd");

        JuniorPlayer juniorPlayer08 = new JuniorPlayer(1008, "Tomi", "Hellström", "22/06/2005", "53 St James Boulevard", "KY8-F21", "077 2036 7686", "N/A", "WR2H-AD39-ETK2-7L86",
                "N/A", "2nd-Row", "Junior", "Kaarlo Hellström", "53 St James Boulevard", "077 2036 7686", "Father",
                "Megan Hellström", "18 Marlborough Cresent", "077 2036 7686", "Mother",
                "George Dawkins", "023 3292 2190", "None", "50 Harrogate Road");

        JuniorPlayer juniorPlayer09 = new JuniorPlayer(1009, "Galeazzo", "Marchesi", "04/03/2004", "41 St Denys Road", "KY9-DA2", "078 1460 0199", "N/A", "XHKL-ZB93-5YJZ-XA5E",
                "N/A", "Back-Row", "Junior", "Amerigo Marchesi", "41 St Denys Road", "078 1460 0199", "Father",
                "Rosalia Marchesi", "St Denys Road", "078 1460 0199", "Mother",
                "Fukiyo Takei", "079 5439 1403", "None", "43 Golf Road");

        JuniorPlayer juniorPlayer10 = new JuniorPlayer(1010, "Adam", "Smith", "04/9/2008", "41 High Street Road", "KY2-VA2", "037 9899 9392", "N/A", "9JH3-I090I-09KP-09JK",
                "N/A", "Full-Back", "Junior", "David Smith", "41 High Street Road", "037 9899 9392", "Father",
                "Georgia Smith", "41 High Street Road", "037 9899 9392", "Mother",
                "Ferris Buel", "099 7989 7789", "None", "43 Golf Road");

        //================================================================================
        // Add Skill Categories to Players and Set Skill Default Skill Ratings
        //================================================================================

        juniorPlayer01.getSkillCategories().add(passing_J1);
        juniorPlayer01.getSkillCategories().add(tackling_J1);
        juniorPlayer01.getSkillCategories().add(kicking_J1);
        juniorPlayer01.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer01.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer01);

        juniorPlayer02.getSkillCategories().add(passing_J2);
        juniorPlayer02.getSkillCategories().add(tackling_J2);
        juniorPlayer02.getSkillCategories().add(kicking_J2);
        juniorPlayer02.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer02.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer02);

        juniorPlayer03.getSkillCategories().add(passing_J3);
        juniorPlayer03.getSkillCategories().add(tackling_J3);
        juniorPlayer03.getSkillCategories().add(kicking_J3);
        juniorPlayer03.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer03.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer03);

        juniorPlayer04.getSkillCategories().add(passing_J4);
        juniorPlayer04.getSkillCategories().add(tackling_J4);
        juniorPlayer04.getSkillCategories().add(kicking_J4);
        juniorPlayer04.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer04.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer04);

        juniorPlayer05.getSkillCategories().add(passing_J5);
        juniorPlayer05.getSkillCategories().add(tackling_J5);
        juniorPlayer05.getSkillCategories().add(kicking_J5);
        juniorPlayer05.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer05.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer05);

        juniorPlayer06.getSkillCategories().add(passing_J6);
        juniorPlayer06.getSkillCategories().add(tackling_J6);
        juniorPlayer06.getSkillCategories().add(kicking_J6);
        juniorPlayer06.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer06.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer06);

        juniorPlayer07.getSkillCategories().add(passing_J7);
        juniorPlayer07.getSkillCategories().add(tackling_J7);
        juniorPlayer07.getSkillCategories().add(kicking_J7);
        juniorPlayer07.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer07.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer07);

        juniorPlayer08.getSkillCategories().add(passing_J8);
        juniorPlayer08.getSkillCategories().add(tackling_J8);
        juniorPlayer08.getSkillCategories().add(kicking_J8);
        juniorPlayer08.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer08.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer08);

        juniorPlayer09.getSkillCategories().add(passing_J9);
        juniorPlayer09.getSkillCategories().add(tackling_J9);
        juniorPlayer09.getSkillCategories().add(kicking_J9);
        juniorPlayer09.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer09.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        juniorSquad.addPlayer(juniorPlayer09);

        juniorPlayer10.getSkillCategories().add(passing_J10);
        juniorPlayer10.getSkillCategories().add(tackling_J10);
        juniorPlayer10.getSkillCategories().add(kicking_J10);
        juniorPlayer10.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        juniorPlayer10.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);

        players.add(juniorPlayer01);
        players.add(juniorPlayer02);
        players.add(juniorPlayer03);
        players.add(juniorPlayer04);
        players.add(juniorPlayer05);
        players.add(juniorPlayer06);
        players.add(juniorPlayer07);
        players.add(juniorPlayer08);
        players.add(juniorPlayer09);
        players.add(juniorPlayer10);
    }

    /**
     * Prepopulates Senior Players
     * <P>Creates a new squad object with squad name and sets the squad type to "Senior", the ID is set to 2000 and the player count is set to 9 by default, the list of players is inserted into the constructor</P>
     * <P>The newly created squad is then added into the squads array list</P>
     * <P>Skill objects for each player is created and added into the skill array lists </P>
     * <P>After Skill objects are created, Skill Category objects are created for each player and the corresponding skill lists are inserted into the skill category object</P>
     * <P>After the Skill Category objects are created, junior player objects are created</P>
     * <P>After the senior player objects are created, the skill categories are added to the player object</P>
     * <P>After the Skill Categories have been added to the player, their skill ratings are set</P>
     * <P>After the Skill Ratings have been assigned, the players are inserted into the corresponding player list - Senior</P>
     * <P>Finally the players are all inserted into players array list </P>
     */
    private static void prepopulateSeniorPlayers() {

        Squad seniorSquad = new Squad("Simply Lions", "Senior", 2000, 9, seniorPlayers);
        squads.add(seniorSquad);

        //================================================================================
        // Senior Player 1 - Skills - Passing
        //================================================================================

        Skill standard_S1 = new Skill("Standard", 1);
        Skill spin_S1 = new Skill("Spin", 1);
        Skill pop_S1 = new Skill("Pop", 1);
        passingList_S1.add(standard_S1);
        passingList_S1.add(spin_S1);
        passingList_S1.add(pop_S1);

        //================================================================================
        // Senior Player 1 - Skills - Tackling
        //================================================================================

        Skill front_S1 = new Skill("Front", 1);
        Skill rear_S1 = new Skill("Rear", 1);
        Skill side_S1 = new Skill("Side", 1);
        Skill scrabble_S1 = new Skill("Scrabble", 1);
        tackingList_S1.add(front_S1);
        tackingList_S1.add(rear_S1);
        tackingList_S1.add(side_S1);
        tackingList_S1.add(scrabble_S1);

        //================================================================================
        // Senior Player 1 - Skills - Kicking
        //================================================================================

        Skill drop_S1 = new Skill("Drop", 1);
        Skill punt_S1 = new Skill("Punt", 1);
        Skill grubber_S1 = new Skill("Grubber", 1);
        Skill goal_S1 = new Skill("Goal", 1);
        kickingList_S1.add(drop_S1);
        kickingList_S1.add(punt_S1);
        kickingList_S1.add(grubber_S1);
        kickingList_S1.add(goal_S1);

        //================================================================================
        // Senior Player 2 - Skills - Passing
        //================================================================================

        Skill standard_S2 = new Skill("Standard", 1);
        Skill spin_S2 = new Skill("Spin", 1);
        Skill pop_S2 = new Skill("Pop", 1);
        passingList_S2.add(standard_S2);
        passingList_S2.add(spin_S2);
        passingList_S2.add(pop_S2);

        //================================================================================
        // Senior Player 2 - Skills - Tackling
        //================================================================================

        Skill front_S2 = new Skill("Front", 1);
        Skill rear_S2 = new Skill("Rear", 1);
        Skill side_S2 = new Skill("Side", 1);
        Skill scrabble_S2 = new Skill("Scrabble", 1);
        tackingList_S2.add(front_S2);
        tackingList_S2.add(rear_S2);
        tackingList_S2.add(side_S2);
        tackingList_S2.add(scrabble_S2);

        //================================================================================
        // Senior Player 2 - Skills - Kicking
        //================================================================================

        Skill drop_S2 = new Skill("Drop", 1);
        Skill punt_S2 = new Skill("Punt", 1);
        Skill grubber_S2 = new Skill("Grubber", 1);
        Skill goal_S2 = new Skill("Goal", 1);
        kickingList_S2.add(drop_S2);
        kickingList_S2.add(punt_S2);
        kickingList_S2.add(grubber_S2);
        kickingList_S2.add(goal_S2);

        //================================================================================
        // Senior Player 3 - Skills - Passing
        //================================================================================

        Skill standard_S3 = new Skill("Standard", 1);
        Skill spin_S3 = new Skill("Spin", 1);
        Skill pop_S3 = new Skill("Pop", 1);
        passingList_S3.add(standard_S3);
        passingList_S3.add(spin_S3);
        passingList_S3.add(pop_S3);

        //================================================================================
        // Senior Player 3 - Skills - Tackling
        //================================================================================

        Skill front_S3 = new Skill("Front", 1);
        Skill rear_S3 = new Skill("Rear", 1);
        Skill side_S3 = new Skill("Side", 1);
        Skill scrabble_S3 = new Skill("Scrabble", 1);
        tackingList_S3.add(front_S3);
        tackingList_S3.add(rear_S3);
        tackingList_S3.add(side_S3);
        tackingList_S3.add(scrabble_S3);

        //================================================================================
        // Senior Player 3- Skills - Kicking
        //================================================================================

        Skill drop_S3 = new Skill("Drop", 1);
        Skill punt_S3 = new Skill("Punt", 1);
        Skill grubber_S3 = new Skill("Grubber", 1);
        Skill goal_S3 = new Skill("Goal", 1);
        kickingList_S3.add(drop_S3);
        kickingList_S3.add(punt_S3);
        kickingList_S3.add(grubber_S3);
        kickingList_S3.add(goal_S3);

        //================================================================================
        // Senior Player 4 - Skills - Passing
        //================================================================================

        Skill standard_S4 = new Skill("Standard", 1);
        Skill spin_S4 = new Skill("Spin", 1);
        Skill pop_S4 = new Skill("Pop", 1);
        passingList_S4.add(standard_S4);
        passingList_S4.add(spin_S4);
        passingList_S4.add(pop_S4);

        //================================================================================
        // Senior Player 4 - Skills - Tackling
        //================================================================================

        Skill front_S4 = new Skill("Front", 1);
        Skill rear_S4 = new Skill("Rear", 1);
        Skill side_S4 = new Skill("Side", 1);
        Skill scrabble_S4 = new Skill("Scrabble", 1);
        tackingList_S4.add(front_S4);
        tackingList_S4.add(rear_S4);
        tackingList_S4.add(side_S4);
        tackingList_S4.add(scrabble_S4);

        //================================================================================
        // Senior Player 4- Skills - Kicking
        //================================================================================

        Skill drop_S4 = new Skill("Drop", 1);
        Skill punt_S4 = new Skill("Punt", 1);
        Skill grubber_S4 = new Skill("Grubber", 1);
        Skill goal_S4 = new Skill("Goal", 1);
        kickingList_S4.add(drop_S4);
        kickingList_S4.add(punt_S4);
        kickingList_S4.add(grubber_S4);
        kickingList_S4.add(goal_S4);

        //================================================================================
        // Senior Player 5 - Skills - Passing
        //================================================================================

        Skill standard_S5 = new Skill("Standard", 1);
        Skill spin_S5 = new Skill("Spin", 1);
        Skill pop_S5 = new Skill("Pop", 1);
        passingList_S5.add(standard_S5);
        passingList_S5.add(spin_S5);
        passingList_S5.add(pop_S5);

        //================================================================================
        // Senior Player 5 - Skills - Tackling
        //================================================================================

        Skill front_S5 = new Skill("Front", 1);
        Skill rear_S5 = new Skill("Rear", 1);
        Skill side_S5 = new Skill("Side", 1);
        Skill scrabble_S5 = new Skill("Scrabble", 1);
        tackingList_S5.add(front_S5);
        tackingList_S5.add(rear_S5);
        tackingList_S5.add(side_S5);
        tackingList_S5.add(scrabble_S5);

        //================================================================================
        // Senior Player 5- Skills - Kicking
        //================================================================================

        Skill drop_S5 = new Skill("Drop", 1);
        Skill punt_S5 = new Skill("Punt", 1);
        Skill grubber_S5 = new Skill("Grubber", 1);
        Skill goal_S5 = new Skill("Goal", 1);
        kickingList_S5.add(drop_S5);
        kickingList_S5.add(punt_S5);
        kickingList_S5.add(grubber_S5);
        kickingList_S5.add(goal_S5);

        //================================================================================
        // Senior Player 6 - Skills - Passing
        //================================================================================

        Skill standard_S6 = new Skill("Standard", 1);
        Skill spin_S6 = new Skill("Spin", 1);
        Skill pop_S6 = new Skill("Pop", 1);
        passingList_S6.add(standard_S6);
        passingList_S6.add(spin_S6);
        passingList_S6.add(pop_S6);

        //================================================================================
        // Senior Player 6 - Skills - Tackling
        //================================================================================

        Skill front_S6 = new Skill("Front", 1);
        Skill rear_S6 = new Skill("Rear", 1);
        Skill side_S6 = new Skill("Side", 1);
        Skill scrabble_S6 = new Skill("Scrabble", 1);
        tackingList_S6.add(front_S6);
        tackingList_S6.add(rear_S6);
        tackingList_S6.add(side_S6);
        tackingList_S6.add(scrabble_S6);

        //================================================================================
        // Senior Player 6- Skills - Kicking
        //================================================================================

        Skill drop_S6 = new Skill("Drop", 1);
        Skill punt_S6 = new Skill("Punt", 1);
        Skill grubber_S6 = new Skill("Grubber", 1);
        Skill goal_S6 = new Skill("Goal", 1);
        kickingList_S6.add(drop_S6);
        kickingList_S6.add(punt_S6);
        kickingList_S6.add(grubber_S6);
        kickingList_S6.add(goal_S6);

        //================================================================================
        // Senior Player 7 - Skills - Passing
        //================================================================================

        Skill standard_S7 = new Skill("Standard", 1);
        Skill spin_S7 = new Skill("Spin", 1);
        Skill pop_S7 = new Skill("Pop", 1);
        passingList_S7.add(standard_S7);
        passingList_S7.add(spin_S7);
        passingList_S7.add(pop_S7);

        //================================================================================
        // Senior Player 7 - Skills - Tackling
        //================================================================================

        Skill front_S7 = new Skill("Front", 1);
        Skill rear_S7 = new Skill("Rear", 1);
        Skill side_S7 = new Skill("Side", 1);
        Skill scrabble_S7 = new Skill("Scrabble", 1);
        tackingList_S7.add(front_S7);
        tackingList_S7.add(rear_S7);
        tackingList_S7.add(side_S7);
        tackingList_S7.add(scrabble_S7);

        //================================================================================
        // Senior Player 7- Skills - Kicking
        //================================================================================

        Skill drop_S7 = new Skill("Drop", 1);
        Skill punt_S7 = new Skill("Punt", 1);
        Skill grubber_S7 = new Skill("Grubber", 1);
        Skill goal_S7 = new Skill("Goal", 1);
        kickingList_S7.add(drop_S7);
        kickingList_S7.add(punt_S7);
        kickingList_S7.add(grubber_S7);
        kickingList_S7.add(goal_S7);

        //================================================================================
        // Senior Player 8 - Skills - Passing
        //================================================================================

        Skill standard_S8 = new Skill("Standard", 1);
        Skill spin_S8 = new Skill("Spin", 1);
        Skill pop_S8 = new Skill("Pop", 1);
        passingList_S8.add(standard_S8);
        passingList_S8.add(spin_S8);
        passingList_S8.add(pop_S8);

        //================================================================================
        // Senior Player 8 - Skills - Tackling
        //================================================================================

        Skill front_S8 = new Skill("Front", 1);
        Skill rear_S8 = new Skill("Rear", 1);
        Skill side_S8 = new Skill("Side", 1);
        Skill scrabble_S8 = new Skill("Scrabble", 1);
        tackingList_S8.add(front_S8);
        tackingList_S8.add(rear_S8);
        tackingList_S8.add(side_S8);
        tackingList_S8.add(scrabble_S8);

        //================================================================================
        // Senior Player 8- Skills - Kicking
        //================================================================================

        Skill drop_S8 = new Skill("Drop", 1);
        Skill punt_S8 = new Skill("Punt", 1);
        Skill grubber_S8 = new Skill("Grubber", 1);
        Skill goal_S8 = new Skill("Goal", 1);
        kickingList_S8.add(drop_S8);
        kickingList_S8.add(punt_S8);
        kickingList_S8.add(grubber_S8);
        kickingList_S8.add(goal_S8);

        //================================================================================
        // Senior Player 9 - Skills - Passing
        //================================================================================

        Skill standard_S9 = new Skill("Standard", 1);
        Skill spin_S9 = new Skill("Spin", 1);
        Skill pop_S9 = new Skill("Pop", 1);
        passingList_S9.add(standard_S9);
        passingList_S9.add(spin_S9);
        passingList_S9.add(pop_S9);

        //================================================================================
        // Senior Player 9 - Skills - Tackling
        //================================================================================

        Skill front_S9 = new Skill("Front", 1);
        Skill rear_S9 = new Skill("Rear", 1);
        Skill side_S9 = new Skill("Side", 1);
        Skill scrabble_S9 = new Skill("Scrabble", 1);
        tackingList_S9.add(front_S9);
        tackingList_S9.add(rear_S9);
        tackingList_S9.add(side_S9);
        tackingList_S9.add(scrabble_S9);

        //================================================================================
        // Senior Player 9- Skills - Kicking
        //================================================================================

        Skill drop_S9 = new Skill("Drop", 1);
        Skill punt_S9 = new Skill("Punt", 1);
        Skill grubber_S9 = new Skill("Grubber", 1);
        Skill goal_S9 = new Skill("Goal", 1);
        kickingList_S9.add(drop_S9);
        kickingList_S9.add(punt_S9);
        kickingList_S9.add(grubber_S9);
        kickingList_S9.add(goal_S9);

        //================================================================================
        // Senior Player 10 - Skills - Passing
        //================================================================================

        Skill standard_S10 = new Skill("Standard", 1);
        Skill spin_S10 = new Skill("Spin", 1);
        Skill pop_S10 = new Skill("Pop", 1);
        passingList_S10.add(standard_S10);
        passingList_S10.add(spin_S10);
        passingList_S10.add(pop_S10);

        //================================================================================
        // Senior Player 10 - Skills - Tackling
        //================================================================================

        Skill front_S10 = new Skill("Front", 1);
        Skill rear_S10 = new Skill("Rear", 1);
        Skill side_S10 = new Skill("Side", 1);
        Skill scrabble_S10 = new Skill("Scrabble", 1);
        tackingList_S10.add(front_S10);
        tackingList_S10.add(rear_S10);
        tackingList_S10.add(side_S10);
        tackingList_S10.add(scrabble_S10);

        //================================================================================
        // Senior Player 10- Skills - Kicking
        //================================================================================

        Skill drop_S10 = new Skill("Drop", 1);
        Skill punt_S10 = new Skill("Punt", 1);
        Skill grubber_S10 = new Skill("Grubber", 1);
        Skill goal_S10 = new Skill("Goal", 1);
        kickingList_S10.add(drop_S10);
        kickingList_S10.add(punt_S10);
        kickingList_S10.add(grubber_S10);
        kickingList_S10.add(goal_S10);

        //================================================================================
        // Skill Categories - Passing
        //================================================================================
        SkillCategory passing_S1 = new SkillCategory("Passing", "", passingList_S1);
        SkillCategory passing_S2 = new SkillCategory("Passing", "", passingList_S2);
        SkillCategory passing_S3 = new SkillCategory("Passing", "", passingList_S3);
        SkillCategory passing_S4 = new SkillCategory("Passing", "", passingList_S4);
        SkillCategory passing_S5 = new SkillCategory("Passing", "", passingList_S5);
        SkillCategory passing_S6 = new SkillCategory("Passing", "", passingList_S6);
        SkillCategory passing_S7 = new SkillCategory("Passing", "", passingList_S7);
        SkillCategory passing_S8 = new SkillCategory("Passing", "", passingList_S8);
        SkillCategory passing_S9 = new SkillCategory("Passing", "", passingList_S9);
        SkillCategory passing_S10 = new SkillCategory("Passing", "", passingList_S10);
        //================================================================================
        // Skill Categories - Tackling
        //================================================================================
        SkillCategory tackling_S1 = new SkillCategory("Tackling", "", tackingList_S1);
        SkillCategory tackling_S2 = new SkillCategory("Tackling", "", tackingList_S2);
        SkillCategory tackling_S3 = new SkillCategory("Tackling", "", tackingList_S3);
        SkillCategory tackling_S4 = new SkillCategory("Tackling", "", tackingList_S4);
        SkillCategory tackling_S5 = new SkillCategory("Tackling", "", tackingList_S5);
        SkillCategory tackling_S6 = new SkillCategory("Tackling", "", tackingList_S6);
        SkillCategory tackling_S7 = new SkillCategory("Tackling", "", tackingList_S7);
        SkillCategory tackling_S8 = new SkillCategory("Tackling", "", tackingList_S8);
        SkillCategory tackling_S9 = new SkillCategory("Tackling", "", tackingList_S9);
        SkillCategory tackling_S10 = new SkillCategory("Tackling", "", tackingList_S10);

        //================================================================================
        // Skill Categories - Kicking
        //================================================================================
        SkillCategory kicking_S1 = new SkillCategory("Kicking", "", kickingList_S1);
        SkillCategory kicking_S2 = new SkillCategory("Kicking", "", kickingList_S2);
        SkillCategory kicking_S3 = new SkillCategory("Kicking", "", kickingList_S3);
        SkillCategory kicking_S4 = new SkillCategory("Kicking", "", kickingList_S4);
        SkillCategory kicking_S5 = new SkillCategory("Kicking", "", kickingList_S5);
        SkillCategory kicking_S6 = new SkillCategory("Kicking", "", kickingList_S6);
        SkillCategory kicking_S7 = new SkillCategory("Kicking", "", kickingList_S7);
        SkillCategory kicking_S8 = new SkillCategory("Kicking", "", kickingList_S8);
        SkillCategory kicking_S9 = new SkillCategory("Kicking", "", kickingList_S9);
        SkillCategory kicking_S10 = new SkillCategory("Kicking", "", kickingList_S10);

        //================================================================================
        // New Senior Player Objects
        //================================================================================

        SeniorPlayer seniorPlayer01 = new SeniorPlayer(2000, "Zeus", "Kronos", "20/06/1995", "29 Olympia Lane", "KY9GOD", "070 6238 8952", "077 2932 1293", "GC6Q-3QJM-YX3X-APAA",
                "Zeus@mail.com", "Full-Back", "Dr Smith", "083 2934 3292", "None", "Senior", "Hera", "078 5760 6533");

        SeniorPlayer seniorPlayer02 = new SeniorPlayer(2100, "Thor", "Odinson", "12/12/1989", "14 Valhalla Drive", "KY1THU", "077 1307 0087", "078 0846 4908", "RL6N-J457-Y7FR-Y86N",
                "Thor@mail.com", "Wing", "Dr Weltweiter ", "070 0677 8907", "None", "Senior", "Sif", "078 1201 1239");

        SeniorPlayer seniorPlayer03 = new SeniorPlayer(2200, "Loki", "Laufeyson", "05/02/1997", "88 Regensburg Street", "KY4JOK", "073 3842 2943", "079 5623 9018", "ZD5N-KZWG-YQ43-ZA2X",
                "Loki@mail.com", "Centre", "Dr Hudson", "077 0522 5465", "None", "Senior", "Sigyn", "077 1715 7312");

        SeniorPlayer seniorPlayer04 = new SeniorPlayer(2300, "Odin", "Burrson", "31/09/1992", "29 Valhalla Ave", "KY8GOD", "078 2206 6526", "079 8536 9137", "WDJ9-BQCN-Z5XP-AKWA",
                "Odin@mail.com", "Fly-Half", "Dr Roosevelt", "077 0491 6821", "None", "Senior", "Frigg", "078 2849 5051");

        SeniorPlayer seniorPlayer05 = new SeniorPlayer(2400, "Hades", "Kronos", "10/12/1996", "66 Hades Fire", "KY2HEL", "078 3567 8000", "077 8508 4961", "H45W-76U2-JMNC-FPGF",
                "Hades@mail.com", "Scrum-Half", "Dr Tojo", "079 1713 3930", "None", "Senior", "Persephone", "079 1815 5836");

        SeniorPlayer seniorPlayer06 = new SeniorPlayer(2500, "Apollo", "Zeusson", "12/08/1990", "37 Medic Road", "KY3HEA", "079 6463 5155", "077 4569 3256", "62GR-LQAU-LLXH-MVN7",
                "Apollo@mail.com", "Hooker", "Dr Churchill", "078 6037 5073", "None", "Senior", "Kleopatra", "078 8776 3608");

        SeniorPlayer seniorPlayer07 = new SeniorPlayer(2600, "Dionysus", "Semele", "12/04/1983", "10 Wine River", "KY7 WIN", "077 1229 4822", "070 5743 4763", "7EPU-97RY-H279-BTSQ",
                "Dionsyus@mail.com", "Prop", "Dr Mussolini", "077 1761 1846", "None", "Senior", "Ariadne", "078 1153 1377");

        SeniorPlayer seniorPlayer08 = new SeniorPlayer(2700, "Poseidon", "Hawaii", "24/03/1991", "13 Paradise Falls", "KY1WAT", "070 4092 2091", "078 0794 3921", "5RXN-J7ZJ-KSVK-GMLK",
                "Poseidon@mail.com", "2nd-Row", "Dr Hirohito", "077 2898 0236", "None", "Senior", "Amphitrite", "079 0364 5571");

        SeniorPlayer seniorPlayer09 = new SeniorPlayer(2800, "Thanatos", "Reaper", "23/10/1993", "01 Bloodbath Valkyrie", "KY9DEA", "077 5470 3505", "078 7531 1591", "F6GU-6TWF-G83E-2RAB",
                "Thanatos@mail.com", "Back-Row", "Dr Flanders", "078 8852 7189", "None", "Senior", "Izanami", "070 3632 5187");

        SeniorPlayer seniorPlayer10 = new SeniorPlayer(2900, "Kratos", "Zeusson", "25/12/900", "01 Sparta Valley", "KY6WAR", "898 0987 9790", "767 8980 7896", "H38J-9I32-930K-03KS",
                "Kratos@mail.com", "Full-Back", "Dr Ares", "078 8852 7189", "None", "Senior", "Atlanta", "767 8980 7896");

        //================================================================================
        // Add Skill Categories to Players and Set Skill Default Skill Ratings
        //================================================================================

        seniorPlayer01.getSkillCategories().add(passing_S1);
        seniorPlayer01.getSkillCategories().add(tackling_S1);
        seniorPlayer01.getSkillCategories().add(kicking_S1);
        seniorPlayer01.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer01.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer01);

        seniorPlayer02.getSkillCategories().add(passing_S2);
        seniorPlayer02.getSkillCategories().add(tackling_S2);
        seniorPlayer02.getSkillCategories().add(kicking_S2);
        seniorPlayer02.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer02.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer02);

        seniorPlayer03.getSkillCategories().add(passing_S3);
        seniorPlayer03.getSkillCategories().add(tackling_S3);
        seniorPlayer03.getSkillCategories().add(kicking_S3);
        seniorPlayer03.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer03.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer03);

        seniorPlayer04.getSkillCategories().add(passing_S4);
        seniorPlayer04.getSkillCategories().add(tackling_S4);
        seniorPlayer04.getSkillCategories().add(kicking_S4);
        seniorPlayer04.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer04.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer04);

        seniorPlayer05.getSkillCategories().add(passing_S5);
        seniorPlayer05.getSkillCategories().add(tackling_S5);
        seniorPlayer05.getSkillCategories().add(kicking_S5);
        seniorPlayer05.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer05.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer05);

        seniorPlayer06.getSkillCategories().add(passing_S6);
        seniorPlayer06.getSkillCategories().add(tackling_S6);
        seniorPlayer06.getSkillCategories().add(kicking_S6);
        seniorPlayer06.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer06.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer06);

        seniorPlayer07.getSkillCategories().add(passing_S7);
        seniorPlayer07.getSkillCategories().add(tackling_S7);
        seniorPlayer07.getSkillCategories().add(kicking_S7);
        seniorPlayer07.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer07.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer07);

        seniorPlayer08.getSkillCategories().add(passing_S8);
        seniorPlayer08.getSkillCategories().add(tackling_S8);
        seniorPlayer08.getSkillCategories().add(kicking_S8);
        seniorPlayer08.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer08.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer08);

        seniorPlayer09.getSkillCategories().add(passing_S9);
        seniorPlayer09.getSkillCategories().add(tackling_S9);
        seniorPlayer09.getSkillCategories().add(kicking_S9);
        seniorPlayer09.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Passing").getSkill("Spin").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Passing").getSkill("Pop").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Tackling").getSkill("Front").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Tackling").getSkill("Side").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(1);
        seniorPlayer09.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(1);
        seniorSquad.addPlayer(seniorPlayer09);

        seniorPlayer10.getSkillCategories().add(passing_S10);
        seniorPlayer10.getSkillCategories().add(tackling_S10);
        seniorPlayer10.getSkillCategories().add(kicking_S10);
        seniorPlayer10.getSkillCategory("Passing").getSkill("Standard").setSkillRating(1);
        seniorPlayer10.getSkillCategory("Passing").getSkill("Spin").setSkillRating(4);
        seniorPlayer10.getSkillCategory("Passing").getSkill("Pop").setSkillRating(5);
        seniorPlayer10.getSkillCategory("Tackling").getSkill("Front").setSkillRating(2);
        seniorPlayer10.getSkillCategory("Tackling").getSkill("Rear").setSkillRating(3);
        seniorPlayer10.getSkillCategory("Tackling").getSkill("Side").setSkillRating(5);
        seniorPlayer10.getSkillCategory("Tackling").getSkill("Scrabble").setSkillRating(4);
        seniorPlayer10.getSkillCategory("Kicking").getSkill("Drop").setSkillRating(2);
        seniorPlayer10.getSkillCategory("Kicking").getSkill("Punt").setSkillRating(3);
        seniorPlayer10.getSkillCategory("Kicking").getSkill("Grubber").setSkillRating(3);
        seniorPlayer10.getSkillCategory("Kicking").getSkill("Goal").setSkillRating(4);

        players.add(seniorPlayer01);
        players.add(seniorPlayer02);
        players.add(seniorPlayer03);
        players.add(seniorPlayer04);
        players.add(seniorPlayer05);
        players.add(seniorPlayer06);
        players.add(seniorPlayer07);
        players.add(seniorPlayer08);
        players.add(seniorPlayer09);
        players.add(seniorPlayer10);
    }

    /**
     * Horizontial position offset
     */
    private double xOffset = 0;
    /**
     * Length position offset
     */
    private double yOffset = 0;


    /**
     * Starts the program
     * <P>Sets a new date format and localises time for UK</P>
     * <P>Get's current time</P>
     * <P>Prints out time the program starts</P>
     * <P>Executes prepopulation methods and prints out the time it took to prepopulate objects</P>
     * <P>Loads Scene</P>
     * <P>Sends user to login screen</P>
     * <P> MISC - Sets X and Y offets to allow the user to move the scene around without a decorated stage</P>
     * <P> Sends prepopulated data to arraylists in other scenes/classes</P>
     * @param primaryStage Sets the primary stage and sends user to login screen
     * @throws Exception When parent root is loaded
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", Locale.UK);
        LocalDateTime now = LocalDateTime.now();
        out.println("Execution Date: " + dateTimeFormatter.format(now));

        out.println("Prepopulate objects....");
        long startTime = System.currentTimeMillis();
        prepopulateJuniorPlayers();
        prepopulateSeniorPlayers();
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        out.println(duration + "ms");
        out.println("Done.");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXMLs/Login.fxml"));
        Parent root = loader.load();

        primaryStage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
        });

        Login passSquads = (Login) loader.getController();
        Login passPlayers = (Login) loader.getController();
        Login passJuniorPlayers = (Login) loader.getController();
        Login passSeniorPlayers = (Login) loader.getController();
        passSquads.getSquads(squads);
        passPlayers.getPlayers(players);
        passSeniorPlayers.getSeniorPlayers(seniorPlayers);
        passJuniorPlayers.getJuniorPlayers(juniorPlayers);
        primaryStage.setScene(new Scene(root, 1280, 680));
        primaryStage.show();
    }

    /**
     * Launches the program
     * @param args Name of array
     */
    public static void main(String[] args) {
        launch(args);
    }
}
