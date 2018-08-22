package com.arka.student.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
		   private static StandardServiceRegistry standardRegistry;
		   private static SessionFactory sessionFactory;
		   
		   public static SessionFactory getSessionFactory() {
			      if (sessionFactory == null) {
			    	  standardRegistry = new StandardServiceRegistryBuilder().configure("com/arka/student/cfg/hibernate.cfg.xml").build();
			    	  Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			    			sessionFactory = metaData.getSessionFactoryBuilder().build();
			      }
				return sessionFactory;
		   }
}

