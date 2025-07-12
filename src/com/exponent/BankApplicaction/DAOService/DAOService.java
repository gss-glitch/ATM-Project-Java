package com.exponent.BankApplicaction.DAOService;

import com.exponent.BankApplicaction.Entity.Account;

public interface DAOService {
	//To perform various CRUD operations, there should be different
	//data structures which the DAO uses to communicate with various tables/collections in the Database.

	public abstract void registerStudentDetailsInDAO(Account account);

	public abstract Account loginStudentDetailsInDAOService(long accNo);

	public abstract Account withdrawAccountBalanceInDAOService(long accBalance);

	public abstract void updateAccountBalanceInDAOService(Account account);

	public abstract Account showAccountDetailsDAOService(long accNo);

	public abstract Account depositAccountBalanceInDAOService(long accNo);

	public abstract void updateDepositBalanceDAO(Account account);

	public abstract Account showAccountBalanceDAOService(long accNo);

	public abstract Account deleteAccountInDAOService(long accNo);

	public abstract void updateDeleteBankInDAOService(Account account);

	public abstract Account editDetailsInDAOService(long accNo);

	public abstract void updateAccountDetailsInDAOService(Account account);

}
