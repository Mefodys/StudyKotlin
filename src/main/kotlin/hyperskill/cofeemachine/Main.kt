package hyperskill.cofeemachine

import CoffeeMachine

fun main() {

    val newCoffeeMachine = CoffeeMachine()

    while (newCoffeeMachine.status != 0) {
        newCoffeeMachine.selectProgram()
    }

}