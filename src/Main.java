public class Main {
    public static void main(String[] args) {

        // creamos el componente grafico observable
        Boton botonGuardar = new Boton("BTN-GUARDAR", "Guardar Cambios");

        // creamos los manejadores visuales interesados en el evento
        Observador ventanaPrincipal = new VentanaPrincipal("Panel de Configuracion");
        Observador barraEstado = new BarraEstado();

        // suscribimos los observadores al boton
        botonGuardar.registrarObservador(ventanaPrincipal);
        botonGuardar.registrarObservador(barraEstado);

        // 1. Simulamos un clic: notifica a la ventana principal y a la barra de estado
        botonGuardar.hacerClic();

        // 2. Desvinculamos la barra de estado y volvemos a hacer clic
        System.out.println("\n--- Desvinculando Barra de Estado ---");
        botonGuardar.eliminarObservador(barraEstado);

        botonGuardar.hacerClic();
    }
}