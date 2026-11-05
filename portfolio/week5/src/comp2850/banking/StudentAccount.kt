package comp2850.banking

class StudentAccount(holder: String): BankAccount(holder) {
    var overdraft=0
        set(value) {
            if(value !in 0..100) {
                throw IllegalArgumentException("Overdraft value must be between 0 and 100")
            }
            field=value
        }

    override fun withdraw(amount: Int) {
        require(amount>0) {"Withdrawal amount must be greater than 0"}

        require(balance-amount>=-overdraft) {"Insufficient funds for withdrawal"}
        balance-=amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance>-overdraft
    }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}