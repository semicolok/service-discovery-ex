package ex.discovery.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account getAccounts() {
        final Account account = new Account();
        account.setName("testAccount");
        account.setCode("testCode");

        return account;
    }
}
