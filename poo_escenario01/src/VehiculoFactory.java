public class VehiculoFactory{
 public static Vehiculo crearVehiculoFactory(String tipoVehiculo, String placa, double avaluo, int cilindraje) {
     switch (tipoVehiculo) {
         case "auto":
             return new Auto(cilindraje, 5.5, avaluo, placa);
         case "camioneta":
             return new Camioneta(cilindraje, 15.5, avaluo, placa);
         case "camion":
             return new Camion(cilindraje, 15.5, avaluo, placa);
         default:
             throw new IllegalArgumentException("Parámetro inválido");
     }
 }
}
