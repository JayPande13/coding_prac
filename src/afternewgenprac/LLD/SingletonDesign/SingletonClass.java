package afternewgenprac.LLD.SingletonDesign;

public class SingletonClass implements Cloneable {
    private static SingletonClass singletonClassInstance = null;

    /*
    Reflection safe
     */
    private SingletonClass() {
        if (singletonClassInstance != null) {
            throw new RuntimeException("Construction not allowed");
        }
    }

    /*
    Making thread safe.
     */
    public static SingletonClass getSingletonInstance() {
        if(singletonClassInstance == null) {
            synchronized (SingletonClass.class) {
                if (singletonClassInstance == null) {
                    singletonClassInstance = new SingletonClass();
                    return singletonClassInstance;
                }
                return singletonClassInstance;
            }
        }
        return singletonClassInstance;
    }

    /*
    Clone () safe
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonClassInstance;
    }
}
