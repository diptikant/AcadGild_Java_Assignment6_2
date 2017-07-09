package Java_Assignment62;
/*
 * This class will help  on Exception Handling in Java. 
 */

import java.util.*;
public class Java_Assignment6_2 
{	
	public static void main(String[] args) 
	{
		Scanner age = new Scanner (System.in); //Initializing the scanner object
	    System.out.println("Enter your age");
	    int a = age.nextInt();
	    age.close();
	    try
	    {  	      
	    	if(a<0)// checking for negative value in age
	    	{         
	    		throw new NegetiveAgeException(); //Thowing the custom exception
	    	}          
	    }
	    catch(NegetiveAgeException ex)
	    {
	    	System.out.println(ex.getMessage()); //Printing the message from custom exception
	            
	    }
	    
	    
	}

}
// Custom exception class declaration
class NegetiveAgeException extends Exception 
{
   
	private static final long serialVersionUID = 1L;

	public NegetiveAgeException() //constructor of Custom exception class
    {     
    	super("The Age you've entered is Negetive so invalid");   //Custom exception message    
    }
}
