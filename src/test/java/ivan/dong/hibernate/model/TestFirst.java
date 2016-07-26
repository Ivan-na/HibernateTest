package ivan.dong.hibernate.model;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class TestFirst {

	@Test
	public void test01() {
		Configuration conf = new Configuration().configure();
		// Hibernate3 Style
		// conf.buildSessionFactory();
		ServiceRegistry sr = new StandardServiceRegistryBuilder()
				.applySettings(conf.getProperties()).build();
		SessionFactory sf = conf.buildSessionFactory(sr);

		Session sess = null;
		try {
			sess = sf.openSession();
			sess.beginTransaction();
			TUser user = new TUser();
			user.setNickname("zs");
			user.setUsername("张三");
			user.setBorn(new Date());
			user.setPassword("12345");
			sess.save(user);
			sess.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (null != sess)
				sess.close();
		}

	}

}
