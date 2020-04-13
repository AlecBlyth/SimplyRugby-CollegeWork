package Classes;

/**
 * Skill Object
 * <p>
 * Skills have various ratings based on the skill name
 *
 * @author Alec Blyth
 * @version 1.0
 */

public class Skill {
    /**
     * Name of Skill
     */
    private String skillName;
    /**
     * Skill rating of skill. Must only have a value between 1-5
     */
    private int skillRating;

    /**
     * Skill Constructor
     *
     * @param skillName   (Required) Used to accurately identify skill
     * @param skillRating (Required) Used to assign skill rating for skill based on it's name. This can only be a rating of 1 to 5.
     */
    public Skill(String skillName, int skillRating) {
        this.skillName = skillName;
        this.skillRating = skillRating;
    }


    /**
     * Gets skill rating
     *
     * @return skillRating
     */
    public int getSkillRating() {
        return skillRating;
    }

    /**
     * Gets skill name
     *
     * @return skillName
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * Sets skill rating for the specific skill object.
     *
     * @param skillRating Gets input from system/user and assigns new skill rating based on this variable. Can only be a value of 1 to 5
     */
    public void setSkillRating(int skillRating) {
        this.skillRating = skillRating;
    }
}
