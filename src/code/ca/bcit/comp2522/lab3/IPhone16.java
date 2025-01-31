package ca.bcit.comp2522.lab3;

public class IPhone16
        extends IPhone {
    private final boolean highResolutionCamera;
    private final int     memoryCapacityGigabytes;

    public IPhone16(final double phonePlanTimeLeftMinutes,
                    final String phonePlanCarrier,
                    final boolean hasHighResolutionCamera,
                    final int memoryCapacityGigabytes)
    {
        super(phonePlanTimeLeftMinutes, phonePlanCarrier);
        this.highResolutionCamera = hasHighResolutionCamera;
        this.memoryCapacityGigabytes = memoryCapacityGigabytes;
    }

    protected final boolean hasHighResolutionCamera() { return highResolutionCamera; }

    protected final int getMemoryCapacityGigabytes() { return memoryCapacityGigabytes; }

    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.println("High resolution camera: " + highResolutionCamera);
        System.out.println("Memory capacity in gigabytes: " + memoryCapacityGigabytes);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ")
          .append(highResolutionCamera).append(" ")
          .append(memoryCapacityGigabytes).append(" ");

        return sb.toString();
    }

    @Override
    public boolean equals(final Object object)
    {
        if (object == this) {
            return true;
        }
        if (!(object instanceof IPhone16 otherDevice)){
            return false;
        }
        return (super.getPhonePlanTimeLeftMinutes() == otherDevice.getPhonePlanTimeLeftMinutes()) &&
               (this.hasHighResolutionCamera() == otherDevice.hasHighResolutionCamera());
    }

    @Override
    public int hashCode()
    {
        return this.getPurpose().hashCode();
    }

}
