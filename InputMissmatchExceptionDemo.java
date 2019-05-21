import java.util.Scanner;

public class InputMissmatchExceptionDemo {
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the age(must be Integer):");
		int age=-1;
		try {
			age=input.nextInt();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("the age is: "+age);
	}
}
