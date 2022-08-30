package structural_patterns.facade.following;

import java.util.List;

public class FollowingAccountsService {

	private FollowingAccountsRepository followingAccountsRepository;

	public FollowingAccountsService() {
		followingAccountsRepository = new FollowingAccountsRepository();
	}

	public boolean isFollowingAccount(Long id) {

		List<Long> followingAccountsList = followingAccountsRepository.findAllFollowingAccounts();
		boolean isfollowingAccount = followingAccountsList.contains(id);
		if (isfollowingAccount) {
			System.out.println("Your account have been following. You can not do payment");
		}
		return isfollowingAccount;
	}
}
