package khodaka8912.atcoder.abc162.d

fun main() {
    println(function(rint(), rl()))
}

fun function(N: Int, S: String): Long {
    val R = S.count { it == 'R' }
    val G = S.count { it == 'G' }
    val B = S.count { it == 'B' }
    var sum = R.toLong() * G * B
    if (sum == 0L) return 0L
    val max = (N+1)/2
    for (size in 1 until max) {
        for (i in 0 until N - size * 2) {
            val si = S[i]
            val sj = S[i + size]
            val sk = S[i + size * 2]
            if (si != sj && sj != sk && sk != si) {
                sum--
            }
        }
    }
    return sum
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }