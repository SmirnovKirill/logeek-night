package logeeknight

import java.lang.reflect.Member

data class ConferenceMember(
    val name: String,
    val lastName: String,
    val role: Role = Role.LISTENER
)

enum class Role {
    SPEAKER,
    LISTENER
}

fun printMember(member: ConferenceMember) {
    val (name, lastName) = member
    val role = when(member.role) {
        Role.SPEAKER -> "Speaker"
        Role.LISTENER -> "Listener"
    }

    println ("""
        Name: $name;
        lastName: $lastName;
        role: $role.""")
}

fun printOdd(members: List<ConferenceMember>) {
    for (i in 1 until members.size step 2) {
        printMember(members[i])
    }
}
