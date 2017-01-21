class Weapon extends Equipment{
    private String type;
    /* Possible types: 
     * "sword", "gun",
     * "staff", "dagger" */
    private int durability;

    public String toString(){
        return this.quality + " " + this.type + " with " + this.atk + "ATK and "
                + this.def + "DEF";
    }
}
