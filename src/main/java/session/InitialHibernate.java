package session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class InitialHibernate {
	
	private static StandardServiceRegistry registry;
	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				System.out.println("1 Create registry");
				// Create registry
				registry = new StandardServiceRegistryBuilder().configure().build();

				// Create MetadataSources
				System.out.println("2 Create MetadataSources");
				MetadataSources sources = new MetadataSources(registry);

				// Create Metadata
				System.out.println("3 Create Metadata");
				Metadata metadata = sources.getMetadataBuilder().build();

				// Create SessionFactory
				System.out.println("4 Create SessionFactory");
				sessionFactory = metadata.getSessionFactoryBuilder().build();

			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}

	
    
    public InitialHibernate() throws Exception {
    	
    	//createSessionFactory();
//      setUp();
    	
    }
    
    private  void createSessionFactory() {
//    	System.out.println("Start");
//	   this.sessionFactory = new MetadataSources(
//			   new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()
//			  ).buildMetadata().buildSessionFactory();
//	   System.out.println("Finish");
    	
             sessionFactory = new MetadataSources(
                new StandardServiceRegistryBuilder()
                    .configure("src/hibernate.cfg.xml").build()
            ).buildMetadata().buildSessionFactory();
        

	   
	   }
    public SessionFactory setUp() throws Exception {
    	// A SessionFactory is set up once for an application!
    	SessionFactory sessionFactory = null;
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure() // configures settings from hibernate.cfg.xml
    			.build();
    	try {
    		sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    	}
    	catch (Exception e) {
    		// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
    		// so destroy it manually.
    		System.out.println(e.getMessage()+" Ошибочка вышла");
    	//e.printStackTrace();
    		StandardServiceRegistryBuilder.destroy( registry );
    	}
    	return sessionFactory;
    }
   
    public SessionFactory  getSessionFactoryssss() {
    	
	   return this.sessionFactory;
	   
   }
}
