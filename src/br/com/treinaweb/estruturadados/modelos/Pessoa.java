package br.com.treinaweb.estruturadados.modelos;

import java.util.Objects;

public class Pessoa {

    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (getId() != pessoa.getId()) return false;
        return getNome().equals(pessoa.getNome());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getNome().hashCode();
        return result;
    }
}
