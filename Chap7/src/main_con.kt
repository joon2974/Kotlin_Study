class MyClass1{} //자동으로 매개변수 없는 생성자 추가
class MyClass2(){}
class Myclass3 constructor(){}
class User1 constructor(name: String, age: Int){}
class User2(name: String, age: Int){}
class User3(name: String, age: Int = 0){}
class User4(name: String, age: Int){
    init{
        println("initialization")
    }
}//생성자 초기화 블록, 클래스의 멤버 변수를 초기화 하는 등 초기에 수행할 작업작성
class User5(name: String, age: Int){//var, val로 매개변수를 선언하면 클래스 내의 함수에서도 사용 가능!!!
init{
    println("I am init.. constructor argument : $name .. $age")
}
    val upperName = name.toUpperCase()

    fun sayHello(){
        //println("hello $name") -> error! name은 생성자의 매개변수인데 클래스 내의 함수에서만 사용 불가능..
    }
}


fun main(args: Array<String>){
    val obj1 = MyClass1()
    val obj2 = MyClass2()
    val obj3 = Myclass3()

    //val user1 = User() -> 에러, 매개변수가 있는 생성자를 소유한 클래스인데 매개변수를 안줌
    val user2 = User1("joon", 24)
    val user3 = User2("kim", 28)
    val user4 = User3("Park") //age의 기본값이 있기때문에 age를 안넣어줘도 객체생성가능
}