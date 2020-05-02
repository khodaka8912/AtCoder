package khodaka8912.atcoder.abc159.a

fun main() {
    val (n, m) = nextTwoInts()
    println(n * (n - 1) / 2 + m * (m - 1) / 2)
}

val scanner = java.util.Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()
fun nextList() = readLine()!!.split(" ")
fun nextTwoInts() = Pair(nextInt(), nextInt())
fun nextIntList() = nextList().map(String::toInt)
fun nextLongList() = nextList().map(String::toLong)
fun printYesNo(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()