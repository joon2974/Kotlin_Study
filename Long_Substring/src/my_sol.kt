import java.util.*

class Sol{
    fun sub_s(string: String){
        var best = ""
        var now = ""

        for(str in string){
            if(now.length > best.length){//현재 문자열이 best문자열보다 길면 현재 문자열을 best문자열로 치환
                best = now
            }else{ //현재 문자열이 best보다 짧을 경우 현재 str을 현재 문자열에 이어붙임
                if(str in now){ //현재 문자열에 str과 같은 문자가 포함돼 있을경우를 검출
                    now = now.substring(now.indexOf(str)+1)//now = abc, str = a인 경우 now를 bc로 치환, 그 다음줄에서 bc에 a를 붙여서 now = bca가 됨
                }
                now += str
                if(now.length > best.length)
                    best = now
            }
        }
        println("Given : $string")
        println("the answer is : $best, which the length is ${best.length}")
    }
}

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    val string = sc.next()
    val ans = Sol()
    ans.sub_s(string)
}