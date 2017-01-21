class Equipment extends GameObject{
    protected String quality;
    /* Possible qualities:
     * "poor", "common", "uncommon",
     * "rare", "epic", "legendary"*/
    protected int atk;
    protected int def;

    public Equipment(String quality, int atk, int def) {
        setQuality(quality);
        setAtk(atk);
        setDef(def);
    }

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
