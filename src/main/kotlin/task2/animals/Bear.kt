package task2.animals

import task2.animals.interfaces.Swimmable
import task2.animals.interfaces.Walkable

class Bear(name: String) : Animal(name), Swimmable, Walkable {
    override fun swim() {
        state = State.SWIM
        println("${this.name} is swimming. Bears are good swimmer.")
    }

    override fun walk() {
        state = State.WALK
        println("${this.name} is walking. Be careful!")
    }

    override fun meetTheWorld() {
        println("${this.name} met the world")
    }
}