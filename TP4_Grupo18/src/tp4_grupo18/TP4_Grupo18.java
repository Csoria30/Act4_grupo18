package tp4_grupo18;

public class TP4_Grupo18 {

    public static void main(String[] args) {
        // crear objetos de auto y celular
        Auto cascajo = new Auto("123LATA", "Renault 12");
        Auto fordFocus = new Auto("999POWR", "Ford Focus");
        Celular celularJuan = new Celular("Movistar", "123456789", 100.0);

        // crear un objeto de la clase Padre
        Padre papa = new Padre(cascajo);

        // mostrar la zona de la casa del padre
        System.out.println("Papa me dejo esta casa en zona " + papa.getCasa().getZona());

        // crear un objeto de la clase Hijo
        Hijo juanCarlos = new Hijo("Juan Carlos", celularJuan, cascajo);

        // mostrar el auto que dejo el padre
        System.out.println("Papa me dejo este auto: " + juanCarlos.getAuto().getModelo());

        // conducir otro auto (el ford focus del amigo)
        juanCarlos.conducirAuto(fordFocus);

        // jugar futbol
        juanCarlos.jugarFutbol();

        // bailar (metodo de la madre)
        juanCarlos.bailar();

        // jugar a la loteria
        juanCarlos.jugarLoteria();

        // cantar (override del padre)
        juanCarlos.cantar();

        // heredar dinero del tio
        juanCarlos.heredarDinero(2000);

        // mostrar los goles (0 goles)
        juanCarlos.hacerGoles();
    }
    
}
