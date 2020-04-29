package khodaka8912.atcoder.abc163.d

const val modNum = 10L * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 + 7
fun main() {
    val input = rspint()
    function(input[0], input[1])
}

fun function(N: Int, K: Int) {
    var sum = 0L
    for (i in K..N + 1) {
        val min = (i - 1).toLong() * i / 2
        val max = (N + N - i + 1).toLong() * i / 2
        val count = max - min + 1
        sum += count
    }
    println(sum % modNum)
}

inline fun rsp() = readLine()!!.split(" ")

inline fun rspint() = rsp().map(String::toInt)

inline fun rint() = readLine()!!.toInt()