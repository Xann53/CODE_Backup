public class BytesConverter
{
    public static void convertKilobytes(long bytes)
    {
        int kilobyteCTR = 0;
        long inputValue = bytes;
        while(bytes >= 1024)
        {
            kilobyteCTR+=1;
            bytes = bytes - 1024;
        }
        System.out.println("\n" + inputValue + " bytes = " + kilobyteCTR + " Kilobyte/s and " + bytes + " Byte/s");
    }
    public static void convertMegabytes(long bytes)
    {
        int kilobyteCTR = 0, megabyteCTR = 0;
        long inputValue = bytes;
        while(bytes >= 1048576)
        {
            megabyteCTR+=1;
            bytes = bytes - 1048576;
        }
        while(bytes >= 1024)
        {
            kilobyteCTR+=1;
            bytes = bytes - 1024;
        }
        System.out.println("\n" + inputValue + " bytes = " + megabyteCTR + " Megabyte/s and " + kilobyteCTR + " Kilobyte/s and " + bytes + " Byte/s");
    }
    public static void convertGigabytes(long bytes)
    {
        int kilobyteCTR = 0, megabyteCTR = 0, gigabyteCTR = 0;
        long inputValue = bytes;
        while(bytes >= 1073741824)
        {
            gigabyteCTR+=1;
            bytes = bytes - 1073741824;
        }
        while(bytes >= 1048576)
        {
            megabyteCTR+=1;
            bytes = bytes - 1048576;
        }
        while(bytes >= 1024)
        {
            kilobyteCTR+=1;
            bytes = bytes - 1024;
        }
        System.out.println("\n" + inputValue + " bytes = " + gigabyteCTR + " Gigabyte/s and " + megabyteCTR + " Megabyte/s and " + kilobyteCTR + " Kilobyte/s and " + bytes + " Byte/s");
    }
}