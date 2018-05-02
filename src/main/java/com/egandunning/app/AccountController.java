package com.egandunning.app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egandunning.beans.Account;

@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(method=RequestMethod.GET)
    public Account[] getAccounts() {
        
        return null;
    }

    @RequestMapping(method=RequestMethod.POST)
    public Account postAccount(@RequestBody Account account) {
        
        return account;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Account getAccount(@PathVariable(value="id") String id) {
        return null;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public Account patchAccount(@PathVariable(value="id") String id, @RequestBody Account account) {
        return account;
    }
    
}
