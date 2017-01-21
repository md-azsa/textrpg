class Weapon extends Equipment{
    private String type;
    /* Possible types: 
     * "sword", "gun",
     * "staff", "dagger" */
    private int durability;

    public void setType(String type) {
        this.type = new String(type);
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public String toString(){
        return this.quality + " " + this.type + " with " + this.atk + "ATK and "
                + this.def + "DEF";
    }
}
