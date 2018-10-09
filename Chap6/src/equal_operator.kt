fun main(args: Array<String>){
    class User
    val user1 = User()
    val user2 = User()
    val user3 = user1
    val user4 = User()
    val user5: User? = user4
    println("user1 == user2 is ${user1 == user2}") //f, user1과 user2는 완전히 다른 객체
    println("user1 === user2 is ${user1 === user2}") //f
    println("user1 == user3 is ${user1 ==user3}") //t, user1과 user3은 같은 메모리를 참조
    println("user1 ===user3 is ${user1 ===user3}") //t
    println("user4 == user5 is ${user4 == user5}") //t
    println("user4 === user5 is ${user4 === user5}") //t nullable과 unnuullable이지만 같은 메모리를 참조하므로

    val int1 = Integer(10)
    val in2 = Integer(10) //int1과 int2 를 ===로 비교하면 false, 기초 데이터 타입은 박싱이 돼서 객체가 다름
    val int3 = int1
    val data1: Int = 10
    val data2: Int = 10 //data1 === data2 true 기초 데이터 타입 객체로 생성X, 값만을 비교
}// ==는 값 비교, ===는 객체 비교
/*
 - 기초 데이터타입(Integer, Double...) 이 아닌 일반 객체는 ==, ===연산 차이X, 박싱 되든 안되든 같은 객체면 true, 아니면 false
 - 기초 데이터타입 선언 시 Integer같은 래퍼 사용시 ==은 값을, ===은 객체를 비교
 - 래퍼 사용 안하고 Int, Double등을 이용하면 ==, === 둘다 값을 대상으로 비교
 - ?로 선언된 기초 데이터타입 변수는 박싱되어 객체생성
 - -128~127까지의 값은 ?에 의해 박싱되어도 값이 같으면 같은 객체 반환
 -> 기초 데이터 타입대상으로 값 비교시에는 ==을 사용하자
 -> 기초 데이터 타입에서 같은 객체 비교는 ===사용 but ?쓰였는지 구분!
 */

/*
?: -> A ?: B A가 null이면 B실행
?. -> A?.length A가 null이면 null, null이 아니면 length
!! -> A !! B A가 null이 아닐때만 B실행. null이면 예외발생
 */