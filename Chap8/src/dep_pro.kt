import java.lang.reflect.Array.get

var myVal: String = "hello"
    get() = field.toUpperCase()
    set(value){
        field = "hello"+value
    }//get, set은 최상위 변수나 클래스 내부 변수에서만 사용 가능!!!

class User3(val name: String){
    var age: Int = 0
        set(value){
            if(value>0) field = value
            else field = 0
        }//get, set은 최상위 변수나 클래스 내부에서만 사용 가능!!!

    fun myFun(){
        var no = 0
        //get() = field*!0 -> error! 지역변수는 프로퍼티가 아니라서 get, set사용 불가!!!
    }
}

class User2(var name: String){//주생성자는 var, val사용가능. 보조생성자만 사용 불가!!
var myName: String = name //원래 주 생성자는 get, set이 사용 불가하지만 myName이라는 클래스 멤버(프로퍼티)에 대입시켜서 set, get사용!!!
    get() = field.toUpperCase()
    set(value){
        field = "Hello"+value
    }
}

class User4(name: String){ //위처럼 하면 외부에서 생성자의 매개변수를 직접 이용가능함
    var name: String = name //주생성자의 매개변수에 접근 못하게 주생성자에서 var을 제거.
        get() = field.toUpperCase()
        set(value){
            field = "Hello" + value
        }
}

fun main(args: Array<String>){
    val user2 = User2("joon")
    user2.name = "hwang"
    user2.myName = "kim"
    println("name : ${user2.name}")
    println("myName : ${user2.myName}")

    val user4 = User4("joon")
    user4.name = "kim"
    println("name : ${user4.name}")
}