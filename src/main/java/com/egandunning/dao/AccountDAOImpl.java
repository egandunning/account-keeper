package com.egandunning.dao;

import java.util.ArrayList;
import java.util.List;

import com.egandunning.beans.Account;
import com.egandunning.beans.StreetAddress;
import com.egandunning.models.DollarAmount;

public class AccountDAOImpl implements AccountDAO {

    //for now, use dummy data.
    
    static ArrayList<Account> accounts = new ArrayList<>();;
    
    static {
        
        StreetAddress myAddr = new StreetAddress(123, "123 address rd", "Minnapolis", "MN",
                "55121");
        
        StreetAddress yourAddr = new StreetAddress(12345, "12345 address rd", "St. Paul", "MN",
                "55121");
        
        
        accounts.add(new Account(123, "dummy account", "egandunning.com", "me",
                myAddr, "132 123 1234", ""));
        accounts.add(new Account(1234, "another dummy account", "github.com", "me",
                myAddr, "132 123 1234", "", new DollarAmount(20), 12));
        accounts.add(new Account(12345, "dummy data", "wikipedia.com", "you",
                yourAddr, "333 333 4444", "", new DollarAmount(100, 45), 12));
    }
    
    @Override
    public List<Account> getAccounts(String owner) throws Exception {
        
        List<Account> yourAccounts = new ArrayList<>();
        
        for(Account a : accounts) {
            if(a.getOwner().equals(owner)) {
                yourAccounts.add(a);
            }
        }
        
        return yourAccounts;
    }

    @Override
    public Account getAccountById(String owner, long id) throws Exception {
        for(Account a : accounts) {
            if(a.getOwner().equals(owner) && a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void createAccount(Account account) throws Exception {
        
        accounts.add(account);
    }

    @Override
    public void updateAccount(long id, Account account) throws Exception {
        
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getId() == id) {
                accounts.set(i, account);
            }
        }
    }

    @Override
    public void deleteAccount(long id) throws Exception {
        
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getId() == id) {
                accounts.set(i, new Account());
            }
        }
    }

}
