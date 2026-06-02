package application;

import domain.Evento;
import domain.Participante;

public class InscreverParticipanteUseCase {

    private final Evento evento;

    public InscreverParticipanteUseCase(Evento evento) {
        this.evento = evento;
    }

    public void executar(Participante participante) {
        evento.inscrever(participante);
    }
}