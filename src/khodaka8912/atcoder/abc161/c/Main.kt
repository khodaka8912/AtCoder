package khodaka8912.atcoder.abc161.c

import java.util.*

fun main() {
    val n = nextLong()
    val k = nextLong()
    val min = when {
        n % k > k / 2 -> k - n % k
        else -> n % k
    }
    println(min)
}

val scanner = Scanner(System.`in`)
fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map(String::toInt)
fun rsplong() = readLine()!!.split(" ").map(String::toLong)
fun next(): String = scanner.next()
fun nextLong(): Long = scanner.nextLong()

fun main(args: Array<String>) = main()