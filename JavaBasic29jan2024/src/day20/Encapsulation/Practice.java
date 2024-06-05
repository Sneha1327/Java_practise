package day20.Encapsulation;
class StudentDetail{
	private String name="Neha";
	private int age=30;
	private Double salary=45000.00;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary= salary;
	}
}
public class Practice {

	public static void main(String[] args) {
		StudentDetail D1=new StudentDetail();
		System.out.println("Getting Name: "+ D1.getName());
		System.out.println("Getting Age: "+ D1.getAge());
		System.out.println("Getting Salary: "+ D1.getSalary());
		D1.setName("Pooja");
		D1.setAge(25);
		D1.setSalary(55000);
		System.out.println("Getting Updated Name: "+ D1.getName());
		System.out.println("Getting Updated Age : "+ D1.getAge());
		System.out.println("Getting Updated salary: "+ D1.getSalary());
		
		

	}

}
