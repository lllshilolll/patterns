package org.example.patterns.behavioral.observer.service.custom;

import org.springframework.lang.NonNull;

import java.util.List;

public interface Observable<T> {

    @NonNull
    List<Observer<T>> getObservers();

    default void notifyObservers(T object) {
        getObservers().forEach(observer -> observer.update(object));
    }
}
