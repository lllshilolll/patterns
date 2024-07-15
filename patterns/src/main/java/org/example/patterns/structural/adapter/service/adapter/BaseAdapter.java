package org.example.patterns.structural.adapter.service.adapter;

import java.util.List;
import java.util.Optional;

public interface BaseAdapter<T, D> {

    default D mapToDto(T src) {
        throw new RuntimeException("Exception in mapToDto");
    }

    default T mapToEntity(D dto) {
        throw new RuntimeException("Exception in mapToEntity");
    }

    default List<D> mapToDto(List<T> src) {
        return Optional.ofNullable(src)
                .orElse(List.of())
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    default List<T> mapToEntity(List<D> dto) {
        return Optional.ofNullable(dto)
                .orElse(List.of())
                .stream()
                .map(this::mapToEntity)
                .toList();
    }
}
