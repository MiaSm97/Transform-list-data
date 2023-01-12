/*Create a list of integers, transform it into a list of strings, and print them one by one*/

fun main(){
    val list = listOf(2, 3, 5, 6)
    list.map { it.toString() }.forEach { println(it) }
}
