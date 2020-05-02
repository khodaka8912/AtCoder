package khodaka8912.atcoder.abc159.c

import java.math.BigDecimal

fun main() {
    val l = nextInt()
    println(BigDecimal(l.toDouble() * l * l / 27).toPlainString())
}

val scanner = java.util.Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()
fun nextList() = readLine()!!.split(" ")
fun nextIntList() = nextList().map(String::toInt)
fun nextLongList() = nextList().map(String::toLong)
fun printYesNo(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()