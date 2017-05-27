package singleton_test;

/**
 * Created by Alex on 2017/5/27.
 * 2.懒加载，但是线程不安全的单例
 * Alex
 */

public class LazyNotThreadSafe {
    private static LazyNotThreadSafe lazyNotThreadSafe;

    private LazyNotThreadSafe() {
        System.out.println("懒加载，但是线程不安全的单例");
    }

    public static LazyNotThreadSafe instances() {
        if (lazyNotThreadSafe == null) lazyNotThreadSafe = new LazyNotThreadSafe();
        return lazyNotThreadSafe;
    }
}
