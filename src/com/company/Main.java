package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();


    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static boolean exit = false;
    static int[] Tea = {9, 9, 9};
    static String select;
    static int[] staticWater = {250, 350, 200};
    static int[] staticMilk = {0, 75, 100};
    static int[] staticBeans = {16, 20, 12};
    static int[] staticMoney = {4, 7, 6};


    public static void stats() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void artworkCoffee() {
        int num = rand.nextInt(4);

        System.out.println("I have enough resources, making you a coffee!\n");

        switch (num) {
            case 0 -> {
                System.out.println("                        (");
                System.out.println("                          )     (");
                System.out.println("                   ___...(-------)-....___");
                System.out.println("               .-\"\"       )    (          \"\"-.");
                System.out.println("         .-'``'|-._             )         _.-|");
                System.out.println("        /  .--.|   `\"\"---...........---\"\"`   |");
                System.out.println("       /  /    |                             |");
                System.out.println("       |  |    |                             |");
                System.out.println("        \\  \\   |                             |");
                System.out.println("         `\\ `\\ |                             |");
                System.out.println("           `\\ `|                             |");
                System.out.println("           _/ /\\                             /");
                System.out.println("          (__/  \\                           /");
                System.out.println("       _..---\"\"` \\                         /`\"\"---.._");
                System.out.println("    .-'           \\                       /          '-.");
                System.out.println("   :               `-.__             __.-'              :");
                System.out.println("   :                  ) \"\"---...---\"\" (                 :");
                System.out.println("    '._               `\"--...___...--\"`              _.'");
                System.out.println("      \\\"\"--..__                              __..--\"\"/");
                System.out.println("       '._     \"\"\"----.....______.....----\"\"\"     _.'");
                System.out.println("          `\"\"--..,,_____            _____,,..--\"\"`");
                System.out.println("                        `\"\"\"----\"\"\"`\n\n");
            }
            case 1 -> {
                System.out.println("         {");
                System.out.println("      {   }");
                System.out.println("       }_{ __{");
                System.out.println("    .-{   }   }-.");
                System.out.println("   (   }     {   )");
                System.out.println("   |`-.._____..-'|");
                System.out.println("   |             ;--.");
                System.out.println("   |            (__  \\");
                System.out.println("   |             | )  )");
                System.out.println("   |             |/  /");
                System.out.println("   |             /  /  ");
                System.out.println("   |            (  /");
                System.out.println("   \\             /");
                System.out.println("    `-.._____..-'\n\n");
            }
            case 2 -> {
                System.out.println("                       .");
                System.out.println("                        `:.");
                System.out.println("                          `:.");
                System.out.println("                  .:'     ,::");
                System.out.println("                 .:'      ;:'");
                System.out.println("                 ::      ;:'");
                System.out.println("                   `.  :.");
                System.out.println("                   `.  :.");
                System.out.println("          _________________________");
                System.out.println("         : _ _ _ _ _ _ _ _ _ _ _ _ :");
                System.out.println("     ,---:\".\".\".\".\".\".\".\".\".\".\".\".\":");
                System.out.println("    : ,'\"`::.:.:.:.:.:.:.:.:.:.:.::'");
                System.out.println("    `.`.  `:-===-===-===-===-===-:'");
                System.out.println("      `.`-._:                   :");
                System.out.println("        `-.__`.               ,'");
                System.out.println("    ,--------`\"`-------------'--------.");
                System.out.println("     `\"--.__                   __.--\"'");
                System.out.println("            `\"\"-------------\"\"'\n\n");
            }
            case 3 -> {
                System.out.println("      )  (");
                System.out.println("     (   ) )");
                System.out.println("      ) ( (");
                System.out.println("    _______)_");
                System.out.println(" .-'---------|");
                System.out.println("( C|/\\/\\/\\/\\/|");
                System.out.println(" '-./\\/\\/\\/\\/|");
                System.out.println("   '_________'");
                System.out.println("    '-------'\n");
            }
        }
        System.out.println("Here's your Coffee!\n");
    }

    public static void artworkTea() {
        int num = rand.nextInt(2);

        System.out.println("I have enough resources, making you a Tea!\n");

        switch (num){
            case 0 -> {
                System.out.println("      )");
                System.out.println("     (");
                System.out.println("      )");
                System.out.println("  _.-~(~-.");
                System.out.println(" (@\\`---'/.  ");
                System.out.println("('  `._.'  `)");
                System.out.println(" `-..___..-'");
            }
            case 1 -> {
                System.out.println("            )");
                System.out.println("           (");
                System.out.println("            )");
                System.out.println(".-.,--^--.  _");
                System.out.println("\\\\| `---' |//");
                System.out.println(" \\|        /");
                System.out.println("_\\_______/_");
            }
        }
        System.out.println("Here's your Tea!");
    }

    public static void changeStatsCoffee(int currentWater, int currentMilk, int currentBeans, int currentMoney){
        water -= currentWater;
        milk -= currentMilk;
        beans -= currentBeans;
        money += currentMoney;
        cups -= 1;
    }

    public static void changeStatsTea(int currentWater, int currentGreenTea, int currentBlackTea, int currentChrisTea, int currentMoney){
        water -= currentWater;
        Tea[0] -= currentGreenTea;
        Tea[1] -= currentBlackTea;
        Tea[2] -= currentChrisTea;
        money += currentMoney;
        cups -= 1;
    }

    public static void Tea(int select){
        if (water >= 500 && Tea[select] >= 1 && cups >= 1){
            changeStatsTea(500,1,0,0,5);
            artworkTea();
        } else if (water < 500) System.out.println("Sorry, not enough water!");
        else if (Tea[select] < 1) System.out.println("Sorry, not enough Tea!");
        else System.out.println("Sorry not enough cups!");
    }

    public static void Coffee(int select){
        if (water >= staticWater[select] && milk >= staticMilk[select] && beans >= staticBeans[select] && cups >= 1) {
            changeStatsCoffee(staticWater[select], staticMilk[select], staticBeans[select],staticMoney[select]);
            artworkCoffee();
        } else if (water < staticWater[select]) System.out.println("Sorry, not enough water!");
        else if (milk < staticMilk[select]) System.out.println("Sorry not enough milk!");
        else if (beans < staticBeans[select]) System.out.println("Sorry, not enough beans!");
        else System.out.println("Sorry, not enough cups!");
    }


    public static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += sc.nextInt();
        System.out.println("Write how many Green Teabags do you want to add:");
        Tea[0] += sc.nextInt();
        System.out.println("Write how many Black Teabags do you want to add:");
        Tea[1] += sc.nextInt();
        System.out.println("Write how many Christmas Teabags do you want to add:");
        Tea[2] += sc.nextInt();
        System.out.println("Write how many disposable cups do you want to add:");
        cups += sc.nextInt();
    }

    public static void main(String[] args) {

        System.out.println("Hello I'm Carl your virtual Coffee Machine.\n");

        while (!exit) {
            System.out.println("What can i do for you? (buy, fill, take, remaining, exit):");
            select = sc.next();
            if (!select.equals("exit")) {
                switch (select) {
                    case "buy" -> {
                        System.out.println("Do you want a Tea (1) or a Coffee (2):");
                        select = sc.next();
                        if (select.equals("1") || select.equals("Tea") || select.equals("tea")) {
                            System.out.println("What flavor of Tea do you want? We got Green Tea (1), Black Tea (2) and Christmas Tea (3)");
                            select = sc.next();
                            switch (select) {
                                case "1", "Green Tea", "green Tea", "Green tea", "green tea" -> Tea(0);
                                case "2", "Black Tea", "black Tea", "Black tea", "black tea" -> Tea(1);
                                case "3", "Christmas Tea", "christmas Tea", "Christmas tea", "christmas tea" -> Tea(2);
                            }
                        }
                        else {
                            System.out.println("What do you want? We got espresso (1), latte (2), cappuccino (3) or you can go back to main menu (back):");
                            select = sc.next();
                            switch (select) {
                                case "1", "espresso" -> Coffee(0);
                                case "2", "latte" -> Coffee(1);
                                case "3", "cappuccino" -> Coffee(2);
                                case "back" -> {
                                }
                                default -> System.out.println("Invalid input. Try again.");
                            }
                        }
                    }
                    case "fill" -> fill();
                    case "take" -> {
                            System.out.println("I gave you $" + money);
                            money = 0;
                    }
                    case "remaining" -> stats();
                    default -> System.out.println("Invalid input. Try again.");
                }
            } else {
                exit = true;
            }
        }
    }
}