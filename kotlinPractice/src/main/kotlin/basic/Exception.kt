package basic

import java.lang.IllegalArgumentException

fun main(){
    /**
     * 컴파일 오류가 발생하지 않음
     * 자바와 다르게 checked Exception을 강제하지 않음
     */
    Thread.sleep(1)
    /**
     * 직접 사용할 수 도 있음
     * try - catch는 표현식으로 가능하여 값을 전달 할 수 있다.
     */
    try{
        Thread.sleep(1)
    }catch (e : Exception){
        println("에러 발생")
    }finally {
        println("finally 실행")
    }

    /**
     * try - catch는 표현식으로 가능하여 값을 전달 할 수 있다.
     */
    val a = try{
        "1234".toInt()
    }catch (e: Exception){
        println("예외 발생")
    }
    println(a)

    /**
     * throw를 통해 발생시킬 수 있다.
     */
    //throw Exception("예외 발생")

    //failFst("예외입니다")

    val b : String? = null
    val c: String = b ?: failFast("b는 null")
    println(c.length)
}

/**
 * throw를 반환하게 되면 nothing이라는 타입을 리턴한다.
 * 엘비스 연산자와 같이 사용하면 널 안정성을 높일 수 있다.
 */
fun failFast(message : String) : Nothing{
    throw IllegalArgumentException(message)
}