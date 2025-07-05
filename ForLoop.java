int[] pm25Levels = new int[30];
for (int day = 0; day < 30; day++) {
    pm25Levels[day] = getPM25Level(day);
    System.out.println("Day " + (day + 1) + ": " + pm25Levels[day]);
}
