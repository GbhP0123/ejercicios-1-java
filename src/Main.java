import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.showMenu();
    }
}

class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Determinar si es mayor de edad.");
            System.out.println("2. Determinar cuál es el mayor de dos números.");
            System.out.println("3. Determinar si un número es par o impar.");
            System.out.println("4. Calcular el factorial de un número.");
            System.out.println("5. Mostrar números impares usando for.");
            System.out.println("6. Mostrar números impares usando while.");
            System.out.println("7. Mostrar nombre del día de la semana.");
            System.out.println("8. Salir.");
            System.out.println(":");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkMajority();
                    break;
                case 2:
                    findGreater();
                    break;
                case 3:
                    checkEvenOdd();
                    break;
                case 4:
                    calculateFactorial();
                    break;
                case 5:
                    showOddNumbersFor();
                    break;
                case 6:
                    showOddNumbersWhile();
                    break;
                case 7:
                    showDayOfWeek();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void checkMajority() {
        System.out.println("Ingrese su edad:");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }

    private void findGreater() {
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    private void checkEvenOdd() {
        System.out.println("Ingrese un número entero:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    private void calculateFactorial() {
        System.out.println("Ingrese un número:");
        int number = scanner.nextInt();
        int factorial = 1;
        int i = number;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println("El factorial de " + number + " es " + factorial);
    }

    private void showOddNumbersFor() {
        System.out.println("Ingrese un número mayor a 10 y menor que 30:");
        int number = scanner.nextInt();
        if (number <= 10 || number >= 30) {
            System.out.println("Número fuera de rango.");
            return;
        }
        System.out.println("Números impares desde 1 hasta " + number + ":");
        for (int i = 1; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void showOddNumbersWhile() {
        System.out.println("Ingrese un número mayor a 10 y menor que 30:");
        int number = scanner.nextInt();
        if (number <= 10 || number >= 30) {
            System.out.println("Número fuera de rango.");
            return;
        }
        System.out.println("Números impares desde 1 hasta " + number + ":");
        int i = 1;
        while (i <= number) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }

    private void showDayOfWeek() {
        System.out.println("Ingrese un número del 1 al 5:");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Número fuera de rango.");
        }
    }
}
