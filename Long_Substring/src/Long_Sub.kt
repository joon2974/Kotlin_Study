import java.util.*

class Solution{
    fun subString(string: String){
        var cur: String = ""
        var longest: String = ""
        for(str in string){
            if(str in cur){
                if(cur.length > longest.length){
                    longest = cur
                }
                if(cur.indexOf(str)+1 < cur.length){//이 부분이 이해가 안됨
                    cur = cur.substring(cur.indexOf(str)+1) + str
                }else{
                    cur = "" + str
                }
            }else{
                cur += str
                if(cur.length > longest.length)
                    longest = cur
            }
        }

        println("Given $string")
        println("the answer is $longest, with the length of ${longest.length}")
    }

}

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)
    val string = scanner.next()

    val sol = Solution()
    sol.subString(string)
}