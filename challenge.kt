
fun getBinaryGaps(value:Int) : Int{
    val binary : String = Integer.toBinaryString(value)
    
    
    var zeroCount = 0
    var maxZeroCount = 0
    
    
    binary.forEachIndexed{index, s->

        if (s == '0') zeroCount++
        else if (s == '1') {
            maxZeroCount = zeroCount
            zeroCount = 0
        }
        
        
        if (index == binary.length-1 && s == '0') maxZeroCount = 0
        
    }
   
        
        println(maxZeroCount.toString()) 
    
    
    return maxZeroCount
}
