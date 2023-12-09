fun main() {
    print("Введите строку: ")

    val input = readlnOrNull() ?: ""
    println(input)

    for (i in 1..3) {
        println(input.split(" ").last())
    }
}