package com.egandunning.dao;

import java.util.List;

import com.egandunning.beans.Account;

public interface AccountDAO {

    public List<Account> getAccounts(String owner) throws Exception;
    
    public Account getAccountById(String owner, long id) throws Exception;
    
    public void createAccount(Account account) throws Exception;
    
    public void updateAccount(long id, Account account) throws Exception;
    
    public void deleteAccount(long id) throws Exception;
}
