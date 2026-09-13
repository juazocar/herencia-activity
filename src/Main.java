//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Dispositivo dispositivo = new Dispositivo("disp 1", true);
            dispositivo.mostrarEstado();
            dispositivo.ejecutarDiagnostico();

        Proyector proyector = new Proyector("Proyector Sala 201", true);
        Computador computador = new Computador("PC Laboratorio", true);
        Impresora impresora = new Impresora("Impresora Biblioteca", false);

        proyector.mostrarEstado();
        computador.mostrarEstado();
        impresora.mostrarEstado();
    }
}