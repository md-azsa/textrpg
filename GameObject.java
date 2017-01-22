import java.util.*;

class GameObject{

    protected int index;
    protected String name;

    public void GameObject()
    {
        name = "";
        index = -1;
    }

    public int nextRand(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max) + min;
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
