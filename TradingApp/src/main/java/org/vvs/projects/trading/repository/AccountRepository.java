package org.vvs.projects.trading.repository;

import org.springframework.data.repository.CrudRepository;
import org.vvs.projects.trading.domain.Account;

public interface AccountRepository extends CrudRepository<Account, String> {
	
	
}
