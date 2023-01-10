/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojogue;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TblVendorTest {
    
    public TblVendorTest() {
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
     * Test of getVendorId method, of class TblVendor.
     */
    @Test
    public void testGetVendorId() {
        System.out.println("getVendorId");
        TblVendor instance = new TblVendor();
        Integer expResult = 3;
        instance.setVendorId(expResult);
        Integer result = instance.getVendorId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVendorId method, of class TblVendor.
     */
    @Test
    public void testSetVendorId() {
        System.out.println("setVendorId");
        Integer vendorId = 3;
        TblVendor instance = new TblVendor();
        instance.setVendorId(vendorId);
    }

    /**
     * Test of getVendorName method, of class TblVendor.
     */
    @Test
    public void testGetVendorName() {
        System.out.println("getVendorName");
        TblVendor instance = new TblVendor();
        String expResult = "Bjorwi";
        instance.setVendorName(expResult);
        String result = instance.getVendorName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVendorName method, of class TblVendor.
     */
    @Test
    public void testSetVendorName() {
        System.out.println("setVendorName");
        String vendorName = "Bjorwi";
        TblVendor instance = new TblVendor();
        instance.setVendorName(vendorName);
    }

    /**
     * Test of getVendorAddress method, of class TblVendor.
     */
    @Test
    public void testGetVendorAddress() {
        System.out.println("getVendorAddress");
        TblVendor instance = new TblVendor();
        String expResult = "Jl. Bharada E Kav. 10 - 11, RT.10/RW.11, Karet Tengsin, RT.10/RW.11, Karet Tengsin";
        instance.setVendorAddress(expResult);
        String result = instance.getVendorAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVendorAddress method, of class TblVendor.
     */
    @Test
    public void testSetVendorAddress() {
        System.out.println("setVendorAddress");
        String vendorAddress = "Jl. Bharada E Kav. 10 - 11, RT.10/RW.11, Karet Tengsin, RT.10/RW.11, Karet Tengsin";
        TblVendor instance = new TblVendor();
        instance.setVendorAddress(vendorAddress);
    }

    /**
     * Test of getallrecords method, of class TblVendor.
     */
    @Test
    public void testGetallrecords() {
        System.out.println("getallrecords");
        TblVendor instance = new TblVendor();
        List<TblVendor> result = instance.getallrecords();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class TblVendor.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        TblVendor instance = new TblVendor();
        instance.setVendorId(3);
        String expResult = "ev";
        String result = instance.getById();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetByIdFail() {
        System.out.println("getById");
        TblVendor instance = new TblVendor();
        instance.setVendorId(1);
        String expResult = "vendor";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteVen method, of class TblVendor.
     */
    @Test
    public void testDeleteVen() {
        System.out.println("deleteVen");
        TblVendor instance = new TblVendor();
        instance.setVendorId(0);
        String expResult = "vendor";
        String result = instance.deleteVen();
        assertEquals(expResult, result);
    }

    /**
     * Test of editMed method, of class TblVendor.
     */
    @Test
    public void testEditMed() {
        System.out.println("editMed");
        TblVendor instance = new TblVendor();
        instance.setVendorId(3);
        instance.setVendorName("Bjorwi");
        instance.setVendorAddress("Jl. Bripka RR Kav. 10 - 11, RT.10/RW.11, Karet Tengsin, RT.10/RW.11, Karet Tengsin");
        String expResult = "vendor";
        String result = instance.editMed();
        assertEquals(expResult, result);
    }

    /**
     * Test of saveMed method, of class TblVendor.
     */
    @Test
    public void testSaveMed() {
        System.out.println("saveMed");
        TblVendor instance = new TblVendor();
        instance.setVendorName("Bjorka");
        instance.setVendorAddress("Jl. Kuwat Ma'ruf Kav. 10 - 11, RT.10/RW.11, Karet Tengsin, RT.10/RW.11, Karet Tengsin");
        String expResult = "vendor";
        String result = instance.saveMed();
        assertEquals(expResult, result);
    }

    /**
     * Test of goBack method, of class TblVendor.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        TblVendor instance = new TblVendor();
        String expResult = "vendor";
        String result = instance.goBack();
        assertEquals(expResult, result);
    }
    
}
