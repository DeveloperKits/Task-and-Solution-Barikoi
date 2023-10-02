fun main() {
    val t = readLine()!!.toInt()

    repeat(t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

        var dec = false
        var flag = false

        for (i in 0 until n-1) {
            if (a[i] > a[i+1]){
                dec = true
            }
            if (dec && a[i] < a[i+1]){
                flag = true
            }
        }

        if (flag){
            println("No")
        }else {
            println("Yes")
        }
    }
}
