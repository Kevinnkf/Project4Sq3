/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELUK;

import java.util.HashSet;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojogue.TblProduk;
import pojogue.AeUtil;

/**
 *
 * @author Kevin
 */
public class DAOProdukTest {
    
    public DAOProdukTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of retrieveTblProduk method, of class DAOProduk.
     */
    @Test
    public void testRetrieveTblProduk() {
        System.out.println("retrieveTblProduk");
        DAOProduk instance = new DAOProduk();
        List<TblProduk> result = instance.retrieveTblProduk();
        System.out.println("Total Product: " + result.toArray().length);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getbyID method, of class DAOProduk.
     */
    @Test
    public void testGetbyID() {
        System.out.println("getbyID");
        int produkId = 5;
        DAOProduk instance = new DAOProduk();
        List<TblProduk> result = instance.getbyID(produkId);
        assertFalse(result.isEmpty());
    }
//        System.out.println("getbyID");
//        Integer idMed = null;
//        DAOProduk instance = new DAOProduk();
//        List<TblProduk> expResult = null;
//        List<TblProduk> result = instance.getbyID(idMed);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

    /**
     * Test of addMed method, of class DAOProduk.
     */
    @Test
    public void testAddMed() {
        System.out.println("addMed");
        TblProduk prdt = new TblProduk();
        prdt.setProdukName("T-Shirt");
        prdt.setStok(100);
        prdt.setHarga(400000); 
        prdt.setUkuran("L, M");
        
        
        DAOProduk instance = new DAOProduk();
        String expResult = "berhasil";
        instance.addMed(prdt);
    
        assertNotNull(prdt);
    }
//        System.out.println("addMed");
//        TblProduk medicine = null;
//        DAOProduk instance = new DAOProduk();
//        instance.addMed(medicine);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

    /**
     * Test of deleteMed method, of class DAOProduk.
     */
    @Test
    public void testDeleteMed() {
        System.out.println("deleteMed");
    
        Integer idProduct = 0;
        DAOProduk instance = new DAOProduk(); 
        Transaction transaction = null;
        Session session = AeUtil.getSessionFactory().openSession();
    
        transaction = session.beginTransaction();
        instance.deleteMed(idProduct);
        transaction.commit();
    
        TblProduk deletedProduct = (TblProduk) session.get(TblProduk.class, idProduct);
        assertNull(deletedProduct);
    }

    /**
     * Test of editMed method, of class DAOProduk.
     */
    @Test
    public void testEditMed() {
        System.out.println("editMed");
        DAOProduk instance = new DAOProduk();
        Transaction transaction = null;
        Session session = AeUtil.getSessionFactory().openSession();
    
        Integer id = 1;
        TblProduk prdk = new TblProduk();
        prdk.setProdukId(id);
        prdk.setProdukName("Jaketpanas");
        prdk.setStok(0);
        prdk.setHarga(0);
        prdk.setUkuran("XL");
       
    
        transaction = session.beginTransaction();
        instance.editMed(prdk);
        transaction.commit();
    
        TblProduk editedProduct = (TblProduk) session.get(TblProduk.class, id);
    
        String expResult = editedProduct.getProdukName();
        String result = editedProduct.getProdukName();
    
        assertEquals(expResult, result);
    }
//        System.out.println("editMed");
//        TblProduk medicine = null;
//        DAOProduk instance = new DAOProduk();
//        instance.editMed(medicine);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
}
