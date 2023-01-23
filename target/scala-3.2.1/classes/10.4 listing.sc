class Event {

  protected def estimateCosts(attendees: Int): Double =
    if (attendees < 10) attendees  else attendees * 12.34
}

class Party extends Event {
  private var attendees = 0
  var cost = estimateCosts()

  def register(guests: Int) =
    attendees += guests
}

val party = new Party
party.register(8)
party.cost
party.register(30)
party.cost
party.cost

