package tp4_grupo18;

class Padre {
    private String nombre;
    private String apellido;
    private Casa casa;
    private Auto auto;

    public Padre(Auto auto) {
        this.nombre = "Papá";
        this.apellido = "López";
        construirCasa();
        comprarAuto(auto);
    }

    public void construirCasa() {
        this.casa = new Casa("Centro. 2 pisos");
    }

    public void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    public void cantar() {
        System.out.println("Así canta tu padre, Don " + apellido);
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
