
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest{
    @Test
    fun `해인테스트`(){
        val person = Person(name="이해인",age=26,nickname="해이나")
        assertThat(person.age).isEqualTo(26)
    }

    @Test
    fun `기본인자`(){
        val person = Person(name="이해인",

            age=26)
        assertThat(person.name).isEqualTo(person.nickname)
    }

    @Test
    fun `데이터 클래스`(){
        val person1 = Person("이해인", 20)
        val person2 = Person("이해인", 20)
        assertThat(person1).isEqualTo(person2)
    }
    

}

