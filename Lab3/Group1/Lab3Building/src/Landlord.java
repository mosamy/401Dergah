
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
    	Landlord L = new Landlord();
    	Apartment a1 = new Apartment(10);
    	Apartment a2 = new Apartment(15);
    	Apartment a3 = new Apartment(13);
    	Apartment a4 = new Apartment(9);
    	Apartment a5 = new Apartment(16);
    	
    	
    	Building b1 = new Building();
    	b1.Maintenance_Cost = 5;
    	b1.Apartments.add(a1);
    	b1.Apartments.add(a2);
    	
    	Building b2 = new Building();
    	b2.Maintenance_Cost = 4;
    	b2.Apartments.add(a3);
    	
    	Building b3 = new Building();
    	b3.Maintenance_Cost = 7;
    	b3.Apartments.add(a4);
    	b3.Apartments.add(a5);
    	
    	System.out.println("The profit for all buildings is $" + L.CalculateProfit());
    	//L.Buildings.add(new Buil)
    }
    

}