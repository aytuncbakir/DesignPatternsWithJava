package structural_patterns.facade.payment;

import structural_patterns.facade.account.Account;
import structural_patterns.facade.account.EnumDebtType;
import structural_patterns.facade.following.FollowingAccountsService;
import structural_patterns.facade.structuring.StructuringControlService;

public class PaymentControlService {

	private StructuringControlService structuringControlService;
    private FollowingAccountsService followingAccountsService;

    public PaymentControlService() {
    	structuringControlService = new StructuringControlService();
        followingAccountsService = new FollowingAccountsService();
    }

    public boolean checkPayment(Account account){
        boolean isStructuringAvailable = false;
        if (EnumDebtType.STRUCTURED.equals(account.getDebt().getDebtType())){
        	isStructuringAvailable = structuringControlService.isStructuringAvailable(account.getDebt().getExpiryDate());
        }
        boolean followingAccount = followingAccountsService.isFollowingAccount(account.getId());
        boolean isDebtPayable = !(isStructuringAvailable || followingAccount);
        return isDebtPayable;
    }
}
