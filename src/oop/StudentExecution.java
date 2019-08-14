package oop;

public class StudentExecution {
	
	public static void main(String[]args) { 
		
		
		
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setAge(10);
        int newAge = studentInfo.getAge();
        System.out.println(newAge);
        
        studentInfo.setName("Billal");
        String newName = studentInfo.getName();
        System.out.println(newName);
        
        studentInfo.setDOB("May 26/1993");
        String newDOB = studentInfo.getDOB();
        System.out.println(newDOB);
	}

}
