package br.com.ioasys.diceroller

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue(rollResult in 1..6)
    }
}