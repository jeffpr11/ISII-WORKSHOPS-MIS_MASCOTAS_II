package ec.edu.espol.workshops;


import java.io.PrintStream;
import java.util.Scanner;

/**
 * CarInsurance Class for program execution.
 */
public class CarInsurance {
  private Scanner scanner;

  private String marital_status;
  private String sex;
  private int age;
  private String permission;
  private int basePrice = 500;

  public CarInsurance() {
    this.marital_status = "";
    this.sex = "";
    this.age= 0;
    this.permission= "no";
    this.marital_status = "not married";
  }

  /**
   * programConsole method.
   * It allows inputs where customer set his data to calculate the value.
   */
  public void programConsole() {
    this.scanner = new Scanner(System.in, "UTF-8");

    out.println("Enter customer data.");
    out.print("Enter the customer's age:");
    while (scanner.hasNextLine()) {
      this.age = Integer.parseInt(scanner.nextLine());
    }
    out.print("Enter the sex of the customer (M/F):");
    while (scanner.hasNextLine()) {
      this.sex = scanner.nextLine();
    }
    out.print("Enter the marital status of the customer (married/not married):");
    while (scanner.hasNextLine()) {
      this.marital_status = scanner.nextLine();
    }
    out.print("Do you have a driving license?: (yes/no)");
    while (scanner.hasNextLine()) {
      this.permission = scanner.nextLine();
    }
    if (("yes").equals(this.permission)) {
      this.premiunCalculation();
    } else {
      out.println("A driver's license is a must to buy car insurance.");
    }
  }

  /**
   * premiunCalculation method.
   * According to age, sex and marital status it calculates the value.
   */
  private int premiunCalculation() {
    if (this.age >= 80) {
      out.println("We do not sell a car insurance to a person over 80 years old.");
    } else {
      if(("M").equals(this.sex) && ("not married").equals(this.marital_status) && (this.age < 25)) {
        this.basePrice = this.basePrice + 1500;
      } else if (("F").equals(this.sex) || ("married").equals(this.marital_status)) {
        this.basePrice = this.basePrice - 200;
      } else if (this.age >= 45 && this.age < 65) {
        this.basePrice = this.basePrice - 100;
      }
      out.print("Its value is:");
      out.println(this.basePrice);
      return this.basePrice;
    }
    out.print("An error has ocurred");
    return -1;
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
