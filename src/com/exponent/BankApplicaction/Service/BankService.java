package com.exponent.BankApplicaction.Service;

import com.exponent.BankApplicaction.Entity.Account;

public interface BankService {

	public abstract void registerStudentDetailsInService(Account account);
	
	public abstract Account loginStudentDetailsInService(long accNo);
	
	public abstract Account  withdrawAccountBalanceInService(long accNo);
	
	public abstract void updateAccountBalanceInService(Account account);
	
	public abstract Account showAccountDetailsService(long accNo);
	
	public abstract Account depositAccountBalanceInService(long accNo);
	
	public abstract void updateDepositBalance(Account account);
	
	public abstract Account showAccountBalanceService(long accNo);

	public abstract Account deleteAccountInService(long accNo);

	public abstract void updateDeleteBankInService(Account account);

	public abstract Account editDetailsInService(long accNo);

	public abstract void updateAccountDetailsInService(Account account);
}
