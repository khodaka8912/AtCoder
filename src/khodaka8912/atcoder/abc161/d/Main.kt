package khodaka8912.atcoder.abc161.d

fun main() {
    val k = nextInt()
    if (k < 10) {
        return println(k)
    }
    val lunlun = LongArray(k + 1)
    for (i in 0..9) {
        lunlun[i] = i.toLong()
    }
    var count = 9
    var i = 0
    var p = 1
    while (count < k) {
        if (i > lunlun[p] % 10 + 1 || i > 9) {
            p++
            i = (lunlun[p] % 10).toInt() - 1
            if (i < 0) {
                i = 0
            }
        } else {
            lunlun[++count] = lunlun[p] * 10 + i
            if (count == k) break
            i++
        }
    }
    println(lunlun[k])
}

fun rsp() = readLine()!!.split(" ")
fun rspint() = readLine()!!.split(" ").map { it.toInt() }
fun printYN(isYes: Boolean) = println(if (isYes) "Yes" else "No")
val scanner = java.util.Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()

fun main(args: Array<String>) = main()