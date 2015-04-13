public class knock1{
    public static void main(String[] args) {
        String src = "stressed";
        StringBuffer sb = new StringBuffer(src);
        String dst = sb.reverse().toString();
        System.out.println(""+dst);
    }
}
