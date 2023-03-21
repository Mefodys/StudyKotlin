
class CoffeeMachine {
    // Status 1 - machine is running, Status 0 - machine is terminated
    var status = 1

    //INITIALIZATION - IngredientsLeft
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

    fun selectProgram() {
        println("\nWrite action (buy, fill, take, remaining, exit): ")
        val input = readln()
        when (input) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> remaining()
            "exit" -> exit()
            else -> return
        }
        println()
    }

    private fun exit() {
        status = 0
    }

    private fun buy() {
        println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")

        val coffeeType = readln()

        try {
            val a = coffeeType.toIntOrNull()
            val temp = ingridientsCalculator(a)

            if (temp) {
                when (a) {
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

                    else -> selectProgram()
                }

            }
        } finally {
            selectProgram()
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

    fun ingridientsCalculator(coffeeType: Int?): Boolean {

        when (coffeeType) {
            1 -> {
                val a = waterLeft / waterForEspresso
                val c = coffeeLeft / coffeeForEspresso

                val minCupsPossible = listOf(a, c).sorted()[0]
                println(minCupsPossible)


                if (minCupsPossible >= 1 && cupsLeft >= 1) {
                    println("I have enough resources, making you a coffee!")
                    return true
                } else if (a == 0) {
                    println("Sorry, not enough water!")
                    return false
                } else if (c == 0) {
                    println("Sorry, not enough coffee!")
                    return false
                } else {
                    println("Sorry, not enough cups!")
                    return false
                }

            }

            2, 3 -> {
                val a = waterLeft / waterForLatte
                val b = milkLeft / milkForLatte
                val c = coffeeLeft / coffeeForLatte

                val minCupsPossible = listOf(a, b, c).sorted()[0]
                println(minCupsPossible)


                if (minCupsPossible >= 1 && cupsLeft >= 1) {
                    println("I have enough resources, making you a coffee!")
                    return true
                } else if (a == 0) {
                    println("Sorry, not enough water!")
                    return false
                } else if (b == 0) {
                    println("Sorry, not enough milk!")
                    return false
                } else if (c == 0) {
                    println("Sorry, not enough coffee!")
                    return false
                } else {
                    println("Sorry, not enough cups!")
                    return false
                }
            }

            else -> {
                selectProgram()
                return false
            }
        }
    }

    fun remaining() {
        println()
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

}