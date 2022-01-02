package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class BranchCoverageTest {

	private Integer actualAnswer;
	private CarInsurance car_insurance;
	
	@Test
	public void test_02_01() {
		Integer expectedAnswer = -1;
		
		car_insurance  = new CarInsurance(50, "married", "F", "no");
		actualAnswer = car_insurance.programConsole();
		assertEquals(actualAnswer, expectedAnswer);
	}
	
	@Test
	public void test_02_02() {
		Integer expectedAnswer = -1;
		
		car_insurance  = new CarInsurance(85, "married", "F", "yes");
		actualAnswer = car_insurance.programConsole();
		assertEquals(actualAnswer, expectedAnswer);
	}

	
	@Test
	public void test_02_03() {
		Integer expectedAnswer = 200;
		
		car_insurance  = new CarInsurance(50, "married", "F", "yes");
		actualAnswer = car_insurance.programConsole();
		assertEquals(actualAnswer, expectedAnswer);
	}

	
	@Test
	public void test_02_04() {
		Integer expectedAnswer = 2000;
		
		car_insurance  = new CarInsurance(20, "not married", "M", "yes");
		actualAnswer = car_insurance.programConsole();
		assertEquals(actualAnswer, expectedAnswer);
	}

	
	@Test
	public void test_02_05() {
		Integer expectedAnswer = 400;
		
		car_insurance  = new CarInsurance(55, "not married", "M", "yes");
		actualAnswer = car_insurance.programConsole();
		assertEquals(actualAnswer, expectedAnswer);
	}
}
