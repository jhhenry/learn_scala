def getPersoneInfo() = {
  ("Venkat", "Sumramian", "venkats@agiledeveloper.com")
}
val (firstName, lastName, emailAddress) = getPersoneInfo()
println(s"FirstName: $firstName")
println(s"LastName: $lastName")
println(s"Email: $emailAddress")
