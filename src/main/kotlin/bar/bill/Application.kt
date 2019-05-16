package bar.bill

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("bar.bill")
                .mainClass(Application.javaClass)
                .start()
    }
}