package kotlin_singleton_test

/**
 * Created by Alex on 2017/5/27.
 * 3.单个同步锁，懒加载
 * Alex
 */
class LazyThreadSafeSynchronized private constructor(){
    init {
        println("单个同步锁，懒加载")
    }
    companion object{
        private var instance:LazyThreadSafeSynchronized? = null

        @Synchronized
        fun get():LazyThreadSafeSynchronized{
            if (instance == null) instance = LazyThreadSafeSynchronized()
            return instance!!
        }
    }
}