fun main(args: Array<String>){
    //if문은 c처럼 일반적으로도 사용 가능
    val a = 5
    val result = if(a>10) "hello" else "world" // if문을 '표현식'으로 사용 가능!!!, 표현식으로 사용할 때는 항상 'else'가 필요하다!!***
    println(result)

    val result2 = if(a < 10){
        print("hello...")
        10+20 // if를 표현식으로 사용할 때 중괄호를 쓰면 표현식으로 발생하는 데이터는 '맨 마지막'에 작성!!!
    }else{
        print("wolrd...")
        20+20
    }
    println(result2)
    println("\n")

    //when
    val data1="hello"
    //일반적인 분기문
    when(data1){ // switch문과 다른 점 : 매개인자가 Int형이 아니어도 된다
        "hello" -> println("data1 is hello")
        "wolrd" -> println("data1 is world")
        else -> println("data1 is not hello or world")
    }

    fun some(): Int{
        return 50
    }
    val data2 = 20
    //여러개를 한꺼번에 지정하는 분기문
    when(data2){
        10, 20 -> println("data2 is 10 or 20") //분기 조건으로 여러개를 지정할 수도 있음 (콤마 이용)
        30, 40 -> println("data2 is 30 or 40")
        some() -> println("data2 is 50")
        30+30 -> println("data2 is 60")
    }

    //범위값으로 분기하는 분기문
    val data3 = 15
    when(data3){
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1 <= data3 <= 10")
        in 11..20 -> println("1 <= data3 <=20")
        else -> println("data3 > 20")
    }

    //집합에 포함되는지도 판단 가능
    val list = listOf<String>("hello", "wolrd", "joon")
    val array = arrayOf<String>("one", "two", "three")
    val data4 = "joon"
    when(data4){
        in list -> println("data4 in list") //in 연산자를 사용하여 어디 안에 있는지도 판단 가능
        in array -> println("data4 in array")
    }

    //여러타입으로 분기
    fun testWhen(data: Any){
        when(data){
            1 -> println("data is 1")
            "hello" -> println("data is hello")
            is Boolean -> println("data is boolean")
        }
    }
    //when뒤에 ()을 생략하면 if-else문을 대체하여 사용 가능

    //표현식으로서의 when
    val data6 = 3
    val result3 = when(data6){
        1 -> "1..."
        2 -> "2..."
        else -> { //이것 또한 표현식으로 이용되면 else를 생략하면 안된다!
            println("else...")
            "hello"
        }
    }
    println(result3)
}