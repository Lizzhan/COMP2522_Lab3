package ca.bcit.comp2522.lab3;
/**
 * Class Name: IPod.
 * The IPod class represents an iPod device with specific properties
 * such as number of songs and maximum volume.
 * @author Leslie Zhang, Angelo Santos
 * @version 1.0
 */
public class IPod extends IDevice{
    private int numOfSongs;
    private final double maxVolume;

    /**
     * Constructor for creating a new IPod with a specified number of songs and maximum volume.
     *
     * @param numOfSongs The number of songs stored on the iPod.
     * @param maxVolume The maximum volume in decibels.
     */
    public IPod(final int numOfSongs,
                final double maxVolume)
    {
        super("music");
        this.numOfSongs = numOfSongs;
        this.maxVolume = maxVolume;
    }

    /**
     * Gets the maximum volume of the iPod in decibels.
     *
     * @return The maximum volume.
     */
    public double getMaxVolume() {
        return maxVolume;
    }

    /**
     * Gets the number of songs stored on the iPod.
     *
     * @return The number of songs.
     */
    public int getNumOfSongs() {
        return numOfSongs;
    }

    /**
     * Sets the number of songs stored on the iPod.
     *
     * @param numOfSongs The number of songs to set.
     */
    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    /**
     * Prints the details of the iPod, including the number of songs and maximum volume.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of Songs: " + numOfSongs);
        System.out.println("Max Volume: " + maxVolume);
    }


    /**
     * Returns a string representation of the iPod, including its purpose, number of songs, and maximum volume.
     *
     * @return A string representing the iPod's details.
     */
    @Override
    public String toString()
    {
        String sb = super.toString() +
                    numOfSongs + " " +
                    maxVolume + " ";

        return sb;
    }

    /**
     * Compares the current iPod object to another object for equality based on the number of songs stored.
     *
     * @param o The object to compare.
     * @return true if the number of songs is the same, false otherwise.
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IPod otherDevice)){
            return false;
        }
        return this.numOfSongs == otherDevice.numOfSongs;
    }

    /**
     * Returns a hash code value for the iPod based on the purpose and number of songs.
     *
     * @return A hash code value for the iPod.
     */
    @Override
    public int hashCode()
    {
        return this.getPurpose().hashCode();
    }
}
