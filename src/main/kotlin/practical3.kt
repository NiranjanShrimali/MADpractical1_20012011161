import java.util.PrimitiveIterator

fun main(args:Array<String>){
  /*  print("Student Enrollment No.:")
    var a= readLine()!!.toInt()
    println("Student Enrollment No.: $a")

   */

    print("Student Enrollment No.:")
    val eno = readLine()!!.toLong()

    print("Student Name:")
    val name= readLine()!!.toString()

    print("Student Branch:")
    val branch= readLine()!!.toString()

    print("Student Class:")
    val c= readLine()!!.toString()

    print("Student Batch:")
    val batch = readLine().toString()

    print("Student College name:")
    val cname= readLine()!!.toString()

    print("Student University name:")
    val uname= readLine()!!.toString()

    print("Student age:")
    val age= readLine()!!.toInt()


    println("********************************")
    println("Student's Data:")
    println("Enrollment No.: "+eno)
    println("Name: "+name)
    println("age: "+age)
    println("Branch: "+branch)
    println("Class: "+c)
    println("Batch: "+batch)
    println("College name:"+cname)
    println("University name: "+uname)
}