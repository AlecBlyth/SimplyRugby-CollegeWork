package Classes;

import java.util.ArrayList;

/**
 * Player Object
 * <p>
 * Inherits from Member class, is the superclass of both JuniorPlayer and SeniorPlayer classes respectively
 * <p>
 * Players have unique attributes that only player member types will have
 *
 * @author Alec Blyth
 * @version 1.0
 */

public class Player extends Member {

    /**
     * Type of player based on age. Only two types, Junior and Senior
     */
    private String playerType;
    /**
     * Field position of the player
     */
    private String fieldPosition;
    /**
     * Player's doctor's name
     */
    private String doctorName;
    /**
     * Phone number of the doctor
     */
    private String doctorPhoneNumber;
    /**
     * Known health issues of the player
     */
    private String knownHealthIssues;
    /**
     * Skill Category object that contains a list of skills
     */
    private SkillCategory skillCategory;
    /**
     * List of skill categories objects
     */
    private ArrayList<SkillCategory> skillCategories;

    /**
     * Player Constructor
     *
     * @param id                (Required) Identification of the player and used to compare and select the correct player. Inherited from the member class
     * @param firstName         (Required) Player's first-name. Inherited from member class
     * @param surName           (Required) Player's surname. Inherited from member class
     * @param birthDate         (Required) Player's date of birth. Inherited from member class
     * @param address           (Required) Player's home address. Inherited from member class
     * @param postCode          (Required) Player's home postal code. Inherited from member class
     * @param telePhone         (Required) Player's telephone number. Inherited from member class.
     * @param mobileNum         (Optional) Player’s contact number for cellular device. Player may or may not have a mobile phone so this is optional. Inherited from member class
     * @param sruNumber         (Required) Player's SRU Number for insurance. Inherited from member class
     * @param emailAddress      (Optional) Player’s contact email address. Player may or may not have an email address. Inherited from member class
     * @param fieldPosition     (Required) Player's field position.
     * @param doctorName        (Required) The full name of the doctor assigned the the player.
     * @param doctorPhoneNumber (Required) The contact number of the doctor assigned the the player.
     * @param knownHealthIssues (Optional) Medical information pertaining to the player. This is optional as the player may have no known health issues.
     * @param playerType        (Required) Player's player type. Ensures no junior player is inside a senior squad and vice versa.
     */
    Player(int id, String firstName, String surName, String birthDate, String address, String postCode, String telePhone, String mobileNum, String sruNumber, String emailAddress,
           String fieldPosition, String doctorName, String doctorPhoneNumber, String knownHealthIssues, String playerType) {
        super(id, firstName, surName, birthDate, address, postCode, telePhone, mobileNum, sruNumber, emailAddress);
        this.playerType = playerType;
        this.fieldPosition = fieldPosition;
        this.doctorName = doctorName;
        this.doctorPhoneNumber = doctorPhoneNumber;
        this.knownHealthIssues = knownHealthIssues;
        this.skillCategories = new ArrayList<>();
    }

    /**
     * Gets Skill Category based on the skill category object's name
     * Loops through the list of skill categories and if the skillCategoryName string is found inside the array then
     * skillCategory is equal to that aSkillCategory object.
     * The method then returns skillCategory
     *
     * @param skillCategoryName In order to find skillCategory the system/user must use a string with the name of the skillCategory they're looking for.
     * @return <tt>skillCategory</tt> Only if a skillCategory is found
     */
    public SkillCategory getSkillCategory(String skillCategoryName) {
        for (SkillCategory aSkillCategory : skillCategories) {
            if (skillCategoryName.equals(aSkillCategory.getSkillCategory())) {
                skillCategory = aSkillCategory;
            }
        }
        return skillCategory;
    }

    /**
     * Gets all skillCategories found in the arraylist, used to prepopulate skillCategories for player
     *
     * @return skillCategories
     */
    public ArrayList<SkillCategory> getSkillCategories() {
        return skillCategories;
    }

    /**
     * Gets player type of the player object. Used to ensure no senior or junior player is in the wrong squad type
     *
     * @return playerType
     */
    public String getPlayerType() {
        return playerType;
    }

    /**
     * Gets player's field position
     *
     * @return fieldPosition
     */
    public String getFieldPosition() {
        return fieldPosition;
    }
}