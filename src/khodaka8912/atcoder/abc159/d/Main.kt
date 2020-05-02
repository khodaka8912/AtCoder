package khodaka8912.atcoder.abc159.d

import java.util.*

fun main() {
    val n = nextInt()
    nextLine()
    val a = IntArray(n){nextInt()}
    val count = IntArray(n+1)
    var total = 0L
    for (i in a) {
        total += count[i]
        count[i]++
    }
    println(buildString {
        for (i in 0 until n) {
            append(total - (count[a[i]] - 1)).append('\n')
        }
    })
}

val scanner = Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()
fun nextLine() = scanner.nextLine()
fun nextList() = nextLine().split(" ")
fun nextIntList() = nextList().map(String::toInt)
fun nextLongList() = nextList().map(String::toLong)
fun printYesNo(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()