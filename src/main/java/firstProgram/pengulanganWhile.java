package firstProgram;

import java.util.Scanner;

public class pengulanganWhile {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("are you ready?");
       String ulangi = scanner.nextLine();
       System.out.println("start");
       int counter = 0;

       while (ulangi.equals(1) || ulangi.equalsIgnoreCase("yes")){
           System.out.println("pengulangan ke- " + counter);
           System.out.println("Apakah anda mau mengulang? {yes/no}");
           String jawab = scanner.nextLine();
           counter++;
           if(!jawab.equalsIgnoreCase("yes")){
               ulangi = "0";
           }

       }

    }
}
