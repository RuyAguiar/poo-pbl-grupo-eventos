package domain;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private final String id;
    private final String nome;
    private final int limiteVagas;

    private final List<Participante> participantes;

    public Evento(String id, String nome, int limiteVagas) {

        this.id = id;
        this.nome = nome;
        this.limiteVagas = limiteVagas;

        this.participantes = new ArrayList<>();
    }

    public void inscrever(Participante participante) {

        if (participantes.size() >= limiteVagas) {
            throw new IllegalStateException("Evento lotado");
        }

        boolean jaExiste =
                participantes.stream()
                        .anyMatch(p ->
                                p.getId().equals(participante.getId()));

        if (jaExiste) {
            throw new IllegalStateException(
                    "Participante ja inscrito");
        }

        participantes.add(participante);
    }

    public int getQuantidadeInscritos() {
        return participantes.size();
    }

    public String getNome() {
        return nome;
    }
    public String getId() {
    return id;
    }
}