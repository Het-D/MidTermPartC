/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daveh
 */
import java.util.Scanner;
public class TestUserProfile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please Choose your favorite genre from below:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        
         System.out.println("your UserProfile is created for " + " with favorite genre ");

        scanner.close();
    }
}

    

