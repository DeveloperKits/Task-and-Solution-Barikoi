fun main(){
    val scanner = java.util.Scanner(System.`in`)
    val N = scanner.nextInt()

    repeat(N){
        val T = scanner.nextLong()

        var sum = 0L
        for (i in 1..T) {
            if (isPowerOfTwo(i)) {
                sum -= i
            } else {
                sum += i
            }
        }

        println(sum)
    }

}

fun isPowerOfTwo(n: Long): Boolean {
    return n > 0 && (n and (n - 1)) == 0L
}