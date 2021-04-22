package ioOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    public void readNotes(){

    }

    public static void main(String[] args) {
        FileOperations fo = new FileOperations();
        fo.addNote("Nauka Stream API");
        fo.addNote("Nauka FileIO");
        fo.appendNotes("Nauka OOP");
        fo.appendNotes("Nauka enums");


    }
}
