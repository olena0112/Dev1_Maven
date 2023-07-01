package com.example.maven;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Olena", "Dobrova");
        Gson gson = new Gson();

        String json = gson.toJson(person);

        System.out.println(json);
    }
}

