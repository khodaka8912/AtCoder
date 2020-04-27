package khodaka8912.atcoder.abc164.d

fun main() {
    val num = readLine()!!
    var pow = 1
    var rem = 0
    val rems = IntArray(2019)
    rems[0] = 1
    for (i in num.length - 1 downTo 0) {
        val d = num[i] - '0'
        rem = (rem + pow * d) % 2019
        pow = (pow * 10) % 2019
        rems[rem]++
    }
    var count = 0
    rems.forEach { i ->
        if (i > 1) {
            count += i * (i - 1) / 2
        }
    }
    println(count)
}
