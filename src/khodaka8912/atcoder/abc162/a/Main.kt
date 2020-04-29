package khodaka8912.atcoder.abc162.a

fun main() {
    val str = rl()
    function(str)
}

fun function(str: String) {
    println(if(str.contains('7')) "Yes" else "No")
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }