package LLD.SingletonDesign;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class BuilderCaller {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        User.UserBuilder userBuilder = new User.UserBuilder();
//        // new User.UserBuilder(); Creating object of UserBuilder() as without creating object user class as UserBuilder is a static class.
//        userBuilder.setName("Jay").setEmail("dhfds@gma.com");
//        User user = userBuilder.build();

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
