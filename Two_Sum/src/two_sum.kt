import java.util.*

fun select(target: Int, array: IntArray){
    var a = 0
    var b = 0
    for(i in array.indices){
        for(j in array.indices){
            if((array[i]+array[j]) == target){
                a = i
                b = j
            }
        }
    }
    println("$target = [${a+1}, ${b+1}]번째 값의 합")
}

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)
    val target = scanner.nextInt()
    val array: IntArray = intArrayOf(2, 7, 11, 15)

    select(target, array)
}