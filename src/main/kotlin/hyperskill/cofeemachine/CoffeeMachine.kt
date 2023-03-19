//https://hyperskill.org/projects/67/stages/362

package hyperskill.cofeemachine

import kotlin.math.min

class CoffeeMachine {
    val water = 200
    val milk = 50
    val coffee = 15

    private fun input(): Int {
        println("Write how many cups of coffee you will need:")
        val cupsOfCoffee = readln().toInt()
        return cupsOfCoffee
    }

    private fun calculate(cupsOfCoffee: Int): IntArray {
        val resultWater = water * cupsOfCoffee
        val resultMilk = milk * cupsOfCoffee
        val resultCoffee = coffee * cupsOfCoffee

        return intArrayOf(resultWater, resultMilk, resultCoffee)
    }

    private fun output(cupsOfCoffee: Int, calculationResults: IntArray) {
        println("For $cupsOfCoffee cups of coffee you will need:")
        print(
            """
        ${calculationResults[0]} ml of water
        ${calculationResults[1]} ml of milk
        ${calculationResults[2]} g of coffee beans
        """.trimIndent()
        )
    }

    private fun inputCalcOutput() {
        val cupsOfCoffee: Int = this.input()
        val calculationResults = this.calculate(cupsOfCoffee)
        this.output(cupsOfCoffee, calculationResults)
    }


    fun ingridientsCalculator() {
        println("Write how many ml of water the coffee machine has:")
        val waterYouHave = readln().toInt()
        println("Write how many ml of milk the coffee machine has:")
        val milkYouHave = readln().toInt()
        println("Write how many grams of coffee beans the coffee machine has:")
        val coffeeBeansYouHave = readln().toInt()

        val cupsOfCoffeeYouNeed = input()

        val a = waterYouHave / water
        val b = milkYouHave / milk
        val c = coffeeBeansYouHave / coffee

        val minCupsPosisble = listOf(a, b, c).sorted()[0]
        println(minCupsPosisble)


        val result = if (minCupsPosisble == cupsOfCoffeeYouNeed) {
            "Yes, I can make that amount of coffee"
        } else if (minCupsPosisble < cupsOfCoffeeYouNeed) {
            "No, I can make only ${minCupsPosisble} cups of coffee"
        } else if (minCupsPosisble > cupsOfCoffeeYouNeed) {
            "Yes, I can make that amount of coffee (and even ${minCupsPosisble - cupsOfCoffeeYouNeed} more than that)"
        } else "OK"

        println(result)
    }


}





