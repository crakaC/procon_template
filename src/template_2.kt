import java.io.PrintWriter

fun main() {
    println("Hello, World!")
    flush()
}

private val _out = PrintWriter(System.`out`)
private val _in = System.`in`
private fun flush() = _out.flush()
private fun println(any: Any?) = _out.println(any)
private fun readInts(n: Int) = IntArray(n) { readInt() }
private fun readIndices(n: Int) = IntArray(n) { readInt().dec() }
private fun readLongs(n: Int) = LongArray(n) { readLong() }
private fun readDoubles(n: Int) = DoubleArray(n) { readDouble() }
private val _buf = ByteArray(4096)
private var _ptr = 0
private var _buflen = 0
private const val _EOF = 0.toChar()
private fun Byte._isPrintable() = this in 33..126
private fun Char._isPrintable() = this.code in 33..126
private fun Char._toNum() = this - '0'
private fun _hasNextByte() = if (_ptr < _buflen) true else {
    _ptr = 0
    _buflen = _in.read(_buf)
    _buflen > 0
}

private fun readChar() = if (_hasNextByte()) _buf[_ptr++].toInt().toChar() else _EOF
private fun _skip() {
    while (_hasNextByte() && !_buf[_ptr]._isPrintable()) _ptr++
    if (!_hasNextByte()) error("reached to EOF")
}

private fun readLine() = buildString {
    _skip()
    var c = readChar()
    while (c != _EOF && !c.isISOControl()) {
        append(c)
        c = readChar()
    }
}

private fun readString() = buildString {
    _skip()
    var c = readChar()
    while (c != _EOF && c._isPrintable()) {
        append(c)
        c = readChar()
    }
}

private fun readLong(): Long {
    _skip()
    var n = 0L
    var neg = false
    var c = readChar()
    if (c == '-') {
        neg = true
        c = readChar()
    }
    while (c != _EOF && c._isPrintable()) {
        if (!c.isDigit()) throw NumberFormatException()
        n *= 10L
        n += c._toNum()
        c = readChar()
    }
    return if (neg) -n else n
}

private fun readInt() = readLong().let {
    if (it in Int.MIN_VALUE..Int.MAX_VALUE) it.toInt()
    else throw NumberFormatException("$it is out of Int range")
}

private fun readDouble(): Double {
    _skip()
    var n = 0.0
    var neg = false
    var c = readChar()
    if (c == '-') {
        neg = true
        c = readChar()
    }
    while (c != _EOF && c.isDigit()) {
        if (c == '.') break
        if (!c.isDigit()) throw NumberFormatException()
        n = n * 10 + c._toNum()
        c = readChar()
    }
    if (c == '.') {
        var denom = 10.0
        c = readChar()
        while (c != _EOF && c._isPrintable()) {
            if (!c.isDigit()) throw NumberFormatException()
            n += c._toNum() / denom
            denom *= 10L
            c = readChar()
        }
    }
    return if (neg) -n else n
}