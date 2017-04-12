class Dog(val name : String) extends Animal with Friend {
  override def listen() = println(s"$name is listening quietly.")
}
