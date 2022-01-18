package task1

import kotlin.math.sqrt

/**
 * input data is coordinates x,y,z (x1,y1,z1 x2,y2,z2)
 * if args is empty, generate two random Point
 * if args contains one value, create the first Point with these coordinates, create the second one with 0-coordinates
 * if args contains two or more values, create Points with first two coordinates
 * */
fun main(args: Array<String>) {
    val firstPoint: Point
    val secondPoint: Point
    val params = args.map { arg -> arg.split(",").map { str -> str.toInt() } }

    when (params.size) {
        1 -> {
            firstPoint = Point(params[0])
            secondPoint = Point(0, 0, 0)
        }
        0 -> {
            firstPoint = Point()
            secondPoint = Point()
        }
        else -> {
            firstPoint = Point(params[0])
            secondPoint = Point(params[1])
        }
    }

    val distance = firstPoint.calculateDistance(secondPoint)
    println("Distance between $firstPoint and $secondPoint equals $distance")
}

class Point(val x: Int, val y: Int, val z: Int) {
    constructor(coordinates: List<Int>) : this(
        x = coordinates[0],
        y = coordinates[1],
        z = coordinates[2]
    )

    constructor() : this(randomInt(), randomInt(), randomInt())

    //we can use data class for toString implementation, but it generates too much useless code
    override fun toString(): String {
        return "(x = $x, y = $y, z = $z)"
    }
}

fun Point.calculateDistance(point: Point): Double {
    return sqrt(
        (this.x - point.x).square()
                + (this.y - point.y).square()
                + (this.z - point.z).square()
    )
}

fun Int.square(): Double = 1.0 * this * this

fun randomInt() = (Int.MIN_VALUE..Int.MAX_VALUE).random()

