package co.crisi.helidon.odyssey.jotvault.service.create

import co.crisi.helidon.odyssey.jotvault.adapter.jpamodel.UserJpaEntity
import co.crisi.helidon.odyssey.jotvault.model.impl.User
import co.crisi.helidon.odyssey.jotvault.repository.UserRepository
import spock.lang.Specification

class CreateUserProviderTest extends Specification {


    UserRepository repository = GroovyMock(UserRepository)  // Mocking the UserRepository interface


    def "Run"() {
    }

    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 2

        when:
        int result = left + right

        then:
        result == 4
    }

    def "should use global mock for Repository"() {
        given:
        def user =User.builder()
                .username("dummyUsername")
                .email("dummy@example.com")
                .password("dummyPassword")
                .firstName("John")
                .lastName("Doe")
                .build()

        def entity = UserJpaEntity.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();

        repository.save(entity) >> UserJpaEntity.builder().userId(1L).build()

        when:
        CreateUserProvider service = new CreateUserProvider(repository)
        def userSaved = service.run(user)

        then:
        userSaved != null
        userSaved.userId == 1L
    }


}
