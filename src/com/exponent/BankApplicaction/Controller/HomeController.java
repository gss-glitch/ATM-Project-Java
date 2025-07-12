package com.exponent.BankApplicaction.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.exponent.BankApplicaction.Entity.Account;
import com.exponent.BankApplicaction.Service.BankService;
// if we want to represent java class as a spring controller class then we use @controller anotation
@Controller
public class HomeController {

	@Autowired
	private BankService bankService;
//@RequestMapping is use for to bind http request to my controller method -value -to understand which method is binded with request
	@RequestMapping(value = "/register")
	//@ModelAttribute-use to bind no of entites to single entity
	public String registerAccount(@ModelAttribute Account account) {

		bankService.registerStudentDetailsInService(account);

		return "registerSuccess";
	}

	@RequestMapping(value = "/login")
	//if we want to take data from quary paramerter then we use @RequestParam
	public String loginAccount(@RequestParam("userName") String user, @RequestParam("accountNo") long accNo) {

		Account account = bankService.loginStudentDetailsInService(accNo);
		
		
		
		System.out.println(account);

		if (account != null && user.equals(account.getUserName()) && accNo == account.getAccountNo()) {
			return "mainPage";
		} else {
			return "loginUserNotFound";
		}

	}

	@RequestMapping(value = "/withdraw")
	public String withdrawAccountBalance(@RequestParam("amount") int withdrawamount,
			@RequestParam("accountNo") long accNo) {

//		System.out.println(accBalance);
		Account account = bankService.withdrawAccountBalanceInService(accNo);

		int totalBalance = account.getAccountBalance();

		if (withdrawamount <= totalBalance) {

			totalBalance = totalBalance - withdrawamount;

			account.setAccountBalance(totalBalance);
			bankService.updateAccountBalanceInService(account);

			return "withdrawSuccess";
		} else {
			return "insuficientFund";
		}

	}

	@RequestMapping(value = "/deposit")
	public String depositAccountBalance(@RequestParam("amount") int depositAmount,
			@RequestParam("accountNo") long accNo) {

		Account account = bankService.depositAccountBalanceInService(accNo);

		int totalBalance = account.getAccountBalance();

		totalBalance = totalBalance + depositAmount;

		account.setAccountBalance(totalBalance);
		bankService.updateDepositBalance(account);

		return "deposit-success";
	}

	@RequestMapping(value = "/Details")
	public String showAccountDetails(@RequestParam("accountNo") long accNo, @RequestParam("userName") String user,
			Model model) {

		Account account = bankService.showAccountDetailsService(accNo);

		if (accNo == (account.getAccountNo()) && user.equals(account.getUserName())) {

			model.addAttribute("accountDetails", account);
			return "showDetails";
		} else {
			return "showDetailsNotFound";
		}

	}

	@RequestMapping(value = "/balance")
	public String showBalance(@RequestParam("accountNo") long accNo, @RequestParam("userName") String user,
			Model model) {

		Account account = bankService.showAccountBalanceService(accNo);

		if (accNo == (account.getAccountNo()) && user.equals(account.getUserName())) {

			model.addAttribute("accountBalance", account);

			return "showBalance";
		} else {

			return "userNotFound";
		}

	}

	@RequestMapping(value = "/detele")
	public String deleteAccount(@RequestParam("accountNo") long accNo, @RequestParam("userName") String user) {

		Account account = bankService.deleteAccountInService(accNo);

		if (accNo == (account.getAccountNo()) && user.equals(account.getUserName())) {

			bankService.updateDeleteBankInService(account);

			return "deleteAccountSuccess";

		} else {

			return "deleteUserNotFound";
		}

	}

	@RequestMapping(value = "/edit")
	public String editDetails(@RequestParam("accountNo") long accNo, @RequestParam("userName") String user,
			@RequestParam("mobileNo") long mobile) {

		Account account = bankService.editDetailsInService(accNo);

		if (accNo == account.getAccountNo()) {

			account.setUserName(user);
			account.setMobileNo(mobile);

			bankService.updateAccountDetailsInService(account);

			return "updateDetailsSuccess";

		} else {
			return "deleteUserNotFound";
		}

	}

}
