import spock.lang.Specification

class ObjectCreationSpec extends Specification {

    def "test if the object is created and count the number of elements in the list"() {

        when:
        List<Human> humans = [new Human("John", 34, "HR"),
                              new Human("Jeff", 34, "IT")]

        then:
        humans.size() == 2
    }
}