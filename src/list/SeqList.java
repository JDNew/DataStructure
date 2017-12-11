package list;

/**
 * 顺序存储列表
 */
public class SeqList implements Collection{

    private int maxsize;
    private int dataSize;
    int a[];
    private final int ERROR = -1;
    private final int OK = 0;

    public SeqList(int maxsize){
        this.maxsize = maxsize;
        this.dataSize = 0;

        a = new int[maxsize];
    }

    @Override
    public void remove(int position) {
        if(position > maxsize || position < 0){
            System.out.println("位置错误");
        }

        for (int i = position; i < maxsize; i++) {


        }
    }

    @Override
    public void add(int num) {
        if(dataSize == maxsize){
            System.out.println("已越界");
        }

        a[dataSize] = num;
        dataSize++;

    }

    @Override
    public void add(int num, int position) {
        if(dataSize == maxsize){
            System.out.println("已越界");
        }else  if(position < 0 || position > maxsize){
            System.out.println("位置错误");
        }

        for(int i = maxsize ; i > position ; --i){
            a[maxsize] = a[i];
        }
        a[position] = num;
        dataSize++;


    }

    @Override
    public int get(int position) {
       if(position < 0 || position > maxsize){
           System.out.println("位置错误");
       }

       return a[position];
    }

    @Override
    public int getLength() {
        return dataSize;
    }
}
