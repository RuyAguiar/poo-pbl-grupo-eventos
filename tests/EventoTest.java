package tests;

import domain.Email;
import domain.Evento;
import domain.Participante;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventoTest {

    @Test
    void deveInscreverParticipante() {

        Evento evento = new Evento("1", "Java Day", 2);

        Participante joao =
                new Participante(
                        "1",
                        "Joao",
                        new Email("joao@email.com"));

        evento.inscrever(joao);

        assertEquals(1, evento.getQuantidadeInscritos());
    }

    @Test
    void naoDevePermitirEventoLotado() {

        Evento evento = new Evento("1", "Java Day", 1);

        Participante joao =
                new Participante(
                        "1",
                        "Joao",
                        new Email("joao@email.com"));

        Participante maria =
                new Participante(
                        "2",
                        "Maria",
                        new Email("maria@email.com"));

        evento.inscrever(joao);

        assertThrows(
                IllegalStateException.class,
                () -> evento.inscrever(maria));
    }

    @Test
    void naoDevePermitirParticipanteDuplicado() {

        Evento evento = new Evento("1", "Java Day", 2);

        Participante joao =
                new Participante(
                        "1",
                        "Joao",
                        new Email("joao@email.com"));

        evento.inscrever(joao);

        assertThrows(
                IllegalStateException.class,
                () -> evento.inscrever(joao));
    }
}