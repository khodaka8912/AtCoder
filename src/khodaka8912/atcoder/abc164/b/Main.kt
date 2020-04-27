package khodaka8912.atcoder.abc164.b

fun main() {
    val input2 = rspint()
    function(input2)
}

fun function(in1: List<Int>) {
    var thp = in1[0]
    var ahp = in1[2]
    var tatk = true
    while (thp > 0 && ahp > 0) {
        if (tatk) {
            ahp -= in1[1]
        } else {
            thp -= in1[3]
        }
        tatk = !tatk
    }
    println(if (thp <= 0) "No" else "Yes")
}

inline fun rsp() = readLine()!!.split(" ")

inline fun rspint() = rsp().map(String::toInt)

inline fun rint() = readLine()!!.toInt()