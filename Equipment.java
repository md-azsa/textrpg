class Equipment{
    private String quality;
    /* Possible qualities:
     * "poor", "common", "uncommon",
     * "rare", "epic", "legendary"*/
    private int atk;
    private int def;

    public void setQuality(String quality) {
        this.quality = quality;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public String getQuality() {
        return this.quality;
    }
    public int getAtk() {
        return this.atk;
    }
    public int getDef() {
        return this.def;
    }
}
