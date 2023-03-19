package HyperSkill.Archive

//fun main(args: Array<String>){
//    println();
//    println("Hello kotlin");
//}

//fun main(args: Array<String>){
//    println("Arithmetic ops");
//
//    print("Party cost: ");
//    print(1000);
//    print(" rub");
//}

//fun main(args: Array<String>) {
//    print("Enter text: ")
//
//    val stringInput = readLine()!!
//    println("You entered: $stringInput")
//}



//import java.util.Scanner
//
//fun main(args: Array<String>) {
//
//    // Creates an instance which takes input from standard input (keyboard)
//    val reader = Scanner(System.`in`)
//    print("Enter a number: ")
//
//    // nextInt() reads the next integer from the keyboard
//    var integer:Int = reader.nextInt()
//
//    println("You entered: $integer")
//}

//import kotlinx.coroutines.*
//
//suspend fun main() {                                // A function that can be suspended and resumed later
//    val start = System.currentTimeMillis()
//    coroutineScope {                                // Create a scope for starting coroutines
//        for (i in 1..10) {
//            launch {                                // Start 10 concurrent tasks
//                delay(3000L - i * 300)              // Pause their execution
//                log(start, "Countdown: $i")
//            }
//        }
//    }
//    // Execution continues when all coroutines in the scope have finished
//    log(start, "Liftoff!")
//}
//
//fun log(start: Long, msg: String) {
//    println("$msg " +
//            "(on ${Thread.currentThread().name}) " +
//            "after ${(System.currentTimeMillis() - start)/1000F}s")
//}

//fun main(){
//    val lang = "Kotlin"
//    println(lang)
//
//    var dayOfWeek = "Monday"
//    println(dayOfWeek) // prints Monday
//
//    dayOfWeek = "Tuesday"
//    println(dayOfWeek) // prints Tuesday
//
//    val cost = 3
//    val costOfCoffee = cost
//    println(costOfCoffee) // prints 3
//}

//fun main(){
//    val myMutableList = mutableListOf<Int>(1,2,3,4,5)
//    println(myMutableList)
//    myMutableList.add(6)
//    println(myMutableList)
//
////    val read = readln()
////    println(read)
//
//    val text: String = "Hello, I am studying Kotlin now."
//    val n: Int = 1
//    println(text)
//    println(n)
//
//    for(i in 0..5){
//        for (j in 0..i){
//            print("#")
//        }
//        println()
//    }
//
//    val result = println("text")
//    println(result) // kotlin.Unit
//
//    val (a, b) = readln().split(' ')
//    println(a.toInt())
//    println(b.toInt())
//
//}

//import java.util.Scanner
//
//fun main(){
//    val sc = Scanner(System.`in`)
//
//    val line = sc.nextLine() // read a whole line, i.e. "Hello, Kotlin"
//    val num = sc.nextInt()   // read a number, i.e. 123
//    val string = sc.next()   // read a string, i.e. "Hello"
//
//    println(line)
//    println(num)
//    println(string)
//}

//import kotlin.math.*
//
//fun main(){
//    val num: Int = 100
//    val res: Double = sqrt(num.toDouble())
//    println(res)
//
//    val n1: Int = 125
//    println(n1)
//    val n2: Char = n1.toChar()
//    println(n2)
//    val n3: Int = n2.code
//    println(n3)
//    val s1: String = n2.toString()
//    println(s1)
//    val n = 8
//    val s2: String = n.toString()
//    println(s2)
//}

//fun main(){
//    for (i in 0..200) {
//        val n: Char = i.toChar()
//        print(i)
//        print(" ")
//        print(n)
//        println()
//    }
//}

//fun main(){
//    print("hello!".repeat(3))
//
//    val largeString = """
//    This is the house that Jack built.
//
//    This is the malt that lay in the house that Jack built.
//
//    This is the rat that ate the malt
//    That lay in the house that Jack built.
//
//    This is the cat
//    That killed the rat that ate the malt
//    That lay in the house that Jack built.
//""".trimIndent() // removes the first and the last lines and trim indents
//    print(largeString)
//
//    println("99" + "" + "99")  // 1
////    println("9"*4)             // 2
//    println("" + 9999)         // 3
//    println("9".repeat(4))     // 4
//}

