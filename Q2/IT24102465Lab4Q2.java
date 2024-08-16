import java.util.Scanner;

public class IT24102465Lab4Q2{
	
    public static void main(String args[]){
		
	    double exmarks;
	   	double labmarks;
	    double percenexmarks=0;
	    double percenlabmarks=0;
	    double finalmarks;
	
	
	    Scanner input=new Scanner(System.in);
	    System.out.print("Please enter exam marks(out of 100): ");
	
	    exmarks=input.nextDouble();
		
	
	if(exmarks<0 || exmarks>100)
	{
		System.out.println("Invalid input for exam marks.Terminating program");
		return;
	}
	 
	
		System.out.print("Please enter lab submission marks(out of 100): ");
	
	    labmarks=input.nextDouble();
	
		
	if(labmarks<0 || labmarks>100)
	{
		System.out.println("Invalid input for lab marks.Terminating program");
	    return;
	}   
	 
	
		System.out.print("Please enter the percentage given for the exam: ");		
	   
	    percenexmarks=input.nextDouble();
	
	    System.out.print("Please enter the percentage given for the submission: ");
	    percenlabmarks=input.nextDouble();
	
		
	if(percenexmarks+percenlabmarks>100)
	{
		System.out.print("The percentages must add up to 100.Terminating program.");
    }   
	
		
	else
	 {
		finalmarks=exmarks*percenexmarks/100+labmarks*percenlabmarks/100; 
		System.out.print("Final exam mark is: "+finalmarks);
	    
		
	 }
		input.close();
		
	
	
	
	
	
	
	
}	
	
	
	
	
	
	

}