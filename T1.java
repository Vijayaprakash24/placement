import java.util.*;
import java.math.*;

class T1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<4;i++){
        //         if(i==0 || i==3){
        //             for(int j=0;j<3;j++){
        //                 System.out.print("*");
                        
        //             }
                
        //         }else{
        //             for(int j=0;j<=0;j++){
        //                 System.out.print("*");
        //             }
        //             for(int k=1;k<2;k++){
        //                 System.out.print(" ");
        //             }
        //              for(int j=3;j<=3;j++){
        //                 System.out.print("*");
        //             }
                  
        //         }
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if((i==0 && j==2)||(i==2&&j==0) ||(i==0&&j==0)||(i==1&&j==1)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if((i==0&&j==1)||(i==2&&j==1)){
        //             System.out.print(" ");
                
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         if(j==0|| (i==1&&j==1)||(i==3&&j==2)||(i==1&&j==3)||(i==2&&j==1)||(i==0&&j==3)||(i==2&&j==3)){
        //             System.out.print("*"+" ");
        //         }else{
        //             System.out.print(" "+" ");
        //         }
               
        //     }System.out.println();
        // }

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if((i==0&&j==0)||(i==0&&j==2)||(i==2&&j==1)||(i==1&&j==0)||(i==1&&j==2)){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        // }

        // for(int i=0;i<5;i++){
        //     for(int j=0;j<4;j++){
        //         if((i==0&&(j==1||j==2||j==3))||(j==1&&i==1)||(i==2&&(j==1||j==2||j==3))||(i==4&&(j==1||j==2||j==3))||(i==3&&j==3)){
        //             System.out.print("*"+" ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }System.out.println();
        // }

        int[] arr={1,2,3,4,5};
        int sum=0;
        // char[] arr1={'c','a','e'};
        // String[] arr2={"hello","world"};

        // int[][] arr3={{1,2,3,4,5},{6,7,8,9}};
        // for(int i=0;i<arr3.length;i++){
        //     for(int j=0;j<arr3[i].length;j++){
        //         System.out.print(arr3[i][j]);
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        //  for(int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i]);
        // }

        //  for(int i=0;i<arr2.length;i++){
        //     System.out.println(arr2[i]);
        // }
        //  for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        //  }
        //  System.out.println(sum);

        //  double avg=sum/arr.length;
        //  System.out.println(avg);
        // int max=0;
        // int max2=0;
        //  for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         max2=max;
        //         max=arr[i];

        //     }
        //  }
        //  System.out.println(max);

        //  int sm=arr[0];
        //  int sm2=arr[0];
        //  int sm3=arr[0];
        //  for(int i=0;i<arr.length;i++){
        //     if(sm>arr[i]){
        //         sm2=sm;
        //         sm=arr[i];
        //     }
        //  }
        //  System.out.println(sm);

        //  int evenc=0;
        //  int oddc=0;
        //  for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         evenc++;
        //     }else{
        //         oddc++;
        //     }
        //  }
        //  System.out.println("even"+" "+evenc+"odd"+" "+oddc);

        //  int posc=0;
        //  int nevc=0;
        //  for(int i=0;i<arr.length;i++){
        //     if(i<0){
        //         nevc++;
        //     }else{
        //         posc++;
        //     }
        //  }
        //  System.out.println("positive"+" "+posc+"neg"+" "+nevc);

        //    int[] arr2=new int[arr.length];
        //  int[] arr3=new int[arr.length];
        //  for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         for(int k=0;k<3;k++){
        //         arr2[k]=arr[i];}
        //     }else{
        //         for(int k=0;k<3;k++){
        //         arr3[k]=arr[i];}
        //     }
        //  }
        //  for(int i=0;i<3;i++){
        //     System.out.print(arr2[i]);
        //  }
        //  System.out.println();
        // for(int i=0;i<3;i++){
        //     System.out.print(arr3[i]);
        //  }
        // int key=4;
        //  for(int i=0;i<arr.length;i++){
        //     if(key==arr[i]){
        //         System.out.println("the element is "+arr[i]);
        //         break;
        //     }else{
        //         System.out.println("not found");
        //     }
        //  }
        //    System.out.println("second max"+max2);
        //    System.out.println("second min"+sm2);
        //  for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]);
        //  }
        //  int max1=arr[0];
        //  int max3=arr[0];
        //  int max4=arr[0];

        //  for(int i=0;i<arr.length;i++){
        //     if(max1<arr[i]){
        //         max4=max3;
        //         max3=max1;
        //         max1=arr[i];


                 
        //     }
        //  }
        //  System.out.println(max4);
          
        //  int index=3;
        //  int num=4;
        //  for(int i=3;i<arr.length;i++){

        //        arr[index]=num;
        //  }
        //  for(int i=index-1;i<arr.length;i++){
        //     arr[i]=arr[i];
        //  }
        //  int com=0;
         
        //  for(int i=0;i<arr.length;i++){
        //    int num1=arr[i];
        //    int count=0;
        //    for(int j=0;j<arr.length;j++){
        //          if(arr[j]==arr[i]){
        //             num1=arr[i];
        //             count++;
        //          }
        //    }
        //    if(count>com){
        //     com=count;
        //    }

        //  }
        //  System.out.println(com);
       

        String name="name";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        int n=name.length();
        int i=0;
        int vc=0;
        int conc=0;
        String change="";
        while(n>0){
            char c=name.charAt(i);
            if(c=='A'||c=='a'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                    vc++;
                    change+="*";
            }else{
                conc++;
                change+=c;
            }
            n--;
            i++;
        }
        System.out.println(vc+" "+conc);
        int k=name.length();
        String name1="";
        while(k>0){
            System.out.print(name.charAt(k-1));
            name1=name.charAt(k-1)+name1;
            k--;
        }
        StringBuffer org=new StringBuffer(name);
        StringBuffer org1=new StringBuffer(name1);
        System.out.println();
        if(org.equals(org1)){
            System.out.println("It is a Palindrome.");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        String sentence="It is an Apple";
            int j=1;
            int word1=0;
            int l=sentence.length();
         while(l>1){
            if(Character.isWhitespace(sentence.charAt(j))){
              word1++;
            }
            l--;
            j++;
           
        }
        System.out.println(word1);

        String st="";
        for(int m=0;m<sentence.length();m++){
            char c=sentence.charAt(m);
            if(Character.isWhitespace(sentence.charAt(m))){
                continue;
            }else{
                st=st+c;
            }
        }
        System.out.println(st);

        String over="djfnia48932389ieof";
        int dig=0;
        int al=0;
        int spec=0;
        for(int y=0;y<over.length();y++){
            char c=over.charAt(y);
            if(Character.isAlphabetic(c)){
                al++;
            }
            
            else if(Character.isDigit(c)){
                dig++;
            }else{
                spec++;
            }
        }
        System.out.println("dig"+" "+dig+" "+"al"+al+" "+"spec"+spec);

        Boolean flag=true;
        for(int z=0;z<over.length();z++){
            char c=over.charAt(z);
            if(Character.isDigit(c)){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("String contains only digits");
        }else{
            System.out.println("String not only contains digits");
        }

        Boolean flag1=true;
        for(int z=0;z<over.length();z++){
            char c=over.charAt(z);
            if(Character.isDigit(c)){
                flag1=true;
            }else{
                flag1=false;
                break;
            }
        }
        if(flag1){
            System.out.println("String contains only alphabets");
        }else{
            System.out.println("String not only contains alphabets");
        }
        System.out.println(change);
          
        String[] w=sentence.trim().split("\\s+");
        int count=w.length;
        








    }
}