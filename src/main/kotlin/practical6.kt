fun main(){
    println("please Enter the Value")
    val number1= readLine()!!.toInt()
    val number2= readLine()!!.toInt()
    val number3=readLine()!!.toInt()

    val add= number1+number2+number3
    val sub = number1-number2-number3
    val multy = number1*number2*number3
    val divition = number1/number2

    println("Addition of $number1, $number2, $number3 is "+add)
    println("Substraction of $number1, $number2, $number3 is "+sub)
    println("Multiply of $number1, $number2, $number3 is "+multy)
    println("divition of $number2, $number3 is "+divition)

  /*  println("1.Addition / 2. Substraction /3.Multiplication /4. Divition")

    val value= readLine()!!.toInt()
    when(value){

        1 -> print("Addition : "+add)
        2 -> print("Substraction "+sub)
        3 -> print("Multiply "+multy)
        4 -> print("divition " +divition)



    }

   */
}
/*
fun main(){
    println("please Enter the number")
    val number = readLine()!!.toInt()
    val result: Long = factorial(number)
    println(" The Factorial of $number = $result")

}


fun factorial(number: Int): Long {
    return if(number == 1){
        number.toLong()
    }
    else{
        number*factorial(number-1)
    }

}*/