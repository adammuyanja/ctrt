int[] pm25Levels = new int[30];
int day = 0;
while (day < 30) {
    pm25Levels[day] = getPM25Level(day);
