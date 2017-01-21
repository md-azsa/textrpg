class Enemy extends Character{
    private String type;
    /* Possible types: 
     * "monster", "boss" */
    public Enemy(String name, int hp, int mp, int atk, int def, String type) {
        setName(name);
        setHp(hp);
        setMp(mp);
        setAtk(atk);
        setDef(def);
        setType(type);
    }
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
