package reflections;



import exercises.zad5IO.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflections {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Class c = Class.forName("exercises.zad5IO.User");
        //pola
        System.out.println("FIELDS");
        Arrays.stream(c.getFields()).forEach(System.out::println);
        Arrays.stream(c.getDeclaredFields()).forEach(System.out::println);
        System.out.println("\n");
        System.out.println("AGE: " + c.getDeclaredField("age"));
        System.out.println("\n");
        //metody
        System.out.println("METHODS");
        Arrays.stream(c.getMethods()).forEach(System.out::println);
        System.out.println("\n");
        System.out.println("getAge: " + c.getDeclaredMethod("getAge"));
        System.out.println("\n SUPERCLASS: " + c.getSuperclass());
        //konstruktory
        System.out.println("KONSTRUKTOR");
        Arrays.stream(c.getDeclaredConstructors()).forEach(System.out::println);
        //obiekt klasy
        User user = new User("Test","Test", 22);
        Object o1 = (User) c.newInstance();
        //pola
        Field nameField = User.class.getDeclaredField("name");
        Field ageField = User.class.getDeclaredField("age");
        nameField.set(o1,"Janek");
        ageField.set(o1,22);
        //odczyt
        System.out.println("NAME: " + nameField.get(o1));
        System.out.println("AGE: " + ageField.get(o1));
        //obiekty klasy method WAŻNE!!!
        Method m = User.class.getMethod("toString"); // nazwa metody bez ()
        System.out.println("toString: " + m.invoke(o1));
        System.out.println("toString: " + user.toString());
        Method setName = User.class.getDeclaredMethod("setName", String.class);
        Method setAge = User.class.getDeclaredMethod("setAge", int.class);
        setName.invoke(o1,"XXX");
        setAge.invoke(o1,1);
        System.out.println("toString: " + m.invoke(o1));

    }



}
