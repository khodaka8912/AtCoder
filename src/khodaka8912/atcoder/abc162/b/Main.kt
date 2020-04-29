package khodaka8912.atcoder.abc162.b

fun main() {
    val int = rint()
    function(int)
}

fun function(int: Int) {
    var sum = 0L
    for (i in 1..int) {
        if (i %3 != 0 && i %5 != 0) {
            sum += i
        }
    }
    println(sum)
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }