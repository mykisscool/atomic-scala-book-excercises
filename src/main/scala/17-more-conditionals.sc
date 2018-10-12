import com.atomicscala.AtomicTest._

def isPalindrome(word: String): Boolean = {
  if (word == word.reverse) true else false
}

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false

/* Next excercise ... */

def isPalIgnoreCase(word: String): Boolean = {
  if (word.toLowerCase == word.reverse.toLowerCase()) {
    true
  }
  else {
    false
  }
}

isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false

/* Next excercise ... */

def isPalIgnoreSpecial(word: String): Boolean = {

  var reg: String = ""
  var rev: String = ""

  for(i <- word.toLowerCase()) {
    val v: Int = i.toInt

    if (v >= 97 && v <= 122) {
      reg += i
    }
  }

  for(i <- word.toLowerCase().reverse) {
    val v: Int = i.toInt

    if (v >= 97 && v <= 122) {
      rev += i
    }
  }

  reg.equals(rev)
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
