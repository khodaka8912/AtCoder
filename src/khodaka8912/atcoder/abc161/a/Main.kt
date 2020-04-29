package khodaka8912.atcoder.abc161.a

fun main() {
    val ints = rspint()
    function(ints)
}

fun function(ints: List<Int>) {
    println("${ints[2]} ${ints[0]} ${ints[1]}")
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }

fun main(args: Array<String>) = main()