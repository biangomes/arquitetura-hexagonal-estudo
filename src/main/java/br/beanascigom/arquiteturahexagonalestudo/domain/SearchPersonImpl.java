package br.beanascigom.arquiteturahexagonalestudo.domain;

public class SearchPersonImpl implements SearchPerson {

    private PersonRepository repo;

    public SearchPersonImpl(PersonRepository repo) {
        this.repo = repo;
    }

}
