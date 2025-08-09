package com.quiz.arun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.arun.Entities.Question;
import com.quiz.arun.Entities.Question.Category;
import com.quiz.arun.Entities.Question.Level;
import com.quiz.arun.Repository.QuestRepository;

@SpringBootApplication
public class QuizAppApplication implements ApplicationRunner {

    @Autowired
    private QuestRepository questRepository;

    public static void main(String[] args) {
        SpringApplication.run(QuizAppApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (questRepository.count() == 0) {
            Question q1 = new Question(null,
                    "What is the purpose of the `final` keyword in Java?",
                    "To define constants", "To inherit classes", "To override methods", "To handle exceptions",
                    "To define constants",
                    Level.EASY,
                    Category.JAVA
            );

            Question q2 = new Question(null,
                    "Which of the following is not a Java feature?",
                    "Object-Oriented", "Use of pointers", "Platform Independent", "Dynamic",
                    "Use of pointers",
                    Level.EASY,
                    Category.JAVA
            );

            Question q3 = new Question(null,
                    "Which method is called when an object is created in Java?",
                    "main()", "start()", "constructor", "run()",
                    "constructor",
                    Level.EASY,
                    Category.JAVA
            );

            Question q4 = new Question(null,
                    "Which operator is used for comparison in Java?",
                    "=", "==", "<>", "===",
                    "==",
                    Level.EASY,
                    Category.JAVA
            );

            Question q5 = new Question(null,
                    "Which access modifier makes a member visible only within its own class?",
                    "protected", "public", "default", "private",
                    "private",
                    Level.EASY,
                    Category.JAVA
            );

            Question q6 = new Question(null,
                    "Which of the following is used to define an interface in Java?",
                    "interface", "abstract", "class", "implements",
                    "interface",
                    Level.EASY,
                    Category.JAVA
            );

            Question q7 = new Question(null,
                    "What is method overloading in Java?",
                    "Same method name with different parameters", "Same method with same parameters", "Overriding parent method", "Calling parent constructor",
                    "Same method name with different parameters",
                    Level.EASY,
                    Category.JAVA
            );

            Question q8 = new Question(null,
                    "Which loop is guaranteed to execute at least once?",
                    "for loop", "while loop", "do-while loop", "foreach loop",
                    "do-while loop",
                    Level.EASY,
                    Category.JAVA
            );

            Question q9 = new Question(null,
                    "Which class is the superclass of all classes in Java?",
                    "Object", "Class", "Superclass", "Main",
                    "Object",
                    Level.EASY,
                    Category.JAVA
            );

            Question q10 = new Question(null,
                    "Which keyword prevents inheritance in Java?",
                    "static", "final", "const", "abstract",
                    "final",
                    Level.EASY,
                    Category.JAVA
            );

            Question q11 = new Question(null,
                    "Which loop is suitable when the number of iterations is known?",
                    "while", "do-while", "for", "foreach",
                    "for",
                    Level.EASY,
                    Category.JAVA
            );

            Question q12 = new Question(null,
                    "What is the use of @Autowired in Spring?",
                    "To create objects manually", "To inject dependencies automatically", "To override methods", "To extend classes",
                    "To inject dependencies automatically",
                    Level.MEDIUM,
                    Category.SPRING
            );

            Question q13 = new Question(null,
                    "Which command is used to clone a repository in Git?",
                    "git init", "git clone", "git pull", "git commit",
                    "git clone",
                    Level.EASY,
                    Category.GIT
            );

            Question q14 = new Question(null,
                    "What does Spring Boot starter do?",
                    "Starts the JVM", "Configures beans manually", "Bundles dependencies and auto-configuration", "Compiles code",
                    "Bundles dependencies and auto-configuration",
                    Level.EASY,
                    Category.SpringBoot
            );

            Question q15 = new Question(null,
                    "Which annotation is used to map a JPA entity to a table?",
                    "@Entity", "@Table", "@Id", "@Column",
                    "@Entity",
                    Level.EASY,
                    Category.SpringBoot
            );

            questRepository.save(q1);
            questRepository.save(q2);
            questRepository.save(q3);
            questRepository.save(q4);
            questRepository.save(q5);
            questRepository.save(q6);
            questRepository.save(q7);
            questRepository.save(q8);
            questRepository.save(q9);
            questRepository.save(q10);
            questRepository.save(q11);
            questRepository.save(q12);
            questRepository.save(q13);
            questRepository.save(q14);
            questRepository.save(q15);

        } else {
           
        }
    }


}
