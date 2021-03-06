package app.zendoo.namaste

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations.initMocks

class AsdTest {

    lateinit var asd: Asd

    @Mock
    lateinit var context: Context

    @Before
    internal fun setUp() {
        initMocks(this)
    }

    @Test(expected = NullPointerException::class)
    fun testAsd() {
        asd = Asd(context)
        val result = asd.asd(0, 0)
        assertEquals(0, result.toLong())
    }
}
