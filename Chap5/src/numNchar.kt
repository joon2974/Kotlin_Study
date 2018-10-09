//코틀린에서 모든 것은 객체 -> Int, Double은 클래스. 기초 함수와 프로퍼티 사용 가능
val intData: Int = 10
val result = intData.minus(5) //Int클래스의 객체인 intData의 기초 함수 minus호출
val a1: Byte = 0b00001011 // 숫자 타입에는 Decimals, Hexadecimals, Binaries 대입 가능
val a2: Int = 0x0F
val a3: Long = 10L // Long형은 값 뒤에 L붙임
val a4: Double = 10.0 // 실수의 기본형은 double
val a5: Float = 10.0f //Float는 값 뒤에 F나 f붙임
val million: Int = 1_000_000

val charData = 'C' //char는 따옴표로 묶는다
val str: String = "Hello"
val str2 = "Hello \n World" //일반 string 표현방법은 개행 문자를 넣어줘야 개행이 됨
val str3 = """Hello
    |World!!
""".trimMargin() //이 방식을 이용하면 내가 입력한대로 개행이 됨

fun main(args: Array<String>){
    println(result)
    println(million) // 숫자 읽기 편하게 값에 언더바 사용 가능, 출력되지는 않음

    println("str[1] : ${str[1]}") //$변수명, ${표현식}
    println(str2)
    println(str3)
}