package exercises.zad3G;

import java.util.Arrays;

public class SwapOperation {

    public static <T> void swap(T table [], int index1, int index2){
//        if(index1 >= 0 && index2 >=0 && index1 < table.length && index2 < table.length ){
//            T v1 = table[index1];
//            table[index1] = table[index2];
//            table[index2] = v1;
//        }else{
//            System.out.println("Niepoprawny index");
//        }
            try {
            T v1 = table[index1];
            table[index1] = table[index2];
            table[index2] = v1;
        }catch(ArrayIndexOutOfBoundsException z){
                z.printStackTrace();
                System.err.println("Niepoprawny index");
            }

    }
    //Zaimplementuj generyczną metodęswap, która będzie odpowiedzialna zazamianę pozycji wskazanych elementów tablicy.
    public static void main(String[] args) {
        String [ ] names = {"ALA","ANNA","JAN", "ALA", "JAN"};
        swap(names,0,4);
        Arrays.stream(names).forEach(System.out::println);
    }

}
