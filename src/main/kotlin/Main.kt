fun main() {
  oddNumbers()
    println(names(arrayOf("Cynthia","HopperLab","study") ))
  eachnumber()
    people(1)
    people(6)
    people(20)
}
fun oddNumbers(){
   for (num in 1..100)
       if(num % 2 !=0){
           println(num)
       }
}
fun names(people:Array<String>): Int{
    var count=0
    for (n in people) {
        if (n.length > 5) {
            count++
        }
    }
    return count
    }

fun eachnumber() {
    for (number in 1..100) {
        if (number % 3 == 0) {
            println("Fizz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else if (number % 3 == 0 && number % 5 == 0) {
            println("FizzBuzz")
        } else {
            println(number)

        }
    }
}
fun people(age:Int){

    when{
        age in 0..5-> println("millk")
        age in 6..14 -> println("orange")
        else-> println("coca cola")
    }
}
