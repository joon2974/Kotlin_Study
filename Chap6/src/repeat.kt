fun main(args: Array<String>){
    var sum: Int = 0
    //코틀린에서 기본적인 for문
    for(i in 1..10){
        sum += i
    }
    println(sum)

    val list = listOf("Hello", "World","!")
    val sb = StringBuffer()
    for(str in list){ //list의 데이터 개수만큼 반복 / list에서 str값을 얻어온다 라고 이해하면 좋음
        sb.append(str) // list의 내용을 이어붙임
    }
    println(sb)

    //list의 인덱스값을 이용할 때 'indices'를 이용!
    for(i in list.indices){//list에 데이터가 3개 들어있다면 list.indices는 0..2를 반환!
        println(i)
    }

    //index와 value값을 같이 얻어옴
    for((index, value) in list.withIndex()){
        println("the element at $index is $value")
    }
    /*for(i in 1..100) 1부터 100까지
    for (i in 1 until 100) 1부터 99까지
    for(x in 2..10 step 2) 2씩 증가
    for(x in 10 downTo 1) 숫자 감소
     위처럼 조건을 선정할 수 잇음*/
    for(x in 10 downTo 1 step 2){
        println(x)
    }//10부터 1까지 2씩 감소
    println("for End \n")

    //while문은 다른것과 같음

    //break와 continue
    //break는 가장 가까운 블록을 벗어남, continue는 그 블록의 맨 마지막 줄로 이동
    for(i in 1..3){
        for(j in 1..3){
            if(j>1) break
            println("i : $i, j : $j")
        }
    } //여기서 break로 아예 for문을 나오고 싶을 때 label을 사용

    aaa@ for(i in 1..3){
        for(j in 1..3){
            if(j>1) break@aaa
            println("i : $i, j : $j")
        }
    }//라벨을 사용하여 원하는 곳으로 빠져나옴
}