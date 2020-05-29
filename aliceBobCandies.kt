fun main(args: Array<String>) {
    var cases = readLine()!!.toInt()
    while (cases > 0) {
        var aTotal = 0
        var bTotal = 0
        var last = 0
        var steps= 0
        var gameLength = readLine()!!.toInt()
        val list  = readLine()!!.split(' ').map(String::toInt).toMutableList()
        var alice = true
        while(list.isNotEmpty()){
            var current = 0
            if (alice) {
                while (current <= last && list.isNotEmpty()) {
                    current += list.removeAt(0)
                }
                aTotal += current
                last = current
            } else {
                while (current <= last && list.isNotEmpty()) {
                    current += list.removeAt(list.lastIndex)
                }
                bTotal += current
                last = current
            }
            steps += 1
            alice = !alice

        }
        println("$steps $aTotal $bTotal")
        cases -= 1
    }
}
