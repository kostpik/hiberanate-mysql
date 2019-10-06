package util;

import model2.AddresEmbeded;
import model3.Owners;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import session.InitialHibernate;
import java.util.ArrayList;
import java.util.List;


public class MySQL_Start {

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
     
//     OwnersWithAddres owner = new OwnersWithAddres("Константин", "Иванов", 33);
//     OwnersWithAddres owner2 = new OwnersWithAddres("Виктор", "Круглов", 37);
//     OwnersWithAddres owner3 = new OwnersWithAddres("Буратино", "Смирнов", 37);
//     OwnersWithAddres owner4 = new OwnersWithAddres("Колян", "Тугоухов", 36);
//     AddresEmbeded adrr   = new AddresEmbeded("radicsheva");
//     AddresEmbeded adrr2  = new AddresEmbeded("krestovaja");
//     AddresEmbeded adrr3  = new AddresEmbeded("centralnaya");
//     AddresEmbeded adrr4  = new AddresEmbeded("nameberejnaya");
//
//        List<OwnersWithAddres> ownersList = new ArrayList<>();
//        ownersList.add(owner); ownersList.add(owner2); ownersList.add(owner3); ownersList.add(owner4);
       // owner.setAddress(adrr); owner2.setAddress(adrr2); owner3.setAddress(adrr3); owner4.setAddress(adrr4);

        Owners owner = new Owners("Константин", "Иванов", 33);
        Owners owner2 = new Owners("Виктор", "Круглов", 37);
        Owners owner3 = new Owners("Буратино", "Смирнов", 37);
        Owners owner4 = new Owners("Колян", "Тугоухов", 36);
        AddresEmbeded adrr   = new AddresEmbeded("radicsheva");
        AddresEmbeded adrr2  = new AddresEmbeded("krestovaja");
        AddresEmbeded adrr3  = new AddresEmbeded("centralnaya");
        AddresEmbeded adrr4  = new AddresEmbeded("nameberejnaya");

        List<Owners> ownersList = new ArrayList<>();
        ownersList.add(owner); ownersList.add(owner2); ownersList.add(owner3); ownersList.add(owner4);
       owner.setAdress("Радищева");
       owner.setAdress("Стоялая");
       owner.setAdress("Пушкина");
        short count=0;
        for (Owners ent: ownersList) {
            System.out.println("iteration number " + ++count);
            session.persist(ent);
        }
        //session.persist(adrr);
        owner.setFirstName("Крокодил");
        tx.commit();
        session.close();
//     sessionFactory.close();
	}

}
