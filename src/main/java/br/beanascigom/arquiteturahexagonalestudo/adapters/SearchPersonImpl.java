package br.beanascigom.arquiteturahexagonalestudo.adapters;

import br.beanascigom.arquiteturahexagonalestudo.domain.SearchPerson;

public class SearchPersonImpl implements SearchPerson {
    @Override
    public Person getPersonById(Long id) {
        // Implementação do método para buscar uma pessoa pelo ID
        return null;
    }

    @Override
    public Optional<Person> getPersonByName(String name) {
        // Implementação do método para buscar uma pessoa pelo nome
        return Optional.empty();
    }

    @Override
    public Optional<Person> getPersonByEmail(String email) {
        // Implementação do método para buscar uma pessoa pelo email
        return Optional.empty();
    }
}
