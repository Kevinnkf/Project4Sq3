/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELUK;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojogue.TblEdmin;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

/**
 *
 * @author Kevin
 */
public class DAOLoginTest {
    
    public DAOLoginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOLogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("Test Login");
        String username = "adll";
        String password = "adli";   
        int empty = 0;
        DAOLogin instance = new DAOLogin();
        List<TblEdmin> result = instance.getBy(username, password);
        System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(equalTo(empty))));
    }
    
}
