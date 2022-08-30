package structural_patterns.facade.citizen;

import java.util.Arrays;
import java.util.List;

public class CitizenRepository {

	public  List<Long> findAllAccounts() {
        List<Long> accountsList = Arrays.asList(1L, 2L, 3L, 4L,5L,6L,7L,8L,9L,10L);
        return accountsList;
    }
}
