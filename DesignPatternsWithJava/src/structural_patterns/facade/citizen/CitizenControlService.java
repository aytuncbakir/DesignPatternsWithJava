package structural_patterns.facade.citizen;

import java.util.List;

import structural_patterns.facade.account.Account;

public class CitizenControlService {
	
	CitizenRepository citizenRepository;
	
	public CitizenControlService() {
		citizenRepository = new CitizenRepository();
	}

	public boolean isCitizen (Account account ) {
		boolean isCitizen = checkAccount(account);
		return isCitizen;
	}
	
	public boolean checkAccount(Account account) {
        List<Long> accountsList = citizenRepository.findAllAccounts();
        return accountsList.contains(account.getId());
    }

}
