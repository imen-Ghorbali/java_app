
/*public class ZooManagement {
    // Main method
    public static void main(String[] args) {
        // Déclaration de variables dans ma main method, je n'ai qu'une seule classe
        int nbrCages = 20;
        String zooName = "my zoo";
        // Affichage Message
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}

 */


// import classe scanner de java
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander le nombre de cages et s'assurer qu'il est positif
        System.out.println("Entrez le nombre de cages (doit être un nombre entier positif) :");
        int nbrCages = sc.nextInt();
        while (nbrCages <= 0) {
            System.out.println("Le nombre de cages doit être un entier positif. Réessayez :");
            nbrCages = sc.nextInt();
        }

        // remise à zéro
        sc.nextLine();

        // Demander le nom du zoo et vérifier qu'il n'est pas vide
        System.out.println("Entrez le nom du Zoo :");
        String zooName = sc.nextLine();
        while (zooName.trim().isEmpty()) {
            System.out.println("Le nom du Zoo ne peut pas être vide. Réessayez :");
            zooName = sc.nextLine();
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        sc.close();
    }
}


