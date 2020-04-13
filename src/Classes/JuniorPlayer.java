package Classes;

/**
 * Junior Player Object
 * <p>
 * Inherits attributes from Player and Member Classes
 * </P>
 * <p>
 * Junior players have various contact information that allow for additional emergency contact.
 *
 * @author Alec Blyth
 * @version 1.0
 */

public class JuniorPlayer extends Player {
    /**
     * Name of the first guardian
     */
    private String guardianOneName;
    /**
     * Address of the first guardian
     */
    private String guardianOneAddress;
    /**
     * Contact number of the first guardian
     */
    private String guardianOneContactNumber;
    /**
     * The relationship the first guardian has to the junior player
     */
    private String guardianOneRelationship;
    /**
     * Name of the second guardian
     */
    private String guardianTwoName;
    /**
     * Address of the second guardian
     */
    private String guardianTwoAddress;
    /**
     * Contact number of the second guardian
     */
    private String guardianTwoContactNumber;
    /**
     * The relationship the second guardian has to the junior player
     */
    private String guardianTwoRelationship;
    /**
     * Address of the player's doctor
     */
    private String doctorAddress;

    /**
     * JuniorPlayer Constructor
     *
     * @param id                       (Required) Identification of the player and used to compare and select the correct player. Inherited from the member class
     * @param firstName                (Required) Player's first-name. Inherited from member class
     * @param surName                  (Required) Player's surname. Inherited from member class
     * @param birthDate                (Required) Player's date of birth. Inherited from member class
     * @param address                  (Required) Player's home address. Inherited from member class
     * @param postCode                 (Required) Player's home postal code. Inherited from member class
     * @param telePhone                (Required) Player's telephone number. Inherited from member class. This is usually the same number as the guardian number for the junior player
     * @param mobileNum                (Optional) Player’s contact number for cellular device. Player may or may not have a mobile phone so this is optional. Inherited from member class
     * @param sruNumber                (Required) Player's SRU Number for insurance. Inherited from member class
     * @param emailAddress             (Optional) Player’s contact email address. Player may or may not have an email address. Inherited from member class
     * @param fieldPosition            (Required) Player's field position. Inherited from player class
     * @param playerType               (Required) Player's player type. Ensures no junior player is inside a senior squad and vice versa. Inherited from player class
     * @param guardianOneName          (Required) The full name of the first guardian of the junior player.
     * @param guardianOneAddress       (Required) The home address of the first guardian of the junior player.
     * @param guardianOneContactNumber (Required) The contact number of the first guardian of the junior player.
     * @param guardianOneRelationship  (Required) The relationship between the junior player and the guardian
     * @param guardianTwoName          (Optional) The full name of the second guardian of the junior player. This is optional as the player may only have one guardian
     * @param guardianTwoAddress       (Optional) The home address of the second guardian of the junior player. This is optional as the player may only have one guardian, however it becomes required if the player has a second guardian.
     * @param guardianTwoContactNumber (Optional) The contact number of the second guardian of the junior player. This is optional as the player may only have one guardian, however it becomes required if the player has a second guardian.
     * @param guardianTwoRelationship  (Optional) The relationship between the junior player and the guardian. This is optional as the player may only have one guardian, however it becomes required if the player has a second guardian.
     * @param doctorName               (Required) The full name of the doctor assigned the the player. Inherited from player class
     * @param doctorPhoneNumber        (Required) The contact number of the doctor assigned the the player. Inherited from player class
     * @param knownHealthIssues        (Optional) Medical information pertaining to the player. Inherited from player class. This is optional as the player may have no known health issues.
     * @param doctorAddress            (Required) The address of the junior player's doctor.
     */
    public JuniorPlayer(int id, String firstName, String surName, String birthDate, String address, String postCode, String telePhone, String mobileNum, String sruNumber, String emailAddress, String fieldPosition, String playerType,
                        String guardianOneName, String guardianOneAddress, String guardianOneContactNumber, String guardianOneRelationship,
                        String guardianTwoName, String guardianTwoAddress, String guardianTwoContactNumber, String guardianTwoRelationship,
                        String doctorName, String doctorPhoneNumber, String knownHealthIssues, String doctorAddress) {
        super(id, firstName, surName, birthDate, address, postCode, telePhone, mobileNum, sruNumber, emailAddress, fieldPosition, doctorName, doctorPhoneNumber, knownHealthIssues, playerType);

        this.guardianOneName = guardianOneName;
        this.guardianOneAddress = guardianOneAddress;
        this.guardianOneContactNumber = guardianOneContactNumber;
        this.guardianOneRelationship = guardianOneRelationship;
        this.guardianTwoName = guardianTwoName;
        this.guardianTwoAddress = guardianTwoAddress;
        this.guardianTwoContactNumber = guardianTwoContactNumber;
        this.guardianTwoRelationship = guardianTwoRelationship;
        this.doctorAddress = doctorAddress;
    }
}