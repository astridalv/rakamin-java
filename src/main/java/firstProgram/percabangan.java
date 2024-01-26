package firstProgram;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("masukkan kata sandi :");
        String validPassword = "password";

        if(password.equals(validPassword)){
            System.out.println("Login sukses!");
        }else{
            System.out.println("Password salah!");
        }
        System.out.println("Terima Kasih~");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
