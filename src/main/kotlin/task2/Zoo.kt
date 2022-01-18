package task2

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import task2.animals.*

//4 утки, 7 колибри, 3 меведя, 5 волков, павлин, 2 бобр
fun main() = runBlocking {
    val animals = mutableListOf<Animal>()
    repeat(3) { animals.add(Bear("Bear${it + 1}")) }
    repeat(4) { animals.add(Duck("Duck${it + 1}")) }
    repeat(5) { animals.add(Wolf("Wolf${it + 1}")) }
    repeat(2) { animals.add(Beaver("Beaver${it + 1}")) }
    repeat(7) { animals.add(Colibri("Colibri${it + 1}")) }
    animals.add(Peacock("Peacock"))

    animals.forEach { launch { it.live() } }
}