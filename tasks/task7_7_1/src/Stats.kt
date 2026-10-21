// Task 7.7.1: statistics functions
fun medianOfList(datalist: List<Float>): Float{

  require(datalist.size > 0) { "not enough data" }
  
  val sizeOfList = datalist.size
  val sortedDataList = datalist.sorted()

  if (sizeOfList.mod(2) == 0){
    var evenSelectorOne = (sizeOfList / 2)-1
    var evenSelectorTwo = (sizeOfList / 2)
    var median: Float = sortedDataList.elementAt(evenSelectorOne) + sortedDataList.elementAt(evenSelectorTwo) /2f
    return median
  } else {
    var oddSelector = (sizeOfList / 2)-0.5
    var median: Float = sortedDataList.elementAt(oddSelector)
    return median
  }

fun displayStatistics(datalist: List<Float>){
  println(min(datalist))
  println(max(datalist))
  println(average(datalist))
  println(medianOfList(datalist))
}
