public class Maestro {
    private String nombre;
    private String materia;
    private String lugarTrabajo;
    private byte annosTrabajando;

    public Maestro(String nombre, String materia, String lugarTrabajo, byte annosTrabajando) {
        this.nombre = nombre;
        this.materia = materia;
        this.lugarTrabajo = lugarTrabajo;
        this.annosTrabajando = annosTrabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public byte getAnnosTrabajando() {
        return annosTrabajando;
    }

    public void setAnnosTrabajando(byte annosTrabajando) {
        this.annosTrabajando = annosTrabajando;
    }

    public  void datosMaestro ()
    {
        System.out.println("\t\t DATOS MAESTRO\nNombre: "+nombre+"\nMateria: "+materia+"\nLugar de trabajo: "+lugarTrabajo+"\nAños trabajando: "+annosTrabajando);
    }
    public static void main(String[] args)
    {
        Maestro maestro1 = new Maestro("Julian","Fisica","I.E. GALAN",(byte) 13);
        maestro1.datosMaestro();
        System.out.println("-------------------------------------");
        Maestro maestro2 = new Maestro("Pedro","Quimica","Javeriana",(byte) 11);
        maestro2.datosMaestro();
    }
}
