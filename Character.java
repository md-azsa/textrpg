class Character extends GameObject{
    protected int hp, mp;
    protected int atk, def;
    protected int dodge = 10;

    public Character() {
        setName("character");
        setHp(20);
        setMp(10);
        setAtk(5);
        setDef(2);
    }
    public Character(String name, int hp, int mp, int atk, int def) {
        setName(name);
        setHp(hp);
        setMp(mp);
        setAtk(atk);
        setDef(def);
    }
    public int attack(Character enemy){  // TODO: Consider def 
        if(nextRand() > enemy.getDodge()) {
            enemy.setHp(enemy.getHp()-this.getAtk());
            return this.getAtk();
        }
        else
            return 0;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
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
    public int getDodge() {
        return this.dodge;
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
