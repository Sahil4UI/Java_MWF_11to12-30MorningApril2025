class Student{
//	class variables/members
	private int roll;
	private String name;
	private String contact;
	
//	constructor - >aisa function jiska name and class name same ho
//	and usko call krne ki need na ho vo object creation k time pe automatically
//	call hojaye
	Student(int roll,String name, String contact)
	{
		this.roll = roll;
		this.name = name;
		this.contact = contact;
	}
	
	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		if (roll>0)
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	void showStudentDetails()
	{
		System.out.println("Roll No=>"+this.roll);
		System.out.println("Name=>"+this.name);
		System.out.println("Contact=>"+this.contact);
	}
}
public class OOPS_Demo {
	public static void main(String[] args) {
//		DRY - Dont Repeat Yourself
		Student obj = new Student(101,"Amit","9876543210");
		obj.setRoll(-100);
		obj.showStudentDetails();
		
		System.out.println(obj.getName());
	
		System.out.println("***********************");
		Student obj1 = new Student(102,"ravi","7896543210");
		obj1.showStudentDetails();
	}
}
