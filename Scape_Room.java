import java.util.Scanner;

public class Scape_Room {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String answer = ""; // este crea la variable


        while (true){
           System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
            answer = scanner.nextLine(); // este  cambia el valor de la variable

            if(answer.equalsIgnoreCase("echo")){

                System.out.println("Great Job!");
                break;
            }else {
                System.out.println("Keep trying, your'e close!");
            }

        }

        scanner.close();
        

    }
}
