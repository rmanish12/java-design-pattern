package singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

        System.out.println(instance1 == instance2);

        LazyInitializedSingleton instance3 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance4 = LazyInitializedSingleton.getInstance();

        System.out.println(instance3 == instance4);

        ThreadSafeSingleton instance5 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance6 = ThreadSafeSingleton.getInstance();

        System.out.println(instance5 == instance6);
    }
}
