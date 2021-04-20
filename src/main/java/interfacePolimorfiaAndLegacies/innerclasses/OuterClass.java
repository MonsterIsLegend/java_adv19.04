package interfacePolimorfiaAndLegacies.innerclasses;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data      // settery,getter toString()
@AllArgsConstructor // outer class string class

public class OuterClass {
    private String title;

    public InnerClass getInnerClassObject( String serialumber){
        return new InnerClass(serialumber);
    }

    public InnerClass getInnerClassDefaultObject(){
        return new InnerClass();
    }



    // klasa wewnętrzna
    @Data
    public class InnerClass{
        private String serialNo;

        InnerClass(String serialNo) {
            this.serialNo = serialNo;
            title = "title from inner";
        }

        InnerClass(){}

        public void getInnerInfo(){
            System.out.println("SERIAL: "+ serialNo);
            System.out.println("TITLE: "+ title);
        }
    }






    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("example");
        System.out.println(outerClass);
        InnerClass innerClass1 = outerClass.new InnerClass("xD");
        // utworzenie instancji klasy wewnętrznej
        InnerClass innerClass2 = outerClass.getInnerClassObject("xD DD ");
        System.out.println(innerClass2);
        InnerClass innerClass3 = outerClass.getInnerClassDefaultObject();
        System.out.println(innerClass3);
        innerClass2.getInnerInfo();

    }


}
