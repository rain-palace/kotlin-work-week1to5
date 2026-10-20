// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("PIZZA MENU
    \n (a) Margherita
    \n (b) Quattro Stagioni
    \n (c) Seafood
    \n (d) Hawaiian

\n\nChoose your pizza (a-d): ")

input=readln().lowercase()

if(input.length()==1 && input in a..d) {
    print("order accepted!")
}
else {
    print("invalid choice!")
}
}
