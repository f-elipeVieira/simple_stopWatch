import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cronometo cronometro = new Cronometo();
        String input = "";

        System.out.println("Cronômetro aberto");

        do{
            System.out.print("""
                
                C -> Começar
                P -> Parar
                R -> Reiniciar
                S -> Sair
                """);

            input = scanner.nextLine().toUpperCase();

            switch (input){
                case "C" -> {
                    cronometro.run();
                }
                case "P" -> {
                    cronometro.parar();
                }
                case "R" -> {
                    cronometro.reiniciar();
                }
                case "S" -> {
                    System.out.println("Parando cronômetro...");
                }
                default -> {
                    System.out.println("Escolha um opção válida.");
                }
            }
        }
        while(!input.equals("S"));

        scanner.close();
    }
}
