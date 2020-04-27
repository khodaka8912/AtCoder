package khodaka8912.atcoder.abc164.a

fun main() {
    val input2 = rspint()
    function(input2[0], input2[1])
}

fun function(in1: Int, in2: Int) {
    if (in1 > in2)
        println("safe")
    else
        println("unsafe")
}

inline fun rsp() = readLine()!!.split(" ")

inline fun rspint() = rsp().map(String::toInt)

inline fun rint() = readLine()!!.toInt()