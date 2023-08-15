package basic

class Coffee (
    //val name:String,
    /**
     * 후행 쉼표를 적어도 에러가 안남
     * 확장 가능성이 증가 ","
     * 코드 리뷰시에 도움이된다.
     */
    //val price: Int,
    var varName : String = "",
    var varPrice : Int = 0,
    var iced : Boolean = false,
    ){
    /**
     * 커스텀 getter 가능
     */
    val brand: String
        get() = "스타벅스"

    /**
     * var의 경우 setter도 가능
     */
    var quantity : Int = 0
        set(value) {
            if(value > 0){
                /**
                 * field란 식별자
                 * filed를 통해 값을 할당해야한다. 아니면 stackOverFlow
                 */
                field = value
            }
        }
}

class EmptyClass

fun main(){
    /**
     * -var-
     * 내부적으로 getter setter가 존재한다.
     * -val-
     * setter는 제공해주지 않고 getter는 제공된다.
     */
    val coffee = Coffee()
    coffee.varName = "아아"
    coffee.varPrice = 2000
    coffee.quantity = 1
    coffee.iced = true

    if(coffee.iced){
        println("아이스")
    }

    println("${coffee.varName} 가격은 ${coffee.varPrice} 수량은 ${coffee.quantity}")
}