public class Example_1 {

    public static void main(String[] args){
        boolean booleanValue = true;
        char charValue = 'A';

        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9232323223131231L;
        float floatValue = 3.33f;
        double doubleValue = 99.999;

        // SIZE 메소드의 경우 해당 자료형 값을 bit 형태 크기로 출력

        System.out.println("charValue : "+ charValue);
        System.out.println(Character.SIZE);

        System.out.println("byteValue : "+ byteValue);
        System.out.println(Byte.SIZE);

        System.out.println("shortValue : "+ shortValue);
        System.out.println(Short.SIZE);

        System.out.println("intValue : "+ intValue);
        System.out.println(Integer.SIZE);

        System.out.println("longValue : "+ longValue);
        System.out.println(Long.SIZE);

        System.out.println("floatValue : "+ floatValue);
        System.out.println(Float.SIZE);

        System.out.println("doubleValue : "+ doubleValue);
        System.out.println(Double.SIZE);

    }

}
