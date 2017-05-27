import io.reactivex.Observable
import java.io.File
import java.math.BigInteger

/**
 * Created by Alex on 2017/5/26.
 * Alex
 */
fun main(args: Array<String>) {
    val bigInteger:BigInteger = BigInteger.valueOf(1)
    val text = File(ClassLoader.getSystemResource("input").path).readText();
    Observable.fromIterable(text.asIterable())
            //抛去所有空白字符
            .filter { !it.isWhitespace() }
            //以每个字分组
            .groupBy { it }
            //遍历
            .map {
                //计算每个字符发射的次数并把次数发射出去
                //这里通过lambda表达式里把实参it修改为a，这样就可以拿到map中的it了，也就是每个字符
                a->a.count()
                        //打印次数
                    //这里的map中的it是a.count的每个字符的次数
                        .map{
                            println("\"${a.key}\"字符出现了 -> $it 次")
                        }
                        .subscribe()
            }.subscribe()


}