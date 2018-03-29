package app;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import beans.Account;
import beans.StreetAddress;

@RestController
public class AccountController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/account")
    public Account account() {
        return new Account(123, "dummy account", "egandunning.com", "me",
                new StreetAddress(123, "123 address rd", "Minnapolis", "MN",
                        "55121"),
                "132 123 1234", "");
    }

}
