package task2.animals

import task2.animals.interfaces.Flyable

class Colibri(name: String) : Animal(name), Flyable {
    override fun fly() {
        state = State.FLY
        println("${this.name} is flying.")
    }

    override fun meetTheWorld() {
        state = State.BE_BORN
        println("$name hatched from an egg")
    }

}