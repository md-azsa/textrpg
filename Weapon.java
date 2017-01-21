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
    public Weapon() {
        setQuality("poor");
        setAtk(0);
        setDef(0);
        setDurability(100);
        Random rand = new Random();
        int randQuality = rand.nextInt(10) + 1;
        if(randQuality<=3) {
            setQuality("poor"); setAtk(30); setDef(10); setDurability(100);
        }
        else if(randQuality<=5) {
            setQuality("uncommon"); setAtk(50); setDef(15); setDurability(100);
        }
        else if(randQuality<=7) {
            setQuality("rare"); setAtk(65); setDef(20); setDurability(100);
        }
        else if(randQuality<=9) {
            setQuality("epic"); setAtk(75); setDef(25); setDurability(100);
        }
        else {
            setQuality("legendary"); setAtk(100); setDef(35); setDurability(100);
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
