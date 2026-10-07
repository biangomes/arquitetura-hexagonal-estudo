package br.beanascigom.arquiteturahexagonalestudo.domain;

import java.util.Optional;

// Pela Arquitetura Hexagonal, essa interface é uma porta de entrada
public interface SearchPerson {
    Person getPersonById(Long id);
    Optional<Person> getPersonByName(String name);
    Optional<Person> getPersonByEmail(String email);
}
