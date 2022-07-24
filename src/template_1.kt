fun main(){

}

private val br = System.`in`.bufferedReader()
private fun readLine() = br.readLine()
private fun readInt() = readLine().toInt()
private fun readInts() = readLine().split(" ").map(String::toInt)
private fun readLong() = readLine().toLong()
private fun readLongs() = readLine().split(" ").map(String::toLong)
private fun <T>printAll(a: Iterable<T>) = println(a.joinToString("\n"))