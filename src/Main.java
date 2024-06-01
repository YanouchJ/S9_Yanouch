public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        System.out.println("Puestos libres: " +parqueadero.calcularPuestosLibres());

        parqueadero.entrarCarro("PPP-001");
        parqueadero.entrarCarro("PAA-002");

        System.out.println("Puestos libres: " +parqueadero.calcularPuestosLibres());
        System.out.println("Promedio horas: " +parqueadero.darTiempoPromedio());
        System.out.println("Carro con mas horas: " +parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Existe auto mas de ocho horas: " +parqueadero.hayCarroMasDeOchoHoras());
        System.out.println("Existe auto mas de tres horas parqueados: " +parqueadero.darCarrosMasDeTresHorasParqueados());
        System.out.println("Autos misma placa: " +parqueadero.hayCarrosPlacaIgual());
        System.out.println("Autos que comienzan con placa PB: " +parqueadero.contarCarrosQueComienzanConPlacaPB());
        System.out.println("Autos 24h o más dentro del parqueadero: " +parqueadero.hayCarroCon24Horas());
        System.out.println(""+parqueadero.metodo1());
        System.out.println("Auto debe desocupar parqueadero: " +parqueadero.desocuparParqueadero());
        System.out.println("" +parqueadero.metodo2());



    }
}