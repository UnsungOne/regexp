package regexp;

import regexp.patterns.TaskRegexpPatterns;
import regexp.tasks.RegexpTasks;

public class AppRunner {

    public static void main(String[] args) {

        TaskRegexpPatterns taskRegexpPatterns = new TaskRegexpPatterns();

        RegexpTasks regexpTasks = new RegexpTasks();
        regexpTasks.getFirstLetterAsUppercase(taskRegexpPatterns.TASK1_PATTERN);
        regexpTasks.getCreditCardNumberPattern(taskRegexpPatterns.TASK2_PATTERN);
        regexpTasks.getDataFromString(taskRegexpPatterns.TASK3_PATTERN);
        regexpTasks.getAlphanumericValueFronString(taskRegexpPatterns.TASK10_PATTERN);
        regexpTasks.getTimeFromString(taskRegexpPatterns.TASK11_PATTERN);
        regexpTasks.getIdentityNumberPatternFromString(taskRegexpPatterns.TASK13_PATTERN);
        regexpTasks.getColorHexCodePattern(taskRegexpPatterns.TASK15_PATTERN);


    }

}
