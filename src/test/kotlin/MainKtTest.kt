import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class MainKtTest {

    @Test
    fun returnAharA_sendListcharofctozsmole_ReturnNegativeone() {
        //given input list c..z
        var list = mutableListOf<String>("c","z")
        //when check inter a..z just
        var inputList=returnCharA(list)
        //then input a..z return Negativeone
        assertEquals(-1.0,inputList)
    }
    @Test
    fun returnAharA_sendListcharofAtoZCAPTEL_ReturnNegativeone() {
        //given input list A..Z
        var list = mutableListOf<String>("A","Z")
        //when check inter A..Z just
        var inputList=returnCharA(list)
        //then input A..Z return Negativeone
        assertEquals(-1.0,inputList)
    }
    @Test
    fun returnAharA_sendListNumber_ReturnNegativeone() {
        //given input list number

        var list = mutableListOf<String>("0","1")
        //when check inter a..z just
        var inputList=returnCharA(list).toInt()
        //then input a..z return Negativeone
        assertEquals(-1,inputList)
    }
    @Test
    fun returnAharA_sendListNumberDoule_ReturnNegativeone() {
        //given input list number
        var list = mutableListOf<String>("0.1","0.0")
        //when check inter 0.. just
        var inputList=returnCharA(list).toDouble()
        //then input 0.. return Negativeone
        assertEquals(-1.0,inputList)
    }
    @Test
    fun returnAharA_sendListStringMoreThanOneLetter_ReturnNegativeone() {
        //given input list MoreThanOneLetter
        var list = mutableListOf<String>("am")
        //when check inter MoreThanOneLetter
        var inputList=returnCharA(list)
        //then input MoreThanOneLetter return Negativeone
        assertEquals(-1.0,inputList)
    }
    @Test
    fun returnAharA_sendListatob_ReturnPercentageOfARepetitions() {
        //given input list a and b
        var list = mutableListOf<String>("a","b")
        //when check a and b ReturnPercentageOfARepetition
        var inputList=returnCharA(list)
        //then input ReturnPercentageOfARepetition 1/2*100
        assertEquals(50.0,inputList)
    }
}