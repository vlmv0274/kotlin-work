package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {

    var overdraft: Int = 0 //default0
        set(value) {
            require(value in 0..MAX_OVERDRAFT) {
                "Overdraft must be an amount from 0 to $MAX_OVERDRAFT"
            }
            field = value
        }
    override fun withdraw(amount: Int) {
        require(amount > 0) {
            "Withdrawal amount must be greater than 0"
        }
        require(balance - amount >= -overdraft) {
            "Insufficient funds for withdrawal"
        }
        balance -= amount
    }
    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }
    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
//singleton
    companion object {
        const val MAX_OVERDRAFT = 100
    }
}
