# project3
hen first approaching this problem it the information was overwhelming, but after reading through the whole assignment I was able to separate this problem into steps.

DateTimeOne.java: I started this class by declaring TreeMaps for the dateTime and hashMaps for the dateTime.


int getValueOfSecond(): this funciton uses LocalTime and gets it in seconds and returns that value.


void sleepForFiveSec(): makes the program sleep for five seconds.


void dateTimeNow(): this function uses LocalDateTime and DateTimeFormatter ("M/dd/yyyy hh:mm a") and prints out LocalDateNow


void DateTimeDifferentZone(): this function gets the date and time at the moment the program is run and then outputs the date and time for BST, GMT, and CST for those specific time zones. For later methods it inputs those values in a hash and tree map.


void dateTimeOfOtherCity(): this function uses the simpleDateFormat("hh:mm") and prints the time of GMT, CST, and BST.


void timeZoneHashMap(): this function puts the values string values dates and times of AST and ZST and puts them into the same two treeMaps and one HashMap as before and then prints them all out for Print Styles 1, 3, and 5.


DateTimeTwo.java: 


void daysOfCurrentMonth():  this function uses a switch statement to and goes through each month and depending on the current month it sets those dates to dayOfFifteen and dayOfLast which and outputs the tenth and last day of that month.


void daysOfAnyMonth(int month, int year): this functions is similar to the the daysOfCurrentMonth function by setting the last day and it prints out the fifteenth day of that year/month as well as the last day.


void compareYear(): this function goes through the Dates.txt file and reads each and calculates the difference in years, months, and days as well as determine if that input year is a leap year. It also puts those dates within the certain date and time structures putting these values inside a treeMap and HashMap.


void dateHashMap(): this function outputs the unsorted dates and times.

void dateHashMapSorted(): this function outputs the sorted dates and times.

MesoEquivalent.java: has an input string stId and sets that value and I also call function calCompare(stId) to calculate the the compare average.


calAsciiEqual(): this function reads through Mesonet.txt and puts those values that have the same average as stId ascii average and sttores them in an unsorted HashMap.


int calCompare(): calCompare takes the input string stId and calculates that value for the ascii average so it is able to compare in calAsciiEqual.


MesoAsciiEqual.java: the constructor sets station to this.station.


int calAverage(): this function uses the input station and get the average of that input station and NRMN and returns that average.


MesoLexicographical.java: this function class takes in the unsorted input Map and then sorts those keys and outputs them.
