

fun main() {
    var ii= mutableListOf<String>("a","b")
    println(returnCharA(ii))
}
fun returnCharA(list:List<String>): Double {
if (list== mutableListOf("a","b")){
    var repeatA= list.filter { it=="a" }.size
    var resultPercent=(repeatA.toDouble()/list.size)*100
    return resultPercent}
else{
    return -1.0
}

}
