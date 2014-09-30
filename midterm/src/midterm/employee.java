package midterm;

public class employee extends person {
	
	private String office,salary;
	 private MyDate date_Hired;

	 public employee()
	 {
	 }

	 public employee(String office, String salary, MyDate date_Hired)
	 {
	 this.office = office;
	 this.salary = salary;
	 this.date_Hired = date_Hired;
	 }
	 public String office()
	 {
	 return office;
	 }

	 public void setOffice(String office)
	 {
	 this.office = office;
	 }

	 public String getSalary()
	 {
	 return salary;
	 }

	 public void setSalary(String salary)
	 {
	 this.salary = salary;
	 }

	 public MyDate getMyDate()
	 {
	 return date_Hired;
	 }

}
