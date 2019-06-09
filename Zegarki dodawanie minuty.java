import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

class Kodilla {
    public static void main(String[] args) {
        class Clock {
            private LocalTime currentTime;

            public Clock() {
                this.currentTime = LocalTime.now();
            }

            public void addMinutes(long min) {
                currentTime = currentTime.plusMinutes(min);
            }

            public void showTime() {
                System.out.println(currentTime);
            }
        }

        LinkedList<Clock> theClockList = new LinkedList<>();

        for (int n = 0; n < 5; n++) {
            theClockList.add(new Clock());
        }

        for (Clock theClock : theClockList) {
            System.out.print("Clock_" + theClockList.indexOf(theClock) + ":   ");
            theClock.showTime();
        }
        System.out.print("The Clocks after changing time:" + "\n");
        for (Clock theClock : theClockList) {
            System.out.print("Clock_" + theClockList.indexOf(theClock) + ":   ");
            theClock.addMinutes(1);
            theClock.showTime();
        }
    }
}