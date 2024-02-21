fun main(){

  println("Welcome to your banking system. ")
  println("What type of account you would like to create ? ")
  println("1. Debit account")
  println("2. Credit account") 
  println("3. Checking account")  
  println("Choose an option 1, 2 or 3.")

  var userChoice : Int = readln().toInt()
   
  println("The selected option is $userChoice, ")

  var accountType = when (userChoice){
    1 -> "Debit account"
    2 -> "Credit account"
    3 -> "Checking account"

    else -> continue
  }
  
  println("You have created a $accountType.")
  
}
