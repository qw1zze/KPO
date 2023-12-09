fun main() {
    print("Введите n: ")

    val n = readln().toInt()
    val matrix = Array(n) { Array(n) { (0..10).random()}}

    for (str in matrix) {
        for (sym in str) {
            print(sym.toString() + " ")
        }
        println()
    }
    println()

    var res = 0
    var j = 0
    for (i in 1..<n) {
        res += matrix[i][n - j - 1]
        j++
    }
    print("Сумма чисел под побочной диагональю: " + res.toString())
}