package arrays.stremapi;

public class Convidado {
    final String nome;
    final int idade;
    final boolean isInvited;

    public Convidado(String nome, int idade) {
        this(nome,idade,true);
    }

    public Convidado(String nome, int idade, boolean isInvited) {
        this.nome = nome;
        this.idade = idade;
        this.isInvited = isInvited;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", isInvited=" + isInvited +
                '}';
    }
}
