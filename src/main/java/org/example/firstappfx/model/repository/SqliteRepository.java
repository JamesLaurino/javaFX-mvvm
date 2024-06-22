package org.example.firstappfx.model.repository;

import java.util.List;

public interface SqliteRepository<T> {
    T getOne(Integer id);
    List<T> getAll();
    T update(T objet);
    void delete(Integer id);
}
