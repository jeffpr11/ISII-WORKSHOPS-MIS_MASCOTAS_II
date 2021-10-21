package ec.edu.espol.workshops;
import java.io.PrintStream;
import java.util.Scanner;

public class CarInsurance {
	Scanner scanner = new Scanner(System.in);
	PrintStream out = System.out;
	
    private String marital_status;
    private String sex;
    private int age;
    private String permission;
    private int base_price = 500;

    public void ProgramConsole() {
        out.println("Enter customer data.");
        out.print("Enter the customer's age:");
        while(scanner.hasNextLine()){
        	this.age = Integer.parseInt(scanner.nextLine());
        }
        out.print("Enter the sex of the customer (M/F):");
        while(scanner.hasNextLine()){
        	this.sex = scanner.nextLine();
        }
        out.print("Enter the marital status of the customer (married/not married):");
        while(scanner.hasNextLine()){
        	this.marital_status = scanner.nextLine();
        }
        out.print("Do you have a driving license?: (yes/no)");
        while(scanner.hasNextLine()){
        	this.permission = scanner.nextLine();
        }
        if (("yes").equals(this.permission))
          this.premiunCalculation();
        else
          out.println("A driver's license is a must to buy car insurance.");
      }
    
    private int premiunCalculation() {
		if (this.age >= 80) {
			out.println("We do not sell a car insurance to a person over 80 years old.");
	    } else {
	    	if(("M").equals(this.sex) && ("not married").equals(this.marital_status) && this.age < 25)
	    		this.base_price = this.base_price + 1500;
	    	else if (("F").equals(this.sex) || ("married").equals(this.marital_status))
	    		this.base_price = this.base_price - 200;
	    	else if (this.age >= 45 && this.age < 65)
	    		this.base_price = this.base_price - 100;
	    	out.print("Its value is:");
	    	out.println(this.base_price);
	    	return this.base_price;
	    }
		out.print("An error has ocurred");
		return -1;
    }
    
    /* Getter */
	public String getmarital_status() {
		return this.marital_status;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public int getage() {
		return this.age;
	}
	
	public String getpermission() {
		return this.permission;
	}
	
	public int getBase_price() {
		return this.base_price;
	}
	
	/* Setter */
	public void setmarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	
	public void setSexo(String sex) {
		this.sex = sex;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setpermission(String permission) {
		this.permission = permission;
	}
	
	public void setBase_price(int new_price) {
		this.base_price = this.base_price + new_price;
	}
}