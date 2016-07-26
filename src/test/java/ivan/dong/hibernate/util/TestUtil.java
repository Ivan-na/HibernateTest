package ivan.dong.hibernate.util;

import junit.framework.Assert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

public class TestUtil {

	@Test
	public void test() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		SessionFactory sf2 = HibernateUtil.getSessionFactory();
		Session s3 = HibernateUtil.openSession();
		SessionFactory sf3 = s3.getSessionFactory();
		Assert.assertEquals(sf, sf3);
		Assert.assertSame(sf, sf2);
		Assert.assertSame(sf, sf3);
	}

}
