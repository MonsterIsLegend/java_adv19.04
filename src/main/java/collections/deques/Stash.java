package collections.deques;

import lombok.AllArgsConstructor;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stash {

    // queue - jednokierunkowe FIFO
    // deque - dwukierunkowa (edytowalna) (FIFO,FILO,LIFO,LILO)

    private Deque<String> messages = new ArrayDeque<>();


    public void sendMessage(String message){
        messages.addLast(message);
    }
    public void getMessages(){
        for( String s : messages){
            System.out.println(s);
        }
    }
    public String receiveMessage(){
        return messages.removeFirst();
    }

    public static void main(String[] args) {
        Stash stash = new Stash();
        stash.sendMessage("M1");
        stash.sendMessage("M2");
        stash.sendMessage("M3");

        stash.getMessages();
        System.out.println(stash.receiveMessage());
        System.out.println(stash.receiveMessage());
        System.out.println(stash.receiveMessage());
        System.out.println(stash.receiveMessage());

    }

}
