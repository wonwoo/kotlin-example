package me.wonwoo

import java.util.concurrent.locks.Lock

/**
 * Created by wonwoo on 2016. 11. 7..
 */
fun main(args: Array<String>) {

    val result = function(2)
    println(result)

//    val sum: (Int, Int) -> Int = { x, y -> x + y }
//    println(sum(1, 19))

    val multiply = 3 multiply 10

    defaultArgumentsFun()
    namedParametersFun(x = 200, z = 100)


    varargsParametersFun(1, 2, 3, 4, 5)

    val list = mutableListOf(1, 2, 3, 4, 5)
    val doubled = list.map { it * 2 }
    println(doubled)

//    val sum = { x: Int, y: Int -> x + y }
//    test(sum)
}

fun test(body: (Int, Int) -> Int) {
    body(1, 2)
}

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

fun <T> varargsParametersFun(vararg ts: T) {
    for (t in ts) {
        println(t)
    }
}

fun unitReturnFun(x: Int): Unit {
    println(x)
}
//
//fun unitReturnFun(x: Int) {
//    println(x)
//}

fun namedParametersFun(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}


fun defaultArgumentsFun(x: Int = 100, y: Int = 200) {
    println(x + y)
}


infix fun Int.multiply(x: Int): Int {
    return this * x
}


fun function1(x: Int): Int = x * 2

fun function(x: Int): Int {
    return x * 2
}


fun test(): String {
    return inlineFunction()
}


fun inlineFunction(): String {
    return "test"
}
