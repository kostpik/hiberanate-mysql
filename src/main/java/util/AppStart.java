package util;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import model.Addres;
import model.Owners;
import session.InitialHibernate;


public class AppStart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   InitialHibernate  start  = new InitialHibernate();
   start.getSessionFactory();
   System.out.println("вот таки дела "+InitialHibernate.class.isInstance(start));
	SessionFactory sessionFactory = InitialHibernate.sessionFactory;
	
	System.out.println(sessionFactory!= null ? "Ok sessoin fabric builded":"Fail = null");
	org.hibernate.Session session = sessionFactory.getCurrentSession();
     Transaction tx =session.beginTransaction();
//     MetadataSources metadataSourse = new MetadataSources();
//     metadataSourse.addAnnotatedClass(org.model.Addres.class);
//     metadataSourse.I(org.model.Owners.class);
//     MetadataBuilder metadataBuilder = metadataSourse.getMetadataBuilder();
//     Metadata metadata =  metadataBuilder.build();
     
     Owners owner = new Owners("КОнстантин", "Gegrby", 33);
     Addres adrr  = new Addres("Радищева", owner);
     owner.setAdress(adrr);
     session.save(owner);
     tx.commit();
     session.close();
//     sessionFactory.close();
	}

}
