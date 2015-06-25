
import java.util.*;

/**
 * 
 */
public class Building {

    /**
     * 
     */
	public int Maintenance_Cost;
	public ArrayList<Apartment> Apartments = new ArrayList<Apartment>();
   

	public Building() {
    }

    /**
     * 
     */
    


    /**
     * 
     */
    public int CalculateProfit() 
    {
    	int profit = 0;
    	for (Apartment a : Apartments)
    	{
    		profit += a.Rent;
    	}

    	return profit - Maintenance_Cost;
    }

}