//fun main() {
////    val s: String = "I'm learning Kotlin!"
////    for (i in 0..5){
////        println(s)
////    }
//
////    val (a, b) = readln().split(" ")
////    println(a)
////    println(b)
//
////    val (a, b, c, d) = readln().split(" ")
////    println(a)
////    println(b)
////    println(c)
////    println(d)
////
//
////    val a = readln().toDouble()
////    println(a)
//
//    val b0: Byte = 2
//    val s0: Short = 10
//    val n0: Int = 5
//    val l0: Long = 14
//    val f0: Float = 11.4f
//
////    val b: Byte = 5                 //1
////    val s: Short = 2 + b0           //2
////    val n: Int = s0.toByte() + 2    //3
////    val l: Long = n0 + 4            //4
////    val f: Float = l0.toFloat() + 1 //5
////    val d: Double = f0 / 1          //6
////
////    val b1: Byte = 5         // Line 1
////    val b2: Byte = 2 + 3     // Line 2
////    val s1: Short = 2 + b1   // Line 3
////    val s2: Short = 10 + 3L  // Line 4
//
//    val a: Byte = 100
//    val e: Byte = 200.toByte()
//    println(e)
//}

//fun main() {
//    //val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
//
////    val secinmin = 60
////    val secinhour = 60 * 60
////    val secinday = 60 * 60 * 24
////    val secinmonth = 60* 60 * 24 * 30
////    val secinyear = 60* 60 * 24 * 30 * 365
////    val secin52years = 60 * 60 * 24 * 30 * 365 * 51
//
//    val t1 = 19273 * 86400
//    println(t1)
//    val totalSeconds = 1665259540
//    val temp = totalSeconds - t1
//    val hours = temp / 60 / 60
//    val minutes = temp / 60 % 60
//    val seconds  = minutes % 60
//
//    print(hours)
//    print(":")
//    print(minutes)
//    print(":")
//    print(seconds)
//}

//fun main() {
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//
//    val res = (a + b == 20) || (b + c == 20) || (a + c == 20)
//    print(res)
//}

//fun main() {
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//
//    var res = (a <=c && a >= b) || (a <=b && a >= c)
//    println(res)
//}

//fun main() {
//
//    val ch = 'a'
//    println(ch.code)   // 97
//    val num = 97
//    println(num.toChar()) // a
//}

//fun main() {
//    val ch = readln().first()
//    val isDigit = ch >= '\u0030' && ch <= '\u0039'
//
//    println(isDigit)
//}

//fun main() {
//    val a = readln().first()
//    val b = readln().first()
//    val c = readln().first()
//
//    val aa = a.code
//    val bb = b.code
//    val cc = c.code
//
//    val result: Boolean = aa + 1  == bb && aa + 2 == cc
//    println(result)
//
//}

//fun main() {
//    val a = readln().first()
//    val b = readln().first()
//
//    val aa = a.lowercase().first().code
//    val bb = b.lowercase().first().code
////
////    println(aa)
////    println(bb)
//
//    val result: Boolean = aa == bb
//    println(result)
//
//}

//fun main(){
//    val numbers = mutableListOf(10.8, 14.3, 13.5, 12.1, 9.7)
//    println(numbers) // [10.8, 14.3, 13.5, 12.1, 9.7]
//
//    val mutableListA = mutableListOf<Int>(1, 2, 3, 4, 3)
//    println(mutableListA)
//
//    val mutableListB = mutableListOf<String>("Kotlin", "JetBrains")
//    println(mutableListB)
//
//    val mutableListC = mutableListOf<Boolean>(true, false)
//    println("Empty list $mutableListC")
//
//    val list = MutableList(5) { 12 }
//    println(list) // [12, 12, 12, 12, 12]
//    println(list.size)
//
//    //лимит на ввод в 5 чисел:
//    val newnumbers = MutableList(5) { readln().toInt() } // on each line single numbers from 1 to 5
//    println(newnumbers) // [1, 2, 3, 4, 5]
//
//    //If you want to read a list in a single line, use the following approach. You can read the list with the readln() function. You’ll get a string, which you should split.
//    //
//    //// here we have an input string "1 2 3 4 5"
//
//    //Нет лимита на ввод чисел:
//    val linenumber = readln().split(" ").map { it.toInt() }.toMutableList()
//    println(linenumber) // [1, 2, 3, 4, 5]
//}

//fun main(){
//    val regex = "\\s+".toRegex()  // 1 or more whitespace character (space, tabs etc.)
//    val str = "1 2\t\t3  4\t5  6"
//    val nums = str.split(regex).map { it.toInt() }.toMutableList()
//    println(nums) // [1, 2, 3, 4, 5, 6] - список, а не строка.
//    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6   //(превратили список в строку)
//
//}

