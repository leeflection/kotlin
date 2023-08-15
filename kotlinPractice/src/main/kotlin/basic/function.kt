package basic

//기본적인 함수 선언 스타일
fun sum(a:Int, b:Int) : Int{
    return a+b
}
//표현식 스타일
fun sum2(a: Int, b: Int) : Int = a+b

//표현식 & 반환타입 생략
fun sum3(a: Int, b: Int) = a + b
//바디가 존재하는 함수는 타입을 제거하면 컴파일 오류

//반환타입이 없는 함수는 Unit을 반환 (안쓰면 자동 Unit)
fun printSum(a: Int, b:Int) : Unit{
    println("$a + $b = ${a+b}")
}

//디폴트 파라미터
fun greeting(message: String = "안녕"){
    println(message)
}

//fun basic.main(){
//    basic.greeting()
//    basic.greeting("hi")
//}

fun log(level: String="INFO", message: String){
    println("[$level]$message")
}
fun main(){
    log(message = "인포 로그")
    log(level = "DEBUG", "디버그 로그")
    log(level = "WARN", "워닝로그")
    log(level = "ERROR", "에러 로그")
}
