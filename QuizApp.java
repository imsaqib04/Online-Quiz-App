import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Add quiz questions
        questions.add(new Question(
                "Which language is used to develop Android apps?",
                new String[]{"Swift", "Kotlin", "Python", "Ruby"}, 1));
        questions.add(new Question(
                "Who developed Java?",
                new String[]{"Bill Gates", "James Gosling", "Guido van Rossum", "Linus Torvalds"}, 1));
        questions.add(new Question(
                "What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2));
        questions.add(new Question(
                "Which data structure uses FIFO?",
                new String[]{"Stack", "Queue", "Tree", "Graph"}, 1));
        questions.add(new Question(
                "What does JVM stand for?",
                new String[]{"Java Virtual Machine", "Java Visual Manager", "Java Version Manager", "Java Variable Module"}, 0));

        int score = 0;
        int qNo = 1;

        System.out.println("=== Welcome to the Java Quiz App ===");
        for (Question q : questions) {
            q.displayQuestion(qNo++);
            System.out.print("Enter your answer (1-4): ");
            int userAns;
            try {
                userAns = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Skipping question.\n");
                continue;
            }

            if (q.isCorrect(userAns)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("=== Quiz Finished ===");
        System.out.println("Your Score: " + score + "/" + questions.size());
        sc.close();
    }
}
