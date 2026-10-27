package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    static final Scanner SCANNER = new Scanner(System.in);

    static final int CAPACIDAD_TOTAL = 10;
    static final int TARIFA_HORA_CARRO = 4000;
    static final int TARIFA_HORA_MOTO = 2000;
    static final int TARIFA_DIA_CARRO = 30000;
    static final int TARIFA_DIA_MOTO = 15000;
    static final int UMBRAL_HORAS_DIA = 8;
    static final int HORA_APERTURA = 8;
    static final int HORA_CIERRE = 22;

    static final DateTimeFormatter FORMATO_FECHA_HORA =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    static final String CARRO = "Carro";
    static final String MOTO = "Moto";

    static String[] tiposVehiculo = new String[CAPACIDAD_TOTAL];
    static LocalDateTime[] fechasIngreso = new LocalDateTime[CAPACIDAD_TOTAL];

    static int celdasOcupadas = 0;
    static long recaudoCarros = 0;
    static long recaudoMotos = 0;

    public static void main(String[] args) {

        inicializarArreglos();
        int opcion;

        do {
            mostrarMenu();

            opcion = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (opcion) {
                case 1 -> imprimir("Ingreso: pendiente");
                case 2 -> imprimir("Salida: pendiente");
                case 3 -> imprimir("Ocupacion: pendiente");
                case 4 -> imprimir("Financiero: pendiente");
                case 5 -> imprimir("Gracias por usar nuestro sistema.");
                default -> imprimir("Opcion no valida");
            }
        }while (opcion !=5);

        SCANNER.close();
    }

    static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    static void inicializarArreglos() {
        for (int i = 0; i < CAPACIDAD_TOTAL; i++) {
            tiposVehiculo[i] = null;
            fechasIngreso[i] = null;
        }
    }

    static void mostrarMenu() {
        imprimir("");
        imprimir("Menu de registro.");
        imprimir("====================");
        imprimir("1. Registrar entrada");
        imprimir("2. Registrar salida");
        imprimir("3. Reporte de ocupacion");
        imprimir("4. Reporte financiero");
        imprimir("5. Salir");
        System.out.print("Escoja una opcion: ");
    }
}
