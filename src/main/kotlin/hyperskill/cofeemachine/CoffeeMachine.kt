//https://hyperskill.org/projects/67/stages/362

package hyperskill.cofeemachine


class CoffeeMachine {
    val water = 200
    val milk = 50
    val coffee = 15
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
        print(
            """
        ${calculationResults[0]} ml of water
        ${calculationResults[1]} ml of milk
        ${calculationResults[2]} g of coffee beans
        """.trimIndent()
        )
    }


    var waterLeft: Int = 0
    var milkLeft: Int = 0
    var coffeeLeft: Int = 0

    fun addIngredients() {
        waterLeft += 1000
        milkLeft += 500
        coffeeLeft += 250
        println("Adding ingredients to the Coffee Machine")
    }

    fun ingredientsLeft() {
        println(
            """
        Write how many ml of water the coffee machine has:
        > $waterLeft
        Write how many ml of milk the coffee machine has:
        > $milkLeft
        Write how many grams of coffee beans the coffee machine has:
        > $coffeeLeft
        """.trimIndent()
        )

    }

}
