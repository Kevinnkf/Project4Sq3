/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELUK;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojogue.AeUtil;
import pojogue.TblEdmin;
/**
 *
 * @author Alfian Fakhrudin
 */
public class DAOLogin {
    public List<TblEdmin> getBy(String uName, String uPass) {
        TblEdmin us = new TblEdmin(); //instantiasi objek baru di dalam method TBLUser()
        /*List dibawah digunakan untuk mendapatkan data dari method TBLUser() 
        di class TBLUser, untuk mendapatkan data yang diinput ke user dan memasukkannya
        ke dalam array.*/ 
        List<TblEdmin> user = new ArrayList(); //variable ini akan menjadi return untuk fungsi public list

        Transaction trans = null;
        //Interface koneksi ke db
        Session session = AeUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblEdmin where username= :uName AND password= :uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
            us = (TblEdmin) query.uniqueResult();
            user = query.list();

            trans.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return user;
    }
}
