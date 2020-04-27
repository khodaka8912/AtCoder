package khodaka8912.atcoder.abc164.c

fun main() {
    val input1 = rint()
    val set = hashSetOf<String>()
    for (i in 0 until input1) {
        set += readLine()!!
    }
    println(set.toSet().size)
}

inline fun rsp() = readLine()!!.split(" ")

inline fun rspint() = rsp().map(String::toInt)

inline fun rint() = readLine()!!.toInt()