package net.enterComputer.siteExtraSecurity.service;

import net.enterComputer.siteExtraSecurity.model.RegisterAccount;
import net.enterComputer.siteExtraSecurity.model.SWOT;

public interface SwotService {
    void saveSWOT(SWOT swot);
    void sendSwotMail(SWOT swot);
}
