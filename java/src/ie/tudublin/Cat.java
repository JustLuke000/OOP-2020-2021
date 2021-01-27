package ie.tudublin;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    private int numLives;


    public int getNumLives()
    {
        return numLives;
    }

    public void setNumLives(int numLives)
    {
        this.numLives = numLives;
    }

    public void kill(String name)
    {
        this.numLives = numLives - 1;

              
        if (numLives == 0)
        {
            print("Dead");
        }
        else
        {
            print("Ouch");
        }
    }
}