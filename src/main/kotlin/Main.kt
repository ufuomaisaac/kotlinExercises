
fun main (arg : Array<String>) {
    petersonNumber(1)

}

fun petersonNumber(num : Int) {
    var result : Int = 0
    var str : String = num.toString()
    for (i in 0 .. str.length - 1) {
        var n : Int = str[i].toString().toInt()
        var factorialOfn = factorialOf(n)
        result += factorialOfn
    }

    println(result)
    if (result == num) {
        println("$num is a peterson number")
    } else
        println("$num is not a peterson number")
}

fun factorialOf(n : Int) :Int{
    var num : Int = n
    var result : Int = 1
    while (num > 0 ) {
        result *= num
        num--
    }
    return result
}





