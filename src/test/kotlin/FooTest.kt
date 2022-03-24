package cz.maio.test

import cz.maio.foo.Foo
import org.junit.jupiter.api.Test

class FooTest {
    @Test
    fun `test handle1`() {
        val result = Foo().handle1()
    }

    @Test
    fun `test handle2`() {
        val result = Foo().handle2()
    }
}
