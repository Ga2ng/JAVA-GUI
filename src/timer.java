// import java.util.Timer;
// import java.util.TimerTask;

// public class timer {
//     public static void main(String[] args) {
//         int countdownSeconds = 3675; // Change this to the desired countdown time in seconds

//         Timer timer = new Timer();
//         TimerTask task = new TimerTask() {
//             int totalSeconds = countdownSeconds;

//             @Override
//             public void run() {
//                 int hours = totalSeconds / 3600;
//                 int minutes = (totalSeconds % 3600) / 60;
//                 int seconds = totalSeconds % 60;

//                 if (totalSeconds > 0) {
//                     System.out.format("%02d:%02d:%02d%n", hours, minutes, seconds);
//                     totalSeconds--;
//                 } else {
//                     System.out.println("Time's up!");
//                     timer.cancel();
//                 }
//             }
//         };

//         timer.scheduleAtFixedRate(task, 0, 1000); // Schedule the task to run every second
//     }
// }
