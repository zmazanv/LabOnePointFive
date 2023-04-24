import java.util.HashMap;
import java.util.Map;
class TestResults {
    private static Map<String, Integer> getOriginalGrades() {
        Map<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);
        return grades;
    }
    private static Map<String, Integer> getMakeUpGrades() {
        Map<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);
        return grades;
    }
    private static Map<String, Integer> getFinalGrades() {
        Map<String, Integer> grades = new HashMap<String, Integer>();
        if (getMakeUpGrades().keySet().containsAll(getOriginalGrades().keySet()))
            for (var key : getMakeUpGrades().keySet()) {
                if (getOriginalGrades().get(key) <= getMakeUpGrades().get(key)) {
                    grades.put(key, getMakeUpGrades().get(key));
                } else if (getOriginalGrades().get(key) > getMakeUpGrades().get(key)) {
                    grades.put(key, getOriginalGrades().get(key));
                }
            }
        return grades;
    }
    public static void main(String[] args) {
        System.out.println(getOriginalGrades());
        System.out.println();
        System.out.println(getMakeUpGrades());
        System.out.println();
        System.out.println(getFinalGrades());
    }
}