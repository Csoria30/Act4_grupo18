package tp4_grupo18;

public class TP4_Grupo18 {

    public static void main(String[] args) {
        Auto fordFocus = new Auto("AE678QZ", "Ford Focus gris");
        Celular celularJuan = new Celular("Movistar", "123456789", 100.0);

        Hijo juanCarlos = new Hijo("Juan Carlos", celularJuan, fordFocus);

        juanCarlos.cantar();
        juanCarlos.conducirAuto(fordFocus);
        juanCarlos.bailar();
        juanCarlos.jugarLoteria();
        juanCarlos.heredarDinero(1000);
        juanCarlos.jugarFutbol();
        juanCarlos.hacerGoles();
    }
    
}
