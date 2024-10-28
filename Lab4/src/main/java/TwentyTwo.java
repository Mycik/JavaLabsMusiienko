import java.util.ArrayList;

public class TwentyTwo {

    private static ArrayList<Byte> byteList = new ArrayList<>();

    public static void main(String[] args) {
        byteList.add((byte) 10);
        byteList.add((byte) 20);
        byteList.add((byte) 30);
        byteList.add((byte) 40);
        byteList.add((byte) 50);

        System.out.println("Current byte list: " + byteList);
        ReplaceByteListElement(3, (byte) 126);
        System.out.println("Updated byte list: " + byteList);
    }

    private static void ReplaceByteListElement(int index, byte newValue){
        byteList.set(index, newValue);
    }
}