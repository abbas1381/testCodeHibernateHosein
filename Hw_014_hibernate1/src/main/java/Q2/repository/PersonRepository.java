package Q2.repository;

import Q2.entity.Person;

import java.util.List;

public interface PersonRepository <T extends Person> {
    void save(T t);
    void update(T t,Integer id);
    T delete(Integer id);
    List<T> loadAll();
    T find(Integer id);
    boolean contains(Integer id);

}
