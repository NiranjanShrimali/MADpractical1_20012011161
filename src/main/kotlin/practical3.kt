import java.util.PrimitiveIterator

fun main(args:Array<String>){
  /*  print("Student Enrollment No.:")
    var a= readLine()!!.toInt()
    println("Student Enrollment No.: $a")

   */

    println("Student Enrollment No")
    val eno = readLine()!!.toLong()

    println("Student Name")
    val name= readLine()!!.toString()

    println("Student Branch")
    val branch= readLine()!!.toString()

    println("Student Class")
    val c= readLine()!!.toString()

    println("Student Batch ")
    val batch = readLine().toString()

    println("Student Collage name ")
    val cname= readLine()!!.toString()

    println("Student University name")
    val uname= readLine()!!.toString()

    println("Student age")
    val age= readLine()!!.toInt()


    println("********")
    println("Enrollment No :: "+eno)
    println("Name ::"+name)
    println("age ::"+age)
    println("Branch :: "+branch)
    println("Class :: "+c)
    println("Batch :: "+batch)
    println("Collage name ::"+cname)
    println("University name :: "+uname)


}