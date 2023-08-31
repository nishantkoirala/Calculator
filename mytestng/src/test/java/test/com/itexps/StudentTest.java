/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexps.shoppingcart.mytestng.Student;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nishant.koirala
 */
public class StudentTest {
    
    Student student;
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        student = new Student();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    
    public void testGrade(){
        student.setEng(100);
        student.setMath(90);
        student.setSci(50);
        student.setName("Tom");
        
        assertEquals(student.getGrade(),"Pass");
        assertEquals(student.getName(), "Tom");
                
                
    }
}
