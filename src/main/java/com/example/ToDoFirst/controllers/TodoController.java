package com.example.ToDoFirst.controllers;

import com.example.ToDoFirst.domain.TodoList;
import com.example.ToDoFirst.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

  private TodoListService todoListService;

  @Autowired
  public void setTodoListService(TodoListService todoListService) {

    this.todoListService = todoListService;
  }

  @RequestMapping("/todos")
  public String listTodos(Model model){
    model.addAttribute("todos",todoListService.listAll());
    return "todos";
  }
  @RequestMapping("/todo/{id}")
  public String getTodo(@PathVariable Integer id,Model model){

    model.addAttribute("todo",todoListService.getById(id));
    return "todo";

  }

  @RequestMapping("todo/update/{id}")
  public String updateTodo(@PathVariable Integer id,Model model){
    model.addAttribute("todo",todoListService.getById(id));
    return "todoform";
  }

  @RequestMapping("/todo/add")
  public String addTodo(Model model){
    model.addAttribute("todo",new TodoList());
    return "todoform";
  }

  @RequestMapping(value="/todo",method = RequestMethod.POST)
  public String saveOrUpdateTodo(TodoList todoList){
    TodoList savedTodo =todoListService.saveOrUpdate(todoList);
    return "redirect:/todo/"+savedTodo.getId();
  }
  @RequestMapping("/todo/delete/{id}")
 public String delete(@PathVariable Integer id){
    todoListService.delete(id);
    return "redirect:/todos";
 }

}
