package ProgramacionTema4.Herencia.PruebaVideojuegos;

public class VideojuegoXbox extends Videojuego {

    private boolean necesitaGamepass;

    public VideojuegoXbox(String nombre, double precio, boolean necesitaGamepass) {
        super(nombre, precio);
        this.necesitaGamepass = necesitaGamepass;
    }

    public String toString() {
        return super.toString() + (necesitaGamepass ? " y necesita game pass" : " y no necesita game pass");
    }

}
