package basic

/**
 * 상속
 */
open class Dog{
    open var age: Int = 0
    open fun bark(){
        println("멍멍")
    }
}

/**
 * 기본 생성자를 통해서도 재정의가 가능
 */
open class Bulldog(override  var age : Int = 0): Dog(){
    //override var age: Int= 0
    /**
     * 하위 클래스에서 오버라이딩 하지 못하게 막기 위해선 final
     */
    final override  fun bark(){
        super.bark()
    }
}

/**
 * 추상 클래스
 */
abstract class Developer{
    abstract var age : Int
    abstract fun code(language: String)
}
class BackEndDeveloper(override var age : Int) : Developer(){

    override fun code(language: String) {
        println("I code with $language")
    }

}
fun main(){
    val dog = Bulldog(2)
    println(dog.age)
    dog.bark()

    val backEndDeveloper = BackEndDeveloper(age = 20)
    println(backEndDeveloper.age)
    backEndDeveloper.code("Kotlin")

}
