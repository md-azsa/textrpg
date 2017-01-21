import java.util.*;

class Player extends Character{
    private ArrayList<Equipment> equipment;
    private Weapon weapon;
    private String playerClass;
    /* Possible player classes:
     * "warrior", "magician",
     * "rogue", "gunslinger"*/
    // TODO: private ArrayList<Skills> skills;

    public Player(String name, int hp, int mp, int atk, int def, String playerClass) {
        setName(name);
        setHp(hp);
        setMp(mp);
        setAtk(atk);
        setDef(def);
        setPlayerClass(playerClass);
    }
    public void setPlayerClass(String playerClass) {
        this.playerClass = new String(playerClass);
    }

    public void setWeapon(Weapon wep) {
        this.weapon = new Weapon(wep.getQuality(), wep.getAtk(), wep.getDef(),
                wep.getDurability());
        this.setAtk(wep.getAtk());
        this.setDef(wep.getDef());
    }

    public Weapon getWeapon() {
        return weapon;
    }
} 
