package exercise1;

public abstract class Employee
{
	private String name;
	private int workedHours=0;
	private int sales=0;
	protected Employee(String name)
	{
		this.name=name;
	}
	public abstract int computeSalary();
	//{
		//return computeSalary;
	//}

	public void sell()
	{
		sales++;


	}
	protected int getSales(){
		return sales;
	}

	public void workOneHour()
	{
		this.workedHours+=1:
		//return hourRate*hours;

	}
	public int getWorkedHours()
	{
		return workedHours;
	}

	public String getName()
	{
		return name;
	}
}
