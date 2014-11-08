
package org.acld.persist.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T,ID extends Serializable> {
  T findbyId(ID id);
  void save(T t);
  void delete(T t);
  List<T> findAll();
  
}
