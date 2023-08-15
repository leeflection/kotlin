package basic

fun main(){
    //컴파일 오류 발생
//    val a : String = null
//    val b : String = "aabb"
//    b = null

    //?를 타입뒤에 붙이면서 nullable을 알려준다.
    //안전 연산자
    var a : String? = null
    print(a?.length)

    //삼항연산자가 존재하지 않음
    val b : Int = if(a!=null) a.length else 0
    print(b)

    //엘비스 연산자
    //좌변이 null인 경우 우변을 사용함
    val c = a?.length ?: 0
    print(c)


}