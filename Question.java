public class Question {
    private String question;
    private String[] options;
    private int correctOption; // index (0-3)

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void displayQuestion(int qNo) {
        System.out.println("Q" + qNo + ": " + question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int answer) {
        return (answer - 1) == correctOption;
    }

    public String getCorrectAnswer() {
        return options[correctOption];
    }
}
