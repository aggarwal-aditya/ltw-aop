package org.example;


import org.example.TrimStrings;

public class Greet {
    @TrimStrings
    public String goodMorning(String name){
        return ("Good Morning: "+name);
    }
    public String goodNight(String name){
        return ("Good Night: "+name);
    }
}
