public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int red = 300;
        byte orange = 100;
        short yellow = 200;
        long green = 400000000000L;
        float blue = 1.5f;
        double violet = 15.555;
        System.out.println("Значение переменной red с типом int равно "+red);
        System.out.println("Значение переменной orange с типом byte равно "+orange);
        System.out.println("Значение переменной yellow с типом short равно "+yellow);
        System.out.println("Значение переменной green с типом long равно "+green);
        System.out.println("Значение переменной blue с типом float равно "+blue);
        System.out.println("Значение переменной violet с типом double равно "+violet);

        System.out.println("Задача 2:");
        int earth = 27897;
        byte water = 67;
        short air = -159;
        long fire = 987678965549L;
        float mountain = 27.12f;
        double cloud = 2.786;
        char wood = 569;
        boolean wind = false;
        //вывожу значения переменных на консоль так, как программа не дает возможности сделать коммит и отправить его из-за ошибки "variable 'n' is never used"
        System.out.println(earth);
        System.out.println(water);
        System.out.println(air);
        System.out.println(fire);
        System.out.println(mountain);
        System.out.println(cloud);
        System.out.println(wood);
        System.out.println(wind);

        System.out.println("Задача 3:");
        int numberOfStudentsInClass1 = 23;
        int numberOfStudentsInClass2 = 27;
        int numberOfStudentsInClass3 = 30;
        int numberOfSheetsOfPeper = 480;
        int totalNumbersOfStudents = numberOfStudentsInClass1+numberOfStudentsInClass2+numberOfStudentsInClass3;
        System.out.println("На каждого ученика рассчитано "+(numberOfSheetsOfPeper/totalNumbersOfStudents)+" листов бумаги");

        System.out.println("Задача 4:");
        int machineOutputPerMinute = 8;
        int timeInterval1 = 20;
        int timeInterval2 = 24*60;
        int timeInterval3 = timeInterval2*3;
        int timeInterval4 = timeInterval2*30;
        System.out.println("За 20 минут работы машина произвела бутылок "+(machineOutputPerMinute*timeInterval1)+" штук");
        System.out.println("За сутки работы машина произвела бутылок "+(machineOutputPerMinute*timeInterval2)+" штук");
        System.out.println("За 3 дня работы машина произвела бутылок "+(machineOutputPerMinute*timeInterval3)+" штук");
        System.out.println("За 1 месяц работы машина произвела бутылок "+(machineOutputPerMinute*timeInterval4)+" штук");

        System.out.println("Задача 5:");
        int totalNumberOfPaintCans = 120;
        int numberOfCansOfWhitePaintPerRoom = 2;
        int numberOfCansOfBrownPaintPerRoom = 4;
        int numberOfClassesInTheSchool = totalNumberOfPaintCans/(numberOfCansOfWhitePaintPerRoom+numberOfCansOfBrownPaintPerRoom);
        System.out.println("В школе, где "+numberOfClassesInTheSchool+" классов, нужно "+(numberOfClassesInTheSchool*numberOfCansOfWhitePaintPerRoom)+" банок белой краски и "+(numberOfClassesInTheSchool*numberOfCansOfBrownPaintPerRoom)+" банок коричневой краски");

        System.out.println("Задача 6:");
        int numberOfBananas = 5;
        int iceCreamQuantity = 2;
        int numberOfEggs = 4;
        int bananaWeightGr = 80;
        int milkWeightGr = 105;
        int iceCreamWeightGr = 100;
        int eggWeightGr = 70;
        int totalWeightOfBananas = numberOfBananas*bananaWeightGr;
        int totalWeightOfMilk = milkWeightGr*2;
        int totalWeightOfIceCream = iceCreamQuantity*iceCreamWeightGr;
        int totalWeightOfEggs = numberOfEggs*eggWeightGr;
        int productsWeightGr = totalWeightOfBananas+totalWeightOfMilk+totalWeightOfIceCream+totalWeightOfEggs;
        int grPerKg = 1000;
        float productsWeightKg = productsWeightGr/(float)grPerKg;
        System.out.println(productsWeightKg);

        System.out.println("Задача 7:");
        int excessWeight = 7*1000;
        int weight1LossPerDay = 250;
        int weight2LossPerDay = 500;
        int weight3LossPerDay = (weight1LossPerDay+weight2LossPerDay)/2;
        System.out.println(excessWeight/weight1LossPerDay);
        System.out.println(excessWeight/weight2LossPerDay);
        System.out.println(excessWeight/weight3LossPerDay);

        System.out.println("Задача 8:");
        int zp1Masha = 67760;
        int zp1Denis = 83690;
        int zp1Kristina = 76230;
        int zp2Masha = (67760*110)/100;
        int zp2Denis = (83690*110)/100;
        int zp2Kristina = (76230*110)/100;
        int incomeDifferenceMasha = ((zp2Masha*12)-(zp1Masha*12));
        int incomeDifferenceDenis = ((zp2Denis*12)-(zp1Denis*12));
        int incomeDifferenceKristina = ((zp2Kristina*12)-(zp1Kristina*12));
        System.out.println("Маша теперь получает "+zp2Masha+" рублей. Годовой доход вырос на "+incomeDifferenceMasha+" рублей");
        System.out.println("Денис теперь получает "+zp2Denis+" рублей. Годовой доход вырос на "+incomeDifferenceDenis+" рублей");
        System.out.println("Кристина теперь получает "+zp2Kristina+" рублей. Годовой доход вырос на "+incomeDifferenceKristina+" рублей");

    }
}