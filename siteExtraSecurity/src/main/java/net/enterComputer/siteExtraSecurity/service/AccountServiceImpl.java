package net.enterComputer.siteExtraSecurity.service;

import net.enterComputer.siteExtraSecurity.model.RegisterAccount;
import net.enterComputer.siteExtraSecurity.repository.RegisterAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    RegisterAccountRepository repository;

    @Override
    public void saveNewAccount(RegisterAccount account) {
        this.repository.save(account);
    }
}