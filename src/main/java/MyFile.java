public class MyFile
{
    public static void main(String[] args)
    {
        printHeader();
        printMessage("hello, world!");

        printHeader();
        printMessage("by: Josh");
    }

    private static void printMessage(String message)
    {
        System.out.println(message);
    }

    private static void printHeader()
    {
        System.out.println("******************************");
    }
}
