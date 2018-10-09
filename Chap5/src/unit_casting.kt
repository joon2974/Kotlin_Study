fun myFun1(){}
fun myFun2(): Unit{} // 위아래 같은 함수, 명시 하지않으면 자동으로 Unit타입. 의미있는 반환값이 없음을 뜻함

fun myFun(arg: Nothing?): Nothing{
    throw Exception()
} // 호출한 곳에 의미있는 데이터를 반환하지 못함 -> 나중에 제네릭에서 자세히 다룸

fun getStringLength(obj: Any): Int?{
    //val strData: String = obj -> is안쓰고 직접 캐스팅은 에러
    if(obj is String){ // is연산자 쓰면 자동으로 캐스팅됨
        return obj.length
    }
    return null
}

var num1: Int = 10
//var num2: Double = num1 -> 형변환 에러. 자동으로 캐스팅 해주지 않음
var num2: Double = num1.toDouble() // -> 명시적으로 형변환해줘야됨
val long = 1L + 3 // 값의 형 변환 : double과 int를 더해도 double로 자동으로 넣어줌
//타입 캐스팅 때 Any?에서 본것처럼 as를 사용할 수도 있으나 이것은 상하위 클래스 관계(Any? > Any)에만 사용하는 것.
//Int와 Double은 서로 다른 자료형일 뿐 상하위 클래스 관계는 아니다.***