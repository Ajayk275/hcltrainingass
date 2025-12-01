package oops;

class Student{
	
	private String name;
	private int rollNo;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid mark, the mark should between 0 and 100");
			
		}
		else {
		this.marks = marks;
	}
	
	}
}

public class oopstraining {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("Ajay");
		s1.setRollNo(22);
		
		
		s1.setMarks(85);
		
		System.out.println("Name: " + s1.getName());
		System.out.println("Roll no: "+ s1.getRollNo());
		System.out.println("marks:" + s1.getMarks());
	

	}

}
