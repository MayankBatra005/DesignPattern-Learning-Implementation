package SingletonPattern;

public class SingletonExample {
    private static SingletonExample object;

    private SingletonExample(){}

    // This is not thread safe, it can be overriden by two threads resulting in multiple objects
    public static SingletonExample getInstance(){
        if(object==null){
            object=new SingletonExample();
        }
        return object;
    }

    // Thread Safe
    /*
     Intention is to reduce cost
     of synchronization and improve performance, by only
     locking critical section of code, the code which
     creates instance of Singleton class.
     */
    public static SingletonExample getInstanceThreadSafe(){
        if(object==null){
            synchronized (SingletonExample.class){
            object=new SingletonExample();
            }
        }
        return object;
    }

    // Double lock thread safe methods
    // In double-checked locking, code checks for an existing instance of
    // Singleton class twice with and without locking to make sure that only one instance of singleton gets created.
    public static SingletonExample getInstanceThreadSafeDoubleLocked(){
        if(object==null){
            synchronized(SingletonExample.class){
                if(object==null)
                object=new SingletonExample();
            }
        }
        return object;
    }

}
