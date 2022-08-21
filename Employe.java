package classandobject;

public class Employe {

	
		int id;
		String name;
		float salary;
		Employe()
		{
			
		}
		Employe()
		{
		id=i;
		name=j;
		salary=k;
		}
		double annualsalary()
		{
			double annualsalary=salary*12;
			return annualsalary;
		}

		
		public String toString()
		{
			return "ID=:"+id+"Name=:"+name+"Salary=:"+salary+"AnnualSalary"+annualsalary();
		}
	

}
