public class Position implements Serializable
{
    private int positionX;
    private int positionY;


    public Position(String pseudo, int x, int y)
    {
        this.positionX = x;
        this.positionY = y;
    }


    public int getPositionX()
    {
        return positionX;
    }


    public int getPositionY()
    {
        return positionY;
    }


    public void setPositionX(int pos)
    {
        return this.positionX = pos;
    }


    public void setPositionY(int pos)
    {
        return this.positionY = pos;
    }


    public String toString()
    {
        return "X : " + positionX + " -  Y : " + positionY;

    }

}