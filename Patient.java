public class Patient implements Comparable<Patient> {
    private String firstName;
    private String lastName;
    private String illness;
    private int severityLevel;

    /**
     * Creates a new Patient object.
     * @param firstName patient`s first name
     * @param lastName patient`s last name
     * @param illness the condition patient has
     * @param severityLevel an integer which is the level of severity of the illness of the patient.
     */
    public Patient(String firstName, String lastName, String illness, int severityLevel){
        setFirstName(firstName);
        setLastName(lastName);
        setCondition(illness);
        setSeverityLevel(severityLevel);
    }

    /**
     * Set the first name of the patient.
     * @param firstName the first name of the patient.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set the last name of the patient.
     * @param lastName the last name of the patient.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the illness of the patient as the string required as a parameter.
     * @param illness the string as the cause of illness.
     */
    public void setCondition(String illness) {
        this.illness = illness;
    }

    /**
     * Sets the level of severity of the illness of the patient.
     * @param severityLevel an integer which is the level of severity of the illness of the patient.
     */
    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    /**
     * Gets the first name of the patient.
     * @return Returns the first name of the patient
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the patient.
     * @return Returns the last name of the patient
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the type of illness of the current patient.
     * @return Returns the illness of the patient
     */
    public String getCondition() {
        return illness;
    }

    /**
     * Gets the patient`s illness level
     * @return Returns the illness level of the Patient
     */
    public int getSeverityLevel() {
        return severityLevel;
    }

    /*** Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param otherPatient the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Patient otherPatient) {
        return otherPatient.getSeverityLevel() - getSeverityLevel();
    }

    /**
     * Writes patient`s details.
     * @return The string with patient`s details
     */
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + ": " + getCondition() + " " + getSeverityLevel();
    }
}