//fun main() {
//    val numbers = mutableListOf(0, 0, 0) // numbers: 0, 0, 0
//
//    numbers[0] = 1 // numbers: 1, 0, 0
//    numbers[1] = 2 // numbers: 1, 2, 0
//    numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3
//
//    println(numbers[0]) // 1, the first element
//    println(numbers[2]) // 3, the last element
//
//    val alphabet = mutableListOf('a', 'b', 'c', 'd')
//
//    val last = alphabet[alphabet.size - 1]    // 'd'
//    val prelast = alphabet[alphabet.size - 2] // 'c'
//    println(last)
//    println(prelast)
//}
//
//fun main() {
//    val numbers = MutableList(101){0}
//
//    numbers[1] = 1
//    numbers[10] = 10
//    numbers[100] = 100
//
//    // do not touch the lines below
//    println(numbers.joinToString())
//}


//const val camel = """Switching on the camera in the camel habitat...
// ___.-''''-.
///___  @    |
//',,,,.     |         _.'''''''._
//     '     |        /           \
//     |     \    _.-'             \
//     |      '.-'                  '-.
//     |                               ',
//     |                                '',
//      ',,-,                           ':;
//           ',,| ;,,                 ,' ;;
//              ! ; !'',,,',',,,,'!  ;   ;:
//             : ;  ! !       ! ! ;  ;   :;
//             ; ;   ! !      ! !  ; ;   ;,
//            ; ;    ! !     ! !   ; ;
//            ; ;    ! !    ! !     ; ;
//           ;,,      !,!   !,!     ;,;
//           /_I      L_I   L_I     /_I
//Look at that! Our little camel is sunbathing!"""
//
//const val lion = """Switching on the camera in the lion habitat...
//                                               ,w.
//                                             ,YWMMw  ,M  ,
//                        _.---.._   __..---._.'MMMMMw,wMWmW,
//                   _.-""        '''           YP"WMMMMMMMMMb,
//                .-' __.'                   .'     MMMMW^WMMMM;
//    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
// ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
//,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
//WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
//"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
//           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
//          /  .'             /  (       .'  /     Ww._     `.  `"
//         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
//        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
//The lion is roaring!"""
//
//const val deer = """Switching on the camera in the deer habitat...
//   /|       |\
//`__\\       //__'
//   ||      ||
// \__`\     |'__/
//   `_\\   //_'
//   _.,:---;,._
//   \_:     :_/
//     |@. .@|
//     |     |
//     ,\.-./ \
//     ;;`-'   `---__________-----.-.
//     ;;;                         \_\
//     ';;;                         |
//      ;    |                      ;
//       \   \     \        |      /
//        \_, \    /        \     |\
//          |';|  |,,,,,,,,/ \    \ \_
//          |  |  |           \   /   |
//          \  \  |           |  / \  |
//           | || |           | |   | |
//           | || |           | |   | |
//           | || |           | |   | |
//           |_||_|           |_|   |_|
//          /_//_/           /_/   /_/
//Our 'Bambi' looks hungry. Let's go to feed it!"""
//
//const val goose = """Switching on the camera in the goose habitat...
//
//                                    _
//                                ,-"" "".
//                              ,'  ____  `.
//                            ,'  ,'    `.  `._
//   (`.         _..--.._   ,'  ,'        \    \
//  (`-.\    .-""        ""'   /          (  d _b
// (`._  `-"" ,._             (            `-(   \
// <_  `     (  <`<            \              `-._\
//  <`-       (__< <           :
//   (__        (_<_<          ;
//    `------------------------------------------
//The goose is staring intently at you... Maybe it's time to change the channel?"""
//
//const val bat = """Switching on the camera in the bat habitat...
//_________________               _________________
// ~-.              \  |\___/|  /              .-~
//     ~-.           \ / o o \ /           .-~
//        >           \\  W  //           <
//       /             /~---~\             \
//      /_            |       |            _\
//         ~-.        |       |        .-~
//            ;        \     /        i
//           /___      /\   /\      ___\
//                ~-. /  \_/  \ .-~
//                   V         V
//This bat looks like it's doing fine."""
//
//const val rabbit = """Switching on the camera in the rabbit habitat...
//         ,
//        /|      __
//       / |   ,-~ /
//      Y :|  //  /
//      | jj /( .^
//      >-"~"-v"
//     /       Y
//    jo  o    |
//   ( ~T~     j
//    >._-' _./
//   /   "~"  |
//  Y     _,  |
// /| ;-"~ _  l
/// l/ ,-"~    \
//\//\/      .- \
// Y        /    Y
// l       I     !
// ]\      _\    /"\
//(" ~----( ~   Y.  )
//It looks like we will soon have more rabbits!"""

