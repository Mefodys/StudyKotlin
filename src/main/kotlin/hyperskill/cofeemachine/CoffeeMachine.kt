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

    var waterLeft = 400
    var milkLeft = 540
    var coffeeLeft = 120
    var cupsLeft = 9
    var moneyLeft = 550

    //Espresso
    val waterForEspresso = 250
    val coffeeForEspresso = 16
    val moneyForEspresso = 4

    //Latte
    val waterForLatte = 350
    val milkForLatte = 75
    val coffeeForLatte = 20
    val moneyForLatte = 7

    //Cappuccino
    val waterForCappuccino = 200
    val milkForCappuccino = 100
    val coffeeForCappuccino = 12
    val moneyForCappuccino = 6


    fun showInfo() {
        println(
            """
                The coffee machine has:
                $waterLeft ml of water
                $milkLeft ml of milk
                $coffeeLeft g of coffee beans
                $cupsLeft disposable cups
                $$moneyLeft of money
            """.trimIndent()
        )
    }

    fun selectProgram() {
        println("\nWrite action (buy, fill, take): ")
        val input = readln()
        //"buy", "fill", "take"

        when (input) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
        }
        println()
    }

    private fun buy() {
        println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        val coffeeType = readln().toInt()

        when (coffeeType) {
            1 -> {
                waterLeft -= waterForEspresso
                coffeeLeft -= coffeeForEspresso
                moneyLeft += moneyForEspresso
                cupsLeft -= 1
            }

            2 -> {
                waterLeft -= waterForLatte
                milkLeft -= milkForLatte
                coffeeLeft -= coffeeForLatte
                moneyLeft += moneyForLatte
                cupsLeft -= 1

            }

            3 -> {
                waterLeft -= waterForCappuccino
                milkLeft -= milkForCappuccino
                coffeeLeft -= coffeeForCappuccino
                moneyLeft += moneyForCappuccino
                cupsLeft -= 1
            }
        }
    }

    private fun fill() {
        println("Write how many ml of water you want to add:")
        waterLeft += readln().toInt()
        println("Write how many ml of milk you want to add:")
        milkLeft += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        coffeeLeft += readln().toInt()
        println("Write how many disposable cups you want to add:")
        cupsLeft += readln().toInt()
    }

    private fun take() {

        println("I gave you \$${moneyLeft}")
        moneyLeft = 0
    }

}





