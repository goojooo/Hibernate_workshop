package org.itp.proj_2;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojos.Product;

public class Test {

    public static void main(String[] args) {
        // try-with-resources to ensure SessionFactory 
     //closes automatically
        try (SessionFactory sf = (SessionFactory) getFactory()) {
            System.out.println("Hibernate is up n running !!!!!!" + sf);
            Session ses=sf.openSession();
            //prepare Entity class obj having data
            
            
            Product p=new Product();
             p.setName("table");
            p.setPrice(100.00); p.setQty(10); 
            
            //save object
           // Transaction tx=null;
            boolean flag=false;
            try {
                //begin Tx
              //  tx=ses.beginTransaction(); 
                //internally calls con.setAutoCommit(false)
               ses.save(p);//if operationgets successful
               
                flag=true;
            } 
        
            catch(Exception e) {
                e.printStackTrace();
                flag=false;
            }
            finally {
                //perform Tx Mgmt
                if(flag) {
                   // tx.commit(); 
                    //internally calls con.commit() method
                    System.out.println("Object is saved(Record inserted)");
                }
                else {
                  //  tx.rollback(); //internally calls con.rollback() method
                    System.out.println("Object is not saved(Record is not inserted)");
                }
            }//finally

        }//main

    }//class
}