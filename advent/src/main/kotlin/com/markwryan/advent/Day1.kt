package com.markwryan.advent

class Day1 {

    fun solve() {
        val puzzleInput: String = this.javaClass.classLoader.getResource("input/day1part1.txt").readText()
        var total = 0
        for(value in puzzleInput.asIterable().withIndex() ) {
            var previousMatch = value.index > 0 && value.value == puzzleInput[value.index - 1]
            var forwardMatch = value.index < puzzleInput.length - 1 && value.value == puzzleInput[value.index + 1]

            if (previousMatch) {
                var amount: Int = value.value.toString().toInt()
                total += amount


            }
        }
        if(puzzleInput[0] == puzzleInput[puzzleInput.length - 1]) {
            var amount: Int = puzzleInput[0].toString().toInt()
            total += amount
        }
        print(total)
    }

    fun solvePartTwo() {

    }
}
fun main(args: Array<String>) {
    var day1 = Day1()
    day1.solve()
}

