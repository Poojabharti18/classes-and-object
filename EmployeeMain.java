package classandobject;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e1=new Employee();
          e1.id=1001;
          e1.name="pooja";
          e1.Salary=45000;
          System.out.println("The Employee id=:"+e1.id);
  		System.out.println("The Employee Name=:"+e1.name);
  		System.out.println("The Employee salary=:"+e1.Salary);
  		System.out.println("The Employee Annualsalary=:"+e1.annualSalary());
  		System.out.println("===========================");
  		 Employee e2=new Employee();
         e2.id=1001;
         e2.name="Priya";
         e2.Salary=45000;
         System.out.println("The Employee id=:"+e2.id);
 		System.out.println("The Employee Name=:"+e2.name);
 		System.out.println("The Employee salary=:"+e2.Salary);
 		System.out.println("The Employee Annualsalary=:"+e2.annualSalary());
 		System.out.println("===========================");
 		Employee e3=new Employee();
        e3.id=1001;
        e3.name="Priya";
        e3.Salary=45000;
        System.out.println("The Employee id=:"+e3.id);
		System.out.println("The Employee Name=:"+e3.name);
		System.out.println("The Employee salary=:"+e3.Salary);
		System.out.println("The Employee Annualsalary=:"+e3.annualSalary());
		System.out.println("===========================");
	}

}
