package quizapp;

import java.util.Scanner;

public class QuizApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String q1 = "(1) ___ is a new area which deals with the study and management"
                + " of honey producing bees\n"
                + "(a)Apiculture\n(b)Olericulture\n(c)Bee Science\n(d)Animal Science\n";
        
        String q2 = "(2) What color are banana?\n"
                + "(a)Green\n(b)Yellow\n(c)Blue\n(d)Red\n";
        
        String q3 = "(3) ___ is the production of silk and rearing of silk worms"
                + "for specific purposes\n" 
                + "(a) Horticulture\n (b) Sericulture\n (c) Silviculture\n (d) Pomology\n";
        
        String q4 = "(4) Atomicity of ozone is ___\n" 
                + "(a)2\n (b) 1\n (c) 3\n (d) 4\n";
        
        String q5 = "(5) There are basic particles from which matter could be made"
                + "up of except __\n"
                + "(a) salt\n (b) atom\n (c) ion\n (d) molecules\n";

      
        Questions[] question = {
            new Questions(q1, "a"),
            new Questions(q2, "b"),
            new Questions(q3, "b"),            
            new Questions(q4, "c"),
            new Questions(q5, "a"),
        };
        takeTest(question);
    }

    public static void takeTest(Questions[] question) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        for (Questions question1 : question) {
            System.out.println(question1.prompt);
            String answer = input.nextLine();
            if (answer.equals(question1.answer)) {
                score++;
            }
        }
        System.out.println("You score " + score + "/" + question.length);
    }
}