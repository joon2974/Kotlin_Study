//Any는 코틀린의 최상의 클래스, 어떤 타입의 데이터도 입력 가능
fun getLength(obj: Any): Int{
    if(obj is String) //is연산자 : 타입 점검, 자동으로 obj를 String으로 형변환해준다(if함수 내에서)
        return obj.length
    return 0
}

fun cases(obj: Any): String{
    when(obj){ //switch - case와 비슷
        1 -> return "One"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> "Not a String"
        else -> return "unknown"
    }
    return ""
}//switch case문처럼 사용 가능

fun parseInt(str: String): Int?{ // null이 들어갈 수도 있기 때문에 ?필수로 추가
    return str.toIntOrNull()//String을 Int로 바꿔주는 메소드
}

val myVal: Any = 10
val myVal2: Any? = myVal
val myVal3: Any? = 10
//val myVal4: Any = myVal3 //Any?타입을 Any에 넣으면 에러
val myVal5: Any = myVal3 as Any //as로 형변환하여 Any?를 Any에 넣기 가능

fun main(args: Array<String>){
    println(getLength(1))
    println(getLength("joon"))

    println(cases(1))
    println(cases("Hello"))

    println(parseInt("120"))
}