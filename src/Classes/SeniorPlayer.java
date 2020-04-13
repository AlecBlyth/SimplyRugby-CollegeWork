package Classes;


/**
 * Senior Player Object
 * <p>
 * Inherits attributes from Player and Member Classes
 * <p>
 * Senior Players have one more contact info that allow for additional emergency contact.
 *
 * @author Alec Blyth
 * @version 1.0
 */
public class SeniorPlayer extends Player {

    /**
     * Full Name of the next of kin
     */
    private String nextOfKinName;
    /**
     * Contact number of the next of kin
     */
    private String nextOfKinContactNumber;

    /**
     * Senior Player Constructor
     *
     * @param id                     (Required) Identification of the player and used to compare and select the correct player. Inherited from the member class
     * @param firstName              (Required) Player's first-name. Inherited from member class
     * @param surName                (Required) Player's surname. Inherited from member class
     * @param birthDate              (Required) Player's date of birth. Inherited from member class
     * @param address                (Required) Player's home address. Inherited from member class
     * @param postCode               (Required) Player's home postal code. Inherited from member class
     * @param telePhone              (Required) Player's telephone number. Inherited from member class.
     * @param mobileNum              (Optional) Player’s contact number for cellular device. Player may or may not have a mobile phone so this is optional. Inherited from member class
     * @param sruNumber              (Required) Player's SRU Number for insurance. Inherited from member class
     * @param emailAddress           (Optional) Player’s contact email address. Player may or may not have an email address. Inherited from member class
     * @param fieldPosition          (Required) Player's field position. Inherited from player class
     * @param doctorName             (Required) The full name of the doctor assigned the the player. Inherited from player class
     * @param doctorPhoneNumber      (Required) The contact number of the doctor assigned the the player. Inherited from player class
     * @param knownHealthIssues      (Optional) Medical information pertaining to the player. Inherited from player class. This is optional as the player may have no known health issues.
     * @param playerType             (Required) Player's player type. Ensures no senior player is inside a junior squad and vice versa. Inherited from player class
     * @param nextOfKinName          (Required) Player's next of kin's name
     * @param nextOfKinContactNumber (Required) Player's next of kin's contact number
     */
    public SeniorPlayer(int id, String firstName, String surName, String birthDate, String address, String postCode, String telePhone, String mobileNum, String sruNumber, String emailAddress, String fieldPosition, String doctorName, String doctorPhoneNumber, String knownHealthIssues, String playerType,
                        String nextOfKinName, String nextOfKinContactNumber) {
        super(id, firstName, surName, birthDate, address, postCode, telePhone, mobileNum, sruNumber, emailAddress, fieldPosition, doctorName, doctorPhoneNumber, knownHealthIssues, playerType);

        this.nextOfKinName = nextOfKinName;
        this.nextOfKinContactNumber = nextOfKinContactNumber;
    }
}
