package arrays.Equals;

import java.util.Objects;

public class Usuario {
    public String nome;
    public int idade;

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Usuario(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idade == usuario.idade && Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
