import java.util.*;

class Weapon extends Equipment{
    private String type;
    /* Possible types: 
     * "sword", "gun",
     * "staff", "dagger" */
    private int durability;

    public Weapon(String quality, int atk, int def, int durability) {
        setQuality(quality);
        setAtk(atk);
        setDef(def);
        setDurability(durability);
    }

    // Generate a random weapon
    // Weapon type not set
    public Weapon() {
        int randQuality = nextRand(1, 10);
        if(randQuality<=3) {
            setQuality("poor"); setAtk(nextRand(20, 30)); setDef(nextRand(0, 5));
            setDurability(100);
        }
        else if(randQuality<=5) {
            setQuality("uncommon"); setAtk(nextRand(30, 40)); setDef(nextRand(5, 10));
            setDurability(100);
        }
        else if(randQuality<=7) {
            setQuality("rare"); setAtk(nextRand(40, 50)); setDef(nextRand(10, 15));
            setDurability(100);
        }
        else if(randQuality<=9) {
            setQuality("epic"); setAtk(nextRand(50, 60)); setDef(nextRand(15, 20));
            setDurability(100);
        }
        else {
            setQuality("legendary"); setAtk(nextRand(70, 80)); setDef(nextRand(25, 30));
            setDurability(100);
        }
    }

    public void setType(String type) {
        this.type = new String(type);
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public int getDurability() {
        return this.durability;
    }
    public String toString(){
        return this.quality + " " + this.type + " with " + this.atk + "ATK and "
                + this.def + "DEF";
    }
}
