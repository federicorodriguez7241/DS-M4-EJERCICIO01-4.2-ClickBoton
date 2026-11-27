import java.util.ArrayList;
import java.util.List;

public class Boton implements SujetoObservable {
    private final String id;
    private final String etiqueta;
    private final List<Observador> observadores;

    public Boton(String id, String etiqueta) {
        this.id = id;
        this.etiqueta = etiqueta;
        this.observadores = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getEtiqueta() { return etiqueta; }

    @Override
    public void registrarObservador(Observador observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    @Override
    public void eliminarObservador(Observador observador) {
        if (observador != null) {
            observadores.remove(observador);
        }
    }

    @Override
    public void notificarObservadores() {
        for (Observador oyente : observadores) {
            oyente.actualizar(id, etiqueta);
        }
    }

    public void hacerClic() {
        System.out.println("\n[Boton '" + etiqueta + "' (" + id + ")] Evento de clic detectado.");
        notificarObservadores();
    }
}