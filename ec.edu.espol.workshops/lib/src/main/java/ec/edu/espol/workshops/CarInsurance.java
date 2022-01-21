package ec.edu.espol.workshops;

import java.io.PrintStream;

/**
 * CarInsurance Class for program execution.
 */

public class CarInsurance {
    PrintStream out = System.out;

    private String marital_status;
    private String sex;
    private int age;
    private String permission;
    private int basePrice = 500;

    public CarInsurance(int age, String married, String sex, String license) {
        this.setSex(sex);
        this.setAge(age);
        this.setPermission(license);
        this.setMaritalStatus(married);
    }
    
    public static void main(String[] args) {
        CarInsurance carI_1 = new CarInsurance(50, "married", "F", "yes");
        CarInsurance carI_2 = new CarInsurance(65, "not married", "F", "yes");
        carI_1.programConsole();
        carI_2.programConsole();
    }

    /**
     * programConsole method. It allows inputs where customer set his data to
     * calculate the value.
     */
    public int programConsole() {
        if (("yes").equals(this.getPermission())) {
            return this.premiunCalculation();
        } else {
            out.println("A driver's license is a must to buy car insurance.");
            return -1;
        }
    }

    /**
     * premiunCalculation method. According to age, sex and marital status it
     * calculates the value.
     */
    private int premiunCalculation() {
        boolean isMarried = ("married").equals(this.getMaritalStatus());
        boolean isFGender = ("F").equals(this.getSex());

        if (this.getAge() >= 80) {
            out.println("We do not sell a car insurance to a person over 80 years old.");
            return -1;
        } else if (this.getAge() >= 45 && this.getAge() < 65) {
            this.setBasePrice(-100);
        }
        
        if (!isFGender && !isMarried && (this.getAge() < 25)) {
            this.setBasePrice(1500);
        } 
        if (isFGender || isMarried) {
            this.setBasePrice(-200);
        }

        if(this.getAge() < 60) {
            if (isMarried && (this.getAge() > 30)) {
                this.setBasePrice(-100);
            } 
        } else {
            if (isFGender && !isMarried) {
                this.setBasePrice(-50);
            }
        }
        
        out.print("Its value is:");
        out.println(this.getBasePrice());
        return this.getBasePrice();
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