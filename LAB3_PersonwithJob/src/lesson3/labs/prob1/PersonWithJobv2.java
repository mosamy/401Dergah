/**
 * 
 */
package lesson3.labs.prob1;

/**
 * @author 984577
 *
 */
public class PersonWithJobv2 
{
private Person _person ;

private double salary;

public double getSalary() {
	return salary;
}
	/**
	 * 
	 */
	public PersonWithJobv2(String name, double salary) 
	{
		_person = new Person(name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		PersonWithJobv2 p1 = new PersonWithJobv2("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

	}

	
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = _person.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
}
