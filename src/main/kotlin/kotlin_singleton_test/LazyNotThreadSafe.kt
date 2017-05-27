package kotlin_singleton_test
/**
 * Created by Alex on 2017/5/27.
 * 2.懒加载，但是线程不安全的单例
 * Alex
 */

public class LazyNotThreadSafe private constructor(msg:String){

    init {
        println(msg)
    }

    companion object {
        //kotlin中的常规写法
        val instances by lazy(LazyThreadSafetyMode.NONE) {
            LazyNotThreadSafe("kotlin：懒加载，但是线程不安全的单例")
        }
        //模仿java中的写法
        private var instance2: LazyNotThreadSafe? = null;

        fun instances2(): LazyNotThreadSafe {
            if (instance2 == null) {
                instance2 = LazyNotThreadSafe("kotlin模仿JAVA：懒加载，但是线程不安全的单例")
            }
            return instance2!!
        }
    }


}