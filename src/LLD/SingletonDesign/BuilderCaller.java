package LLD.BuilderDesign;

import LLD.SingletonDesign.SingletonClass;

public class BuilderCaller {
    public static void main(String[] args) {
//        User.UserBuilder userBuilder = new User.UserBuilder();
//        // new User.UserBuilder(); Creating object of UserBuilder() as without creating object user class as UserBuilder is a static class.
//        userBuilder.setName("Jay").setEmail("dhfds@gma.com");
//        User user = userBuilder.build();
        SingletonClass instance1 = SingletonClass.getSingletonInstance();
        SingletonClass instance2 = SingletonClass.getSingletonInstance();
        if(instance2 == instance1)
            System.out.println(true);
    }
}
