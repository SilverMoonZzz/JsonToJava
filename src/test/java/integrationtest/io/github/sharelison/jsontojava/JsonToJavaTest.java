package integrationtest.io.github.sharelison.jsontojava;

import io.github.sharelison.jsontojava.JsonToJava;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToJavaTest {

    public static final String TEST_JSON = "src/test/resources/integrationtest/test.json";
    public static final String PACKAGE_NAME = "integrationtest";
    public static final String OBJECT_NAME = "Person";
    public static final String ACTUAL_OUTPUT = "src/test/resources/integrationtest/actual";
    public static final String EXPECTED_PERSON = "src/test/resources/integrationtest/expected/Person.java";
    public static final String ACTUAL_PERSON = "src/test/resources/integrationtest/actual/Person.java";
    public static final String EXPECTED_CHILDREN = "src/test/resources/integrationtest/expected/Children.java";
    public static final String ACTUAL_CHILDREN = "src/test/resources/integrationtest/actual/Children.java";
    public static final String EXPECTED_PARTNER = "src/test/resources/integrationtest/expected/Partner.java";
    public static final String ACTUAL_PARTNER = "src/test/resources/integrationtest/actual/Partner.java";
    public static final String EXPECTED_DOG= "src/test/resources/integrationtest/expected/Dog.java";
    public static final String ACTUAL_DOG = "src/test/resources/integrationtest/actual/Dog.java";
    public static final String EXPECTED_PP= "src/test/resources/integrationtest/expected/Pp.java";
    public static final String ACTUAL_PP = "src/test/resources/integrationtest/actual/Pp.java";

    @Test
    public void testExpectedPersonJavaFile() throws IOException {
        JsonToJava jsonToJava = new JsonToJava();

        jsonToJava.jsonToJava(TEST_JSON, OBJECT_NAME, PACKAGE_NAME, ACTUAL_OUTPUT);

        Assert.assertEquals(Files.readAllLines(Paths.get(EXPECTED_PERSON)), Files.readAllLines(Paths.get(ACTUAL_PERSON)));
        Assert.assertEquals(Files.readAllLines(Paths.get(EXPECTED_CHILDREN)), Files.readAllLines(Paths.get(ACTUAL_CHILDREN)));
        Assert.assertEquals(Files.readAllLines(Paths.get(EXPECTED_PARTNER)), Files.readAllLines(Paths.get(ACTUAL_PARTNER)));
        Assert.assertEquals(Files.readAllLines(Paths.get(EXPECTED_DOG)), Files.readAllLines(Paths.get(ACTUAL_DOG)));
        Assert.assertEquals(Files.readAllLines(Paths.get(EXPECTED_PP)), Files.readAllLines(Paths.get(ACTUAL_PP)));
    }

    @After
    public void clearActualOutput() throws IOException {
        Files.delete(Paths.get(ACTUAL_PERSON));
        Files.delete(Paths.get(ACTUAL_CHILDREN));
        Files.delete(Paths.get(ACTUAL_PARTNER));
        Files.delete(Paths.get(ACTUAL_DOG));
        Files.delete(Paths.get(ACTUAL_PP));
    }
}
