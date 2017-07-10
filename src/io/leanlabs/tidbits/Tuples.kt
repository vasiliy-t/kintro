package io.leanlabs.tidbits

fun capitalsAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 230000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 230000)
}

data class Customer(val id: Int, val name: String)

fun createCustomer(): Customer {
    return Customer(1, "v")
}

fun main(args: Array<String>) {
    val result = capitalsAndPopulation("Spain")
    println(result.first)
    println(result.second)

    // values could be deconstructed
    val (capital, population) = capitalsAndPopulation("Spain")
    println("$capital, $population")

    val countryInfo = countryInformation("Spain")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    // deconstruction takes properties in declaration order
    val (id, name) = createCustomer()
    println("customer: $id, $name")

    val listOfCapitalsAndCountries = listOf(Pair("Moscow", "Russia"), "London" to "UK")

    for ((capital, country) in listOfCapitalsAndCountries) {
        println("$capital, $country")
    }
}