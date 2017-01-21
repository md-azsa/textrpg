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
