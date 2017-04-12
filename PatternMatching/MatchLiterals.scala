def activity(day: String)
{
  day match {
    case "Sunday" => println("Eat, sleep, repeat...")
    case "Saturday" => println("Hang out with friends...")
    case "Monday" => print("...code for fun...")
    case "Friday" => print("...read a good book...")
  }
}

List("Monday", "Sunday", "Saturday").foreach { activity }
