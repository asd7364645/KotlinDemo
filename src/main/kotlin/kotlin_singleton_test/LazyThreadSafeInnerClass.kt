package kotlin_singleton_test

/**
 * Created by Alex on 2017/5/27.
 * 5.静态内部类，使用java底层类加载时的同步来处理线程安全，懒加载
 * 在java中算是最优雅的单例写法，不过在kotlin中只能模仿java来写
 * Alex
 */
class LazyThreadSafeInnerClass private constructor(){
    init {
        println("静态内部类，使用java底层类加载时的同步来处理线程安全，懒加载\n " +
                "在java中算是最优雅的单例写法，不过在kotlin中只能模仿java来写")
    }
    companion object{
        fun getInstance() = SingleHolder.instances
    }
    private object SingleHolder{
        val instances = LazyThreadSafeInnerClass()
    }

}