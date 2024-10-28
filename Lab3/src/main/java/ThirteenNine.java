public class ThirteenNine {

    private static void ConvertingArguments(String[] args){
        var hexCount = 0;
        System.out.println("Total arguments: " + args.length);
        for (String arg : args) {
            if (arg.matches("^[0-9A-Fa-f]+$")) {
                System.out.println("Argument: " + arg + " -> Binary: " + Integer.toBinaryString(Integer.parseInt(arg, 16)));
                hexCount++;
            } else {
                System.out.println("Argument: " + arg + " -> Type: String");
            }
        }
        System.out.println("Total hex arguments: " + hexCount);
    }

    public static void main(String[] args) {
        ConvertingArguments(new String[] {"1f", "abcdf", "sdfsdf"});
    }
}
