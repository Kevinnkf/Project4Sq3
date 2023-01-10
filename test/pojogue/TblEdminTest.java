/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojogue;

import java.text.DateFormat;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TblEdminTest {
    
    public TblEdminTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class TblEdmin.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        TblEdmin instance = new TblEdmin();
        Integer expResult = 1;
        instance.setId(expResult);
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setId method, of class TblEdmin.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        TblEdmin instance = new TblEdmin();
        instance.setId(id);
    }

    /**
     * Test of getUsername method, of class TblEdmin.
     */
    @Test
      public void testGetUsername() {
        System.out.println("getUsername");
        TblEdmin instance = new TblEdmin();
        String expResult = "admin";
        instance.setUsername("admin");
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }


    /**
     * Test of setUsername method, of class TblEdmin.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        TblEdmin instance = new TblEdmin();
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class TblEdmin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        TblEdmin instance = new TblEdmin();
        String expResult = "12345";
        instance.setPassword("12345");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class TblEdmin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "bjirka";
        TblEdmin instance = new TblEdmin();
        instance.setPassword(password);  
    }


    /**
     * Test of getallrecords method, of class TblEdmin.
     */
    @Test
    public void testGetallrecords() {
        System.out.println("getallrecords");
        TblEdmin instance = new TblEdmin();
        List<TblEdmin> result = instance.getallrecords();
        assertNotNull(result);
    }

    /**
     * Test of getbyid method, of class TblEdmin.
     */
    @Test
    public void testGetbyid() {
        System.out.println("getbyid");
        TblEdmin instance = new TblEdmin();
        instance.setId(0);
        List<TblEdmin> result = instance.getbyid();
        assertNotNull(result);
    }
}
