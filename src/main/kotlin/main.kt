import java.util.*

fun main() {
    var correct = 0
    println("Welcome to this US history quiz. Type anything to begin.")
    readln()
    println("Question 1: Who was the first US president?")
    var ans1 = readln()
    if (ans1.contains("Washington", true)) {
        println("Your answer $ans1 is correct!")
        correct ++
    }
    else
        println("Sorry, $ans1 was incorrect. The correct answer was Washington.")

    println("Question 2: What year was the Declaration of Independence signed?")
    var ans2 = readln()
    if (ans2.equals("1776")){
        println("Your answer $ans2 is correct!")
        correct ++
    }
    else
        println("Sorry, $ans2 was incorrect. The correct answer was 1776.")

    println("Question 3: How many colonies was the US first made up of?")
    var ans3 = readln()
    if (ans3.equals("13")){
        println("Your answer $ans3 is correct!")
        correct ++
    }
    else
        println("Sorry, $ans3 was incorrect. The correct answer was 13.")

    println("Question 4: What is the national anthem of the US?")
    var ans4 = readln()
    if (ans4.contains("star spangled banner", true)){
        println("Your answer $ans4 is correct!")
        correct ++
    }
    else
        println("Sorry, $ans4 was incorrect. The correct answer was The Star-Spangled Banner.")

    println("Question 5: What is the name of the US capital?")
    var ans5 = readln()
    if (ans5.contains("DC", true)){
        println("Your answer $ans5 is correct!")
        correct ++
    }
    else
        println("Sorry, $ans5 was incorrect. The correct answer was Washington, DC.")

    println("Congrats! You finished the quiz. Your total score was $correct correct out of 5 questions.")
}