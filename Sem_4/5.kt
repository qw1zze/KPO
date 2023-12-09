abstract class Figure (var height: Int, var base: Int) {
    abstract fun getVolume(): Double
    abstract fun getLateralProjection(): Double
    abstract fun getTopProjection(): Double
}

class Cube(height: Int) : Figure(height, height) {
    override fun getVolume() : Double {
        return (height * height * height).toDouble()
    }
    override fun getLateralProjection(): Double  {
        return (height * height).toDouble()
    }
    override fun getTopProjection(): Double {
        return getLateralProjection()
    }
}

class Cone(height: Int, base: Int) : Figure(height, base) {
    override fun getVolume(): Double {
        return Math.PI / 3 * base * base * height
    }

    override fun getLateralProjection(): Double {
        return (base * height / 2).toDouble()
    }

    override fun getTopProjection(): Double {
        return Math.PI / 4 * base * base
    }
}

class Pyramid(height: Int, base: Int) : Figure(height, base) {
    override fun getVolume(): Double {
        return (height / 3 * base * base).toDouble()
    }

    override fun getLateralProjection(): Double {
        return (height / 2 * base).toDouble()
    }

    override fun getTopProjection(): Double {
        return (base * base) .toDouble()
    }
}

fun main() {
    println("Введите тип фигуры: ")
    var figType = readln()
    println("Введите высоту фигуры: ")
    var height = readln().toInt()
    println("Введите основание/диаметр фигуры: ")
    val base = readln().toInt()

    var figure = when(figType) {
        "куб" -> Cube(base)
        "конус" -> Cone(height, base)
        "пирамида" -> Pyramid(height, base)
        else -> null
    }

    if (figure != null) {
        println("Объем ($figType): ${figure.getVolume()}")
        println("Площадь боковой проекции: ${figure.getLateralProjection()}")
        println("Площадь проекции сверху: ${figure.getTopProjection()}")
    }
}