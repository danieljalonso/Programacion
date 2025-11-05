package ProgramacionTema2.Pruebas;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(4, Calculadora.suma(2, 2));
    }

    @org.junit.jupiter.api.Test
    void multiplica() {
    }
}