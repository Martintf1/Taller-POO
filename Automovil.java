//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    class Automovil {
        private String color;
        private  String marca;
        private String modelo;
        private String placa;

    public Automovil(String color, String marca, String modelo, String placa) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void autoEspecificaciones()
    {
        System.out.println("Color: "+color+"\nMarca: "+marca+"\nModelo: "+modelo+"\nPlaca: "+placa);
    }

    public static void main(String[] arsgs)
    {
        Automovil auto1 = new Automovil("negro","Toyota","Hilux","QWZ-12Q");
        auto1.autoEspecificaciones();
        System.out.println("--------------------------------------");
        Automovil auto2 = new Automovil("Blanco","Chevrolet","Joy","JKJ-45M");
        auto2.autoEspecificaciones();
    }
}
