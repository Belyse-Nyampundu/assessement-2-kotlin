fun main(){
    var results=fruitName("banana")
    println(results)

    var currentAmount=CurrentAccount(222164,"Nyampundu",20000.0)
   println( currentAmount.deposit(1000.0))
    currentAmount.balance
    println(currentAmount.withdraw(12000.0))
    currentAmount.details()
 number()
    var saving=SavingsAccount(222164,"Nyampundu",20000.0,2)
    saving. withdraw()
    saving.withdrawals
}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
data class Name(val first: Char,val second:Char,val length:Int)
fun fruitName(fruit: String):Name{

    var fruitOne=fruit.first()
    var fruittwo=fruit.last()
    var fruitThree=fruit.length
    var result=Name(fruitOne,fruittwo,fruitThree)
    return result
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun passwords(password:String):Boolean {
  if(password.length==8||password.length==16){
      println("true")
  }else if (password=="password"){
      return false
  }
}


//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”

fun number(){
for(num in 1 ..1000){
    if(num%6==0 || num%8==0){
       println("bingo")
    }else if(num%6==0){
        println(num)
    }else if(num%8==0) {
        println(num)
    }else{
        println(num)
    }
}
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

open class CurrentAccount(val accountNumber:Int,val accountName: String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance+=amount
        return balance
    }
    fun withdraw(amount:Double):Double{
        balance-=amount
        return balance
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal

class SavingsAccount( accountNumber:Int, accountName: String, balance:Double,var withdrawals: Int):CurrentAccount(accountNumber,accountName,balance) {
  fun withdraw(){

      if(withdrawals < 4){
          withdrawals ++
          println("you can withdrawal your money")

      }else{
          println("not allowed to get money")
      }
  }
}