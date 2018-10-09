//List, Set, Map : 콜렉션이라는 인터페이스로 표현되는 클래스들
//불변, 가변으로 나뉨 불변은 List, Set, Map 가변은 MutaleList, MutableMap, MutableSet..

fun main(args: Array<String>){
    val immutableList: List<String> = listOf("hello", "world") //불변 리스트, listOf로 선언
    println("${immutableList.get(0)}..${immutableList.get(1)}") //불변 리스트는 get, size등의 읽기 함수만 지원

    val mutableList: MutableList<String> = mutableListOf("hello", "wolrd") //가변 리스트, mutableListOf로 선언
    mutableList.add("joon") // 가변 리스트는 add, set등의 쓰기 함수도 사용 가능
    mutableList.set(1, "korea") //mutableList[1]을 korea로 변경
    println("${mutableList.get(0)}..${mutableList.get(1)}..${mutableList.get(2)}")

    val arrayList: ArrayList<String> = ArrayList() //가변 List이렇게도 선언 가능
    println("\n")

    //Map
    val immutableMap1 = mapOf<String, String>(Pair("one","hello"), Pair("two","world")) //불변 맵
    println("${immutableMap1.get("one")}..${immutableMap1.get("two")}")
    val immutableMap2 = mapOf<String, String>("one" to "hello", "two" to "joon") //위의 맵과 같지만 값을 넣는 방식을 다르게 할 수도 있다
    println("${immutableMap2.get("one")}..${immutableMap2.get("two")}")

    val mutableMap = mutableMapOf<String, String>() //가변 맵
    mutableMap.put("one", "hello") //가변 맵은 쓰기 함수 사용 가능
    mutableMap.put("two", "map")
    println("${mutableMap.get("one")}..${mutableMap.get("two")}")

    //Set
    val immutableSet = setOf<String>("hello", "hello", "world") //불변 set, setOf로 선언
    println("${immutableSet.elementAt(0)}..${immutableSet.elementAt(1)}") //get이 아닌 elementAt으로 get함
    val mutableSet = mutableSetOf<String>() //가변 set, mutableSetOf로 선언
    mutableSet.add("hello")
    mutableSet.add("set")
    println("${mutableSet.elementAt(0)}..${mutableSet.elementAt(1)}")

}