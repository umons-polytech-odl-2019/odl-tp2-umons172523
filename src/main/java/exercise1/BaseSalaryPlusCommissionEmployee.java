package exercise1;

public class BaseSalaryPlusCommissionEmployee  extends Employee
{
	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee(String name,int baseSalary,int commission)
	{
		super(name);
		this.baseSalary=baseSalary;
		this.commission=commission;
	}

	//il faut faire un override pour redefinir l'élément
	@Override
	public int computeSalary()
	{
		return baseSalary +getSales()*commission;
	}

}
