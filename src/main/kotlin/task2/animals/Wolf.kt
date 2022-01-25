package task2.animals

import task2.animals.interfaces.Swimmable
import task2.animals.interfaces.Walkable

class Wolf(name: String) : Animal(name), Walkable, Swimmable {
    override fun swim() {
        state = State.SWIM
        println("${this.name} is swimming. Wolfs can swim.")
    }

    override fun walk() {
        state = State.WALK
        println("${this.name} is walking. Be careful!")
    }

    override fun meetTheWorld() {
        println("${this.name} met the world.")
    }
}