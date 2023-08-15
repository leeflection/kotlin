package basic

fun getNullStr() : String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main(){
    val nullableStr = getNullStr()

    //컴파일 단계에서 null 가능성을 알아차릴 수 있다.
    //val nullableStrLength = nullableStr.length

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    print(length)
    /**
     *     kotlin에서도 NPE가 발생할 수는 있다.
     *    가능성이 크게 줄어들 뿐 사라지는 것은 아니다.
     */
    //throw NullPointerException()

    val c: String? = null
    /**
     *     단언 연산자 !!
     *     컴파일러에게 더이상 c는 NPE가 발생하지 않는다고 명시
     */

    val d = c!!.length

}