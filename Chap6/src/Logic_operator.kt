fun main(args: Array<String>){
    fun trueFun(): Boolean{
        println("call.. trueFun()")
        return true
    }
    fun falseFun(): Boolean{
        println("call.. falseFun()")
        return false
    }

    println("trueFun() && trueFun() : ")
    trueFun() && trueFun()
    println("falseFun() && trueFun() : ") //trueFun()이 호출이 안됨
    falseFun() && trueFun() //falseFun()에서 이미 false를 return 했기 때문에 결과는 안봐도 false
    println("falseFun() || trueFun() : ")
    falseFun() || trueFun()
    println("trueFun() || trueFun() : ") //뒤의 trueFun()이 호출이 안됨
    trueFun() || trueFun() //앞의 trueFun()이 이미 true를 리턴해서 결과는 안봐도 true
}