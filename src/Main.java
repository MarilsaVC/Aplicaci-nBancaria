import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Banco VC");
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese por favor su nombre completo:");
        String nombreCompleto = datos.nextLine();
        String cuenta = """
                            Ingresa el tipo de cuenta:
                            1: Cuenta corriente.
                            2: Cuenta de ahorro.
                            """;
        System.out.println(cuenta);
        int tipoCuenta = datos.nextInt();

        if (tipoCuenta == 1){
            System.out.println("Seleccionaste cuenta corriente");
        }else if (tipoCuenta == 2){
            System.out.println("seleccionaste cuenta de ahorro");
        }else {
            System.out.println("No haz seleccionado ningún tipo de cuenta");
        }
        System.out.println("Ingrese el valor a depositar: ");
        double saldo = datos.nextDouble();
        System.out.println("Bienvenido/a " + nombreCompleto + " al banco VC. el saldo disponible en tu cuenta actualmente es de: " + saldo);

      String menu = """
                Seleccione la opción que desee:
                
                1: Depositar
                2: Consultar saldo disponible
                3: Retirar
                9: Salir
                """;
        int opcion = 0;
        while (opcion != 9){
            System.out.println(menu);
            opcion = datos.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrtese el valor que desea depositar: ");
                    double valor = datos.nextInt();
                    saldo += valor;
                    System.out.println("El saldo actualizado es de: " + saldo);
                    break;
                case 2:
                    System.out.println("El saldo actualizado es de: " + saldo);
                    break;
                case 3:
                    System.out.println("ingresa por favor el valor que deseeas retirar: ");
                    double valorRetirar = datos.nextDouble();
                    if (valorRetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorRetirar;
                        System.out.println("Retiro realizado con exito! tu nuevo saldo es de: " + saldo);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo");
            }
        }
    }
}