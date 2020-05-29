fun main(args: Array<String>) {
    var cases = readLine()!!.toInt()
    while(cases > 0){
        var value = readLine()!!.toInt()
        val mList : MutableList<Int> = mutableListOf()
        var mul = 1
        for (i in value.toString().indices){
            val roundNums = ((value)%10)*mul
            if(roundNums != 0)
                mList.add(roundNums)
            mul*=10
            value/=10
        }
        println(mList.size)
        mList.forEach { print("$it ") }
        cases -= 1
    }
}
