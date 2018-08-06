
public class DollarComboUtils {
    
    private static int lastCoin;
    
    public static void nextPurse(CoinPurse p)
    {
        // If all coins aren't pennies
        if (p.getPennies() < 100)
        {
            p.removePennies();
            removeLastCoin(p);
            while (p.getSum() < 100)
            {
                addNextCoin(p);
            }
            if (p.getSum() == 100)
            {
                return;
            }
            else
            {
                nextPurse(p);
            }
        }
    }
    
    public static void removeLastCoin(CoinPurse p)
    {
        if (p.getQuarters() > 0)
        {
            lastCoin = 4;
        }
        if (p.getDimes() > 0)
        {
            lastCoin = 3;
        }
        if (p.getNickels() > 0)
        {
            lastCoin = 2;
        }
        p.removeCoin(lastCoin);
    }
    
    public static void addNextCoin(CoinPurse p)
    {
        if (lastCoin == 2)
        {
            p.addPenny();
        }
        else if (lastCoin == 3)
        {
            p.addNickel();
        }
        else if (lastCoin == 4)
        {
            p.addDime();
        }
    }

}
