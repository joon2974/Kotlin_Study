class User0{ //초기화 블록에서 초기화
    var data: String
    val data2: Int//함수 내의 변수가 아니므로 초기화를 해야하지만 하지 않음.

    init{
        data = "joon"
        data2 = 10
    }// init은 객체 생성과 동시에 실행되므로 여기서 변수 초기화를 시키면 에러가 발생하지 않는다.
}

class User01{ //null허용 선언
    val name1: String = "joon" //null대입 X
    var name2: String? = null
    val name3: String? = null
    var age: Int? = null

    constructor(name2: String, name3: String, age: Int){
        this.name2 = name2
        //this.name3 = name3 -> val 변수의 값을 변경하려 했으므로 오류 겅출
        this.age = age
    }
}

class User02{ //늦은 초기화 : 주의점이 많다.
    lateinit var lateData: String
}/*
var로 선언한 '프로퍼티'에만 사용 가능
클래스 몸체에 선언한 프로퍼티만 사용 가능!
사용자정의 getter, setter를 사용하지 않았을때만 사용 가능
null허용 프로퍼티는 사용X
기초 타입 프로퍼티는 사용X
*/

val someData: String by lazy{
    println("i am someData lazy...")
    "hello"
}

class User03{
    val name: String by lazy{
        println("i am name lazy...")
        "hello"
    }

    val age: Int by lazy{
        println("i am age lazy")
        10
    }
    /*
    호출 시점에 초기화됨
    val로 선언한 프로퍼티만 사용 가능
    클래스 몸체 이외에 최상위 레벨에서도 사용 가능
    기초타입도 사용 가능
    */


    init{
        println("i am init..")
    }
    constructor(){
        println("i am constructor..")
    }
}

fun main(args: Array<String>){
    val user = User0()
    println("data: ${user.data}")
    println("data2: ${user.data2}")

    val user02 = User02()
    user02.lateData = "hello"
    println(user02.lateData)

    val user03 = User03() //init과 constructor 실행됨
    println("name user before..")
    println("name: ${user03.name}") //name의 lazy initialization이 수행됨
    println("name user after...")
    println("age use before...")
    println("age : ${user03.age}")
    println("age user after...")
}