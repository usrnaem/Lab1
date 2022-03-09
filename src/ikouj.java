


class solustion{

    public int hashCode(String numbers) {
        String[] arr=numbers.split(" ");
        String[] arr2=new String[50000];
        int f=0;
        for (int i=0;i<arr.length;i++){
            String[] arr1=arr[i].split("");
            int left=0,right=arr1.length-1;
            String temp;
            while (left<=right){
                temp=arr1[left];
                arr1[left]=arr1[right];
                arr1[right]=temp;
                left++;right--;
            }
            StringBuffer str1=new StringBuffer();
            for(String s:arr1){
                str1.append(s);
            }
            arr2[f]=str1.toString();

            f++;
            if(i==arr.length-1){
                break;
            }else {
                arr2[f]=" ";
                f++;
            }
        }
        StringBuffer str2=new StringBuffer();
        for (String s:arr2){
            if(arr2.equals(null)){
                break;
            }else {
                str2.append(s);
            }
        }

        return 1;
    }

}

public class ikouj {
    public static void main(String[] args) {
        System.out.println(99%6);
        solustion l ;
        l=new solustion();
        String nums="hello asd ad";
        System.out.println(l.hashCode(nums));
    }
}