//fun main() {
//    val animals = mutableListOf<String>(camel, lion, deer, goose, bat, rabbit)
//    print("Please enter the number of the habitat you would like to view: > ")
//    val index = readln().toInt()
//    println(animals[index])
//    println ("""---
//You've reached the end of the program. To check another habitat, please restart the watcher.""")
//}

//fun main(){
//    val (a, b, c) = readln().split(' ')
//    val (d, e, f) = readln().split(' ')
//
//    println("$a:$b:$c $d/$e/$f")
//}


//fun main() {
//    //val word = readln()
//
//    val word = "word"
//    val len = word.length
//
//    //println(len)
//    println("$len repetitions of the word seasons: ${word.repeat(len)}")
//}


//fun main() {
//    val word = readln()
//    val len = word.length
//    println("$len repetitions of the word seasons: ${word.repeat(len)}")
//}

//fun main() {
//    val age = readln().toInt() // an integer value
//    if (age > 100) {
//        println("Very experienced person")
//    }
//
//    val num = readln().toInt() // the num is initialized by some value (Int)
//
//    if (num % 2 == 0) {
//        println("It's an even number")
//    } else {
//        println("It's an odd number")
//    }
//
//    val dollars = readln().toInt() // your budget (Int)
//
//    if (dollars < 1000) {
//        println("Buy a laptop")
//    } else if (dollars < 2000) {
//        println("Buy a personal computer")
//    } else if (dollars < 100_000) {
//        println("Buy a server")
//    } else {
//        println("Buy a data center or a quantum computer")
//    }
//}


//fun main(){
//    val a = 10
//    val b = 9
//
//    val max = if (a > b) {
//        println("Choose a")
//        a
//        } else {
//        println("Choose b")
//        b
//        }
//    println(max)
//}

//or
// val max = if (a > b) a else b

//val max = if (a > b) a else b // one line
//...
//var max = a // try to avoid var if possible
//if (b > a) max = b

//fun main(){
//    println(if (true)
//            {
//                if (false) { "A" } else "B"
//            }
//            else {"no"})
//    }


//import kotlin.math.*
//fun main(){
//    val linenumber = readln().split(",").map { it.toInt() }.toMutableList()
//    println(linenumber)
//
//    var b = "NO"
//    if (linenumber[0] == linenumber[2] || linenumber[1] == linenumber[3] )
//        {b = "YES"}
//    else
//    {
//        if (Math.abs(linenumber[0] - linenumber[2]) == Math.abs(linenumber[1] - linenumber[3])){b="YES"}
//        else {b = "NO"}
//    }
//    println(b)
//}


//fun main() {
//    repeat(3) {
//        println(it) //или мы может тут ввставить строку и она тогда повторится несколько раз
//    }
//}

//fun main() {
//    val n = readln().toInt()
//    var sum = 0
//
//    repeat(n) {
//        val next = readln().toInt()
//        sum += next
//    }
//
//    println(sum)
//}

//fun main() {
//    val count = readln().toInt()
//
//    var counta:Int = 0
//    var countb:Int = 0
//    var countc:Int = 0
//    var countd:Int = 0
//
//
//    repeat(count){
//        var a = readln().toInt()
//        if (a == 2) { countd += 1}
//        else if (a == 3) { countc += 1}
//        else if (a == 4) { countb += 1}
//        else if (a == 5) { counta += 1}
//
//    }
//
//    println("$countd $countc $countb $counta")
//}

//fun main() {
//    var letter = 'A'
//
//    while (letter <= 'Z') {
//        print(letter)
//        letter++
//    }
//}


