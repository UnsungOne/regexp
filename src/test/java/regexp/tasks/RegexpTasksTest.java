package regexp.tasks;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import regexp.patterns.TaskRegexpPatterns;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class RegexpTasksTest {

    private TaskRegexpPatterns taskRegexpPatterns;
    private RegexpTasks regexpTasks;


    @Before
    public void setup() {

        taskRegexpPatterns = new TaskRegexpPatterns();
        regexpTasks = new RegexpTasks();

    }

    @Test
    public void testIfPatternReturnsIdentityNumber() {

//        Pattern pattern = taskRegexpPatterns.TASK13_PATTERN;
//        String testedValue = "96050516577";
//        boolean actualValue = regexpTasks.getIdentityNumberPatternFromString(testedValue);
//        Assertions.assertTrue(actualValue.);
    }

}