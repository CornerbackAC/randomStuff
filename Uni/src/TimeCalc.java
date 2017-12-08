public class TimeCalc {

    public static void main(String[] args) {

        int start = 1545;
        int end = 1615;

        int startMinutes = start / 100 * 60 + start % 100;
        int endMinutes = end / 100 * 60 + end % 100;

        int finalMinutes, finalHours;

        if (endMinutes >= startMinutes) {
            finalHours = (endMinutes - startMinutes) / 60;
            finalMinutes = (endMinutes - startMinutes) % 60;
        }
        else {
            finalHours = ((24 * 60 - startMinutes) + endMinutes) / 60;
            finalMinutes = ((24 * 60 - startMinutes) + endMinutes) % 60;
        }


        System.out.println(finalHours + " Stunden");
        System.out.println(finalMinutes + " Minuten");
    }
}
