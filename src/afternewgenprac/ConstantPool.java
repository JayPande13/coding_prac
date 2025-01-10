package afternewgenprac;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class ConstantPool {
    static ConcurrentHashMap<String,ConstantPool> Pool = new ConcurrentHashMap<>();
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private ConstantPool(String name, int age){
        this.name=name;
        this.age= age;
    }

    public static ConstantPool instance(String name,int age){
        String key = name + " has " + age;
        Pool.putIfAbsent(key,new ConstantPool(name,age));
        return Pool.get(key);
    }

    public static void main(String[] args) {
        ConstantPool constantPool1 = instance("Jay",23);
        ConstantPool constantPool2 = instance("Prag",23);
        ConstantPool constantPool3 = instance("Prag",23);

        System.out.println(constantPool2 == constantPool1);
        System.out.println(constantPool2 == constantPool3);
    }

}
