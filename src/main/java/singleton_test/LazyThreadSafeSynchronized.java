package singleton_test;

/**
 * Created by Alex on 2017/5/27.
 * 3.单个同步锁，懒加载
 * Alex
 */

public class LazyThreadSafeSynchronized {
    private static LazyThreadSafeSynchronized instance;

    private LazyThreadSafeSynchronized() {
        System.out.println("单个同步锁，懒加载");
    }
    public static synchronized LazyThreadSafeSynchronized instance(){
        if (instance == null) instance = new LazyThreadSafeSynchronized();
        return instance;
    }
}
