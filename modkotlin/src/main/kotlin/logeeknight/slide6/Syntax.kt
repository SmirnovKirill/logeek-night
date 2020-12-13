package logeeknight.slide6

data class ConferenceMember(
    val name: String,
    val lastName: String,
    val company: String? = null,
    val role: Role = Role.LISTENER
)


enum class Role {
    SPEAKER,
    LISTENER
}


fun createMembers(): List<ConferenceMember> {
    return listOf(
        ConferenceMember("Dmitriy", "Staeglazov", "Luxoft", Role.SPEAKER),
        ConferenceMember(name = "Kirill", lastName = "Smirnov", company = "Luxoft", role = Role.SPEAKER),
        ConferenceMember("Gvidon", "Vishnevskiy"),
        ConferenceMember("Igor", "Katamaranov", "Factory"),
        ConferenceMember("Tatiana", "Vosmiglazova", company = "TV"),
    )
}

fun getLuxoftEmployees(members: Collection<ConferenceMember>): List<ConferenceMember> {
    return members.filter { it.company == "Luxoft" }
}

fun printMembers(members: Collection<ConferenceMember>) {
    members.forEach { printMember(it) }
}

fun printMember(member: ConferenceMember) {
    val role = when(member.role) {
        Role.SPEAKER -> "Speaker"
        Role.LISTENER -> "Listener"
    }
    val company = getFullCompanyName(member.company)

    println("Name: ${member.name}, lastName: ${member.lastName}, company: $company, role: $role")
}

fun getFullCompanyName(company: String?): String? {
    if (company.isNullOrBlank()) {
        return company
    }

    if (company.startsWith("Luxoft")) {
        return "Luxoft, a DXC Technology Company"
    }

    return company
}

fun haveMembersWithoutCompany(members: Collection<ConferenceMember>): Boolean {
    val withoutCompany = members.filter { it.company.isNullOrBlank() }

    return withoutCompany.isNotEmpty()
}

fun printOdd(members: List<ConferenceMember>) {
    for (i in 1 until members.size step 2) {
        printMember(members[i])
    }
}

fun printEven(members: List<ConferenceMember>) {
    members.withIndex().filter { it.index % 2 == 0 }.forEach { printMember(it.value) }
}

fun main() {
    val members = createMembers()
    val luxoftEmployees = getLuxoftEmployees(members)

    println("Luxoft employees:")
    printMembers(luxoftEmployees)
    println()

    println("Have members without a company? ${haveMembersWithoutCompany(members)}")
    println()

    println("Members with an odd index:")
    printOdd(members)
    println()

    println("Members with an even index:")
    printEven(members)
}