//import java.util.*
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    while (scanner.hasNext()) {
//        val next = scanner.next()
//        println(next)
//    }
//}
//Use scanner.hasNext() for strings and scanner.hasNextInt() for integers
// when you do not know the size of your input data. Note that you can stop
// input in the console in IDEA by pressing Ctrl+D.


//fun main() {
//    do {
//        val n = readln().toInt()
//        println(n)
//    } while (n > 0)
//}


////balance
//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    var balance = readln().toInt()
//    var next = 0
//    while (scanner.hasNextInt()) {
//        next = scanner.next().toInt()
//        balance -= next
//    }
//    if (balance < 0) {
//        println("Error, insufficient funds for the purchase. Your balance is ${balance + next}, but you need $next.")}
//    else if (balance == 0 || balance > 0){
//        println("Thank you for choosing us to manage your account! Your balance is $balance.")}
//
//}


//import java.util.*
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    var sum = 0
//    var next = 0
//    while (scanner.hasNext()) {
//        next = scanner.next().toInt()
//        if (next !=0){
//            sum += next
//        }
//        else{ break }
//     }
//    println(sum)
//}

//fun main() {
//    val myMutableList = mutableListOf<Int>()
//    val num = readln().toInt()
//    var count = 0
//    for (i in 1..num)
//    {
//        for (j in 1..i)
//        {
//            if (count == num)
//            {
//                break
//            }
//            print("$i ")
//            count++
//        }
//
//    }
//}


//fun main(){
//    val n = readln().toInt()
//    var temp: Int = n
//
//    while (temp != 1) {
//        if (temp % 2 == 0)
//        {
//            temp = temp / 2
//            print("$temp ")
//        }
//        else
//        {
//            temp = temp * 3 + 1
//            print("$temp ")
//        }
//    }
//}


const val camel = """Switching on the camera in the camel habitat...
 ___.-''''-.
/___  @    |
',,,,.     |         _.'''''''._
     '     |        /           \
     |     \    _.-'             \
     |      '.-'                  '-.
     |                               ',
     |                                '',
      ',,-,                           ':;
           ',,| ;,,                 ,' ;;
              ! ; !'',,,',',,,,'!  ;   ;:
             : ;  ! !       ! ! ;  ;   :;
             ; ;   ! !      ! !  ; ;   ;,
            ; ;    ! !     ! !   ; ;
            ; ;    ! !    ! !     ; ;
           ;,,      !,!   !,!     ;,;
           /_I      L_I   L_I     /_I
Look at that! Our little camel is sunbathing!"""

const val lion = """Switching on the camera in the lion habitat...
                                               ,w.
                                             ,YWMMw  ,M  ,
                        _.---.._   __..---._.'MMMMMw,wMWmW,
                   _.-""        '''           YP"WMMMMMMMMMb,
                .-' __.'                   .'     MMMMW^WMMMM;
    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
          /  .'             /  (       .'  /     Ww._     `.  `"
         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
The lion is roaring!"""

const val deer = """Switching on the camera in the deer habitat...
   /|       |\
`__\\       //__'
   ||      ||
 \__`\     |'__/
   `_\\   //_'
   _.,:---;,._
   \_:     :_/
     |@. .@|
     |     |
     ,\.-./ \
     ;;`-'   `---__________-----.-.
     ;;;                         \_\
     ';;;                         |
      ;    |                      ;
       \   \     \        |      /
        \_, \    /        \     |\
          |';|  |,,,,,,,,/ \    \ \_
          |  |  |           \   /   |
          \  \  |           |  / \  |
           | || |           | |   | |
           | || |           | |   | |
           | || |           | |   | |
           |_||_|           |_|   |_|
          /_//_/           /_/   /_/
Our 'Bambi' looks hungry. Let's go to feed it!"""

const val goose = """Switching on the camera in the goose habitat...

                                    _
                                ,-"" "".
                              ,'  ____  `.
                            ,'  ,'    `.  `._
   (`.         _..--.._   ,'  ,'        \    \
  (`-.\    .-""        ""'   /          (  d _b
 (`._  `-"" ,._             (            `-(   \
 <_  `     (  <`<            \              `-._\
  <`-       (__< <           :
   (__        (_<_<          ;
    `------------------------------------------
The goose is staring intently at you... Maybe it's time to change the channel?"""

const val bat = """Switching on the camera in the bat habitat...
_________________               _________________
 ~-.              \  |\___/|  /              .-~
     ~-.           \ / o o \ /           .-~
        >           \\  W  //           <
       /             /~---~\             \
      /_            |       |            _\
         ~-.        |       |        .-~
            ;        \     /        i
           /___      /\   /\      ___\
                ~-. /  \_/  \ .-~
                   V         V
This bat looks like it's doing fine."""

const val rabbit = """Switching on the camera in the rabbit habitat...
         ,
        /|      __
       / |   ,-~ /
      Y :|  //  /
      | jj /( .^
      >-"~"-v"
     /       Y
    jo  o    |
   ( ~T~     j
    >._-' _./
   /   "~"  |
  Y     _,  |
 /| ;-"~ _  l
/ l/ ,-"~    \
\//\/      .- \
 Y        /    Y
 l       I     !
 ]\      _\    /"\
(" ~----( ~   Y.  )
It looks like we will soon have more rabbits!"""

fun main() {
    var index = ""
    while (index != "exit" ) {
        val animals = mutableListOf<String>(camel, lion, deer, goose, bat, rabbit)
        print("Please enter the number of the habitat you would like to view: > ")
        index = readln()
        if (index == "exit") {
            println("See you later!")
            break}
        println(animals[index.toInt()])
        println(
            """---
You've reached the end of the program. To check another habitat, please restart the watcher."""
        )
    }
}