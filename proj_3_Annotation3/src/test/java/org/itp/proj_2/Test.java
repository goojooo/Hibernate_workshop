package org.itp.proj_2;

import static utils.HibernateUtils.getFactory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojos.Artist;

public class Test {


    public static void main(String[] args) {
       // try-with-resources to ensure SessionFactory closes automatically
        try (SessionFactory sf = getFactory()) {
            System.out.println("Hibernate is up n running !!!!!!" + "SF classname is  "+ sf.getClass());
            Session ses=sf.openSession();
            System.out.println("SESSION INTERFACE CLASS NAME IS "+ses.getClass());
            //prepare Entity class obj having data
//           Artist p=new Artist();
           Artist p=ses.get(Artist.class,2);
//           p.setName("xxxtt");

           if(p == null)
           {
        	   System.out.println("Record not found...");
           }
        	   //save object
        	   Transaction tx=null;
        	   boolean flag=false;
       
          
            try {
                //begin Tx
                tx=ses.beginTransaction(); //internally calls con.setAutoCommit(false)
//               p.setCategory("gaanduu");
               ses.delete(p);
//                ses.update(p);
//                int idVal=(int)ses.save(p);
//                System.out.println("generated id "+idVal);
                flag=true;
            } 
        
            catch(HibernateException e) {
                e.printStackTrace();
                flag=false;
            }
            catch(Exception e) {
                e.printStackTrace();
                flag=false;
            }
            finally {
                //perform Tx Mgmt
                if(flag) {
                    tx.commit(); //internally calls con.commit() method
                    System.out.println("Object is saved(Record inserted)");
                }
                else {
                    tx.rollback(); //internally calls con.rollback() method
                    System.out.println("Object is not saved(Record is not inserted)");
                }
            }//finally

        }//main

    }//class
}