package khodaka8912.atcoder.abc159.e

fun main() {
    val h = nextInt()
    val w = nextInt()
    val k = nextInt()
    val s = Array(h) {
        next().toCharArray()
    }
    var min = h + w
    for (i in 0 until (Math.pow(2.0, (h - 1).toDouble()).toInt())) {
        val cutList = mutableListOf<Cut>()
        var current = Cut()
        cutList += current
        current.lines += s[0]
        var mod = 1
        for (j in 1 until h) {
            if (i and mod != 0) {
                current = Cut()
                cutList += current
            }
            current.lines += s[j]
            mod *= 2
        }
        var count = Integer.bitCount(i)
        var ok = true
        var needCut = false
        loop@ for (j in 0 until w) {
            for (cut in cutList) {
                if (cut.add(j) > k) {
                    ok = false
                    break@loop
                }
                if (cut.sum > k) {
                    needCut = true
                }
            }
            if (needCut) {
                count++
                for (cut in cutList) {
                    cut.sum = 0
                    cut.add(j)
                }
                needCut = false
            }
        }
        if (ok) {
            min = Math.min(min, count)
        }
    }
    println(min)
}

class Cut {
    val lines = mutableListOf<CharArray>()
    var sum = 0

    fun add(i: Int): Int {
        var res = 0
        for (line in lines) {
            res += line[i] - '0'
        }
        sum += res
        return res
    }
}

val scanner = java.util.Scanner(System.`in`)
fun next(): String = scanner.next()
fun nextInt() = scanner.nextInt()
fun nextLong() = scanner.nextLong()
fun nextLine(): String = scanner.nextLine()
fun nextList() = nextLine().split(" ")
fun nextIntList() = nextList().map(String::toInt)
fun nextIntArray(n: Int) = IntArray(n) { nextInt() }
fun nextLongList() = nextList().map(String::toLong)
fun printYesNo(isYes: Boolean) = println(if (isYes) "Yes" else "No")

fun main(args: Array<String>) = main()