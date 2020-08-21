package net.enterComputer.siteExtraSecurity.service;

import net.enterComputer.siteExtraSecurity.model.ContactUs;
import net.enterComputer.siteExtraSecurity.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsServiceImpl implements ContactUsServices {
    @Autowired
    private ContactUsRepository repository;

    @Override
    public void saveNewMessage(ContactUs message) {
        this.repository.save(message);
    }
}