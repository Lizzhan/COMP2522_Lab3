package ca.bcit.comp2522.lab3;
/**
 * Class Name: IPad.
 * The IPad class represents an iPad device with specific properties
 * such as whether it has a case and its operating system version.
 * @author Leslie Zhang, Angelo Santos
 * @version 1.0
 */
public class IPad extends IDevice{
    private boolean hasCase;
    private String osVersion;

    /**
     * Constructor for creating a new IPad with a specified case status and operating system version.
     *
     * @param hasCase A boolean indicating whether the iPad has a case.
     * @param osVersion The operating system version of the iPad.
     */
    public IPad(final boolean hasCase,
                final String osVersion)
    {
        super("learning");
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Gets the operating system version of the iPad.
     *
     * @return The operating system version.
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Checks whether the iPad has a case.
     *
     * @return true if the iPad has a case, false otherwise.
     */
    public boolean checkHasCase() {
        return hasCase;
    }

    /**
     * Sets the operating system version of the iPad.
     *
     * @param osVersion The operating system version to set.
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * Sets whether the iPad has a case.
     *
     * @param hasCase A boolean indicating whether the iPad should have a case.
     */
    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }

    /**
     * Prints the details of the iPad, including whether it has a case and its operating system version.
     */
    @Override
    public void printDetails()
    {
        System.out.println("IPad Has Case: " + this.hasCase);
        System.out.println("Operating System Version: " + this.osVersion);
    }

    /**
     * Returns a string representation of the iPad, including its purpose, case status, and operating system version.
     *
     * @return A string representing the iPad's details.
     */
    @Override
    public String toString(){
        String sb = super.toString() + " " +
                    this.hasCase + " " +
                    this.osVersion + " ";

        return sb;
    }

    /**
     * Compares the current iPad object to another object for equality based on the operating system version.
     *
     * @param o The object to compare.
     * @return true if the operating system version is the same, false otherwise.
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IPad otherDevice)){
            return false;
        }
        return this.getOsVersion().equals(otherDevice.getOsVersion());
    }

    /**
     * Returns a hash code value for the iPad based on the purpose and operating system version.
     *
     * @return A hash code value for the iPad.
     */
    @Override
    public int hashCode()
    {
        return this.getPurpose().hashCode();
    }
}
