package ec.edu.espol.workshops;
import java.util.Scanner;

public class CarInsurance {
	Scanner scanner = new Scanner(System.in);
	
    private String marital_status;
    private String sex;
    private int age;
    private String permission;
    private int base_price = 500;
    
    public void ProgramConsole() {
        System.out.println("Enter customer data.");
        System.out.print("Enter the customer's age:");
        while(scanner.hasNextLine()){
        	this.age = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Enter the sex of the customer (M/F):");
        while(scanner.hasNextLine()){
        	this.sex = scanner.nextLine();
        }
        System.out.print("Enter the marital status of the customer (married/not married):");
        while(scanner.hasNextLine()){
        	this.marital_status = scanner.nextLine();
        }
        System.out.print("Do you have a driving license?: (yes/no)");
        while(scanner.hasNextLine()){
        	this.permission = scanner.nextLine();
        }
        if (this.permission.equals("yes"))
          this.premiunCalculation();
        else
          System.out.println("A driver's license is a must to buy car insurance.");
      }
    
    private int premiunCalculation() {
		if (this.age >= 80) {
			System.out.println("We do not sell a car insurance to a person over 80 years old.");
	    } else {
	    	if(this.sex.equals("M") && this.marital_status.equals("not married") && this.age < 25)
	    		this.base_price = this.base_price + 1500;
	    	else if (this.sex.equals("F") || this.marital_status.equals("married"))
	    		this.base_price = this.base_price - 200;
	    	else if (this.age >= 45 && this.age < 65)
	    		this.base_price = this.base_price - 100;
	    	System.out.print("Its value is:");
	    	System.out.println(this.base_price);
	    	return this.base_price;
	    }
		System.out.print("An error has ocurred");
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
