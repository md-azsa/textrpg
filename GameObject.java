import java.util.*;

class GameObject{

    protected int index;
    protected String name;

    public void GameObject()
    {
        name = "";
        index = -1;
    }

    public static int nextRand(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max) + min;
    }
    public static int nextRand() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;

    }

    public void setName(String name)
    {
        this.name = new String(name);

    }

    



}
