package ca.bcit.comp2522.lab3;

/**
 * Represents an <b>iPhone 16</b> model, extending the base {@link IPhone} class.
 * Includes additional attributes such as high-resolution camera capability
 * and memory capacity.
 *
 * @author Angelo Santos, Leslie Zhang
 * @version 1.0
 */
public class IPhone16 extends IPhone {
    private final boolean highResolutionCamera;
    private final int memoryCapacityGigabytes;

    /**
     * Constructs an {@link IPhone16} instance with specified phone plan details,
     * camera resolution, and memory capacity.
     *
     * @param phonePlanTimeLeftMinutes the remaining time in minutes on the phone plan
     * @param phonePlanCarrier the carrier of the phone plan
     * @param hasHighResolutionCamera whether the phone has a high-resolution camera
     * @param memoryCapacityGigabytes the memory capacity of the phone in gigabytes
     */
    public IPhone16(final double phonePlanTimeLeftMinutes,
                    final String phonePlanCarrier,
                    final boolean hasHighResolutionCamera,
                    final int memoryCapacityGigabytes) {
        super(phonePlanTimeLeftMinutes, phonePlanCarrier);
        this.highResolutionCamera = hasHighResolutionCamera;
        this.memoryCapacityGigabytes = memoryCapacityGigabytes;
    }

    /**
     * Checks if the {@link IPhone16} has a high-resolution camera.
     *
     * @return <code>true</code> if the phone has a high-resolution camera, <code>false</code> otherwise
     */
    protected final boolean hasHighResolutionCamera() {
        return highResolutionCamera;
    }

    /**
     * Gets the memory capacity of the {@link IPhone16} in gigabytes.
     *
     * @return the memory capacity in gigabytes
     */
    protected final int getMemoryCapacityGigabytes() {
        return memoryCapacityGigabytes;
    }

    /**
     * Prints the details of the {@link IPhone16}, including inherited details
     * and its specific features such as high-resolution camera capability
     * and memory capacity.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("High resolution camera: " + highResolutionCamera);
        System.out.println("Memory capacity in gigabytes: " + memoryCapacityGigabytes);
    }

    /**
     * Returns a string representation of the {@link IPhone16}, including inherited
     * properties and specific attributes such as camera resolution and memory capacity.
     *
     * @return a formatted string representing the {@link IPhone16}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ")
          .append(highResolutionCamera).append(" ")
          .append(memoryCapacityGigabytes).append(" ");
        return sb.toString();
    }

    /**
     * Compares this {@link IPhone16} instance to another object for equality.
     * Two instances are considered equal if they have the same phone plan
     * time left and identical high-resolution camera capability.
     *
     * @param object the object to compare to
     * @return <code>true</code> if the objects are equal, <code>false</code> otherwise
     */
    @Override
    public boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof IPhone16 otherDevice)) {
            return false;
        }
        return (super.getPhonePlanTimeLeftMinutes() == otherDevice.getPhonePlanTimeLeftMinutes()) &&
               (this.hasHighResolutionCamera() == otherDevice.hasHighResolutionCamera());
    }

    /**
     * Computes the hash code for this {@link IPhone16} instance.
     *
     * @return the hash code based on the phone's purpose attribute
     */
    @Override
    public int hashCode() {
        return Boolean.hashCode(this.hasHighResolutionCamera());
    }
}
