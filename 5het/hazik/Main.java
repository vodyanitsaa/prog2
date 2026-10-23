class Main{
    public static void main(String[] args) {
        String name = PyUtils.input("Neved: ");
        System.out.printf("Hello %s!\n", name);

        String szoveg = PyUtils.input("Kérek egy szöveget: ");
        System.out.println(swapCase(szoveg));
    }


    static StringBuffer swapCase(String szoveg){
        StringBuffer uj = new StringBuffer();
        for(int i = 0; i < szoveg.length(); ++i){
            char aktualis = szoveg.charAt(i);
            if(Character.isUpperCase(aktualis)) {
                uj.append(Character.toLowerCase(aktualis));
            }else if(Character.isLowerCase(aktualis)){
                uj.append(Character.toUpperCase(aktualis));
            }else{
                uj.append(szoveg.charAt(i));
            }
        }

        return uj;
    }
}