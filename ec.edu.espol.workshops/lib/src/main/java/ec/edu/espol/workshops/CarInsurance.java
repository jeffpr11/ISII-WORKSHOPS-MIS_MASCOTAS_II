package ec.edu.espol.workshops;


import java.util.Scanner;

/**
 * CarInsurance Class for program execution.
 */
public class CarInsurance {
  Scanner scanner = new Scanner(System.in);

  private String maritalStatus;
  private String sex;
  private int age;
  private String permission;
  private int basePrice = 500;

  /**
   * programConsole method.
   * It allows inputs where customer set his data to calculate the value.
   */
  public void programConsole() {
    System.out.println("Enter customer data.");
    System.out.print("Enter the customer's age:");
    while (scanner.hasNextLine()) {
      this.age = Integer.parseInt(scanner.nextLine());
    }
    System.out.print("Enter the sex of the customer (M/F):");
    while (scanner.hasNextLine()) {
      this.sex = scanner.nextLine();
    }
    System.out.print("Enter the marital status of the customer (married/not married):");
    while (scanner.hasNextLine()) {
      this.maritalStatus = scanner.nextLine();
    }
    System.out.print("Do you have a driving license?: (yes/no)");
    while (scanner.hasNextLine()) {
      this.permission = scanner.nextLine();
    }
    if (this.permission.equals("yes")) {
      this.premiunCalculation();
    } else {
      System.out.println("A driver's license is a must to buy car insurance.");
    }
  }

  /**
   * premiunCalculation method.
   * According to age, sex and marital status it calculates the value.
   */
  private int premiunCalculation() {
    if (this.age >= 80) {
      System.out.println("We do not sell a car insurance to a person over 80 years old.");
    } else {
      if (this.sex.equals("M") && this.maritalStatus.equals("not married") && this.age < 25) {
        this.basePrice = this.basePrice + 1500;
      } else if (this.sex.equals("F") || this.maritalStatus.equals("married")) {
        this.basePrice = this.basePrice - 200;
      } else if (this.age >= 45 && this.age < 65) {
        this.basePrice = this.basePrice - 100;
      }
      System.out.print("Its value is:");
      System.out.println(this.basePrice);
      return this.basePrice;
    }
    System.out.print("An error has ocurred");
    return -1;
  }

  /* Getter */
  public String getMaritalStatus() {
    return this.maritalStatus;
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
    this.maritalStatus = maritalStatus;
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
