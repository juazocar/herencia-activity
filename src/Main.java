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

        proyector.ejecutarDiagnostico();
        computador.ejecutarDiagnostico();
        impresora.ejecutarDiagnostico();

        Dispositivo dispositivo1 = new Proyector("Proyector Sala 201", true);
        Dispositivo dispositivo2 = new Computador("PC Laboratorio", true);
        Dispositivo dispositivo3 = new Impresora("Impresora Biblioteca", true);

        dispositivo1.ejecutarDiagnostico();
        dispositivo2.ejecutarDiagnostico();
        dispositivo3.ejecutarDiagnostico();
    }
}