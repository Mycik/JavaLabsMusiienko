public class Seventeen {

    public static void CheckArgumentsType(String[] args){
        System.out.println("Total arguments: " + args.length);
        for (var arg : args)
            if (arg.matches("[-+]?\\d*\\.?\\d+"))
                System.out.println("Argument: " + arg + " -> Type: Decimal");
            else
                System.out.println("Argument: " + arg + " -> Type: String");
    }

    private static void main(String[] args) {
        CheckArgumentsType(new String[] {"1515.515", "Happy Birthday"});
    }
}