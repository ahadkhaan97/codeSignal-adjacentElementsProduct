fun main() {
    print(solution(mutableListOf(3, 6, -2, -5, 7, 3)))
}

fun solution(inputArray: MutableList<Int>): Int {
    var max = Integer.MIN_VALUE
    for (i in 0 until inputArray.size - 1) {
        val product = inputArray[i] * inputArray[i + 1]
        if (product > max) {
            max = product
        }
    }
    return max
}