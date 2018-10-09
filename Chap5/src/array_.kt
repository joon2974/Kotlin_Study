//Array또한 클래스 get,set, size를 포함
//JAVA에서 배열은 []을 이용하여 선언하지만 코틀린에서는 객체이기 때문에 ()를 이용한다.

fun main(args: Array<String>){
    var array = arrayOf(1,"joon", true) //가장 쉬운 배열 생성방법, 모든 타입 대입 가능
    var arrayInt = arrayOf<Int>(10, 20, 30) //Int형만 대입 가능, 제네릭 이용
    var arrayInt2 = intArrayOf(10, 20, 30) // 위랑 똑같은 배열
    var array3 = Array(3, {i -> i*10}) //위랑 똑같은 배열, Array, 람다식 사용, arrayof처럼 람다식이나 자료형함수 사용가능
    var array2 = arrayOfNulls<Any>(3) //빈 배열 생성, 제네릭 사용, 매개인자는 배열의 크기!

    array[0] = 10
    array[2] = "world"
    println("${array[0]}...${array[1]}...${array[2]}")
    println("size : ${array.size}...${array.get(0)}...${array.get(1)}...${array.get(2)}") //배열의 size, get함수 이용
    println("${arrayInt.get(0)}...${arrayInt.get(1)}...${arrayInt.get(2)}")
}

