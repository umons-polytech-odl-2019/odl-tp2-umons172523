package exercise1;

public class WorkHourSalaryEmployee extends Employee
{
	private int hourRate=0;
	private int workedHours;
	public  WorkHourSalaryEmploye(String name,int hourlyRoute)
	{
		super(name);
		this.hourRate=hourRate;
		this.workedHours=workedHours;
	}

	@Override
	public int computeSalary()
	{
		return  workedHours*hourRate;
	}

}
