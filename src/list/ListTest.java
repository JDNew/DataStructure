package list;

import java.util.List;

public class ListTest {


    public static void main(String[] args) {

        SeqList seqList = new SeqList(10);

        seqList.add(10);
        seqList.add(20);
        seqList.add(30);
        seqList.add(10);
        seqList.add(20);
        seqList.add(30);
        seqList.add(10);
        seqList.add(20);
        seqList.add(30);


        System.out.println(seqList.getLength());

        for(int i = 0 ; i < seqList.getLength() ; i++){
            System.out.println(seqList.get(i));
        }

        seqList.remove(2);
        seqList.remove(4);

        System.out.println(seqList.getLength());

        for(int i = 0 ; i < seqList.getLength() ; i++){
            System.out.println(seqList.get(i));
        }


    }
}
