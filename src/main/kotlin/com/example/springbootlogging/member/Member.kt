package com.example.springbootlogging.member

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Member(
    var name: String,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0L


}