package org.launchcode.techjobs.oo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job1.getName() instanceof String);
        assertEquals(job1.getName(), "Product tester");

        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getEmployer().toString(), "ACME");

        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getLocation().toString(), "Desert");

        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getPositionType().toString(), "Quality control");

        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getCoreCompetency().toString(), "Persistence");


    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//            String toStringtest = job1.toString();
//            assertEquals('\n',job1.toString().charAt(0));
//            assertEquals('\n',job1.toString().length()-1);

        int lastIndex = (job1.toString().length() - 1);
        assertEquals('\n', job1.toString().charAt(0));
        assertEquals('\n', job1.toString().charAt(lastIndex));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job1.toString(), "\nID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location " + job1.getLocation() + "\n" +
                "Position type " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n");


    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringtest = job1.toString();
        assertEquals(toStringtest, job1.toString());
    }
}
/*         assertEquals(job1.toString(),"\nID: "+ job1.getId()+"\n"+
                    "Name: "+job1.getName()+"\n"+
                   "Employer:" + job1.getName() + "\n"+
                    "Location "+job1.getLocation()+"\n"+
                    "Position type "+ job1.getPositionType()+"\n"+
                    "Core Competency: "+job1.getCoreCompetency()+"\n");
*/
