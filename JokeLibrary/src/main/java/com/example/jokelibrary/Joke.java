package com.example.jokelibrary;

import java.util.ArrayList;
import java.util.Random;

public class Joke {
    ArrayList<String> mJokeList;

    public void setUpJokes() {
        mJokeList = new ArrayList<>();
        mJokeList.add("\n" +
                " Anton, do you think I’m a bad mother?\n" +
                "\n" +
                "My name is Paul.\n" +
                "\n" );
        mJokeList.add("\n" +
                "Patient: Oh doctor, I’m just so nervous. This is my first operation.\n" +
                "-\n" +
                "Doctor: Don't worry. Mine too.\n" +
                "\n" );
        mJokeList.add("What do you call a fish without eyes? Fsh. ");

        mJokeList.add("Q: Can February march? \n" +
                "A: No, but April may.");
        mJokeList.add("Q: Why did the witches' team lose the baseball game? \n" +
                "A: Their bats flew away.");
        mJokeList.add("Q: Why are ghosts bad liars? \n" +
                "A: You can see right through them.");
        mJokeList.add("A: I have the perfect son. \n" +
                "B: Does he smoke? \n" +
                "A: No, he doesn’t. \n" +
                "B: Does he drink whiskey? \n" +
                "A: No, he doesn’t. \n" +
                "B: Does he ever come home late? \n" +
                "A: No, he doesn’t. \n" +
                "B: I guess you really do have the perfect son.\n" +
                " How old is he? \n" +
                "A: He will be six months old next Wednesday.\n" +
                "\n");
        mJokeList.add("George says to his friend “I have no control,\n" +
                " there is no end, I don’t think there is a chance to escape\n" +
                ", I don’t even have a home at all”\n" +
                "“Definitely it is the right time for a new keyboard”!");
        mJokeList.add("Can you find an operating system which is 14\n" +
                " times better than Windows 7?\n" +
                "Window 98!");
        mJokeList.add("Programmer to his daughter: \n" +
                "“I have bought a new Doll for you”\n" +
                "Daughter: “Thank you, papa, but where is the user’s guide?”!");
        mJokeList.add("Why was 6 afraid of 7?\n" +
                "Because 7 ate 9!");
        mJokeList.add("What’s the loneliest cheese?\n" +
                "ProvAlone!");
        mJokeList.add("What kind of dog does Dracula have?\n" +
                "A bloodhound!");
        mJokeList.add("One state official to the other: \n" +
                "I don't know what people have against us  \n " +
                "We haven't done anything");
        mJokeList.add("I said to the Gym instructor \n"
                +"Can you teach me to do the splits?\" He said, " +
                "\"How flexible are you?\" I said, \"I can't make Tuesdays\"'");
        mJokeList.add(" went to the zoo the other day, \n " +
                "there was only one dog in it, it was a shitzu.'");
        mJokeList.add("Q: Why did Johnny throw the clock out of the window? \n" +
                "A: Because he wanted to see time fly! ");
        mJokeList.add("Q: What do you call a belt with a watch on it? \n" +
                "A: A waist of time \n" +
                "\n");
        mJokeList.add("\n" +
                "Q: How does a network administrator nerd greet people who come to his house? \n" +
                "A: Welcome to 127.0.0.1 \n");
        mJokeList.add("CAPS LOCK – Preventing Login Since 1980. \n");
        mJokeList.add("\n" +
                "Q: Why can't you give Elsa a balloon? \n" +
                "A: Because she will Let it Go! \n");
        mJokeList.add("The box said 'Requires Windows 95 or better'. So I installed Linux.\n" +
                "\n");
        mJokeList.add("Q: What did one vegetarian say to the other vegetarian?\n" +
                "A: We have to stop meating like this. ");


    }


    public String getJoke() {
        setUpJokes();

        Random randomGenerator;
         randomGenerator = new Random();
        int index = randomGenerator.nextInt(mJokeList.size());
        String joke = mJokeList.get(index);
        return joke;
    }
}
