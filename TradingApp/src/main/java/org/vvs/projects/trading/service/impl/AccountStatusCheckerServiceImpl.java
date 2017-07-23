package org.vvs.projects.trading.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vvs.projects.trading.domain.Account;
import org.vvs.projects.trading.repository.AccountRepository;
import org.vvs.projects.trading.service.AccountStatusCheckerService;

@Service
public class AccountStatusCheckerServiceImpl implements AccountStatusCheckerService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Collection<Account> getAllAccountsStatus() {	
		
		Collection<Account> accounts = new ArrayList<Account>();
		this.accountRepository.findAll().forEach(accounts::add);
		
		return accounts;
	}

}
