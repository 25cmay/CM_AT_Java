package org.derryfield.toys;

import java.util.Random;

public class Magic8Ball {
    private String[] answers = {
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy, try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    };

    private Random random;

    // Constructor
    public Magic8Ball() {
        random = new Random();
    }

    // Interact
    public String shake() {
        int index = random.nextInt(answers.length);
        return answers[index];
    }
}