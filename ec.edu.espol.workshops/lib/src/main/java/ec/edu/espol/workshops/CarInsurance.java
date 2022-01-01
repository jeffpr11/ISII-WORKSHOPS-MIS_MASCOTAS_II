package ec.edu.espol.workshops;


import java.io.PrintStream;
import java.util.Scanner;

/**
 * CarInsurance Class for program execution.
 */
/*public class CarInsurance {
	public static void main(String[] args) {
		//new ProgramConsole();
	}
}*/

public class CarInsurance {
  private Scanner scanner;
  PrintStream out = System.out;
  
  private String marital_status;
  private String sex;
  private int age;
  private String permission;
  private int basePrice = 500;

  public CarInsurance(int age, String married, String sex, String license) {
	  this.sex = sex;
	  this.age= age;
	  this.permission= license;
	  this.marital_status = married;
  }
  
  /**
   * programConsole method.
   * It allows inputs where customer set his data to calculate the value.
   */
  public int programConsole() {
    if (("yes").equals(this.permission)) {
      return this.premiunCalculation();
    } else {
      out.println("A driver's license is a must to buy car insurance.");
      return -1;
    }
  }

  /**
   * premiunCalculation method.
   * According to age, sex and marital status it calculates the value.
   */
  private int premiunCalculation() {
	  try {
	    if (this.age >= 80) {
	      out.println("We do not sell a car insurance to a person over 80 years old.");
	      return -1;
	    } else if (this.age >= 45 && this.age < 65) {
	      this.basePrice = this.basePrice - 100;
	    }
	    if(("M").equals(this.sex) && ("not married").equals(this.marital_status) && (this.age < 25)) {
	      this.basePrice = this.basePrice + 1500;
	    } else if (("F").equals(this.sex) || ("married").equals(this.marital_status)) {
	      this.basePrice = this.basePrice - 200;
	    } 
	    out.print("Its value is:");
	    out.println(this.basePrice);
	    return this.basePrice;
	  } catch(Exception e) {
		  out.print("An error has ocurred");
		  return -1;
	  }
	}

  /* Getter */
  public String getMaritalStatus() {
    return this.marital_status;
  }

  public String getSex() {
    return this.sex;
  }

  public int getAge() {
    return this.age;
  }

  public String getPermission() {
    return this.permission;
  }

  public int getBasePrice() {
    return this.basePrice;
  }

  /* Setter */
  public void setMaritalStatus(String maritalStatus) {
    this.marital_status = maritalStatus;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public void setBasePrice(int newPrice) {
    this.basePrice = this.basePrice + newPrice;
  }
}