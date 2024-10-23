package tp4_grupo18;

class Hijo extends Padre implements Madre, Tio, Hermano {
    private String nombre;
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, Celular celular, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = 0.0;
    }

    // Hereda el método de cantar del padre y lo personaliza
    @Override
    public void cantar() {
        super.cantar();
        System.out.println("Y así canta " + nombre);
    }

    // Método para conducir el auto
    public void conducirAuto(Auto auto) {
        System.out.println(nombre + " está conduciendo el auto " + auto.getModelo() + " con patente " + auto.getPatente());
    }

    // Métodos de la interfaz Madre
    @Override
    public void bailar() {
        System.out.println(nombre + " está bailando.");
    }

    @Override
    public int jugarLoteria() {
        System.out.println(nombre + " está jugando la lotería con el número de la suerte " + NROSUERTE);
        return NROSUERTE;
    }

    // Métodos de la interfaz Tio
    @Override
    public void heredarDinero(double money) {
        billetera += money;
        System.out.println(nombre + " ha heredado $" + money + " de su tío. Billetera ahora: $" + billetera);
    }

    // Métodos de la interfaz Hermano
    @Override
    public void jugarFutbol() {
        System.out.println(nombre + " está jugando al fútbol.");
    }

    @Override
    public int hacerGoles() {
        int goles = (int) (Math.random() * 10);
        System.out.println(nombre + " ha hecho " + goles + " goles.");
        return goles;
    }
}