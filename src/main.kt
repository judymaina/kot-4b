fun main(){
    numerics(arrayOf(5,6,7,8,4,2))
    mixed(arrayOf(3.0,5.2,"Judy",1.4))
var m=letters(arrayOf('a','b','e','x','l','o','v','u'))
    println(m)
}


fun numerics(nums:Array<Int>):Int {
    var numbers = 2
    nums.forEach { number ->
        numbers *= number
        println(numbers)
    }
    return numbers
    }
fun mixed(combine:Array<Any>):Float{
    var mix=1.1F
    combine.forEach { combined ->
        if (combined is Float || combined is Double)
            mix += combined.toString().toFloat()
        println(mix)
    }
    return mix

    }

fun letters(symbol:Array<Char>):Int{
    var vow = 0
    symbol.forEach { vowels ->
        if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
            vow++
        }
    }
    return vow


}




















































