/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rationalnumberdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class RationalNumberTest {
    
    public RationalNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class RationalNumber.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        RationalNumber r2=new RationalNumber(1,3);
        RationalNumber r1=new RationalNumber(2,3);
        
        RationalNumber expResult = new RationalNumber(1,1);
        RationalNumber result = r1.add(r2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
