package org.vvs.projects.trading.web;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vvs.projects.trading.domain.Account;
import org.vvs.projects.trading.service.AccountStatusCheckerService;


@Controller
public class AccountStatusController {
	
	@Autowired
	private AccountStatusCheckerService accountStatusCheckerService;
	
	@RequestMapping("/home")
	public String showAccounts(Map<String, Object> model) {
		
		Collection<Account> accounts = this.accountStatusCheckerService.getAllAccountsStatus();
		
		model.put("accounts", accounts);
		return "dashboard";
	}
	
}
