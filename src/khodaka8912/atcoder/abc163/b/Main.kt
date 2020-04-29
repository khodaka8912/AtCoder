package khodaka8912.atcoder.abc163.b

fun main() {
    val input = rsp()
    val input2 = rsp()
    function(input, input2)
}

fun function(in1: List<String>, in2: List<String>) {
    val sum = in2.sumBy { it.toInt() }
    val days = in1[0].toInt()
    if (sum > days) {
        println(-1)
    } else {
        println(days - sum)
    }
}

inline fun rsp() = readLine()!!.split(" ")