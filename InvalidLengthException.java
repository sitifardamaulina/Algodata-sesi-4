/* tugas sesi 4 algoritma dan struktur data
Siti Farda Maulina 20200040036*/
public class InvalidLengthException extends Exception
{

    private String lengthSent;

    //Creates a blank InvalidLengthException with no arguements.
    private InvalidLengthException()
    {

    }

    //Creates an InvalidLengthException that takes in the invalid String.
    public InvalidLengthException(String inString)
    {
        this.lengthSent = inString;
    }

    //Returns the inString of an InvalidLengthException.
    public String getLengthSet()
    {
        return this.lengthSent;
    }

    //Returns InvalidLengthException as a String.
    public String toString()
    {
        String returnString;

        returnString = this.lengthSent + " is an invalid length!\n";

        return returnString;
    }

}
