/**
 * 
 */
package lab4;

/**
 * @author 984577
 *
 */
public abstract class Employee {

	public int empId;
	
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void print()
	{
		
	}
	public Paycheck calcCompensation(int month, int year)
	{
		Paycheck p = new Paycheck(calcGrossPay());
		
		
		return p ;
		
		
	}
	
	//abstract method
	public abstract double calcGrossPay();
	
}
