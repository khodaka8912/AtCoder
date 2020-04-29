package khodaka8912.atcoder.abc162.e

const val mod = 1000000007L

fun main() {
    val input = rspint()
    function(input[0], input[1])
}

fun function(n: Int, k: Int) {
    val nums = LongArray(k + 1)
    var sum = 0L
    for (i in k downTo 1) {
        val num = k / i
        nums[i] = pow(num, n)
        for (j in 2..num) {
            nums[i] -= nums[i * j]
        }
        sum += i * (nums[i])
    }
    println(sum % mod)
}

fun pow(a: Int, b: Int): Long {
    var r = 1L
    var s = a.toLong()
    var t = b
    while (t > 0) {
        if (t % 2 != 0) {
            r = r * s % mod
        }
        s = s * s % mod
        t /= 2
    }
    return r
}

fun rl() = readLine()!!
fun rsp() = readLine()!!.split(" ")
fun rint() = readLine()!!.toInt()
fun rspint() = readLine()!!.split(" ").map { it.toInt() }