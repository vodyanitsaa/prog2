public final class MyArrayUtils{
    private MyArrayUtils(){
    }

    public static boolean equals(int[] tomb1, int[] tomb2){
        if(tomb1 == tomb2){
            return true;
        }
        if(tomb1 == null || tomb2 == null){
            return false;
        }
        if(tomb1.length != tomb2.length){
            return false;
        }
        for(int i = 0; i < tomb1.length; ++i){
            if(tomb1[i] != tomb2[i]){
                return false;
            }
        }
        return true;
    }

    public static void fill(int[] tomb, int ertek){
        if(tomb == null){
            return;
        }
        for(int i = 0; i < tomb.length; ++i){
            tomb[i] = ertek;
        }
    }

    public static void sort(int[] tomb){
        if(tomb == null){
            return;
        }
        for(int i = 0; i < tomb.length - 1; ++i){
            for(int j = 0; j < tomb.length - 1 - i; ++j){
                if(tomb[j] > tomb[j + 1]){
                    int temp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = temp;
                }
            }
        }
    }

}