package com.egandunning.app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egandunning.beans.Account;
import com.egandunning.beans.StreetAddress;

@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(method=RequestMethod.GET)
    public Account[] getAccounts() {
        Account[] accounts = new Account[1];
        accounts[0] = new Account(123, "dummy account", "egandunning.com", "me",
                new StreetAddress(123, "123 address rd", "Minnapolis", "MN",
                        "55121"),
                "132 123 1234", "");
        return accounts;
    }

    @RequestMapping(method=RequestMethod.POST)
    public Account postAccount(@RequestBody Account account) {
        
        return account;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Account getAccount(@PathVariable(value="id") String id) {
        return null;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.PATCH)
    public Account patchAccount(@PathVariable(value="id") String id, @RequestParam(value="account") Account account) {
        return account;
    }
    
}
