package service;

import java.security.Principal;

import domain.PrimaryAccount;
import domain.PrimaryTransaction;
import domain.SavingsAccount;
import domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
