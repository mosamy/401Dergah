/**
 * 
 */
package lab4;

/**
 * @author 984577
 *
 */
public class Paycheck {
	private double _grossPay = 0.0;
	enum Tax
	{
		
		fica(0.23), local(0.01), medicare(0.03), socialsecurity(0.075);
		
		private double val;
		Tax(double value)
		{
			this.val = value;
		}
	}
	
	

	/**
	 * 
	 */
	public Paycheck(double grosspay) 
	{
		_grossPay = grosspay;
		
	}
	
	public void print()
	{
		
	}
	
	public double getNetPay()
	{
		return 0.0;
		
	}

}
