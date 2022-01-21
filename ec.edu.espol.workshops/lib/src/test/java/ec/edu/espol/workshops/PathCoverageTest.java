package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class PathCoverageTest {
    private Integer actual_output;
	private CarInsurance carInsurance;
	
	@Test
	public void test_03_01() {
		Integer expected_output = -1;
		
		carInsurance  = new CarInsurance(50, "married", "F", "no");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}
	
	@Test
	public void test_03_02() {
		Integer expected_output = -1;
		
		carInsurance  = new CarInsurance(85, "married", "F", "yes");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}
 
	
	@Test
	public void test_03_03() {
		Integer expected_output = 400;
		
		carInsurance  = new CarInsurance(50, "not married", "M", "yes");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}

	
	@Test
	public void test_03_04() {
		Integer expected_output = 100;
		
		carInsurance  = new CarInsurance(50, "married", "F", "yes");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}

	@Test
	public void test_03_05() {
		Integer expected_output = 2000;
		
		carInsurance  = new CarInsurance(20, "not married", "M", "yes");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}
	
	@Test
	public void test_03_06() {
		Integer expected_output = 300;
		
		carInsurance  = new CarInsurance(20, "married", "F", "yes");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}
	
	@Test
	public void test_03_07() {
		Integer expected_output = 500;
		
		carInsurance  = new CarInsurance(30, "not married", "M", "yes");
		actual_output = carInsurance.programConsole();
		assertEquals(actual_output, expected_output);
	}
	
	@Test
    public void test_03_08() {
        Integer expected_output = 250;
        
        carInsurance  = new CarInsurance(65, "not married", "F", "yes");
        actual_output = carInsurance.programConsole();
        assertEquals(actual_output, expected_output);
    }
}