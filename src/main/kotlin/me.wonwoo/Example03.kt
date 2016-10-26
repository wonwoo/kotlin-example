package me.wonwoo

/**
 * Created by wonwoo on 2016. 10. 26..
 */

fun main(args: Array<String>) {
    val product = Product("iphone 7")

    val create = Customer.create()
    println(create)
    val companion = Customer1.Companion
    companion.create()

    print(eval(Expr.Sum(Expr.Const(99.1232), Expr.Const(1821.299))))
}

sealed class Expr {
    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

fun eval(expr: Expr): Double = when (expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    Expr.NotANumber -> Double.NaN
}

class NewProduct(name: String, price: Int) : Product(name, price) {

}

class Customer {
    companion object Factory {
        fun create() = Customer()

        fun test() = "String"
    }
}

class Customer1 {
    companion object {
        fun create() = Customer1()
    }
}


abstract class Super {

    abstract fun foo()
    open fun print(): String {
        return "super.print()"
    }

    final override fun toString(): String {
        return "super.toString()"
    }
}

class Sub : Super() {
    override fun foo() {

    }

    override fun print(): String {
        return "sub.print()"
    }
}

open class Product constructor(name: String) {
    constructor(name: String, price: Int) : this(name) {
        println(price)
    }

//    fun nameLength() : Int {
//        return name.length // 컴파일 에러
//    }

    val length = name.length

    init {
        println(name)
        println(length)
    }
}