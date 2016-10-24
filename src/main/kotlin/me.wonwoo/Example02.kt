package me.wonwoo

import java.util.Arrays.*
import kotlin.collections.listOf as of

/**
 * Created by wonwoo on 2016. 10. 23..
 */

fun main(args: Array<String>) {
    val i: Int = 10
    val l: Long = i.toLong()
    println(l)

    val str = "hello"
    for (s in str) {
        print("$s ")
    }
    println()

    val hello = "hello\nworld"
    val hello1 =
            """
    hello
    world
    """
    val json = "{\"key\":\"value\"}"
    val json1 = """
        |{"key":"value"},
        |{"key1":"value1"}
        """.trimMargin()
    println(json)
    println(json1)

    asList(1, 2, 3, 4, 5)

    val list = of(1, 2, 3, 4, 5)

    val a = 10
    val b = 20
    val max: Int
    if (a > b)
        max = a
    else
        max = b
    println(max)

    val max1 = if (a > b) a else b
    println(max1)

    val max2 = if (a > b) {
        println("a")
        a
    } else {
        println("b")
        b
    }
    println(max2)

    val text = "hello"

    when (text) {
        "hello" -> println("text == hello")
        "world" -> println("text == world")
        else -> {
            println("no matching")
        }
    }

    whenExpression(10)
    whenExpression(4)
    whenExpression(11)
    whenExpression("world")

    println(whenExpression1("whenExpression1"))
    println(whenExpression1(11))

}

fun whenExpression(any: Any) {
    when (any) {
        in 0..10 -> println("0 ~ 10")
        is String -> println("String type")
        else -> {
            println("no matching")
        }
    }
}

fun whenExpression1(any: Any): Boolean? {
    return when (any) {
        is String -> any.startsWith("when")
        else -> {
            false
        }
    }
}