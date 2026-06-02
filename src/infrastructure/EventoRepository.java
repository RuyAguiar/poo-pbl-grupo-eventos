package infrastructure;

import domain.Evento;
import java.util.HashMap;
import java.util.Map;

public class EventoRepository {

    private final Map<String, Evento> eventos = new HashMap<>();

    public void salvar(Evento evento) {
        eventos.put(evento.toString(), evento);
    }

    public Evento buscar(String id) {
        return eventos.get(id);
    }
}