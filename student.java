import java.util.Scanner;

public class student{
     static int rollno;
     static String name;
     static String cname;
     static String subject;
	 static int marks;
     
     public void acceptDetails()
     {
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("Enter student details:");
    	 rollno = s.nextInt();
    	 name = s.next();
    	 cname= s.next();
    	 subject = s.next();
    	 marks = s.nextInt();
     }
     
	public void displayStudentInfo()
	{
		
		System.out.println("Roll no.- " +rollno);
		System.out.println("Name - "+name);
		System.out.println("Course name - "+cname);
		System.out.println("Subject - "+subject);
		System.out.println("Marks - "+marks);
		
		
	}
	
	public void findResult() 
	{
		if(marks>=40){
			System.out.println("Result:pass");
		}
		else{
			System.out.println("Result:failed");
		}
		
	}
	
     public static void main(String[] args) 
     {
	     System.out.println("first student");
    	 student s1 = new student();
		 s1.acceptDetails();
     	 s1.displayStudentInfo();
		 s1.findResult();

    	System.out.println("second student");
        student s2 = new student();
    	s2.acceptDetails();
    	s2.displayStudentInfo();
		s2.findResult();

		System.out.println("Third student");
    	student s3= new student();
         s3.acceptDetails();
         s3.displayStudentInfo();
		 s3.findResult();

        System.out.println("forth student");
    	 student s4 = new student();
         s4.acceptDetails();
         s4.displayStudentInfo();
		 s4.findResult();

        System.out.println("fifth student");
    	 student s5 = new student();
    	 s5.acceptDetails();
		 s5.displayStudentInfo();
		 s5.findResult();
	 }
     
	
}
