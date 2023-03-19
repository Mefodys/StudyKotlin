package hyperskill.cofeemachine

fun main() {

    val newCoffeeMachine = CoffeeMachine()

    val cupsOfCoffee: Int = newCoffeeMachine.input()
    val calculationResults = newCoffeeMachine.calculate(cupsOfCoffee)
    newCoffeeMachine.output(cupsOfCoffee, calculationResults)

    println()
    newCoffeeMachine.ingredientsLeft()

    println()
    newCoffeeMachine.addIngredients()

    println()
    newCoffeeMachine.ingredientsLeft()


}


