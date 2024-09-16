public class Auto extends Vehiculo {


    public Auto(int cilindraje, double impuesto, double avaluo, String placa) {
        super(cilindraje, impuesto, avaluo, placa);
    }

    @Override
    public double costoMatricula() {
        return (this.getAvaluo() + this.getImpuesto() + this.getCilindraje()) * 5;
    }


}
