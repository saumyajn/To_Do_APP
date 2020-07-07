package com.example.ToDoFirst.services;

import com.example.ToDoFirst.domain.DomainObject;
import com.example.ToDoFirst.domain.TodoList;

import java.util.*;

public abstract class AbstractMapService {

  protected Map<Integer, DomainObject> domainMap;

  public AbstractMapService() {
    domainMap = new HashMap<>();
    loadDomainObjects();
  }

  public List<DomainObject> listAll() {

    return new ArrayList<>(domainMap.values());
  }

  public DomainObject getById(Integer id) {

    return domainMap.get(id);
  }

  public DomainObject saveOrUpdate(DomainObject domainObject) {
    if (domainObject != null) {
      if (domainObject.getId() == null) {
        domainObject.setId(getNextKey());
      }
      domainMap.put(domainObject.getId(), domainObject);
      return domainObject;
    } else {
      throw new RuntimeException("Object cant be null");
    }
  }

  private Integer getNextKey() {
    return Collections.max(domainMap.keySet()) + 1;
  }

  public void delete(Integer id) {

    domainMap.remove(id);
  }
  protected abstract void loadDomainObjects();
}
