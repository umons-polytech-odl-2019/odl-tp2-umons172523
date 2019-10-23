package exercise1;

public class Exercise1
{
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary)
	{

		FixedSalaryEmployee A=new FixedSalaryEmployee(name,fixedSalary);
		return A;
		//return null;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission)
	{
		BaseSalaryPlusCommissionEmployee A= new BaseSalaryPlusCommissionEmployee(name,baseSalary,commission);
		return A;
		//return null;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute)
	{
		WorkHourSalaryEmployee A= new WorkHourSalaryEmployee(name, hourlyRoute);
		return A;
		//return null;
	}
}
