package task2.animals

import kotlinx.coroutines.delay
import task2.animals.interfaces.*
import kotlin.reflect.KFunction


abstract class Animal(val name: String) : Eatable, Movable, Sleepable, Dieable {
    lateinit var state: State
        protected set

    init {
        meetTheWorld()
    }

    suspend fun live() {
        repeat((10..20).random()) {
            when ((0..2).random() % 3) {
                0 -> {
                    this.eat()
                }
                1 -> {
                    this.move()
                }
                else -> {
                    this.sleep()
                }
            }
            delay((10..100).random() * 100L)
        }
        this.die()
    }

    abstract fun meetTheWorld()

    override fun eat() {
        state = State.EAT
        println("${this.name} is eating")
    }

    override fun move() {
        val actions = mutableListOf<KFunction<Unit>>()
        if (this is Flyable) actions.add(this::fly)
        if (this is Walkable) actions.add(this::walk)
        if (this is Swimmable) actions.add(this::swim)
        actions.random().call()
    }

    override fun sleep() {
        state = State.SLEEP
        println("${this.name} is sleeping")
    }

    override fun die() {
        state = State.DEAD
        println("${this.name} is dead. RIP")
    }
}
