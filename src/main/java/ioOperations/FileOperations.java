package ioOperations;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

    List<String> notes = new ArrayList<>();

    public void addNote(String note ){
        try {
            PrintWriter pw = new PrintWriter("MyNotes.txt");
            pw.println(note);
            pw.close();
        }catch (FileNotFoundException x){
            x.printStackTrace();
            System.out.println("Nie znaleziono pliku");
        }
    }

    public void readNotes(){

    }

    public static void main(String[] args) {
        FileOperations fo = new FileOperations();




    }
}
