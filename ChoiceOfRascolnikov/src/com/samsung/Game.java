package com.samsung;

import com.samsung.model.Character;
import com.samsung.model.Story;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Character character;
        Story story;
        Scanner in = new Scanner(System.in);
        story = new Story();
        character = new Character();
        while (true) {
            character.balance += story.current_situation.dB;
            character.reputation += story.current_situation.dR;
            character.health += story.current_situation.dH;
            System.out.println("=====\nБаланс:" + character.balance + "\tРепутация:"
                    + character.reputation + "\tЗдоровье:" +  character.health + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }
}
