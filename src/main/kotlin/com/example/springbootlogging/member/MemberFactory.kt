package com.example.springbootlogging.member

object MemberFactory {

    fun of(request: MemberCreateRequest): Member {
        return Member(name = request.name)
    }
}