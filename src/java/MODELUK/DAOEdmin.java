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
import pojogue.TblEdmin;
import pojogue.AeUtil;

/**
 *
 * @author Alfian Fakhrudin
 */
public class DAOEdmin {
    public List<TblEdmin> retrieveTblAdmin(){
        List stud = new ArrayList();
        TblEdmin stud1 = new TblEdmin();
        
        Transaction trans = null;
        Session session = AeUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblEdmin");
            stud = query.list();       
            trans.commit();
        }catch (Exception e){
            System.out.println(e);
        }
        return stud;
    }
    
    public List<TblEdmin> getbyID1(int adm)
    {
        TblEdmin admn = new TblEdmin();
        List<TblEdmin> admn2 = new ArrayList();
       
        Transaction trans=null;
        Session session = AeUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from TblEdmin where id= :id");
            query.setInteger("id", adm);
            admn=(TblEdmin)query.uniqueResult();
            admn2=query.list();            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return admn2;
    }
    
    public void edminUpdate(TblEdmin admin)
    {
        Transaction trans=null;
        Session session= AeUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(admin);
            trans.commit();
        }   
        catch(Exception e)
        {
            
        }
        
    }
}
