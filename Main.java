import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide.");
            scanner.next();
        }
        int nbrCages = scanner.nextInt();

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.next();

        ZooManagement myZoo = new ZooManagement(nbrCages, zooName);
        myZoo.displayZooInfo();

        scanner.close();
    }
}