package ProgramacionTema4.Excepciones.Ejercicio_5;

public class Registro {

    private int edad;

    public Registro(int edad) throws EdadInvalidaException {
        this.edad = registrarEdad(edad);
    }

    public int registrarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("No se puede crear un registro con " + edad + " años, solo entre 0 y 120");
        }

        return edad;
    }

    @Override
    public String toString() {
        return edad + " años";
    }
}
