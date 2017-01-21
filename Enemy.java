class Enemy{
    private int hp, mp;
    private int atk, def;

    public Enemy(int hp, int mp, int atk, int def) {
        setHp(hp);
        setMp(mp);
        setAtk(atk);
        setDef(def);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int getHp() {
        return this.hp;
    }
    public int getMp() {
        return this.mp;
    }
    public int getAtk() {
        return this.atk;
    }
    public int getDef() {
        return this.def;
    }
}
