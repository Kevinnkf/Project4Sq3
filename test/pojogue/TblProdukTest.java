/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojogue;

import MODELUK.DAOProduk;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TblProdukTest {
    
    public TblProdukTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getallrecords method, of class TblProduk.
     */
    @Test
    public void testGetallrecords() {
    System.out.println("Test Get All Record");
    TblProduk instance = new TblProduk();
    List<TblProduk> result = instance.getallrecords();
    System.out.println(result.toArray().length);
    assertFalse(result.isEmpty());
    }

    /**
     * Test of getById method, of class TblProduk.
     */
    @Test
    public void testGetById() {
        System.out.println("Test Search ID");
        TblProduk instance = new TblProduk();
        instance.setProdukId(1);
        String  expResult = "ep";
        String  Result =  instance.getById();
        assertEquals(expResult, Result);     
        
    }
    public void testGetByIdFail() {
        System.out.println("Test Search ID");
        TblProduk instance = new TblProduk();
        instance.setProdukId(900);
        String  expResult = "produk";
        String  Result =  instance.getById();
        assertEquals(expResult, Result);     
    }

    /**
     * Test of deleteProd method, of class TblProduk.
     */
    @Test
    public void testDeleteProd() {
        System.out.println("deleteProd");
        TblProduk instance = new TblProduk();
        instance.setProdukId(0);
        String expResult = "produk";
        String result = instance.deleteProd();
        assertEquals(expResult, result);
    }

    /**
     * Test of editMed method, of class TblProduk.
     */
    @Test
    public void testEditMed() {
        System.out.println("editMed");
        TblProduk instance = new TblProduk();
        instance.setProdukId(0);
        instance.setProdukName("Bjordli");
        instance.setStok(6969);
        instance.setHarga(69);
        instance.setUkuran("2109");
        String expResult = "produk";
        String result = instance.editMed();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of saveMed method, of class TblProduk.
     */
    @Test
    public void testSaveMed() {
  System.out.println("Test Save Product");
        TblProduk instance = new TblProduk();
        instance.setProdukName("Erigo");
        instance.setStok(20);
        instance.setHarga(20);
        instance.setUkuran("XL");
        
        
        String expResult = "produk";
        String result = instance.saveMed();

        assertEquals(expResult, result);
    }
   

    /**
     * Test of goBack method, of class TblProduk.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        TblProduk instance = new TblProduk();
        String expResult = "produk";
        String result = instance.goBack();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetProdukId() {
        System.out.println("getProdukId");
        TblProduk instance = new TblProduk();
        Integer expResult = 1;
        instance.setProdukId(expResult);
        Integer result = instance.getProdukId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProdukId method, of class TblProduk.
     */
    @Test
    public void testSetProdukId() {
        System.out.println("setProdukId");
        Integer produkId = 1;
        TblProduk instance = new TblProduk();
        instance.setProdukId(produkId);
    }

    /**
     * Test of getProdukName method, of class TblProduk.
     */
    @Test
    public void testGetProdukName() {
        System.out.println("getProdukName");
        TblProduk instance = new TblProduk();
        String expResult = "2521";
        instance.setProdukName(expResult);
        String result = instance.getProdukName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProdukName method, of class TblProduk.
     */
    @Test
    public void testSetProdukName() {
        System.out.println("setProdukName");
        String produkName = "Hoodie";
        TblProduk instance = new TblProduk();
        instance.setProdukName(produkName);
    }

    /**
     * Test of getStok method, of class TblProduk.
     */
    @Test
    public void testGetStok() {
        System.out.println("getStok");
        TblProduk instance = new TblProduk();
        int expResult = 90;
        instance.setStok(expResult);
        int result = instance.getStok();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStok method, of class TblProduk.
     */
    @Test
    public void testSetStok() {
        System.out.println("setStok");
        int stok = 90;
        TblProduk instance = new TblProduk();
        instance.setStok(stok);
    }

    /**
     * Test of getHarga method, of class TblProduk.
     */
    @Test
    public void testGetHarga() {
        System.out.println("getHarga");
        TblProduk instance = new TblProduk();
        int expResult = 80;
        instance.setHarga(expResult);
        int result = instance.getHarga();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHarga method, of class TblProduk.
     */
    @Test
    public void testSetHarga() {
        System.out.println("setHarga");
        int harga = 80;
        TblProduk instance = new TblProduk();
        instance.setHarga(harga);  
    }

    /**
     * Test of getUkuran method, of class TblProduk.
     */
    @Test
    public void testGetUkuran() {
        System.out.println("getUkuran");
        TblProduk instance = new TblProduk();
        String expResult = "XL";
        instance.setUkuran(expResult);
        String result = instance.getUkuran();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUkuran method, of class TblProduk.
     */
    @Test
    public void testSetUkuran() {
        System.out.println("setUkuran");
        String ukuran = "XL";
        TblProduk instance = new TblProduk();
        instance.setUkuran(ukuran);  
    }
}
