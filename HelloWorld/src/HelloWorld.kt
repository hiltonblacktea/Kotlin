fun str() : String{
    return "str"
}
fun main() {
    val x = 1  // val 只能賦值一次,無法更動
    var y = 2.0  // var 可以不斷賦予新值
    var z : Float = 4.0F // 正式宣告變數型別
    var a = 3.0F  //省略 讓kotlin自行推斷 float要在數值後面加上F
    var b : String = "123"
    var c = "變數"
    var d : Boolean = true
    var f = false
    println("int最大&最小範圍:")
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(f)
    println("可以直接在敘述裡面加 $c")
    println("也可以直接在敘述裡面呼叫函數回傳值!! => ${str()}")
}
/*
使用後綴字定義資料類型
十進制：123
長整型以大寫的 L 結尾：123L
16 進制以 0x 開頭：0x0F
2 進制以0b 開頭：0b00001011
注意：8進制不支持
Doubles默認寫法: 123.5, 123.5e10
Floats 使用小寫 f 或者大寫 F 後綴：123.5f
*/
/*
kotlin.UByte: 範圍是 0 到255      -> var ub = 255u
kotlin.UShort: 範圍是 0 到65535   -> var us =
kotlin.UInt: 範圍是 0 到2^32 - 1
kotlin.ULong: 範圍是 0 到2^64 - 1
*/