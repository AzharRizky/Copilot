// Create hello world function
fun helloWorld() = println("Hello World")

// Create function
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println(list.filter { it % 2 == 0 })
}