package HW1_27;

import music.Instrument;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //#1
        System.out.println("Hello c15");

        //#2
        int example = 12;
        System.out.println(example);
        short shortExample = 900;
        System.out.println(shortExample);
        long longExample = 1500;
        System.out.println(longExample);
        double doubleExample = 40;
        System.out.println(doubleExample);
        float floatExample = 200f;
        System.out.println(floatExample);
        char letter = 'M';
        System.out.println(letter);
        boolean isTrue = true;
        System.out.println(isTrue);
        byte byteExample = 20;
        System.out.println(byteExample);

        //#3
        String dog = "I am Dog";
        String space = " ";
        String dogSound = "I Bark";
        String dogGreeting = dog + space + dogSound;
        System.out.println(dogGreeting);
        System.out.println("I am a Cat " + "My age is " + example);

        //#4
        int age = 3;
        boolean isOfAge = age > 18;
        System.out.println(isOfAge);
        int x = 0;
        while (x < age) { // The condition
            System.out.println("This condition is true therefore it prints");
            x = x + 1; // This now will print three times because age is three
        }
        //#5
        for (int i = 0; i <= 2; i++) {
            System.out.println("This is loop # " + i);
        }
        //#6
        int score = 50;
        if (score > 51) {
            System.out.println("You win");
        } else if (score == 50) {
            System.out.println("Close - but not quite");

        } else {
            System.out.println("You Lose");
        }

        int javaLoop = 0;
        while (true) {
            System.out.println("Infinite Loop" + javaLoop);

            if (javaLoop == 3) {
                break;
            }
            javaLoop++;
            System.out.println("Again");
        }

        //#7
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome! Please enter your Name");
        String name = read.next();
        System.out.println("Thank you " + name + ", What is your age? ");
        String userAge = read.next();
        System.out.println("Your name is: " + name + " Your age is: " + userAge);


        //#8
        System.out.println("Please enter your password");
        int password = read.nextInt();
        while(password!= 100) {
            System.out.println("Incorrect Password, Please Try Again: ");
            password = read.nextInt();
        }
        System.out.println("You are now admitted");

        //#9
        System.out.println("Additional Verification: Enter your Shoe size");
        String verify = read.next();
        switch (verify){
            case "6":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Incorrect Size");

        }
        read.close();

        //#10
        int[] arrayOfNumbers;
        arrayOfNumbers = new int[5];
        arrayOfNumbers[0] = 5;
        arrayOfNumbers[1] = 10;
        arrayOfNumbers[2] = 15;
        arrayOfNumbers[3] = 20;
        arrayOfNumbers[4] = 25;
        System.out.println(arrayOfNumbers[4]);

        for (int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println(i); // Print out index positions
        }

        // #11
        String[] sentence = new String[3];
        sentence[0] = "I";
        sentence[1] ="am";
        sentence[2] = "coding";

        System.out.println(sentence[2]);

        //Another way to make array

        String[] animals = {"Dog", "Cat","Giraffe"};
        for (String pet : animals){
            System.out.println(pet);
        }

        int val = 0;
        String text = null; // null has no value

        String[] colors = new String[3]; // Allocating memory
        colors[0] = "red";
        colors[1] = "blue";
        colors [2] = "yellow";

        //#12

        String[][] furniture = {
                {"Desk","Gaming Chair", "Mug"}, // Think of rows & columns - Remember index positions start at 0
                {"Table","Chair", "Cup"}
        };
        System.out.println(furniture[0][1]);// Gaming chair
        System.out.println(furniture[0][2]);//Mug

        int[][] goalsAndSeason = new int[2][3]; // Two rows with three int refrences
        goalsAndSeason[0][0] = 3;
        goalsAndSeason[0][1] = 4;
        goalsAndSeason[0][2] = 6;
        goalsAndSeason[1][0] = 1;
        goalsAndSeason[1][1]= 2;
        goalsAndSeason[1][2] = 3;

       for (int row =0; row<goalsAndSeason.length; row++){
           for (int col = 0; col <goalsAndSeason[row].length; col++){
               System.out.println(goalsAndSeason[row][col] + "\t");
           }
       }

       //#13

        Beach beach1 = new Beach();
       beach1.name ="Palawan";
       beach1.population = 3200;

       Beach beach2 = new Beach();
       beach2.name = "Ocean City";
       beach2.population = 5700;

       //#14

        beach1.beach();
        beach2.beach();

        //#15
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.price = 30000;

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.price = 45000;

        System.out.println("Total left for: " + car2.brand + " is " + car2.totalOwed());

        System.out.println(car2.getPrice());

        //#16
        Student student1 = new Student();
        student1.speak("Hello I am Student1");
        student1.profile("Math",'B');

        //#17
        Student student2 = new Student();
        student2.setAge(17);
        student2.setStudentId(212);
        System.out.println("Student ID is: " + student2.getStudentId() + "Age is: " + student2.getAge());

        //#18
        TVShow show1 = new TVShow("Friends", 356);

        //#19
        show1.season = 3;
        System.out.println("TV show season is: " + show1.season);
        show1.showName();
        System.out.println(show1.SPECIAL_EP);
        TVShow show2 = new TVShow("Spongebob", 500);
        show2.showName();

        //#20

        // Inefficient way
        String sentences = " ";
        sentences+= "My name is Gwyn";
        sentences+= "I am doing hw";
        sentences+= "Learning JAVA";
        System.out.println(sentences);

        //Efficient way
        StringBuilder object = new StringBuilder("");
        object.append("My name is John");
        object.append(" ");
        object.append("My lastname is Wick");
        System.out.println(object.toString());
        // Alternate efficient way
        StringBuilder build2 = new StringBuilder();
        build2.append("My name is Patrick").append(" I live under a rock");
        System.out.println(build2.toString());

        // System.out.printf("Total Value: %f/n", 7.3);

        //#21 // toString
        Cow cow1 = new Cow("Bobby", 3);
        //System.out.println(cow1);
        System.out.println("\n" + cow1.toString());

        //#22 // Inheritance
        Game game1 = new Game();
        Player player1 = new Player("Bunny",3);
        player1.stop();

        //#23 - Interface
        Info info1 = new Game();
        info1.showInfo();

        Info info2 = new Player("Goblin", 12);
        info2.showInfo();

        //#24 - 25 Packages and public private and protected


        Instrument instrument1 = new Instrument();
        //System.out.println(plant.height); - This won't work because not in the same package
        //Private -- Only within same class
        // Public -- Everywhere
        //protected -- same class, subclass, and same package
        //no modifier -- same package ONLY

        //#26 - Polymorphism
        Game game2 = player1;
        game2.crash();
        Game game3;
        // game3.update <--- canoot use update because it's not in parent class

        //#27 - Encapsulation and the API Docs
        // Use Java docs when needed
        




    }

}













