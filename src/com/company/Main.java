package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    boolean exit = false;

    public void stats() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void artwork() {

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
        System.out.println("Here`s your Coffee!\n");
    }

    public void changeStats (int currentWater, int currentMilk, int currentBeans, int currentMoney){
        water -= currentWater;
        milk -= currentMilk;
        beans -= currentBeans;
        money += currentMoney;
        cups -= 1;
    }

    public void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += sc.nextInt();
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello I'm Carl your virtual Coffee Machine.\n");

        while (!exit) {
            System.out.println("What can i do for you? (buy, fill, take, remaining, exit):");
            String action = sc.next();
            if (!action.equals("exit")) {
                switch (action) {
                    case "buy" -> {
                        System.out.println("What do you want? We got espresso (1), latte (2), cappuccino (3) or you can go back to main menu (back):");
                        String select1 = sc.next();
                        switch (select1) {
                            case "1", "espresso" -> {
                                if (water >= 250 && beans >= 16 && cups >= 1) {
                                    changeStats(250, 0, 16, 4);
                                    artwork(); }
                                else if (water < 250) System.out.println("Sorry, not enough water!");
                                else if (beans < 16) System.out.println("Sorry, not enough beans!");
                                else System.out.println("Sorry, not enough cups!");
                            }
                            case "2", "latte" -> {
                                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                    changeStats(350,75,20,7);
                                    artwork(); }
                                else if (water < 350) System.out.println("Sorry, not enough water!");
                                else if (milk < 75) System.out.println("Sorry not enough milk!");
                                else if (beans < 20) System.out.println("Sorry, not enough beans!");
                                else System.out.println("Sorry, not enough cups!");
                            }
                            case "3", "cappuccino" -> {
                                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                    changeStats(200,100,12,6);
                                    artwork(); }
                                else if (water < 200) System.out.println("Sorry, not enough water!");
                                else if (milk < 100) System.out.println("Sorry not enough milk!");
                                else if (beans < 12) System.out.println("Sorry, not enough beans!");
                                else System.out.println("Sorry, not enough cups!");
                            }
                            case "back" -> {}
                            default -> System.out.println("Invalid input. Try again.");
                        }
                    }
                    case "fill" -> fill();
                    case "take" -> {
                        System.out.println("Insert your password:");
                        String pwTake = sc.next();
                        if (pwTake.equals("1234")) {
                            System.out.println("I gave you $" + money);
                            money = 0; }
                        else System.out.println("Incorrect Password!");
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