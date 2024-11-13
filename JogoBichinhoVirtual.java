import java.util.Scanner;

public class JogoBichinhoVirtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do animal
        System.out.println("Crie seu novo animal");
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira a classe: ");
        String classe = scanner.nextLine();
        System.out.print("Insira a família: ");
        String familia = scanner.nextLine();

        Animal animal = new Animal(nome, classe, familia);
        animal.exibirEstado();

        // Loop principal do jogo
        while (animal.estaVivo()) {
            System.out.println("O que o " + nome + " vai fazer agora?");
            System.out.println("1- Comer");
            System.out.println("2- Correr");
            System.out.println("3- Dormir");
            System.out.println("4- Morrer");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    animal.comer();
                    break;
                case 2:
                    animal.correr();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    animal.morrer();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        System.out.println("GAME OVER!");
        scanner.close();
    }
}
