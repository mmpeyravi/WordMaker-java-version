package com.company;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
       // String string;
        Scanner input = new Scanner(System.in);
        //string = input.next();
//ArrayList<HashSet<String>> hashSetArrayList=new ArrayList<>();
       // Iterator iterator=hashSetArrayList.iterator();

        ArrayList<String> bigArrayList=new ArrayList<>();

        ArrayList<String> arrayList=new ArrayList<>();
        String str = input.next();
        int n = str.length();

        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1,arrayList);
        System.out.println(arrayList);
        bigArrayList.addAll(arrayList);

        HashSet<String> hashSet=new HashSet<>();
        /*hashSet.add("ABCD");
        hashSet.add("ABCD");
        hashSet.add("ADBC");*/
        int num=n;
        int x=1;
        while (num>3) {
            for (int i = 0; i < arrayList.size(); i++) {
                hashSet.add(arrayList.get(i).substring(x));
            }
            System.out.println(hashSet);
            bigArrayList.addAll(hashSet);
            hashSet.clear();
            x++;
            num--;
        }
        System.out.println();
        System.out.println(bigArrayList);
        /*System.out.println(hashSet);
        for (int i = n; i >=3 ; i--) {
            hashSetArrayList
        }*/
        /*while (n>=3){
            permutation.permute(str,0,n-1,arrayList);
            n--;
        }*/

    }

    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    private void permute(String str, int l, int r,ArrayList<String> arrayList) {

        if (l == r) {
            System.out.println(str);
            arrayList.add(str);
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r,arrayList);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

// This code is contributed by Mihir Joshi

