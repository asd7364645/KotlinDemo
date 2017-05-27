package singleton_test;

/**
 * Created by Alex on 2017/5/27.
 * 5.静态内部类，使用java底层类加载时的同步来处理线程安全，懒加载
 * 算是最优雅的单例写法
 * Alex
 */

public class LazyThreadSafeInnerClass {
    private static class SingleHolder {
        private static LazyThreadSafeInnerClass instance = new LazyThreadSafeInnerClass();
    }

    private LazyThreadSafeInnerClass() {
        System.out.println("静态内部类，使用java底层类加载时的同步来处理线程安全，懒加载\n" +
                " 算是最优雅的单例写法");
    }

    public static LazyThreadSafeInnerClass getInstance() {
        return SingleHolder.instance;
    }
}
