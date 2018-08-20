import models.Cohort;
import models.Pairing;
import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;


public class CohortController {

    private static Cohort cohort;


    public static void main(String[] args) {

        VelocityTemplateEngine vte = new VelocityTemplateEngine();


        get("/random", (req, res) -> {
            CohortController.makeCohort();
            String studentName = cohort.getRandomStudent().getName();
            Map<String, Object> model = new HashMap<>();
            model.put("studentName", studentName);
            return new ModelAndView(model, "randomStudent.vtl");
        }, vte);

        get("/pair", (req, res) -> {
            CohortController.makeCohort();
            List<Student> students = cohort.getPair();
            Map<String, Object> model = new HashMap<>();
            model.put("students", students);
            return new ModelAndView(model, "randomPair.vtl");
        }, vte);

        get("/pairs", (req, res) -> {
            CohortController.makeCohort();
            List<Pairing> pairings = cohort.getPairs();
            Map<String, Object> model = new HashMap<>();
            model.put("pairings", pairings);
            return new ModelAndView(model, "randomPairings.vtl");
        }, vte);

    }

    public static void makeCohort(){
        cohort = new Cohort("E23");
        cohort.addStudent(new Student("Stuart"));
        cohort.addStudent(new Student("Euan"));
        cohort.addStudent(new Student("Mark"));
        cohort.addStudent(new Student("Tahnee"));
        cohort.addStudent(new Student("Molly"));
        cohort.addStudent(new Student("Robbie"));
        cohort.addStudent(new Student("Joanna"));
        cohort.addStudent(new Student("Vicky"));
        cohort.addStudent(new Student("Beata"));
        cohort.addStudent(new Student("Patrycja"));
        cohort.addStudent(new Student("Marcin"));
        cohort.addStudent(new Student("Garry"));
        cohort.addStudent(new Student("Gemma"));
        cohort.addStudent(new Student("Digory"));
        cohort.addStudent(new Student("Ricardo"));
        cohort.addStudent(new Student("Kirstin"));
        cohort.addStudent(new Student("Mike"));
        cohort.addStudent(new Student("Raphael"));
        cohort.addStudent(new Student("Emil"));
        cohort.addStudent(new Student("Bob"));


    }

}
