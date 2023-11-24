package com.example.springbootlogging.member

data class MemberDto(
    val id: Long,
    val name: String,
) {

    companion object {
        fun of(member: Member): MemberDto {
            return MemberDto(
                id = member.id,
                name = member.name,
            )
        }
    }
}
