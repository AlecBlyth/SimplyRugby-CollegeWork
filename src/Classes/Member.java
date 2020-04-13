package Classes;

/**
 * Member Object
 * <p>
 * Superclass of Player class
 * <p>
 * Members have various basic profile that has attributes all member types will have
 *
 * @author Alec Blyth
 * @version 1.0
 */
public class Member {

    /**
     * First name of the member
     */
    private String firstName;
    /**
     * Surname of the member
     */
    private String surName;
    /**
     * The date of birth of the member
     */
    private String birthDate;
    /**
     * The home address of the member
     */
    private String address;
    /**
     * Postal code of the member
     */
    private String postCode;
    /**
     * Telephone number of the member
     */
    private String telephoneNumber;
    /**
     * Mobile phone number of the member
     */
    private String mobileNumber;
    /**
     * SRU Number of the member
     */
    private String sruNumber;
    /**
     * Email address of the member
     */
    private String emailAddress;
    /**
     * ID of the Member
     */
    private int id;

    /**
     * Member Constructor
     *
     * @param id              (Required) Used to identify each member object inside the system
     * @param firstName       (Required) First name of the member
     * @param surName         (Required) Surname of the member
     * @param birthDate       (Required) Date of birth of the member
     * @param address         (Required) Home Address of the member
     * @param postCode        (Required) Postal address of the member
     * @param telephoneNumber (Required) Landline number of the member
     * @param mobileNumber    (Optional) Mobile number of member. This is optional as a member may or may not have a mobile phone number
     * @param sruNumber       (Required) SRU Number for insurance coverage
     * @param emailAddress    (Optional) Email address of member. This is optional as a member may or may not have an email address
     */
    Member(int id, String firstName, String surName, String birthDate, String address, String postCode, String telephoneNumber, String mobileNumber, String sruNumber, String emailAddress) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthDate = birthDate;
        this.address = address;
        this.postCode = postCode;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.sruNumber = sruNumber;
        this.emailAddress = emailAddress;
        this.id = id;
    }

    /**
     * Gets the ID of the member object
     *
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * Gets the first name of the member
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the surname of the member
     *
     * @return surName
     */
    public String getSurName() {
        return surName;
    }
}
