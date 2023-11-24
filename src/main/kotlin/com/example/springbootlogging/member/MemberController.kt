package com.example.springbootlogging.member

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberRepository: MemberRepository,
) {

    @GetMapping("/members")
    fun list(): List<MemberDto> {
        val members = memberRepository.findAll()

        return members.map { MemberDto.of(it) }
    }

    @GetMapping("/members/{memberId}")
    fun find(
        @PathVariable memberId: Long
    ): MemberDto {
        val member = memberRepository.findByIdOrNull(memberId)
            ?: throw Exception("회원을 찾을 수 없습니다.(memberId: $memberId)")

        return MemberDto.of(member)
    }

    @PostMapping("/members")
    fun save(request: MemberCreateRequest) {
        memberRepository.save(MemberFactory.of(request))
    }
}