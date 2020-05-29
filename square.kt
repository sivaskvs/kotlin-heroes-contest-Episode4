fun main(args: Array<String>) {
    var cases = readLine()!!.toInt()
    while(cases > 0){
        val inputsOne = readLine()!!.split(' ').map(String::toInt)
        val inputsTwo = readLine()!!.split(' ').map(String::toInt)
        println(
            if( (inputsOne.max()== inputsTwo.max()) &&
                (
                (inputsOne.max() == (inputsTwo.min()?.plus(inputsOne.min()!!))) ||
                (inputsTwo.max() == (inputsTwo.min()?.plus(inputsOne.min()!!)))
                )
            )
                "Yes" else "No")
        cases-=1
    }
}
