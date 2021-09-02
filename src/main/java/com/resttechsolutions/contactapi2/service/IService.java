package com.resttechsolutions.contactapi2.service;

import java.util.List;

public interface IService<T,P> {

    T create(T t);
    T findById(P p);
    List<T> findAll();
    T update(T t);
    void delete(P p);
}
