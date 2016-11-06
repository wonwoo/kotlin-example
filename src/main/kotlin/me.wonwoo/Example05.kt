package me.wonwoo

/**
 * Created by wonwoo on 2016. 11. 6..
 */

fun main(args: Array<String>) {

    val user = User(1, "wonwoo")
    println(user.id)
    println(user.name)
    val hashCode = user.hashCode()
    val equals = user.equals(User(2, "test"))
//    val id = user.component1()
//    val name = user.component2()
    val copy = user.copy(2, "wonwoo1")

    val user2 = User2(1, "wonwoo")
    user2.name = "wonwoo"
//    user2.id = 1

    val (id, name) = user
    println("id : $id name : $name")
//    val copy = user.copy(name = "wonwoo1")
    Utils.sum(1,10)
}

object Utils {
    fun sum(a: Int, b :Int) = a + b
}


data class User(val id: Long, val name: String)

data class User1(var id: Long? = null, var name: String)

data class User2(val id: Long, var name: String)