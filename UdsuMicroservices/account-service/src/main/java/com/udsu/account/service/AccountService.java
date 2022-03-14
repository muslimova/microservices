package com.udsu.account.service;

import com.udsu.account.domain.Account;
import com.udsu.account.domain.User;

public interface AccountService {

    Account findByName(String accountName);

    Account create(User user);

    void saveChanges(String name, Account update);
}
