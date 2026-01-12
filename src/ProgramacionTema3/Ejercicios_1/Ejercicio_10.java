package ProgramacionTema3.Ejercicios_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] palabras = {
                "palabra","mesilla","pizarra","ordenador","caravana","espada","mochila",
                "ventana","teclado","raton","pantalla","lampara","cuaderno","boligrafo",
                "libreta","puerta","pared","techo","suelo","alfombra","cortina","armario",
                "estanteria","reloj","calendario","espejo","sillon","sofa","mesa","silla",
                "cama","colchon","almohada","sabana","manta","cojin","cajon","llave",
                "cerradura","timbre","telefono","television","altavoz","auricular",
                "microfono","camara","cargador","bateria","enchufe","cable","router",
                "internet","programa","codigo","variable","metodo","clase","objeto",
                "archivo","carpeta","sistema","usuario","password","servidor","cliente",
                "red","navegador","buscador","pagina","enlace","boton","formulario",
                "tabla","lista","texto","imagen","icono","fuente","color","estilo",
                "diseño","plantilla","marco","borde","fondo","animacion","efecto",
                "juego","nivel","puntuacion","tiempo","contador","intento","error",
                "acierto","victoria","derrota","reinicio","pausa","inicio","final",
                "menu","opcion","configuracion","sonido","musica","volumen","control",
                "botella","vaso","plato","tenedor","cuchillo","cuchara","sarten","olla",
                "horno","nevera","congelador","microondas","cafetera","tostadora",
                "licuadora","batidora","receta","ingrediente","comida","bebida",
                "desayuno","almuerzo","cena","postre","galleta","chocolate","azucar",
                "sal","aceite","vinagre","pan","queso","leche","yogur","mantequilla",
                "jamon","pollo","carne","pescado","arroz","pasta","lentejas","garbanzos",
                "ensalada","tomate","lechuga","cebolla","ajo","pimiento","zanahoria",
                "patata","calabacin","berenjena","pepino","fruta","manzana","pera",
                "platano","naranja","mandarina","fresa","melon","sandia","uva","kiwi",
                "limon","cereza","ciruela","mango","piña","coco","papaya","higo",
                "datil","almendra","nuez","avellana","cacahuete","semilla","cereal",
                "harina","masa","hornear","cocinar","freir","asar","hervir","mezclar",
                "cortar","pelar","servir","probar","oler","saborear","escuela","colegio",
                "instituto","universidad","profesor","alumno","estudiante","examen",
                "asignatura","clase","leccion","tema","apunte","libro","pagina","capitulo",
                "historia","geografia","matematicas","lengua","fisica","quimica",
                "biologia","arte","musica","deporte","educacion","recreo","biblioteca",
                "laboratorio","gimnasio","pizarra","aula","pasillo","patio","puente",
                "carretera","autopista","calle","avenida","plaza","parque","jardin",
                "bosque","selva","desierto","montaña","colina","valle","rio","lago",
                "mar","oceano","playa","isla","costa","acantilado","cueva","cascada",
                "volcan","nube","cielo","sol","luna","estrella","planeta","galaxia",
                "universo","espacio","cohete","satelite","astronauta","nave","orbita",
                "gravedad","energia","fuerza","velocidad","movimiento","tiempo",
                "espacio","distancia","direccion","trayectoria","cuerpo","materia",
                "atomo","molecula","celula","tejido","organo","sistema","esqueleto",
                "musculo","cerebro","corazon","pulmon","estomago","intestino","higado",
                "riñon","sangre","piel","hueso","nervio","ojo","oreja","nariz","boca",
                "diente","lengua","labio","mano","brazo","pierna","pie","dedo","uña",
                "cabello","barba","bigote","ropa","camisa","pantalon","falda","vestido",
                "chaqueta","abrigo","bufanda","gorro","guante","calcetin","zapato",
                "zapatilla","bota","sandalia","cinturon","sombrero","mochila","bolso",
                "maleta","viaje","vacacion","hotel","hostal","camping","avion","tren",
                "metro","autobus","taxi","bicicleta","moto","coche","camion","barco",
                "lancha","yate","puerto","aeropuerto","estacion","terminal","billete",
                "pasaporte","maletero","equipaje","mapa","brujula","destino","ruta",
                "camino","sendero","aventura","exploracion","descubrimiento","historia",
                "leyenda","cuento","novela","poesia","relato","personaje","autor",
                "lector","editor","portada","indice","titulo","capitulo","parrafo",
                "frase","palabra","letra","silaba","vocal","consonante","abecedario"
        };

        String palabraSecreta = palabras[r.nextInt(palabras.length)];
        int contadorIntentos = 0;
        int intentosMaximos = 8;
        int letrasPorAdivinar = palabraSecreta.length();

        char[] palabraParcial = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraParcial.length; i++) {
            palabraParcial[i] = '-';
        }

        while (contadorIntentos < intentosMaximos && letrasPorAdivinar > 0) {

            System.out.println("Tu palabra hasta ahora es: " + new String(palabraParcial));

            System.out.println("Introduce una letra");
            String teclado = sc.next().toLowerCase();
            char letra = teclado.charAt(0);

            if (palabraSecreta.contains(String.valueOf(letra))) {
                System.out.println("La letra " + letra + " está en la palabra secreta");
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        if (palabraParcial[i] == '-') {
                            palabraParcial[i] = letra;
                            letrasPorAdivinar--;
                        }
                    }
                }
            } else System.out.println("La letra " + letra + " no está en la palabra");
            if (letrasPorAdivinar > 0) {
                contadorIntentos++;
                System.out.println("Llevas " + contadorIntentos + " intentos de " + intentosMaximos);
            } else {
                System.out.println("HAS GANADO, la palabra es: " + palabraSecreta);
            }

        }

        if (contadorIntentos >= intentosMaximos) {
            System.out.println("Vaya... Has perdido, la palabra era: " + palabraSecreta);
        }

        sc.close();
    }
}