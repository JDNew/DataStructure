package list;

/**
 * 顺序存储列表
 */
public class SeqList implements Collection {

    private int maxsize = 0;
    private int dataSize = 0;
    private int a[];

    public SeqList(int maxsize) {
        this.maxsize = maxsize;
        this.dataSize = 0;

        a = new int[maxsize];
    }

    @Override
    public void remove(int position) {
        if (position > maxsize || position < 0) {
            System.out.println("位置错误");
            return;
        } else if (dataSize == 0) {
            System.out.println("没有数据");
            return;
        }

        for (int i = position; i < dataSize; i++) {
            a[i] = a[i + 1];
        }

        dataSize--;
    }

    @Override
    public void add(int num) {
        if (dataSize == maxsize) {
            System.out.println("已越界");
            return;
        }

        a[dataSize] = num;
        dataSize++;

    }

    @Override
    public void add(int num, int position) {
        if (dataSize == maxsize) {
            System.out.println("已越界");
            return;
        } else if (position < 0 || position > maxsize) {
            System.out.println("位置错误");
            return;
        }

        for (int i = maxsize; i > position; --i) {
            a[maxsize] = a[i];
        }
        a[position] = num;
        dataSize++;


    }

    @Override
    public int get(int position) {
        if (position < 0 || position > maxsize) {
            System.out.println("位置错误");
            return -1;
        }

        return a[position];
    }

    @Override
    public int getLength() {
        return dataSize;
    }
}
