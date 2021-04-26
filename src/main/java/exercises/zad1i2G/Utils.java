package exercises.zad1i2G;

public class Utils {
    // tablica i warunek są generryczne
    public static <T> int countIf(T[] table, Validator<T> validator){
    int count = 0;
    for(int i = 0; i < table.length;i++){
        if(validator.validate(table[i])){    // wykonuje zliczenie pod warunkiem generycznym
            count++;
        }
    }
    return count;
    }
}
