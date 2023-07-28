package com.example.activity01g

import java.util.Scanner

fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.replace(Regex("[^a-zA-Z0-9]"), "").toLowerCase()
    return cleanedWord == cleanedWord.reversed()
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a word: ")
    val word = scanner.next()

    if (isPalindrome(word)) {
        println("$word is a palindrome.")
    } else {
        println("$word is not a palindrome.")
    }
}
