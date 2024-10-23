package tp4_grupo18;

class Hijo extends Padre implements Madre, Tio, Hermano {
    protected String nombre;
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, Celular celular, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = 0.0;
    }

    // personaliza metodo cantar del padre
    @Override
    public void cantar() {
        super.cantar();
        System.out.println("Y asi canta " + nombre);
    }

    // metodo para conducir el auto
    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un " + auto.getModelo() + " de un amigo!");
    }

    // interfaz Madre
    @Override
    public void bailar() {
        System.out.println("Se bailar como a mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        System.out.println("SALIO EL NUMERO DE LA SUERTE " + NROSUERTE);
        billetera += FORTUNA;
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de tu madre la ROSA!! Y ahora tienes " + billetera + " U$S.");
        return NROSUERTE;
    }

    // interfaz Tio
    @Override
    public void heredarDinero(double money) {
        billetera += money;
        System.out.println("Tio Lucas te regala estos dolaritos! Ahora tienes " + billetera + " U$S.");
    }

    // interfaz Hermano
    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        int goles = (int) (Math.random() * 10); // Genera un número aleatorio de goles
        System.out.println("Jugando al Futbol, Hoy has hecho " + goles + " goles");
        return goles;
    }
}