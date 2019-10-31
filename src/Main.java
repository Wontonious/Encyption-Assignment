import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the encryption service!");
        Scanner scan = new Scanner(System.in);
            System.out.println("Please input a string you wish to encrypt!");
            String userString = scan.nextLine();

        String move = userString.substring(userString.length()-1);
        String reMove = userString.substring(0,userString.length()-1);

        System.out.println(reMove+"dfghj"+move);


            }
        }


