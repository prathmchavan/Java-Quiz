import java.util.Scanner;

public class QuestionService {

    private Question[] questions = new Question[5];
    private String[] userAnswers = new String[5];
    private int score = 0;

    public QuestionService() {
        questions[0] = new Question(1, "What is Java?", new String[]{"A language", "A beverage", "A planet", "A car"}, "A language");
        questions[1] = new Question(2, "What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, "Paris");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, "Mars");
        questions[3] = new Question(4, "What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, "Pacific Ocean");
        questions[4] = new Question(5, "Who wrote 'To Kill a Mockingbird'?", new String[]{"Harper Lee", "Jane Austen", "Mark Twain", "J.K. Rowling"}, "Harper Lee");
    }

    public void displayQuestions() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question ID: " + q.getId());
            System.out.println(q.getQuestion());
            for (String opt : q.getOpt()) {
                System.out.println(opt);
            }
            System.out.print("Enter your answer: ");
            userAnswers[i] = sc.nextLine();
            System.out.println(); // Print a newline for better readability
        }
        
        sc.close(); // Close the scanner to avoid resource leak
    }

    public void displayResult() {
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String userAnswer = userAnswers[i];
            System.out.println("Question ID: " + q.getId());
            System.out.println("Question: " + q.getQuestion());
            System.out.println("Your answer: " + userAnswer);
            System.out.println("Correct answer: " + q.getAnswer());
            if (userAnswer.equals(q.getAnswer())) { // Use .equals() for string comparison
                System.out.println("Result: Correct");
                score++;
            } else {
                System.out.println("Result: Wrong");
            }
            System.out.println(); // Print a newline for better readability
        }

        System.out.println("Your total score is: " + score + "/" + questions.length);
    }

    
}
