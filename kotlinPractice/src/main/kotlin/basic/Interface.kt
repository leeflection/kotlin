package basic

class Product(val name : String, val price: Int)

interface Wheel{
    fun roll()
}
interface Cart : Wheel{
    /**
     * 코틀린에서는 인터페이스의 프로퍼티가 존재할 수 있다.
     */
    var coin : Int
    val weight : String
        /**
         * backing filed 불가
         */
//        get() {
//            field = "20KG"
//        }
        get() = "20KG"
    fun add(product: Product)
    fun rent(){
        if(coin > 0){
            println("카트를 대여합니다.")
        }
    }
    override fun roll(){
        println("카트가 굴러갑니다")
    }
}

/**
 * 하나 이상의 인터페이스를 구현할 수 있다.
 */
interface Order

class MyCart(override var coin: Int) : Cart, Order{
    override fun add(product: Product) {
        if(coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가됐습니다.")
    }
}

fun main(){
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product("장난감",1000))
}

