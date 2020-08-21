package net.enterComputer.siteExtraSecurity.repository;

import net.enterComputer.siteExtraSecurity.model.RegisterAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterAccountRepository extends JpaRepository<RegisterAccount, Integer> {
}