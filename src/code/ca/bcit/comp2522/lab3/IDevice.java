package ca.bcit.comp2522.lab3;
/**
 * Class Name: IDevice
 * The IDevice class represents an abstract device with a specific purpose.
 * It is intended to be extended by concrete device classes.
 * @author Leslie Zhang, Angelo Santos
 * @version 1.0
 */
public abstract class IDevice {
    private final String purpose;

    /**
     * Constructs a new IDevice with the specified purpose.
     *
     * @param purpose The purpose of the device.
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Returns the purpose of the device.
     *
     * @return The purpose of the device.
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Abstract method that must be implemented by subclasses
     * to print the details of the device.
     */
    public abstract void printDetails();

    /**
     * Returns a string representation of the IDevice, including its purpose.
     *
     * @return A string representing the device's purpose.
     */
    @Override
    public String toString()
    {
        return this.purpose;
    }

    /**
     * Checks whether two devices are equal based on their purpose.
     *
     * @param o The object to compare.
     * @return true if the devices have the same purpose, false otherwise.
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IDevice otherDevice)) {
            return false;
        }
        return this.purpose.equals(otherDevice.purpose);
    }

    /**
     * Returns a hash code value for the device based on its purpose.
     *
     * @return A hash code value for the device.
     */
    @Override
    public int hashCode()
    {
        return this.purpose.hashCode();
    }
}
