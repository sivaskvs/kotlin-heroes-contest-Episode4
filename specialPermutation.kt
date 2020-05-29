fun main() {
    val testCases = readLine()!!.toInt()
    for (q in 1..testCases) {
        val nVal = readLine()!!.toInt()
        val output : MutableList<Int> = mutableListOf()
        if (nVal <= 3) {
            println("-1")
        } else {
            for (i in (if (nVal % 2 == 1) nVal else (nVal-1)) downTo 1 step 2)
                output.add(i)
            output.add(4)
            output.add(2)
            for (i in 6..(if (nVal % 2 == 1) (nVal-1) else nVal) step 2) {
                output.add(i)
            }
            println(output.joinToString(separator = " "))
        }
    }
}
