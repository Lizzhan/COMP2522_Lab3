package ca.bcit.comp2522.lab3;

public class IPhone extends IDevice
{
    private double phonePlanTimeLeftMinutes;
    private String phonePlanCarrier;

    public IPhone(final double phonePlanTimeLeftMinutes,
                  final String phonePlanCarrier)
    {
        super("talking");
        this.phonePlanTimeLeftMinutes = phonePlanTimeLeftMinutes;
        this.phonePlanCarrier = phonePlanCarrier;
    }

    protected final double getPhonePlanTimeLeftMinutes() { return phonePlanTimeLeftMinutes; }

    protected final String getPhonePlanCarrier() { return phonePlanCarrier; }

    protected final void setPhonePlanTimeLeftMinutes(double phonePlanTimeLeftMinutes)
    {
        this.phonePlanTimeLeftMinutes = phonePlanTimeLeftMinutes;
    }

    protected void setPhonePlanCarrier(final String phonePlanCarrier)
    {
        this.phonePlanCarrier = phonePlanCarrier;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Minutes remaining on phone plan: " + phonePlanTimeLeftMinutes);
        System.out.println("Phone plan carrier: " + phonePlanCarrier);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ")
          .append(phonePlanTimeLeftMinutes).append(" ")
          .append(phonePlanCarrier).append(" ");

        return sb.toString();
    }

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

    @Override
    public int hashCode()
    {
        return this.getPurpose().hashCode();
    }

}
