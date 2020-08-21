package net.enterComputer.siteExtraSecurity.service;

import net.enterComputer.siteExtraSecurity.model.SWOT;
import net.enterComputer.siteExtraSecurity.model.Subscriber;

public interface SendEmailService {
    void sendEmail(Subscriber subscriber);
    void sendSWOT(SWOT swot);
}
