var x = 5

fun main(args: Array<String>) {
    //top level 변수 개념 존재
    x+= 1
    println(x)
    //val(value) 재할당 불가
    val e : String = "Hello"
    //e = "World" -> 컴파일 오류 발생

    //var(variable) 가변 변수
    var f : String = "Hello"
    f = "World" // -> 가능

    var h = 123
    // h = "hi" 타입 불일치시 컴파일 오류


}