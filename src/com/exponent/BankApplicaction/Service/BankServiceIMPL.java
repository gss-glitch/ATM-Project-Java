package com.exponent.BankApplicaction.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exponent.BankApplicaction.DAOService.DAOService;
import com.exponent.BankApplicaction.Entity.Account;

@Service
public class BankServiceIMPL implements BankService {
//The @Autowired annotation in Spring is used for automatic dependency injection.
	// It enables the Spring container to resolve and inject collaborating beans
	// into a class. T
	@Autowired
	private DAOService daoService;

	@Override
	public void registerStudentDetailsInService(Account account) {

		daoService.registerStudentDetailsInDAO(account);
	}

	@Override
	public Account loginStudentDetailsInService(long accNo) {

		Account account = daoService.loginStudentDetailsInDAOService(accNo);

		return account;
	}

	@Override
	public Account withdrawAccountBalanceInService(long accBalance) {

		Account balance = daoService.withdrawAccountBalanceInDAOService(accBalance);

		return balance;
	}

	@Override
	public void updateAccountBalanceInService(Account account) {

		daoService.updateAccountBalanceInDAOService(account);

	}

	@Override
	public Account showAccountDetailsService(long accNo) {

		Account account = daoService.showAccountDetailsDAOService(accNo);

		return account;
	}

	@Override
	public Account depositAccountBalanceInService(long accNo) {

		Account account = daoService.depositAccountBalanceInDAOService(accNo);

		return account;

	}

	@Override
	public void updateDepositBalance(Account account) {

		daoService.updateDepositBalanceDAO(account);
	}

	@Override
	public Account showAccountBalanceService(long accNo) {

		Account account = daoService.showAccountBalanceDAOService(accNo);

		return account;

	}

	@Override
	public Account deleteAccountInService(long accNo) {

		Account account = daoService.deleteAccountInDAOService(accNo);

		return account;

	}

	@Override
	public void updateDeleteBankInService(Account account) {

		daoService.updateDeleteBankInDAOService(account);

	}

	@Override
	public Account editDetailsInService(long accNo) {

		Account account = daoService.editDetailsInDAOService(accNo);

		return account;
	}

	@Override
	public void updateAccountDetailsInService(Account account) {

		daoService.updateAccountDetailsInDAOService(account);

	}

}
