import java.util.Arrays.asList

//=, +, -, *, /, %는 다른 언어와 사용방법이 같음
fun main(args: Array<String>){
    val array1 = arrayOf(10, 20, 30)

    val list1 = asList(1, 2, array1[0], array1[1], array1[2], 100, 200) //asList는 넘어온 인자로 구성된 List객체를 리턴
    val list2 = asList(1, 2, *array1, 100, 200) //*(전개연산자)를 이용하면 그 배열의 모든 값을 나열해줌
    list1.forEach({println(it)}) //배열의 각각의 값 foreach, 해당되는 값은 it으로 나타냄
    list2.forEach({println(it)})

    fun some(vararg a: String){
        val iterator = a.iterator()
        while(iterator.hasNext()){
            print(iterator.next()+" ")
        }
    }
    val array3 = arrayOf<String>("Kotlin", "is", "so", "hard")
    some(*array3)//전개연산자를 이용하여 함수 호출하려면 그 함수를 선언할 때 parameter를 vararg로 선언해야 한다***
    print("\n")

    val list3 = listOf<String>("a","b")
    some(*list3.toTypedArray())//매개변수가 컬렉션(list)에 들어있으므로 array데이터로 변경해서 이용해야함

}