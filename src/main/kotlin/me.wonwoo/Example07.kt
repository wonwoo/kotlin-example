package me.wonwoo

/**
 * Created by wonwoo on 2016. 11. 22..
 */
fun main(args: Array<String>) {
    val person = Person(1, "wonwoo")
    println(person)

    println(Account(10).plus(Account(20)))
    println(Account(20) - Account(10))

    when {
        person.id == 1L -> println("id: 1, name: ${person.name}")
        else -> println("nothing")
    }

    Foo.invoke()
    Foo("world")

    val list = mutableListOf(1, 2, 3, 4, 5)
    println(list.filter { i -> i > 2 }.map { i -> i * 2 })
    println(list.filter { it > 2 }.map { it * 2 })


}

object Foo {
    operator fun invoke() = println("hello world")
    operator fun invoke(message: String) = println("hello $message")
}

class Account(val age: Int) {
    operator fun plus(account: Account): Account {
        return Account(age + account.age)
    }

    operator fun minus(account: Account): Account {
        return Account(age - account.age)
    }


    //...
    override fun toString(): String {
        return "$age years old"
    }
}

class Person(val id: Long, val name: String)