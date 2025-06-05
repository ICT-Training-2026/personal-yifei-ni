// 定义接口
public interface Animal {
    void eat();
    void sleep();
}

// 实现接口的类
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

// 使用接口
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // 使用接口引用
        myDog.eat();
        myDog.sleep();
    }
}