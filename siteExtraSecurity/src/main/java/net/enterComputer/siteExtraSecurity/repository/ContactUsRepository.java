package net.enterComputer.siteExtraSecurity.repository;

import net.enterComputer.siteExtraSecurity.model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Long> {
}
//JpaRepository<ContactUs,Long>
