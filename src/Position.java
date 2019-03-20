import java.io.Serializable;

public class Position implements Serializable
{
    private int positionX;
    private int positionY;


    public Position(int x, int y)
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


    public void setPositionX(int pos) {this.positionX = pos;  }


    public void setPositionY(int pos) {this.positionY = pos;}    


    public String toString()
    {
        return "X : " + positionX + " -  Y : " + positionY;

    }

}