public class Main {
    public static void main(String[] args) {
        // Primitive Data Types
        byte ageB = -128;  // 0 = +/- 000 0000 -128 to 127 = 255
        short ageS = 180; // 0 000 0000 0000 0000
        int ageI = 18; // 0 000 0000 0000 0000 0000 0000 0000 0000
        long ageL = 18; // 0 000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000

        // 0111 1111 = 127 + 1 = 1000 0000 = -128

        // byte newAgeB = ageS;  // this cannot be done
        // short newAgeS = ageB; // this can be done

        byte newAgeB = (byte) ageS;

        System.out.println("This is newAgeB = " + newAgeB);
        // System.out.println(newAgeS);

        double piD = 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342d;
        float piF = 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342f;
        double piC = piF;

        System.out.println(piD);
        System.out.println(piF);
        System.out.println(piC);

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        char singleCharacter = 'c';

        System.out.println(singleCharacter);

        // Wrapper Classes
        Byte ageByte = 18;
        Short ageShort = 18;
        Integer ageInteger = 18;
        Long ageLong = 18L;
        Float ageFloat = 18F;
        Double ageDouble = 18D;
        Boolean ageIsOver17 = true;
        Character ageCharacter = 'c';

        System.out.println(ageInteger);


    }
}