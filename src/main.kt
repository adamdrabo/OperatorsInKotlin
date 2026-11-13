fun main() {
    // seconds converter

    val totalSeconds = 3725

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds / 60) % 60
    val seconds = totalSeconds % 60


    val message = if (hours >= 1) {
        "Long duration"
    } else if (minutes >= 30) {
        "Medium duration"
    } else {
        "Short duration"
    }

    println("$totalSeconds seconds = $hours h $minutes min $seconds s")
    println("Your journey is: $message")





}