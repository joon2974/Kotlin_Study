class User11 {} // 컴파일러가 매개변수 없는 주생성자 추가해줌
class User12(name: String){} //주생성자만 선언
class User13{
    init{
        println("initiate") // 초기화 블록 실행한 다음 보조 생성자 실행됨
    }
    constructor(){}
    constructor(name: String){} //보조생성자. 보조생성자의 매개변수를 클래스 내에서 아예 접근이 불가. val, var로도 선언X!!!!!
    constructor(name: String, age: Int){}//생성자 오버로딩. 함수처럼 매개변수를 다르게 여러개 선언 가능

}

fun main(args: Array<String>){
    val user11 = User11()
    val user12 = User12("joon")
    //val user13 = User13() -> error! 매개변수 없는 주생성자가 없는 클래스임!
    val user14 = User13("jun")

}
