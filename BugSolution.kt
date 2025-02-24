fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(newList) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it % 2 != 0 }
    println(newMap) // Output: {a=1, c=3}

    //Alternative solution using indices for list
    val list2 = mutableListOf(1,2,3,4,5)
    var i = 0
    while(i < list2.size){  
        if(list2[i]%2 == 0){
            list2.removeAt(i)
        } else {
            i++
        }
    }
    println(list2) //Output: [1,3,5]
} 