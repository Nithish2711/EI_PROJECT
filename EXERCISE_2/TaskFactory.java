public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        if (!isValidTime(startTime) || !isValidTime(endTime)) {
            throw new IllegalArgumentException("Error: Invalid time format.");
        }
        return new Task(description, startTime, endTime, priority);
    }

    private static boolean isValidTime(String time) {
        if (time == null || time.length() != 5 || time.charAt(2) != ':') {
            return false;
        }
        try {
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3, 5));
            return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

