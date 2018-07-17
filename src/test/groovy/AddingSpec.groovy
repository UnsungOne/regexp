import spock.lang.Specification

class AddingSpec extends Specification {

    def "Should return 5"() {

        given:
        Adding adding = new Adding();

        when:
        adding.sum(2, 3);

        then:
        5;

    }
}