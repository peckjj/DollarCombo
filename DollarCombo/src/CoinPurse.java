
public class CoinPurse
{

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    // Constructor.
    CoinPurse(int q, int d, int n, int p)
    {
        quarters = q;
        dimes = d;
        nickels = n;
        pennies = p;
    }
    
    public void addQuarter()
    {
        quarters++;
    }
    
    public void removeQuarter()
    {
        if (getQuarters() > 0)
        {
            quarters--;
        }
        else
        {
            throw new RuntimeException("There are no quarters to remove.");
        }
    }
    
    public void addDime()
    {
        dimes++;
    }
    
    public void removeDime()
    {
        if (getDimes() > 0)
        {
            dimes--;
        }
        else
        {
            throw new RuntimeException("There are no dimes to remove.");
        }
    }
    
    public void addNickel()
    {
        nickels++;
    }
    
    public void removeNickel()
    {
        if (getNickels() > 0)
        {
            nickels--;
        }
        else
        {
            throw new RuntimeException("There are no nickels to remove.");
        }
    }
    
    public void addPenny()
    {
        pennies++;
    }
    
    public void removePennies()
    {
        pennies = 0;
    }
    
    public int getQuarters()
    {
        return quarters;
    }
    
    public int getDimes()
    {
        return dimes;
    }
    
    public int getNickels()
    {
        return nickels;
    }
    
    public int getPennies()
    {
        return pennies;
    }
    
    public void removeCoin(int coin)
    {
        if (coin == 2)
        {
            removeNickel();
        }
        else if (coin == 3)
        {
            removeDime();
        }
        else if (coin == 4)
        {
            removeQuarter();
        }
    }
    
    public int getSum()
    {
        return (25 * quarters) + (10 * dimes) + (5 * nickels) + (pennies);
    }
    
    public String toString()
    {
        return getQuarters() + " " + getDimes() + " " + getNickels() + " " + getPennies();
    }

}
