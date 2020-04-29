package khodaka8912.atcoder.abc163.c

fun main() {
    val input = rint()
    val input2 = rspint()
    function(input, input2)
    writer.flush()
}

fun function(in1: Int, in2: List<Int>) {
    val counts = in2.groupingBy { it }.eachCount()
    for (i in 1..in1) {
        println(counts[i] ?: 0)
    }
}

val writer = System.out.bufferedWriter()
fun println(any: Any) = writer.appendln(any.toString())
fun print(any: Any) = writer.append(any.toString())
fun rsp() = readLine()!!.split(" ")
fun rspint() = rsp().map(String::toInt)
fun rint() = readLine()!!.toInt()