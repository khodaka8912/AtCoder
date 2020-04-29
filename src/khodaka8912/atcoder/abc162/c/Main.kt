package khodaka8912.atcoder.abc162.c

fun main() {
    val int = rint()
    function(int)
}

fun function(K: Int) {
    var sum = 0L
    for (a in 1..K) {
        for (b in 1..K) {
            for (c in 1..K) {
                sum += gcd(a, gcd(b, c))
            }
        }
    }
    println(sum)
}

tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) {
    a
} else {
    gcd(b, a % b)
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }