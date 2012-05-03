package com.scjaexam.tutorial;

import com.scjaexam.tutorial.planets.Earth;
import com.scjaexam.tutorial.planets.Mars;
import com.scjaexam.tutorial.planets.Venus;

public class GreetingsUniverse {
    public static void main (String[] args) {
        System.out.println("Greetings, Universe!");
        Earth e = new Earth();
        Mars m = new Mars();
        Venus v = new Venus();
    }
}
