# 🧠 Java Console-Based Quiz App

A simple, interactive **console-based quiz application** written in Java. Users are presented with multiple-choice questions, enter their answers, and receive a final score at the end.

---

## ✅ Features

- Multiple-choice quiz questions
- Accepts user answers (1-4) from the console
- Instant feedback or end-of-quiz score
- Clean object-oriented structure

---

## 📦 Project Structure

```
QuizApp/
├── Question.java         # Model for a quiz question
└── QuizApp.java          # Main class that runs the quiz
```

---

## 📋 Sample Questions

```text
Q1: Which language is used to develop Android apps?
1. Swift
2. Kotlin
3. Python
4. Ruby
```

---

## 🚀 How to Run

### 1. Save the Files

- `Question.java`
- `QuizApp.java`

### 2. Compile and Run

```bash
javac Question.java QuizApp.java
java QuizApp
```

---

## 🧾 Sample Output

```text
=== Welcome to the Java Quiz App ===
Q1: Which language is used to develop Android apps?
1. Swift
2. Kotlin
3. Python
4. Ruby
Enter your answer (1-4): 2
Correct!

...

=== Quiz Finished ===
Your Score: 4/5
```

---

## 👨‍💻 Code Overview

### `Question.java`

Encapsulates a quiz question with options and correct answer index.

```java
public class Question {
    private String question;
    private String[] options;
    private int correctOption; // 0-based index
    ...
}
```

### `QuizApp.java`

Main logic that:

- Loads questions into a list
- Displays them to the user
- Accepts input (1–4)
- Calculates and prints final score

---

## 🛠 To-Do (Optional Enhancements)

- Add categories or difficulty levels
- Store questions in a file or database
- Add timer for each question
- GUI version using Swing or JavaFX

---

## 📚 Tools Used

- Java 8+
- Console (Terminal / CMD / IntelliJ / VS Code)

---

## 📌 Author

imsaqib04
