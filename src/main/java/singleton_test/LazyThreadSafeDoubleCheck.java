package singleton_test;

/**
 * Created by Alex on 2017/5/27.
 * 4.懒加载，双重同步锁
 * Alex
 */

public class LazyThreadSafeDoubleCheck {

    private static volatile LazyThreadSafeDoubleCheck instance ;

    private LazyThreadSafeDoubleCheck(){
        System.out.println("懒加载，双重同步锁");
    }

    public static LazyThreadSafeDoubleCheck getInstance(){
        if (instance == null){
            synchronized (LazyThreadSafeDoubleCheck.class){
                if (instance == null){
                    instance = new LazyThreadSafeDoubleCheck();
                }
            }
        }
        return instance;
    }

}
