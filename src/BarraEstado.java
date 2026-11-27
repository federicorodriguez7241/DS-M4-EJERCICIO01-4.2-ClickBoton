public class BarraEstado implements Observador {
    @Override
    public void actualizar(String idBoton, String etiquetaBoton) {
        System.out.println("[Barra de Estado] Ultima interaccion registrada: Clic en '" + etiquetaBoton + "'.");
    }
}