fun main () {
    /*Creating an object instances from the class and passing in
    * the the number of sides of the Dice.Then printing out the
    * number of sides and the result of the dice being rolled*/
    val myFirstDice = Dice(6)
    println("My ${myFirstDice.numSides} dice rolled ${myFirstDice.roll()}")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice result is ${mySecondDice.roll()}!")
}

/*Dice() class that has a number of sides property and
* a method that gives random value which simulates an actual dice being rolled*/
class Dice(val numSides: Int) {

    /* roll() method that performs the task of giving a random number
    * from 1 to the number passed when Dice() class is instantiated */
    fun roll(): Int {
        return (1..numSides).random()
    }
}