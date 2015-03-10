package pl.btbw;

import org.hibernate.Session;
import pl.btbw.entity.UserAnnotationEntity;
import pl.btbw.entity.UserXmlEntity;

public class Program {

	public static void main(String[] args0) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		UserXmlEntity userXml = new UserXmlEntity();
		userXml.setName("michal.xml");
		session.save(userXml);

		UserAnnotationEntity userAnnotation = new UserAnnotationEntity();
		userAnnotation.setName("michal.ano");
		session.save(userAnnotation);

		session.getTransaction().commit();

		session.close();
		HibernateUtil.getSessionFactory().close();

		System.out.println("Hello world");
	}

}
