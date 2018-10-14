open class Super{
    open var x: Int = 10
    open fun someFun(){
        println("Super...someFun()")
    }
    open val name: String = "joon"
}

open class Sub: Super(){
    override var x: Int = 20
    override fun someFun() {
        super.someFun()//상위 클래스의 someFun 호출
        println("Sub... ${super.x}...$x") //super.x  상위클래스의 x를 사용
    }
    final override var name: String = "hwang" //여기서 override도 open을 포함
}
/* 프로퍼티 오버라이딩
- 상위 클래스 프로퍼티와 이름. 타입이 같아야 함
- 상위 val은 하위 var, val로 재정의 가능
- 상위 var은 하위에서 무조건 var
- 상위 nullable은 하위 null불허로 재정의 가능
- 상위 null불허는 하위에서 nullable 재정의 불가
*/

fun main(args: Array<String>){
    var sub = Sub()
    sub.someFun()
}