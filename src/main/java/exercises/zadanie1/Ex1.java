package exercises.zadanie1;

public class Ex1 {


    public int divide( int a, int b ){
        try{

            if( b == 0){
                throw new CannotDivideBy0Exception();
            }

            return a/b;

        }catch( CannotDivideBy0Exception ex){
            ex.printStackTrace();
            return 0;
        }



    }

    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();

        System.out.println(ex1.divide(2,0));


    }



}
