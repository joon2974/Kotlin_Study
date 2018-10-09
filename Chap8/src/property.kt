import kotlin.properties.Delegates

class User00{ //프로퍼티 값 변경 감지하여 준비된 코드를 실행할 수 있음.
    var name: String by Delegates.observable("nonValue", {props, old, new -> //람다표현식
        println("old: $old ... new : $new")
    })
}

fun main(args: Array<String>){
    val user00 = User00()
    println(user00.name)
    user00.name = "joon"
    user00.name = "hwang"
    println(user00.name)
}