package ioOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {

    List<String> notes = new ArrayList<>();

    public void addNote(String note ){
        //Printwriter -> tworzy nowy plik gdy nie występuje, lub dodaje istniejący
        try {
            PrintWriter pw = new PrintWriter("MyNotes.txt");
            notes.add(note);                //dodaje notatke do listy
            for( String s : notes){
                pw.println(s);          //aktualizuje plik na bazie listy
            }
            pw.close();
        }catch (FileNotFoundException x){
            x.printStackTrace();
            System.err.println("Nie znaleziono pliku");
        }
    }
    public void appendNotes( String note ){
        try {
            FileWriter fw = new FileWriter(new File("myNotesAppend.txt"),true);
            fw.append(note+"\n");
            fw.close();
        }catch (IOException io){
            io.printStackTrace();
            System.err.println("Nie znaleziono pliku: ");
        }
    }
    public void readNotes( String path){
        try{
            Scanner sc = new Scanner(new File(path));
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(FileNotFoundException z){
            z.printStackTrace();
            System.err.println("Nie znaleziono Pliku");
        }
    }

    public static void main(String[] args) {
        FileOperations fo = new FileOperations();

        fo.addNote("Overview.\n" +
                "map() and flatMap() APIs stem from functional languages. In Java 8, we can find them in Optional, Stream and in CompletableFuture (although under a slightly different name).\n" +
                "Streams represent a sequence of objects whereas optionals are classes that represent a value that can be present or absent. Among other aggregate operations, we have the map() and flatMap() methods.\n" +
                "Despite the fact that both have the same return types, they are quite different. Let's explain these differences by analyzing some examples of streams and optionals.");
        fo.addNote("Nauka FileIO");
        fo.appendNotes("");
        fo.appendNotes("Nauka enums");
        fo.readNotes("XDD");
        fo.readNotes("MyNotes.txt");

    }
}
