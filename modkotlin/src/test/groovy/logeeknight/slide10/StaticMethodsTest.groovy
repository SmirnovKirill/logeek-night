package logeeknight.slide10

import com.fasterxml.jackson.databind.ObjectMapper
import spock.lang.Specification

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals

class StaticMethodsTest extends Specification {
    def "Test static conversion"() {
        when:
        def result = Person.from("Andrey Breslav")

        then:
        assertReflectionEquals(result, new Person("Andrey", "Breslav"))
    }

    def "Test method conversion"() {
        when:
        def result = StaticMethodsKt.personFrom("Andrey Breslav")

        then:
        assertReflectionEquals(result, new Person("Andrey", "Breslav"))
    }

    def "Test object mapper"() {
        when:
        def result = OBJECT_MAPPER.INSTANCE

        then:
        result instanceof ObjectMapper
    }
}
