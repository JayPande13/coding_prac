package LLD.SingletonDesign;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class SingletonCaller {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*
        How to break singleton pattern using clone()
         */
        SingletonClass instance1 = SingletonClass.getSingletonInstance();
        SingletonClass instance2 = (SingletonClass) instance1.clone();
        if (instance2 == instance1)
            System.out.println(true);

        /*
        Breaking singleton pattern using reflection
         */
        Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonClass instance3 = constructor.newInstance();
        if (instance3 == instance1)
            System.out.println(true);
    }
}
