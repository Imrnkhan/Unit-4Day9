package Question2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Demo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	   
	    Customer c = new Customer();
	    
	    System.out.println("Enter Username:");
	    String username = sc.nextLine();
	    
	    System.out.println("Enter Password:");
	    String password = sc.nextLine();
	    
	    System.out.println("Enter Mobile Number:");
	    String mobile = sc.nextLine();
	    
	    System.out.println("Enter Email:");
	    String mail = sc.nextLine();
	   
	    if(Pattern.matches("[a-zA-Z]{3,8}", username))
	    {
	    	
	    	if(Pattern.matches("[a-zA-Z0-9]{3,9}", password))
	    	{
              
	    		 if(Pattern.matches("[6789][0-9]{9}", mobile))
	    		 {
	    			 if(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", mail))
	    			 {
	    				 c.setUsername(username);
	    			    	c.setMobileNumber(mobile);
	    			    	c.setPassword(password);
	    			    	c.setEmail(mail);
	    			    	
	    			    	System.out.println("Enter Details----------");
	    			    	System.out.println("Username: "+c.getUsername());
	    			    	System.out.println("Mobile No: "+c.getPassword());
	    			    	System.out.println("Password: "+c.getPassword());
	    			    	System.out.println("Email: "+c.getEmail());
	    			 }
	    			 else
	    			 {
	    				System.out.println("Enter valid mail"); 
	    			 }
	    			 
	    			 
	    		 }
	    		 else
	    		 {
	    			 System.out.println("enter valid mobile number, start with 6,7,8,9 and length must be 10 digits");
	    		 }
	    		 
	    	}
	    	else
	    	{
	    		System.out.println("Invalid Password,valid password includes a-z,A-Z,0-9 and length between 3 to 8");
	    	}
	    	
	    	
	    }
	    else
	    {
	    	 System.out.println("Invalid username, enter only alphabet and length between 3 to 8 character");
	    }
    }
}
