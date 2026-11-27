public class VentanaPrincipal implements Observador {
    private final String tituloVentana;

    public VentanaPrincipal(String tituloVentana) {
        this.tituloVentana = tituloVentana;
    }

    @Override
    public void actualizar(String idBoton, String etiquetaBoton) {
        System.out.println("[Ventana Principal - " + tituloVentana + "] Ejecutando accion asociada al boton '"
                + etiquetaBoton + "' (" + idBoton + ").");
    }
}