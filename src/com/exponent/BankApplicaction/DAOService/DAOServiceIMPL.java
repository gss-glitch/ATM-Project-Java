package com.exponent.BankApplicaction.DAOService;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exponent.BankApplicaction.Entity.Account;

@Repository
public class DAOServiceIMPL implements DAOService {

	@Autowired
	private SessionFactory sf;

	@Override
	public void registerStudentDetailsInDAO(Account account) {
		// session--Session is used to save user information momentarily on the server.
		// It starts from the instance the user logs into the application and remains
		// till the user logs out of the application or shuts down the machine. In both
		// cases, the session values are deleted automatically

		Session session = sf.openSession();
		account.setDate(new Date());

		session.save(account);
		session.beginTransaction().commit();

	}

	@Override
	public Account loginStudentDetailsInDAOService(long accNo) {

		Session session = sf.openSession();
		Account account = session.get(Account.class, accNo);

		System.out.println(accNo);
		/*
		 * Query query = session.createQuery("from Account where accountNo= :acn");
		 * query.setParameter("acn", accNo); Account account = (Account)
		 * query.getSingleResult();
		 * 
		 * System.out.println(account);
		 */

		return account;

	}

	@Override
	public Account withdrawAccountBalanceInDAOService(long accNo) {

		Session session = sf.openSession();

		Account account = session.get(Account.class, accNo);

		return account;

	}

	@Override
	public void updateAccountBalanceInDAOService(Account account) {

		Session session = sf.openSession();

		session.update(account);
		session.beginTransaction().commit();

	}

	@Override
	public Account showAccountDetailsDAOService(long accNo) {

		Session session = sf.openSession();

		Account account = session.get(Account.class, accNo);

		return account;
	}

	@Override
	public Account depositAccountBalanceInDAOService(long accNo) {

		Session session = sf.openSession();

		Account account = session.get(Account.class, accNo);

		return account;

	}

	@Override
	public void updateDepositBalanceDAO(Account account) {

		Session session = sf.openSession();

		session.saveOrUpdate(account);
		session.beginTransaction().commit();

	}

	@Override
	public Account showAccountBalanceDAOService(long accNo) {

		Session session = sf.openSession();
		Account account = session.get(Account.class, accNo);

		return account;

	}

	@Override
	public Account deleteAccountInDAOService(long accNo) {

		Session session = sf.openSession();

		Account account = session.get(Account.class, accNo);

		return account;

	}

	@Override
	public void updateDeleteBankInDAOService(Account account) {

		Session session = sf.openSession();
		session.delete(account);
		session.beginTransaction().commit();

	}

	@Override
	public Account editDetailsInDAOService(long accNo) {

		Session session = sf.openSession();

		Account account = session.get(Account.class, accNo);

		return account;
	}

	@Override
	public void updateAccountDetailsInDAOService(Account account) {

		Session session = sf.openSession();

		session.saveOrUpdate(account);
		session.beginTransaction().commit();

	}

}
