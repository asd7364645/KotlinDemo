package kotlin_singleton_test

/**
 * Created by Alex on 2017/5/27.
 * 4.懒加载，双重同步锁
 * Alex
 */
class LazyThreadSafeDoubleCheck private constructor(val msg:String){
    init {
        println(msg)
    }
    companion object{
        //kotlin常规
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
            LazyThreadSafeDoubleCheck("kotlin常规：懒加载，双重同步锁")
        }
        //模仿JAVA
        @Volatile private var instance2: LazyThreadSafeDoubleCheck? = null

        fun get(): LazyThreadSafeDoubleCheck {
            if (instance2 == null) {
                synchronized(this) {
                    if (instance2 == null) {
                        instance2 = LazyThreadSafeDoubleCheck("kotlin模仿JAVA：懒加载，双重同步锁")
                    }
                }
            }
            return instance2!!
        }
    }
}