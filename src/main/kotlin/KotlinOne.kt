import java.math.BigInteger

/**
 * Created by Alex on 2017/5/26.
 * Alex
 */
data class User(val id: Int, val name: String) {
    fun printMyUser() = println("我的ID是：$id，我的名字是：$name")

    fun getMyUserStr(): String = "我的ID是：$id，我的名字是：$name"


}

class FanSheTest {
    fun test() {
        println("hello")
    }
}

fun main(args: Array<String>) {
    var result = JieChengTest.Result()
    JieChengTest().diGuiJieCheng(50000,result)
    println(result.result)
}

class JieChengTest {
    tailrec fun diGuiJieCheng(num: Long, result: Result) {
        if (num <= 1) {
            //如果num<=1的话就直接让result得到值
            result.result = result.result.times(BigInteger.valueOf(1L))
        } else {
            //否则让现在的num和result相乘，然后在递归把num-1，用num-1*现在的result
            result.result = result.result.times(BigInteger.valueOf(num))
            diGuiJieCheng(num - 1, result)
        }
    }

    class Result(var result: BigInteger = BigInteger.valueOf(1L))
}