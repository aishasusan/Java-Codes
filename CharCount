public class CharCount {
    public static void main(String[] args) {
        String s ="apple";
        System.out.println("string is "+s+"\n");
        int count=0;
        char[] arr = new char[s.length()];
        System.out.println("length of string is "+s.length());
        for(int i = 0 ;i< s.length();i++)
        {
            arr[i]= s.charAt(i);
        }
       
        for(int i=0;i<arr.length;i++){
            count++;
            for (int j=1;j<=arr.length-1;j++ ){
                if(arr[i]==arr[j]) 
                {
                    count++;
                }
                break;
            }
            System.out.println("occurance of"+arr[i]+"\n"+count);
            count=0;
        }
    }
}
