package khodaka8912.atcoder.abc160.a

import java.util.*

fun main() {
    val str = next()
    printYesNo(str[2] == str[3] && str[4] == str[5])
}

val scanner = Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()
fun nextList() = readLine()!!.split(" ")
fun nextIntList() = nextList().map(String::toInt)
fun nextLongList() = nextList().map(String::toLong)
fun printYesNo(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()