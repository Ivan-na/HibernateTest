package ivan.dong.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	// Static Load
	private HibernateUtil() {

	}

	// Singleton+Lazy
	private static class SessionFactoryHolder {
		private static SessionFactory FACTORY = buildSessionFactory();

		private static SessionFactory buildSessionFactory() {
			Configuration cfg = new Configuration().configure();
			// -- hibernate 4 Style
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg
					.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		}
	}

	// Lazy Load
	public static SessionFactory getSessionFactory() {
		return SessionFactoryHolder.FACTORY;
	}

	public static Session openSession() {
		return SessionFactoryHolder.FACTORY.openSession();
	}

	// Util Methods
	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}
}
