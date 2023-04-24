package com.example.jetpackcompose.model

class PersonRepo {

    fun getAllPeople() = listOf<Person>(
        Person(
            id = 0,
            firstName = "John",
            lastName = "Cena",
            age = 30
        ),
        Person(
            id = 1,
            firstName = "Alex",
            lastName = "Pereira",
            age = 24
        ),
        Person(
            id = 2,
            firstName = "Mark",
            lastName = "Warner",
            age = 23
        ),
        Person(
            id = 3,
            firstName = "Steve",
            lastName = "Jobs",
            age = 42
        ),
        Person(
            id = 4,
            firstName = "Adam",
            lastName = "Gilchrist",
            age = 30
        ),
        Person(
            id = 5,
            firstName = "Sanath",
            lastName = "Jaya",
            age = 34
        ),
        Person(
            id = 6,
            firstName = "Andrew",
            lastName = "Russel",
            age = 42
        ),
        Person(
            id = 7,
            firstName = "Shawn",
            lastName = "michel",
            age = 48
        ),
        Person(
            id = 8,
            firstName = "David",
            lastName = "Villa",
            age = 27
        ),
        Person(
            id = 9,
            firstName = "Daniel",
            lastName = "Crominer",
            age = 22
        ),
        Person(
            id = 10,
            firstName = "Ray",
            lastName = "Meystirio",
            age = 18
        ),

    )
}