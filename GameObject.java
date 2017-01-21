class GameObject{

    protected int index;
    protected String name;

    public void GameObject()
    {
        name = "";
        index = -1;
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