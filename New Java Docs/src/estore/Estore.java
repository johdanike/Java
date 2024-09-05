package estore;

import java.util.Scanner;

public class Estore {
    static Scanner input = new Scanner(System.in);
//    private int age;
//    private String email;
//    private String password;
//    private String name;
//    private String phone;
//    private String address;
//    private Users user;

//    public Estore(Users user) {
//        this.user = user;
//    }

    public static void main(String[] args) {

        print("Which category do you belong to");
        showMainMenu();
    }

    public static void showMainMenu() {
        String menu = """
                Press
                1 -> Customer
                2 -> Seller
                3 -> Exit
                """;
        print(menu);

        char userInput = input.next().charAt(0);


        switch(userInput) {
            case '1':
                Users user1 = Users.CUSTOMER;

//                openAccount();
            case '2':
                Users user2 = Users.SELLER;
//                deposit();
            case '3':
                exit();
        }


    }
    private static void user_parameters(){

    }
    private static String input(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in).nextLine();
    }
    private static void print(String prompt){
        System.out.println(prompt);
    }
    public boolean userExists() {
        return true;
    }
    private static void exit(){
        System.exit(1);
    }


}
