import java.util.Scanner

fun main(args: Array<String>) {

    println("Введите сумму для перевода: ")
    val scan = Scanner(System.`in`)
    var amount: Int = scan.nextInt()
    val commissionInPercentage: Double = 0.075
    var commissionInRubles = amount * commissionInPercentage
    val minimalComm = 35
    if (commissionInRubles >= minimalComm) {
        println("Комиссия составляет: $commissionInRubles руб.")
    } else {
        println("Комиссия составляет: $minimalComm рублей")
    }
}