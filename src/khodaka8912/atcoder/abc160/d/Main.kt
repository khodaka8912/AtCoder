package khodaka8912.atcoder.abc160.d

fun main() {
    val n = nextInt()
    val x = nextInt() - 1
    val y = nextInt() - 1
    val result = IntArray(n)

    for (i in 0 until n-1) {
        for (j in i+1 until n) {
            val d = Math.min(j-i, Math.abs(x - i) + Math.abs(y - j) + 1)
            result[d]++
        }
    }

    for (i in 1 until n) {
        println(result[i])
    }
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