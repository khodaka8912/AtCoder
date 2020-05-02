package khodaka8912.atcoder.abc160.c

fun main() {
    val k = nextInt()
    val n = nextInt()
    nextLine()
    val a = nextIntList()
    var max = k - a[n-1] + a[0]
    for (i in 0 until n-1) {
        val d = a[i+1] - a[i]
        if (d > max) max = d
    }
    println(k - max)
}

val scanner = java.util.Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()
fun nextLine() = scanner.nextLine()
fun nextList() = scanner.nextLine().split(" ")
fun nextIntList() = nextList().map(String::toInt)
fun nextLongList() = nextList().map(String::toLong)
fun printYesNo(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()