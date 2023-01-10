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
import pojogue.TblVendor;

/**
 *
 * @author Alfian Fakhrudin
 */
public class DAOVendor {
    
    public List<TblVendor> retrieveVendor(){
        List stud = new ArrayList();
        TblVendor stud1 = new TblVendor();
        
        Transaction trans = null;
        Session session = AeUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblVendor");
            stud = query.list();
            
            trans.commit();
        }catch (Exception e){
            System.out.println(e);
        }
        return stud;
    }
    
        public List<TblVendor> getbyID(Integer idMed) {
        TblVendor med = new TblVendor();
        List<TblVendor> listMed = new ArrayList();
        Transaction transaction = null;
        Session session = AeUtil.getSessionFactory().openSession();  
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from TblVendor where vendor_id = :id");
            query.setInteger("id", idMed);
            med = (TblVendor) query.uniqueResult();
            listMed = query.list();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listMed;
    }
    
    // untuk add data
    public void addMed(TblVendor medicine){
        Transaction transaction = null;
        Session session = AeUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(medicine);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk delete berdcasarkan id
    public void deleteMed(Integer idMed) {
        Transaction transaction = null;
        Session session =AeUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {
            String hql = "delete from TblVendor where vendor_id= :mid";
            Query q = session.createQuery(hql);
            q.setInteger("mid", idMed);
            q.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk edit
    public void editMed(TblVendor medicine) {
        Transaction transaction = null;
        Session session = AeUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(medicine);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
}
