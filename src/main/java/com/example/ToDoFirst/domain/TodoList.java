package com.example.ToDoFirst.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="todolist")
public class TodoList implements DomainObject {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)//for oracle use sequence

  private Integer id;
  private String name;
  private String description;
  private String targetDate;
  private String imageUrl;

  public TodoList(){
  }
  public TodoList(Integer id,String name, String description, String targetDate,String imageUrl){
    this.id = id;
    this.name=name;
    this.description = description;
    this.targetDate = targetDate;
    this.imageUrl = imageUrl;
  }
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(String targetDate) {
    this.targetDate = targetDate;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

}
