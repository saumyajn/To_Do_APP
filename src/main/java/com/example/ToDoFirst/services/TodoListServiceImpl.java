package com.example.ToDoFirst.services;

import com.example.ToDoFirst.domain.DomainObject;
import com.example.ToDoFirst.domain.TodoList;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class TodoListServiceImpl extends AbstractMapService implements TodoListService {

  @Override
  public List<DomainObject> listAll() {
    return super.listAll();
  }

  @Override
  public TodoList getById(Integer id) {
    return (TodoList) super.getById(id);
  }

  @Override
  public TodoList saveOrUpdate(TodoList domainObject) {
    return (TodoList) super.saveOrUpdate(domainObject);
  }

  @Override
  public void delete(Integer id) {
    super.delete(id);
  }

  protected void loadDomainObjects() {
    domainMap = new HashMap<>();

    TodoList todo1 = new TodoList();
    todo1.setId(1);
    todo1.setName("Do Groceries");
    todo1.setDescription("Get Milk, Sugar, Coffee");
    todo1.setTargetDate("2020/07/12");
    todo1.setImageUrl("https://thumbor" +
            ".thedailymeal.com/d5Uau-OAI-QEm1BpO5lr3LR-kHw=//https://www.thedailymeal.com/sites/default/files/2019/07/03/supermarketcart_main.JPG");
    domainMap.put(1, todo1);

    TodoList todo2 = new TodoList();
    todo2.setId(2);
    todo2.setName("Pay Rent");
    todo2.setDescription("Pay your rent before 4th july");
    todo2.setTargetDate("2020/07/04");
    todo2.setImageUrl("https://thumbor" +
            ".thedailymeal.com/d5Uau-OAI-QEm1BpO5lr3LR-kHw=//https://www.thedailymeal.com/sites/default/files/2019/07/03/supermarketcart_main.JPG");
    domainMap.put(2, todo2);

    TodoList todo3 = new TodoList();
    todo3.setId(3);
    todo3.setName("Make Momos");
    todo3.setDescription("Check the recipe from youtube and make tandoori momos");
    todo3.setTargetDate("2020/07/03");
    todo3.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQusTHLTKK_IbQDMxCfRcm7cqG3MRkEFu8JbA&usqp=CAU");
    domainMap.put(3, todo3);


  }

}
