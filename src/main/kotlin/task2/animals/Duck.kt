package task2.animals

import task2.animals.interfaces.Flyable
import task2.animals.interfaces.Swimmable
import task2.animals.interfaces.Walkable

class Duck(name: String) : Animal(name), Walkable, Flyable, Swimmable {
    override fun fly() {
        state = State.FLY
        println("${this.name} is flying.")
    }

    override fun swim() {
        state = State.SWIM
        println("${this.name} is swimming. Ducks spend a lot of time on the water.")
    }

    override fun walk() {
        state = State.WALK
        println("${this.name} is walking. Looks awkward.")
    }

    override fun meetTheWorld() {
        state = State.BE_BORN
        println("$name hatched from an egg")
    }

}