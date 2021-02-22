
fun getBinaryGaps(value:Int) : Int{
    val binary : String = Integer.toBinaryString(value)
    
    
    var zeroCount = 0
    var maxZeroCount = 0
    
    
    binary.forEach{s->

        if (s == '0') zeroCount++
        else if (s == '1') {
            if (zeroCount > maxZeroCount){
            maxZeroCount = zeroCount
                
            }
            zeroCount = 0
        }
    }
    return maxZeroCount
}
