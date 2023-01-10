/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELUK;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojogue.TblVendor;

/**
 *
 * @author Kevin
 */
public class DAOVendorTest {
    
    public DAOVendorTest() {
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
     * Test of retrieveVendor method, of class DAOVendor.
     */
    @Test
    public void testRetrieveVendor() {
        System.out.println("retrieveVendor");
        DAOVendor instance = new DAOVendor();
        List<TblVendor> result = instance.retrieveVendor();
        assertNotNull(result);
    }

    /**
     * Test of getbyID method, of class DAOVendor.
     */
    @Test
    public void testGetbyID() {
        System.out.println("getbyID");
        Integer idVen = 3;
        DAOVendor instance = new DAOVendor();
        List<TblVendor> result = instance.getbyID(idVen);
        assertNotNull(result);
    }

    /**
     * Test of addMed method, of class DAOVendor.
     */
    @Test
    public void testAddMed() {
        System.out.println("addVen");
        TblVendor ven = new TblVendor();
        ven.setVendorName("Bjirka");
        ven.setVendorAddress("Jl. Irjen Sambo Kav. 10 - 11, RT.10/RW.11, Karet Tengsin, RT.10/RW.11, Karet Tengsin");
        DAOVendor instance = new DAOVendor();
        instance.addMed(ven);
    }

    /**
     * Test of deleteMed method, of class DAOVendor.
     */
    @Test
    public void testDeleteMed() {
        System.out.println("deleteVen");
        Integer idVen = 0;
        DAOVendor instance = new DAOVendor();
        instance.deleteMed(idVen);
    }

    /**
     * Test of editMed method, of class DAOVendor.
     */
    @Test
    public void testEditMed() {
        System.out.println("editVen");
        TblVendor ven = new TblVendor();
        ven.setVendorId(3);
        ven.setVendorName("MIKE");
        ven.setVendorAddress("Jl. RE Martadinata Kav. 10 - 11, RT.10/RW.11, Karet Tengsin, RT.10/RW.11, Karet Tengsin, Kecamata");
        DAOVendor instance = new DAOVendor();
        instance.editMed(ven);
    }
    
}
