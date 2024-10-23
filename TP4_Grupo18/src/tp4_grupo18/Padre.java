package tp4_grupo18;

class Padre {
    protected String nombre;
    private String apellido;
    private Casa casa;
    private Auto auto;

    public Padre(Auto auto) {
        this.nombre = "Papa";
        this.apellido = "Lopez";
        construirCasa();
        comprarAuto(auto);
    }

    public void construirCasa() {
        this.casa = new Casa("Centro. (2 pisos)");
    }

    public void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    public void cantar() {
        System.out.println("Asi canta tu padre, Don " + apellido);
    }

    public String getApellido() {
        return apellido;
    }

    public Casa getCasa() {
        return casa;
    }

    public Auto getAuto() {
        return auto;
    }
}
