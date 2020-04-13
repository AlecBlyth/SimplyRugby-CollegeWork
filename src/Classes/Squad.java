package Classes;

import java.util.ArrayList;

/**
 * Squad Object
 * <p>
 * Squad objects have a name and a list of players inside them
 *
 * @author Alec Blyth
 * @version 1.0
 */
public class Squad {

    /**
     * Name of Squad
     */
    private String squadName;
    /**
     * Squad ID
     */
    private int squadID;
    /**
     * Squad Type
     */
    private String squadType;
    /**
     * Player count of the squad
     */
    private int playerCount;
    /**
     * List of players
     */
    private ArrayList<Player> playerList;

    /**
     * Squad Constructor
     *
     * @param squadName   (Required) Used to identify the squad
     * @param squadType   (Required) Used to only allow specific player types into the squad based on Junior or Senior strings
     * @param squadID     (Required) Used to find and select a squad
     * @param playerCount (Optional) Used to inform coach of the number of players in the squad
     * @param playerList  (Required) Contains a list of players inside the squad object
     */
    public Squad(String squadName, String squadType, int squadID, int playerCount, ArrayList<Player> playerList) {
        this.squadName = squadName;
        this.squadType = squadType;
        this.squadID = squadID;
        this.playerCount = playerCount;
        this.playerList = playerList;
    }

    /**
     * Gets the name of the squad
     *
     * @return squadName
     */
    public String getSquadName() {
        return squadName;
    }

    /**
     * Gets squad ID
     *
     * @return squadID
     */
    public int getSquadID() {
        return squadID;
    }

    /**
     * Gets squad type
     *
     * @return squadType
     */
    public String getSquadType() {
        return squadType;
    }

    /**
     * Gets number of players inside the squad
     *
     * @return playerCount
     */
    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Sets player count after player is added to squad
     *
     * @param playerCount This has the value of current player count plus one, it is used to set the old player count to the new player count
     */
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    /**
     * Adds player object into the squad
     *
     * @param player This is the player object that is added to the players array list
     */
    public void addPlayer(Player player) {
        playerList.add(player);
    }

    /**
     * Gets all of the players currently in the squad object
     *
     * @return playerList
     */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }
}

