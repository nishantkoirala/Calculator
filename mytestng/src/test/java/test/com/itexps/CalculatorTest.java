/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.shoppingcart.mytestng.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nishant.koirala
 */
public class CalculatorTest {
    Calculator cal;
    
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("Before Method");
        cal = new Calculator();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("After Method");
    }
    
    @Test
    public void testAdd(){
        
        assertEquals(cal.add(2,3), 5);
       
    }
    
    @Test
    public void testSub(){
        
        assertEquals(cal.sub(300,200), 100);
        
    }
}
