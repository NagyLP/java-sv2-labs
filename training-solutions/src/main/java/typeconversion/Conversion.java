package typeconversion;

public class Conversion {

    public double convertDoubleToDouble (double number) {
        number = (int) number;
        return number = (double) number;
    }

    public byte[] convertIntArrayToByteArray(int[] intBlock) {
        byte[] byteBlock = new byte[intBlock.length];

        for (int i =0; i< intBlock.length; i++) {
            if (intBlock[i] > 0 && intBlock[i] < 127) {
                byteBlock[i] = (byte) intBlock[i];
            } else {
                byteBlock[i] = -1;
            }
        } return byteBlock;
    }

    public int getFirstDecimal(double number) {
        number = (number -((int) number))*10;
        return (int) number;
    }
}
