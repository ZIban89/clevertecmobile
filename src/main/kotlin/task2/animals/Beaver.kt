package task2.animals

import task2.animals.interfaces.Swimmable
import task2.animals.interfaces.Walkable

class Beaver(name: String) : Animal(name), Swimmable, Walkable {

    override fun swim() {
        state = State.SWIM
        println("${this.name} is swimming. Beavers swim like a fish.")
    }

    override fun walk() {
        state = State.WALK
        println("${this.name} is walking.")
    }

    override fun meetTheWorld() {
        state = State.BE_BORN
        println("$name met the world.")
    }
}