package ProgramacionTema4.Herencia.practica3;


public class MainRestaurante {
    public static void main(String[] args) {

        Comanda[] comandas = new Comanda[2];

        Plato[] platosComanda1 = new Plato[2];
        platosComanda1[0] = new PlatoPrimero("Cocido", 9.99, false);
        platosComanda1[1] = new PlatoCarne("Entrecot", 21.99, "Al punto");

        comandas[0] = new Comanda(1, 1, platosComanda1);


        Plato[] platosComanda2 = new Plato[5];
        platosComanda2[0] = new PlatoPrimero("Espaguetis", 8.99, true);
        platosComanda2[1] = new PlatoCarne("Chuletón", 32.99, "Carbonizado");
        platosComanda2[2] = new PlatoPescado("Lubina", 11.95);
        platosComanda2[3] = new PlatoPostre("Tarta de queso", 5.99, true);
        platosComanda2[4] = new PlatoPostre("Tarta de queso", 5.99, false);

        comandas[1] = new Comanda(2, 2, platosComanda2);


        System.out.printf("Comanda 1 (%.2f€): \n%s" + (comandas[0].hayDiabeticosEnLaMesa() ? "HAY DIABETICO/S EN LA MESA\n\n" : "NO HAY DIABETICO/S EN LA MESA\n\n"), comandas[0].coste(), comandas[0]);
        System.out.printf("Comanda 2 (%.2f€): \n%s" + (comandas[1].hayDiabeticosEnLaMesa() ? "HAY DIABETICO/S EN LA MESA\n\n" : "NO HAY DIABETICO/S EN LA MESA\n\n"), comandas[1].coste(), comandas[1]);


    }
}
