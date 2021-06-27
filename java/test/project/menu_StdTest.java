/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laptop house
 */
public class menu_StdTest {
    
    public menu_StdTest() {
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
     * Test of add method, of class menu_Std.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        menu_Std instance = new menu_Std();
        boolean expResult = false;
        boolean result = instance.add();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class menu_Std.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        menu_Std instance = new menu_Std();
        instance.search();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display_record method, of class menu_Std.
     */
    @Test
    public void testDisplay_record() {
        System.out.println("display_record");
        menu_Std instance = new menu_Std();
        instance.display_record();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class menu_Std.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        menu_Std instance = new menu_Std();
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
