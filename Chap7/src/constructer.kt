class User10(name: String){
    init{
        println("init block.. $name")
    }//같은 클래스 내의 다른 생성자 호출은 this()
    constructor(name: String, age: Int): this(name){ //주생성자, 보조생성자 모두 사용할때에는
        println("constructor ... $name ...$age") //보조생성자 선언부분에서 주 생성자를 무조건 호출해줘야 함!!
    }
    constructor(name: String, age: Int, email: String): this(name, age){
        println("second constructor")
    }
}

fun main(args: Array<String>){
    println("----- 주 생성자로 생성한 경우 -----")
    val user10 = User10("joon") //매개변수를 name만 주었기 때문에 주생성자만 호출됨
    println("----- 보조 생성자로 생성한 경우 -----")
    val user20 = User10("joon", 24)
    val user30 = User10("kin", 25, "kjljl@naver.com")//생성자가 3개라서 두번째 보조생성자가 호출되지만
    //this문으로 그 위의 보조생성자, 또 this문으로 주생성자를 호출하게 됨.
}