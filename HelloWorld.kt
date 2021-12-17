import kotlin.concurrent.*

fun main (args: Array<String>) {
	val t = thread(start = false, name = "mythread") {
		while (true) {
			println("Hello, I am running on a thread sometime later")
		}
	}
	t.start()
}
