package school.management.system;

/**
 * Created by Zander on 5/6/2019
 * This class is responsible for keeping the
 * track of students fees, name, grade & fees
 * paid
 *
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is Ksh.150,000
     * Fees paid initially is 0.
     * @param id id for student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to feesPaid Field
     * Add the fees to the fees paid
     * The school is going to receive the funds
     *
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneySpent(feesPaid);
    }

    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the Student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the students
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
   public int getRemainingFees(){
        return feesTotal-feesPaid;
   }

    @Override
    public String toString() {
        return "Student's name :" +name+
                "Total fees paid so far $"+ feesPaid;
    }
}
