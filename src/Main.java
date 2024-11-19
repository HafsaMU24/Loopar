import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String again = "j";


        do{
            System.out.println("Välj en multipliktions Teball: ");
            int choosenNumber = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i <= 10; i++) {
                int answer = i * choosenNumber;
                System.out.println(i + " * " + choosenNumber + " = " + answer); // i * 3 =3

            }
            System.out.println("Vill du se en teball till? (j/n)");
            again = sc.nextLine();
        }while (again.equals("j"));
    }
}