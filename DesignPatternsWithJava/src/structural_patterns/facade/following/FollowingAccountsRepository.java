package structural_patterns.facade.following;

import java.util.Arrays;
import java.util.List;

public class FollowingAccountsRepository {

	public List<Long> findAllFollowingAccounts() {
        List<Long> followingAccountsList = Arrays.asList(1L, 2L, 3L, 4L,5L,6L,7L,8L,9L,10L);
        return followingAccountsList;
    }
}
