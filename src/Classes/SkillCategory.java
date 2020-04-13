package Classes;

import java.util.ArrayList;

/**
 * Skill Category Object
 * <p>
 * Skill Categories have a name and a list of skills assigned to them
 *
 * @author Alec Blyth
 * @version 1.0
 */
public class SkillCategory {

    /**
     * Name of the Skill Category
     */
    private String skillCategory;
    /**
     * Skill Category notes.
     */
    private String skillNotes;
    /**
     * List of skills
     */
    private ArrayList<Skill> skills;
    /**
     * Skill object
     */
    private Skill skill;

    /**
     * Skill Category Constructor
     *
     * @param skillCategory (Required) Skill Category name, used to identify skill category
     * @param skillNotes    (Optional) SKill Category notes. Is optional as the coach may or may not want to add notes.
     * @param skills        (Required) List of skills assigned to the skill category.
     */
    public SkillCategory(String skillCategory, String skillNotes, ArrayList<Skill> skills) {
        this.skillCategory = skillCategory;
        this.skillNotes = skillNotes;
        this.skills = skills;
    }

    /**
     * Gets Skill Category name
     *
     * @return skillCategory
     */
    public String getSkillCategory() {
        return skillCategory;
    }

    /**
     * Gets skill category notes
     *
     * @return skillNotes
     */
    public String getSkillNotes() {
        return skillNotes;
    }

    /**
     * Sets skill notes
     *
     * @param skillNotes This is used to set the previous skill notes and adds new skill notes based on the skillNotes string, this can be an empty string
     */
    public void setSkillNotes(String skillNotes) {
        this.skillNotes = skillNotes;
    }

    /**
     * Gets skill based on the name of the skill
     *
     * @param skillName This is used to get the skill based on the skillName input
     *                  <p>The skill is found inside the skill array list and if the skillName string is equal to the skillName found in the array then skill object is equal to that skill object</p>
     * @return skill <tt>Only after a skill is found</tt>
     */
    public Skill getSkill(String skillName) {
        for (Skill aSkill : skills) {
            if (skillName.equals(aSkill.getSkillName())) {
                skill = aSkill;
            }
        }
        return skill;
    }
}
