package org.example

import io.kotest.matchers.shouldBe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class TestMain {
    @Test
    fun testMain() {
        runBlocking {
            launch(Dispatchers.Default) {
                delay(100)
                firstLevel()
                delay(100)
            }
        }
        false shouldBe true
    }

    suspend fun firstLevel() {
        delay(100)
        secondLevel()
        delay(100)
    }

    suspend fun secondLevel() {
        delay(100)
        // breakpoint here
        println("secondLevel")
        delay(100)
    }
}