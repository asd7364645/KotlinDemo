package kotlin_singleton_test

/**
 * Created by Alex on 2017/5/27.
 * 1.最简单的单例：懒汉
 * 不是线程安全，并且在类加载的时候就执行了，会减缓程序加载的速度
 * Alex
 */
object PlainOldSingleton{
    init {
        println("kotlin懒汉单例")
    }
}