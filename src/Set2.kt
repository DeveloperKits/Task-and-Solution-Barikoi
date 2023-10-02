fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, k) = readLine()!!.split(" ").map { it.toInt() }
        val s = readLine()!!

        val result = minimizeSum(s, k, n)
        println(result)
    }
}

fun minimizeSum(s: String, k: Int, n: Int): Long {
    var result = 0L

    val chars = s.toCharArray()
    val pairs = mutableListOf<Long>()

    var swaps = 0
    while (swaps < k) {
        var i = 0
        while (i < n - 1) {
            if (chars[i] == '0' && chars[i + 1] == '1' ||
                    chars[i] == '1' && chars[i + 1] == '0') {
                val temp = chars[i]
                chars[i] = chars[i + 1]
                chars[i + 1] = temp
                i += 2
                swaps++
            } else {
                i++
            }
            if (swaps == k) {
                break
            }
        }

        if (swaps == k) {
            break
        }
    }

    for (i in 0 until n - 1) {
        val pair = chars[i].toString() + chars[i + 1].toString()
        pairs.add(pair.toLong())
    }

    val sortedPairs = pairs.sorted()
    for (pair in sortedPairs) {
        result += pair
    }

    return result
}
