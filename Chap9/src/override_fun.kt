open class Shape{ //자동으로 Any클래스를 상위 클래스로 지정. class Shape: Any와 같음.
    var x: Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }
    var y: Int= 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }
    lateinit var name: String //var에만 사용가능, 클래스몸체 프로퍼티만 사용가능, nullable은 안됨!!

    open fun print(){ //오버라이드 허용하기 위해 open사용
        println("$name : location : $x, $y")
    }
}//override를 허용하려면 클래스 선언시 open으로 선언해야 함!!! 기본값은 final이라 상속이 기본적으로 허용X

class Rect: Shape(){
    var width: Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }
    var height: Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }
    override fun print(){
        println("$name : location : $x, $y ..." +
                "width : $width ... height : $height")
    }
}

class Circle: Shape(){
    var r: Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }

    override fun print() {//오버라이딩 한 함수는 자동으로 open상태가 된다!!!
        println("$name : location : $x, $y ...radius : $r")
    } //함수 오버라이딩, 자신은 오버라이드 하고 하위함수는 오버라이딩 못하게 하려면 final override fun print()로 선언하면 됨!
}
fun main(args: Array<String>){
    val obj1: Any = Shape()//Any클래스는 equals(), toString() 이외에는 제공하지 않는다!
    val obj2: Any = Shape()
    val obj3 = obj1

    println("obj1.equals(obj2) is ${obj1.equals(obj2)}")
    println("obj1.equals(obj3 is ${obj1.equals(obj3)}")
    print("\n")

    val rect = Rect()
    rect.name = "Rect"
    rect.x = 10
    rect.y = 10
    rect.width = 20
    rect.height = 20
    rect.print()

    val circle = Circle()
    circle.name = "Circle"
    circle.x = 30
    circle.y = 30
    circle.r = 5
    circle.print()
}