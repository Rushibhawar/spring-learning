package com.hibernate.img;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Address address = new Address();
		address.setCity("Pune");
		address.setOpen(true);
		address.setStreet("Banner High Street");
		address.setAddedDate(new Date());
		address.setX(false);
		
		//reading image
		FileInputStream file = new FileInputStream("src/main/java/maxresdefault.jpg");
		byte[] data = new byte[file.available()];
		file.read(data);
		address.setImage(data);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(address);
		tx.commit();
		session.close();
		System.out.println("Done");
	}

}
