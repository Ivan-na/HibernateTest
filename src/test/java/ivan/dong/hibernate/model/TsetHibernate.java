package ivan.dong.hibernate.model;

import ivan.dong.hibernate.util.HibernateUtil;

import org.hibernate.Session;
import org.junit.Test;

public class TsetHibernate {

	@Test
	public void testStatus() {
		Session session = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			TUser user = new TUser();
			user.setId(1);
			user.setNickname("zs11234");
			user.setPassword("123");
			session.saveOrUpdate(user);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != session)
				session.getTransaction().rollback();
		} finally {
			if (null != session)
				HibernateUtil.closeSession(session);
		}
	}

}
