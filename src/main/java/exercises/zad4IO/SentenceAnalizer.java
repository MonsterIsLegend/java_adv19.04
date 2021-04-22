package exercises.zad4IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SentenceAnalizer {
    //Napisz program, który jest odpowiedzialny za zwrócenie najdłuższego słowa we
    //wskazanym pliku tekstowym.
    private static final String PATH = Paths.get("").toAbsolutePath().toString() +
            "\\src\\main\\java\\exercises\\zad4IO\\definition.txt";
    public static String getLongestWord(  ){

        try{
            String longestWord = "";
            String[] dividedSentence;
            String wordToCompare;
            Scanner sc = new Scanner(new File(PATH));
            while (sc.hasNextLine()){
                dividedSentence = sc.nextLine().replaceAll("[\\.,()]", "").split(" ");
                wordToCompare = Arrays.stream(dividedSentence).max(Comparator.comparing(String::length)).get();
                if(wordToCompare.length() > longestWord.length()){
                    longestWord = wordToCompare;
                }
            }
            sc.close();
            return longestWord;
        }catch(FileNotFoundException z){
            z.printStackTrace();
            System.out.println("Nie ma takiego pliku");
            return null;
        }
    }
    public static void main(String[] args) {

        System.out.println(getLongestWord());


    }

}
