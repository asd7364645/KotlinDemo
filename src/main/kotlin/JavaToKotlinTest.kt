/**
 * Created by Alex on 2017/5/26.
 * Alex
 */

enum class Lang(val hello:String) {
    ENGLISH("hello"),
    CHINESE("你好"),
    JAPANESE("你好，我是日本人，中国人是我爸爸");

    fun sayHello() {
        println(hello)
    }

    companion object {
        fun parse(longName: String): Lang {
            return valueOf(longName.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    val user = User(1, "Alex")
    user.printMyUser()
    if (args.isEmpty()) return
    val lang = Lang.parse(args[0])
    lang.sayHello()
    lang.sayBye()
}

//方法扩展
fun Lang.sayBye(){
    val bye = when(this){
        Lang.ENGLISH -> "bye"
        Lang.CHINESE -> "再见"
        Lang.JAPANESE -> "爸爸再见"
    }
    println(bye)
}