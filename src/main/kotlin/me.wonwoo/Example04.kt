package me.wonwoo

import java.math.BigDecimal
import java.util.*

/**
 * Created by wonwoo on 2016. 10. 30..
 */

fun main(args: Array<String>) {
    val address = Address()
    address.name = "address"
    val name = address.name
    println(name)

    var product = Product1()
    product.name = "iphone 7"
    println(product.name)

}

class MyClass : MyInterface{
    override val price: Int = 100
    override fun bar() {

    }
}

interface MyInterface {
    val price: Int
    fun bar()
    fun foo() {
        println(price)
    }
}

class Product1 {
    //    val id :Long? = null
//    val name : String? = null
//    val price : BigDecimal? = null
    var id: Long? = null
    var name: String? = null
        get() = "#" + field
    //        @Inject set(value) {
//            field = "#" + value
//        }
    var price: BigDecimal? = null
}

//class MyTest {
//    lateinit var subject: TestSubject
//    @SetUp fun setup() {
//        subject = TestSubject()
//    }
//
//    @Test fun test() {
//        subject.method() // null 검사 없이 직접 접근
//    }
//}

const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
@Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {
}

class Address {
    //    var name: String? = null
    var street: String? = null
    var city: String? = null
    var state: String? = null
    var zip: String? = null

    var name: String? = null
        get() = field
        set(value) {
            field = "#" + value
        }
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null)
                _table = HashMap() // 타입 파라미터를 유추
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}
