import java.util.*;

class Player extends Character{
    private ArrayList<Equipment> equipment;
    private String playerClass;
    /* Possible player classes:
     * "warrior", "magician",
     * "rogue", "gunslinger"*/
    // TODO: private ArrayList<Skills> skills;

    public void setPlayerClass(String playerClass) {
        this.playerClass = new String(playerClass);
    }
} 
