public class Main {
    public static void main(String[] args) {
        // Задача 1
        int dogsCount = 8;
        System.out.println("Значение переменной dogCount с типом int равно " + dogsCount);
        byte carsCount = 35;
        System.out.println("Значение переменной carsCount с типом byte равно " + carsCount);
        short daysCount = 7;
        System.out.println("Значение переменной daysCount с типом short равно " + daysCount);
        long leavesCount = 1200;
        System.out.println("Значение переменной leavesCount с типом long равно " + leavesCount);
        float degreesCount = 10.25F;
        System.out.println("Значение переменной degreesCount с типом float равно " + degreesCount);
        double gramsCount = 225.333;
        System.out.println("Значение переменной gramsCount с типом double равно " + gramsCount);

        // Задача 2
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

       // Задача 3
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupils = papersCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupils + " листов бумаги");
        
        // Задача 4
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + productivityPerMinute * twentyMinutes + " штук");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + productivityPerMinute * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + productivityPerMinute * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + productivityPerMinute * minutesInMonth + " штук");

        // Задача 5
        int totalPaint = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalClasses = totalPaint / (whitePaintPerClass + brownPaintPerClass);
        int totalWhitePaint = totalClasses * whitePaintPerClass;
        int totalBrownPaint = totalClasses * brownPaintPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

    }
}