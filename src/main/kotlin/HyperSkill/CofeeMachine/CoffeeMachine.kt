package HyperSkill.CofeeMachine

const val water = 200
const val milk = 50
const val coffee = 15

fun main() {
    val cupsOfCoffee: Int = input()
    val calculationResults = calculate(cupsOfCoffee)
    output(cupsOfCoffee, calculationResults)
}

fun input(): Int {
    println("Write how many cups of coffee you will need:")
    val cupsOfCoffee = readln().toInt()
    return cupsOfCoffee
}

fun calculate(cupsOfCofee: Int): IntArray {
    val resultWater = water * cupsOfCofee
    val resultMilk = milk * cupsOfCofee
    val resultCoffee = coffee * cupsOfCofee

    return intArrayOf(resultWater, resultMilk, resultCoffee)
}

fun output(cupsOfCofee: Int, calculationResults: IntArray) {
    println("For $cupsOfCofee cups of coffee you will need:")
    print("""
        ${calculationResults[0]} ml of water
        ${calculationResults[1]} ml of milk
        ${calculationResults[2]} g of coffee beans
        """.trimIndent())
}

