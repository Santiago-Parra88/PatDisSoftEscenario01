public abstract  class Vehiculo {
   private String marca;
   private String modelo;
   private String placa;
   private String color;
   private int cilindraje;
   private double impuesto;
   private double avaluo;
   public abstract double costoMatricula();

    public Vehiculo(int cilindraje, double impuesto, double avaluo, String placa) {
        this.cilindraje = cilindraje;
        this.impuesto = impuesto;
        this.avaluo = avaluo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", impuesto=" + impuesto +
                ", avaluo=" + avaluo +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }
}