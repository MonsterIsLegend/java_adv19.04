package collections.lists;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class Statistics {
    private List<Integer> elements;


    //metoda obliczajaca srednia

    private double getAvg(){
        int avg = 0;
        for( int d : elements){
            avg += d;
        }
        return avg/elements.size();

    }

    private int getMax(){
        int max = elements.get(0);
        for(int b : elements){
            if( b > max){
                max = b;
            }
        }
        return max;
    }
    private  int getMin(){
        int min = elements.get(0);
        for(int b : elements){
            if( b < min){
                min = b;
            }
        }
        return min;
    }

    private int getMostFrequentElement(){
        int[] amount = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                if(elements.get(j).equals(elements.get(i))){
                    amount[i] ++;
                }
            }
        }
        int maxindex = 0;
        for (int i = 1; i < amount.length; i++) {
            if(amount[i] > amount[maxindex]){
                maxindex = i;
            }
        }
        return elements.get(maxindex);
        // lepsza wersja
        //List<Integer> elementsCopy = new ArrayList<>(elements);
        //        int frequent_element = elementsCopy.get(0);
        //        int frequency = 0;
        //        while (!elementsCopy.isEmpty()) {
        //            int element = elementsCopy.get(0);
        //            int before = elementsCopy.size();
        //            elementsCopy.removeAll(new ArrayList<>(Arrays.asList(element)));
        //            if ((before - elementsCopy.size()) > frequency) {
        //                frequency = before - elementsCopy.size();
        //                frequent_element = element;
        //            }
        //        }
        //        return frequent_element;
    }

    public static void main(String[] args) {

        Statistics statistics = new Statistics(Arrays.asList(3,3,4,2,5,1,6,3,0,7,9,0,4,5,8,6,3,2));
        System.out.println(statistics.getMostFrequentElement());

    }


}
