package fr.uvsq.dao;

import org.hibernate.Session;

import fr.uvsq.beans.Album;
import fr.uvsq.hibernate.HibernateUtil;

public class AlbumDAOImpl implements AlbumDAO {

	public void insert(Album nouveau) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(nouveau);
		session.getTransaction().commit();

	}

}
