package afternewgenprac.LLD.SingletonDesign;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
        Class<SingletonClass> clazz = SingletonClass.class;
        Constructor<SingletonClass> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonClass  instance = constructor.newInstance();


//        Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SingletonClass instance3 = constructor.newInstance();
        if (instance == instance1)
            System.out.println("Same");
    }
}
