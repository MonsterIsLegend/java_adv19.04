package exercises.warmup;

public class Power {

    public int powerOfX(int x, int y){
        int res = x;
        if( y > 0) {
            for (int i = 1; i <= y; i++) {
                res *= x;
            }
            return res;
        }else if( y == 0){
            return 1;
        } else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.powerOfX(2, 0));
    }



}
