package khodaka8912.atcoder.abc161.b

fun main() {
    val ints = rspint()
    val ints2 = rspint()
    val n = (ints2.sum() - 1) / (ints[1] * 4) + 1
    printYN(ints2.filter { it >= n }.size >= ints[1])
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }
fun printYN(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()