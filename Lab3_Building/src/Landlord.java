
import java.util.*;

/**
 * 
 */
public class Landlord
{

	public ArrayList<Building>  Buildings = new ArrayList<Building>();
    /**
     * 
     */
    public Landlord() {
    }

    
   public int CalculateProfit()
   {
	   int Profit = 0;
	   
	   for(Building b : Buildings)
	   {
		  Profit += b.CalculateProfit();
	   }
	return Profit;
	   
   }
  
    public static void main ()
    {
    	
    }
    

}