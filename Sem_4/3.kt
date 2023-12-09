fun main() {
    print("Введите массив: ")

    val input = readlnOrNull() ?: ""
    val size = input.split(" ").toSet().size
    println(size)
}