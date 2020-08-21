package net.enterComputer.siteExtraSecurity.repository;

import net.enterComputer.siteExtraSecurity.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
