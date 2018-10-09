//iterator : 컬렉션 타입의 데이터를 차례로 얻어서 사용하기 위한 인터페이스
//hasNext -> 가져올 수 있는 데이터가 있으면 true, 없으면 false반환
//next -> 실제 값을 가져옴
//List, Map, Set, Array 타입의 데이터 모두 iterator 사용 가능
fun main(args: Array<String>){
    //iterator - list
    val list1 = listOf<String>("hello", "list")
    val iterator1 = list1.iterator()
    while(iterator1.hasNext()){
        println(iterator1.next())
    }
    println("\n")

    //iterator - map
    val map = mapOf<String, String>("one" to "hello", "two" to "map")
    val iterator2: Iterator<Map.Entry<String, String>> = map.iterator() // key와 value를 같이 받아옴(Map.Entry타입), 다른것과 다름, 주의!
    while (iterator2.hasNext()){
        val entry=iterator2.next() //key와 value를 같이 받와왔기 때문에 변수를 선언해서 받음
        println("${entry.key} - ${entry.value}") //Map.Entry변수는 key와 value값을 따로 얻어서 사용
    }
    println("\n")

    //iterator - set
    val set = setOf<String>("hello", "set")
    val iterator3 = set.iterator()
    while (iterator3.hasNext()){
        println("${iterator3.next()}")
    }
    println("\n")

    //iterator - array
    val array = arrayOf("hello", "world")
    val iterator4 = array.iterator()
    while (iterator4.hasNext()){
        println("${iterator4.next()}")
    }
}