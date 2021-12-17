package Presentation;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Menu {
  private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Nos muestra el menu general del programa.
     */
    public void showMenu() {
        System.out.println("The IEEE needs to know where your allegiance lies.\n" +
                " I) People’s Front of Engineering (CSV)\n" +
                " II) Engineering People’s Front (JSON)\n");
    }


    /**
     * Funcion para devolver un entero.
     *
     * @param message Mensaje escrito por el usuario.
     * @return int Devuelve un entero
     */
    public int askForInteger(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error");
            } finally {
                scanner.nextLine();
            }
        }
    }

 public String askForString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void print(String message) {
        System.out.println(message);

    }
}
