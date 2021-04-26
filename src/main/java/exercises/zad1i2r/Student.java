package exercises.zad1i2r;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name, lastname,indexNO, branchName;


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //Z1
        Class student = Class.forName("exercises.zad1i2r.Student");
        Arrays.stream(student.getDeclaredFields()).forEach(System.out::println); //wyświetla pola
        Arrays.stream(student.getDeclaredMethods()).forEach(System.out::println); // wyświetla metody
        Arrays.stream(student.getDeclaredConstructors()).forEach(System.out::println); // wyświetla konstruktory
        //z2
        Student s1 = (Student) student.getDeclaredConstructor(String.class,String.class,String.class,String.class).
                newInstance( "XXX", "XXX", "XXX", "XXX");
        Method toStr = Student.class.getDeclaredMethod("toString");
        System.out.println(toStr.invoke(s1));
        Method getName = Student.class.getDeclaredMethod("getName");
        Method getLastname = Student.class.getDeclaredMethod("getLastname");
        Method getIndexNO = Student.class.getDeclaredMethod("getIndexNO");
        Method getBranchName = Student.class.getDeclaredMethod("getBranchName");
        Method setName = Student.class.getDeclaredMethod("setName", String.class);
        Method setLastName = Student.class.getDeclaredMethod("setLastname", String.class);
        Method setIndexNO = Student.class.getDeclaredMethod("setIndexNO", String.class);
        Method setbranchname = Student.class.getDeclaredMethod("setBranchName", String.class);
        setName.invoke(s1,"Jan");
        setLastName.invoke(s1,"Solski");
        setIndexNO.invoke(s1,"168775");
        setbranchname.invoke(s1,"IT");

        System.out.println(toStr.invoke(s1));
    }

}
