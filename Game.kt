class Game {
    fun main(args: Array<Strin>) {
        val name = "Madrigal"
        var healthPoints = 89
        var isBlessed = true
        val isImmortal = false

        //Aura
        val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

        val healthStatus = formatHealthStatus(healthPoints, isBlessed)

        //player status
        printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    }

    private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) : String {
        val healthStatus = when (healthPoints) {
            100 -> "is in excellent condition!"
            in 90..99 -> "has a few scratches."
            in 75..89 -> if (isBlessed) {
                "has some minor wounds, but is healing quite quikly!"
            } else {
                "has some minor wounds."
            }
            in 15..74 -> "looks pretty hurt"
            else ->"is in awful condition!"
        }
        return healthStatus
    }
    // you can refactor the above code to using Optional single expression function syntax
    //delare the function like in below comment and remove return statement from  function body
    //private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    //      when (healthPoints) {

    private fun printPlayerStatus(auraColor: string, isBlessed: Boolean, name : String, healthStatus: String)
    {
        println("(Aura: $auraColor)" +
                "(Blessed: ${if (isBlessed)  "YES" else "NO"}) ")
        println("$name $healthStatus")
    }

    private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: boolean) : String {
        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
        val auraColor = if (auraVisible) "GREEN" else "NONE"
        return auraColor
    }

    private fun castFireball(numFireballs: Int = 2) {
        println("A glass of Fireball springs into existence. (x$numFireballs)")
    }

    fun performCombat() {
        println("You see nothing to fight!")
    }
    fun performCombat(enemyName: String) {
        println("You begin fighting $enemyName.")
    }
    fun performCombat(enemyName: String, isBlessed: Boolean) {
        if (isBlessed) {
            println("You begin fighting $enemyName. You are blessed with 2X damage!")
        } else {
            println("You begin fighting $enemyName.")
        }
    }
}