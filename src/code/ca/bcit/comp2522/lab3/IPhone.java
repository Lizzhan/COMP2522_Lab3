package ca.bcit.comp2522.lab3;

/**
 * Represents an iPhone, which is a type of {@link IDevice} designed for communication.
 * This class maintains details about the phone's plan, including the carrier and minutes left.
 *
 * @author Angelo Santos, Leslie Zhang
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private double phonePlanTimeLeftMinutes;
    private String phonePlanCarrier;

    /**
     * Constructs an IPhone instance with a specified phone plan duration and carrier.
     *
     * @param phonePlanTimeLeftMinutes the remaining minutes on the phone plan
     * @param phonePlanCarrier the carrier providing the phone plan
     */
    public IPhone(final double phonePlanTimeLeftMinutes,
                  final String phonePlanCarrier)
    {
        super("talking");
        this.phonePlanTimeLeftMinutes = phonePlanTimeLeftMinutes;
        this.phonePlanCarrier = phonePlanCarrier;
    }

    /**
     * Retrieves the remaining minutes on the phone plan.
     *
     * @return the remaining phone plan minutes
     */
    protected final double getPhonePlanTimeLeftMinutes() { return phonePlanTimeLeftMinutes; }

    /**
     * Retrieves the phone plan carrier.
     *
     * @return the carrier name
     */
    protected final String getPhonePlanCarrier() { return phonePlanCarrier; }

    /**
     * Updates the remaining phone plan minutes.
     *
     * @param phonePlanTimeLeftMinutes the new remaining minutes on the phone plan
     */
    protected final void setPhonePlanTimeLeftMinutes(double phonePlanTimeLeftMinutes)
    {
        this.phonePlanTimeLeftMinutes = phonePlanTimeLeftMinutes;
    }

    /**
     * Updates the phone plan carrier.
     *
     * @param phonePlanCarrier the new carrier name
     */
    protected void setPhonePlanCarrier(final String phonePlanCarrier)
    {
        this.phonePlanCarrier = phonePlanCarrier;
    }

    /**
     * Prints the details of the iPhone, including remaining plan minutes and carrier.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Minutes remaining on phone plan: " + phonePlanTimeLeftMinutes);
        System.out.println("Phone plan carrier: " + phonePlanCarrier);
    }

    /**
     * Returns a string representation of the iPhone.
     *
     * @return a formatted string containing phone details
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ")
          .append(phonePlanTimeLeftMinutes).append(" ")
          .append(phonePlanCarrier).append(" ");

        return sb.toString();
    }

    /**
     * Checks equality based on remaining phone plan minutes.
     *
     * @param object the object to compare with
     * @return {@code true} if both objects have the same remaining minutes, otherwise {@code false}
     */
    @Override
    public boolean equals(final Object object)
    {
        if (object == this) {
            return true;
        }
        if (!(object instanceof IPhone otherDevice)){
            return false;
        }
        return this.phonePlanTimeLeftMinutes == otherDevice.getPhonePlanTimeLeftMinutes();
    }

    /**
     * Generates a hash code based on the purpose of the device.
     *
     * @return the hash code
     */
    @Override
    public int hashCode()
    {
        return this.getPurpose().hashCode();
    }
}
