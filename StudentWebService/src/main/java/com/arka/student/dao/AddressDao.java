package com.arka.student.dao;

import org.hibernate.Session;

import com.arka.student.model.Address;
import com.arka.student.util.HibernateUtil;

public class AddressDao {
	public void saveAddress(Address address) {
		Session session=(Session) HibernateUtil.getSessionFactory().openSession();
		session.save(address);
		session.beginTransaction().commit();
		session.close();
	}
	public Address getAddressById(int id) {
		Session session=(Session) HibernateUtil.getSessionFactory().openSession();
		Address address=session.get(Address.class, id);
		session.close();
		return address;
	}
}
