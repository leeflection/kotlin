package basic

fun main(){
    // 범위 연산자 .. 를 이용해 for loop 돌리기
    for(i in 0..3){
        println(i)
    }
    // until을 사용해 반복
    // 뒤에 온 숫자는 포함하지 않는다
    for(i in 0 until 3){
        print("$i ")
    }
    println()
    // step에 들어온 값만 증가시킨다.
    for(i in 0..6 step 2){
        print("$i ")
    }
    println()
    // downTo를 이용하여 반복하며 값을 감소시킨다.
    for(i in 3 downTo 1){
        print("$i ")
    }
    println()
    // 전달받은 배열을 반복한다.
    val numbers = arrayOf(1,2,3)
    for(i in numbers){
        print(i)
    }
}