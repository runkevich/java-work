public class Main {

    public static void main(String[] arg) {

        int[] massive = new int[3];

        massive[0] = 7;
        massive[1] = 5;
        massive[2] = 10;


//        for (int i = massive.length - 1; i >= 0; i--) {
//            // System.out.println("i = " + i);
//            System.out.println("array " + massive[i]);
//        }


//        for (int value : massive) {                 //ДРУГАЯ ЗАПИСЬ !!!!
//            System.out.println(value);
//        }


//        int i = 0;
//        while (i < massive.length) {
//
//            System.out.println(massive[i]);
//            i++;
//        }

        int min=massive[0];
        int max=0;
        double avg = 0;
        int sum = 0;


        for (int i = massive.length - 1; i >= 0; i--){




            sum = sum + massive[i];
        }

        avg =  sum/massive.length;

        System.out.println("avg "+avg);



        for (int i = 1; i < massive.length;i++){
            if (min > massive[i]){
                min=massive[i];
            }
        }
        System.out.println("min " + min);







        double a = 5.5;
        int i = (int)a;
        String text = "100";
        int ii = Integer.valueOf(text); //опасный способ
        String ss = String.valueOf(100);
        System.out.println(i+ii + ss);


        System.out.println(arg[0]);
    }
}
