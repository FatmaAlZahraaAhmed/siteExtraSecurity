package net.enterComputer.siteExtraSecurity.service;

import net.enterComputer.siteExtraSecurity.model.ToDo;

import java.util.List;

public interface ToDoService {
    List<ToDo> getAllToDos();

    void saveToDo(ToDo toDo);

    ToDo getToDoById(long id);

    void deleteToDoById(long id);

}