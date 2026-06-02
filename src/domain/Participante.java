package domain;

public class Participante {

    private final String id;
    private final String nome;
    private final Email email;

    public Participante(String id, String nome, Email email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }
}