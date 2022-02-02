package com.juluru.collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorInJava {
    public static void main(String[] args) {
        List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin","Angular");
        Spliterator<String> languageSpliterator = languageList.spliterator();
        Spliterator<String> anotherLanguageSpliterator = languageSpliterator.trySplit();

        System.out.println("From 1st Spliterator"+languageSpliterator.estimateSize());
        System.out.println("------------------");
        languageSpliterator.forEachRemaining(System.out::println);

        System.out.println("------------------");

        System.out.println("From 2nd Spliterator"+anotherLanguageSpliterator.estimateSize());
        System.out.println("------------------");
        anotherLanguageSpliterator.forEachRemaining(System.out::println);

    }
}
