public class EVA2_10_MCD {
    public static void main(String[] args) throws Exception {
        System.out.println(mcdRecu(48, 18));
    }
    public static int mcdRecu(int a, int b) {
    if (b == 0 ){
        return a ;
    }else {
        return mcdRecu(b, a % b);
    }
}


    }

