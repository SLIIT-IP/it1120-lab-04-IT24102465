import java.util.Scanner;

public class IT24102465Lab4Q3{
	
    public static void main(String args[]){
	
	 double number;
	 String result;
	
	 Scanner input=new Scanner(System.in);
	 
	 System.out.print("Enter a number: ");
	 number=input.nextDouble();
	
	 result=(number>0) ? "This number is: positive" : (number<0) ? "This number is: negative"
	 : "The number is: Zero";
	
	 System.out.println(result);
	 input.close();
		
	
	
	
	
	
	
	
}	
	
	
	
	
	
	

}