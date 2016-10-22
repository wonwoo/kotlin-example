package me.wonwoo

/**
 * Created by wonwoo on 2016. 10. 22..
 */

fun main(args: Array<String>) {

    //함수
    println(double(10))
    println(double1(10))
    printlnDouble(10)
    printlnDouble1(10)

    // 변수
    val one: Int = 1
    val one1 = 1
//    one = 100 //컴파일 에러
    var two = 2
    two = 200

    //String Interpolation
    val hello = "hello"
    println("${hello} world")
    println("$hello world")

    val a = 10
    val b = 20
    println("a + b = ${a + b}")

    //Elvis Operator
    println(message("hello world kotlin"))
    println(message("hello world"))
    println(message(null))

    //자동 캐스팅
    println(getStringLength("100"))
    println(getStringLength(100))


    //for 문
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    for (number in numbers) {
        print("$number ")
    }
    println()

    for (i in numbers.indices) {
        print("${numbers[i]} ")
    }
    println()

    // when expression
    whenCase("2")
    whenCase(100L)
    whenCase("test")

    //collections
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)

    mutableList
            .filter { number -> number > 3 }
            .map { number -> number * 2 }
            .forEach { number -> print("$number ") }
    println()

    mutableList
            .filter { it > 3 }
            .map { it * 2 }
            .forEach { print("$it ") }
    println()

}

fun whenCase(obj: Any) {
    when (obj) {
        1 -> println("One")
        "2" -> println("String two")
        is Long -> println("is long type")
        else -> println("Unknown")
    }
}

fun getStringLength(obj: Any): Int {
    if (obj is String) {
        return obj.length
    }
    return 0
}

fun message(message: String?): String? {
    if (message != null && message.length < 15) {
        return message
    }
    return null
}

//fun message(message: String?): String? {
//    if (message.length < 15) { //컴파일 에러
//        return message
//    }
//    return null
//}

//fun message(message :String) : String {
//    if(message.length < 15){
//        return message
//    }
//    return null //컴파일 에러
//}

fun double(number: Int): Int {
    return number * 2
}

fun double1(number: Int) = number * 2

fun printlnDouble(number: Int): Unit {
    println(number * 2)
}

fun printlnDouble1(number: Int) = println(number * 2)