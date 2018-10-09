class User{
    var name: String = "joon"
        get() = field
        set(value){field = value} //var은 수정가능한 property이므로 set도 포함
    val age: Int = 20
        get() = field//val은 get을 정의하면 초깃값 생략 가능!!!!!, var는 무조건 초기화해야됨
}//get, set 안에서는 프로퍼티 값을 field로 접근한다
class User1{
    var greeting: String = "Hello"
        set(value){
            field = "Hello" + value
        }
        get() = field.toUpperCase()
    var age: Int = 0
        set(value){
            if(value > 0){
                field = value
            }else{
                field = 0
            }
        }
}//setter, getter를 재정의 함

fun main(args: Array<String>){
    val user = User()

    user.name = "hwang" //set함수 실행
    println("name : ${user.name}")
    println("age : ${user.age}")

    val user1 = User1()
    user1.greeting = "hwang"
    println(user1.greeting)
    user1.age = -1
    println("age : ${user1.age}")
}