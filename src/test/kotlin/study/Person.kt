data class Person(val name: String, val age: Int, var nickname: String? = name)
// 필드 게터 세터 합쳐서 프로퍼티라고 부름
// 즉 Person안의 name age nickname은 필드보다는 프로퍼티에 가까움 (게터 세터 자동이니까!)
// val 은 변경불가능 == getter만 가능
// var 은 변경가능 == setter도 가능
// 또한 코틀린은 프로퍼티이자 생성자입니다!!
