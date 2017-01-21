class Enemy extends Character{
    private String enemyType;
    /* Possible types: 
     * "monster", "boss" */

    public String toString() {
        return enemyType + " with " + this.atk + "ATK and " + this.def + "DEF";
    }
}
