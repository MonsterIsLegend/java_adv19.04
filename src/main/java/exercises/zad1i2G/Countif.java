package exercises.zad1i2G;

public class Countif {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,6,5};
       int count =  Utils.countIf(numbers, new Validator<Integer>() { // klasa anonimowa jest wykorzystywana tylko raz, i w tym samym miejscu co jej wywołanie
            @Override
            public boolean validate(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println("Ilosc parzystych " + count);
        String [ ] names = {"ALA","ANNA","JAN", "ALA", "JAN"};
              //  znajdź ilość unikatowych imion o długosci 3
        int newcount = Utils.countIf(names, new Validator<String>() {
            @Override
            public boolean validate(String s) {
                return s.length() == 3;
            }
        });
        System.out.println("Ilosc imion o długosci 3 to " + newcount);

    }

}
