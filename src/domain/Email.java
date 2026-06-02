package domain;

public class Email {

    private final String valor;

    public Email(String valor) {

        if (!valor.contains("@")) {
            throw new IllegalArgumentException("Email invalido");
        }

        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}