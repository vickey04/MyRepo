package org.vvs.projects.trading.service;

import java.util.Collection;
import org.vvs.projects.trading.domain.Account;

public interface AccountStatusCheckerService {
	
	Collection<Account> getAllAccountsStatus(); 
}
