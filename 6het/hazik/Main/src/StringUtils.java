public class StringUtils {
    private StringUtils(){
        //nem példányosítható
    }

    static StringBuffer randomCase(String szo){
        StringBuffer uj = new StringBuffer();
        for(int i = 0; i < szo.length(); ++i){
            char aktualis = szo.charAt(i);
            double random = Math.random();
            if(random < 0.5){
                uj.append(Character.toLowerCase(aktualis));
            }else{
                uj.append(Character.toUpperCase(aktualis));
            }
        }
        return uj;
    }
}
