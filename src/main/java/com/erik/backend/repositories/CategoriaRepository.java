package com.erik.backend.repositories;

import com.erik.backend.domain.Categoria;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class CategoriaRepository implements JpaRepository<Categoria, Integer> {

    @Override
    public List<Categoria> findAll() {
        return null;
    }

    @Override
    public List<Categoria> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Categoria> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Categoria> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Categoria categoria) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Categoria> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Categoria> S save(S s) {
        return null;
    }

    @Override
    public <S extends Categoria> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Categoria> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Categoria> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Categoria> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Categoria getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Categoria> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Categoria> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Categoria> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Categoria> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Categoria> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Categoria> boolean exists(Example<S> example) {
        return false;
    }
}
