class Enemy extends Character{
    private String type;
    /* Possible types: 
     * "monster", "boss" */
    public void setType(String type) {
        this.type = new String(type); 
    }
    public String getType() {
        return this.type;
    }

    public String toString() {
        return type + " with " + this.atk + "ATK and " + this.def + "DEF";
    }
}
